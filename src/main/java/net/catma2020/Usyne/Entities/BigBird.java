package net.catma2020.Usyne.Entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class BigBird extends PathAwareEntity
{

    public BigBird(EntityType<? extends PathAwareEntity> entityType, World world)
    {

        super(entityType, world);

    }

    public boolean isInSittingPose() {
        return false;
    }

    public boolean isInAir() {
        return false;
    }

}
