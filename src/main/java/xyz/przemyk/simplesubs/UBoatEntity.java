package xyz.przemyk.simplesubs;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class UBoatEntity extends SubmarineEntity {
    public UBoatEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected boolean canAddPassenger(Entity passenger) {
        return getPassengers().size() < 8;
    }
}
