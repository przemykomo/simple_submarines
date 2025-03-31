package xyz.przemyk.simplesubs;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.List;

public class SubItem extends Item {
    private final EntityType<? extends SubmarineEntity> entityType;

    public SubItem(EntityType<? extends SubmarineEntity> entityType, Item.Properties properties) {
        super(properties);
        this.entityType = entityType;
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        HitResult hitresult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.ANY);
        if (hitresult.getType() == HitResult.Type.MISS) {
            return InteractionResult.PASS;
        } else {
            Vec3 vec3 = player.getViewVector(1.0F);
            double d0 = 5.0;
            List<Entity> list = level.getEntities(
                player, player.getBoundingBox().expandTowards(vec3.scale(5.0)).inflate(1.0), EntitySelector.CAN_BE_PICKED
            );
            if (!list.isEmpty()) {
                Vec3 vec31 = player.getEyePosition();

                for (Entity entity : list) {
                    AABB aabb = entity.getBoundingBox().inflate((double)entity.getPickRadius());
                    if (aabb.contains(vec31)) {
                        return InteractionResult.PASS;
                    }
                }
            }

            if (hitresult.getType() == HitResult.Type.BLOCK) {
                SubmarineEntity entity = this.getSub(level, hitresult, itemstack, player);
                if (entity == null) {
                    return InteractionResult.FAIL;
                } else {
                    entity.setYRot(player.getYRot());
                    if (!level.noCollision(entity, entity.getBoundingBox())) {
                        return InteractionResult.FAIL;
                    } else {
                        if (!level.isClientSide) {
                            level.addFreshEntity(entity);
                            level.gameEvent(player, GameEvent.ENTITY_PLACE, hitresult.getLocation());
                            itemstack.consume(1, player);
                        }

                        player.awardStat(Stats.ITEM_USED.get(this));
                        return InteractionResult.SUCCESS;
                    }
                }
            } else {
                return InteractionResult.PASS;
            }
        }
    }

    @Nullable
    private SubmarineEntity getSub(Level level, HitResult hitResult, ItemStack stack, Player player) {
        SubmarineEntity entity = this.entityType.create(level, EntitySpawnReason.SPAWN_ITEM_USE);
        if (entity != null) {
            Vec3 vec3 = hitResult.getLocation();
            entity.setInitialPos(vec3.x, vec3.y, vec3.z);
            if (level instanceof ServerLevel serverlevel) {
                EntityType.<SubmarineEntity>createDefaultStackConfig(serverlevel, stack, player).accept(entity);
            }
        }

        return entity;
    }
}
