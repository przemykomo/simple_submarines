package xyz.przemyk.simplesubs;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;

@SuppressWarnings("resource")
public class SubmarineEntity extends Entity {

    public static final EntityDataAccessor<Byte> MOVE_UP = SynchedEntityData.defineId(SubmarineEntity.class, EntityDataSerializers.BYTE);
    public static final EntityDataAccessor<Byte> MOVE_FORWARD = SynchedEntityData.defineId(SubmarineEntity.class, EntityDataSerializers.BYTE);
    public static final EntityDataAccessor<Byte> ROTATE_RIGHT = SynchedEntityData.defineId(SubmarineEntity.class, EntityDataSerializers.BYTE);

    public SubmarineEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        builder.define(MOVE_UP, (byte) 0);
        builder.define(MOVE_FORWARD, (byte) 0);
        builder.define(ROTATE_RIGHT, (byte) 0);
    }

    @Override
    public boolean hurtServer(ServerLevel serverLevel, DamageSource damageSource, float v) {
        return true;
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compoundTag) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compoundTag) {

    }

    @Override
    public void tick() {
        super.tick();

        if (isInWater()) {
            if (getControllingPassenger() instanceof Player) {
                float moveStrafing = entityData.get(ROTATE_RIGHT);
                float moveForward = -entityData.get(MOVE_FORWARD) * 0.03f;
                float moveUp = entityData.get(MOVE_UP) * 0.03f;
                if (!isUnderWater()) {
                    moveUp = Math.min(moveUp, -0.02f);
                }

                if (Math.abs(moveStrafing) < 0.2) {
                    moveStrafing = 0;
                }

                setYRot(getYRot() + moveStrafing);

                setDeltaMovement(
                    getDeltaMovement()
                        .add(
                            Mth.sin(-this.getYRot() * (float) (Math.PI / 180.0)) * moveForward,
                            moveUp,
                            Mth.cos(this.getYRot() * (float) (Math.PI / 180.0)) * moveForward
                        )
                );
                Vec3 v = getDeltaMovement();
                double lenSqr = v.x * v.x + v.z * v.z;
                if (lenSqr > 4) {
                    double len = Math.sqrt(lenSqr);
                    setDeltaMovement(v.x * 2 / len, Math.clamp(v.y, -0.1, 0.1), v.y * 2 / len);
                }

                v = getDeltaMovement();
                if (Math.abs(v.y) < 0.01) {
                    setDeltaMovement(v.x, 0, v.z);
                }

            }
            setDeltaMovement(getDeltaMovement().multiply(0.9, 0.9, 0.9));
        } else {
            setDeltaMovement(getDeltaMovement().add(0, -0.08, 0));
        }

        move(MoverType.SELF, getDeltaMovement());
    }

    @Override
    protected boolean canAddPassenger(Entity passenger) {
        return getPassengers().size() < 4;
    }

    @Override
    public InteractionResult interact(Player player, InteractionHand hand) {
        if (!level().isClientSide) {
            return player.startRiding(this) ? InteractionResult.CONSUME : InteractionResult.FAIL;
        } else {
            return player.getRootVehicle() == getRootVehicle() ? InteractionResult.FAIL : InteractionResult.SUCCESS;
        }
    }

    @Override
    public boolean isPickable() {
        return true;
    }

    @Nullable
    public LivingEntity getControllingPassenger() {
        if (getFirstPassenger() instanceof LivingEntity livingEntity) {
            return livingEntity;
        }

        return null;
    }

    public void setMoveUp(byte up) {
        entityData.set(MOVE_UP, up);
    }

    public void setMoveForward(byte up) {
        entityData.set(MOVE_FORWARD, up);
    }

    public void setRotate(byte right) {
        entityData.set(ROTATE_RIGHT, right);
    }
}
