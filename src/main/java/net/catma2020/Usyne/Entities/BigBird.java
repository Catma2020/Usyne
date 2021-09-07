package net.catma2020.Usyne.Entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class BigBird extends PathAwareEntity
{

    /*

    Each bird, of which there are 5 variants, is 3.25 blocks tall, 1.75 blocks wide, and 4 blocks long. This means 52 px tall, 28 px wide, and 64 px long with a 16x16 texture.

    */

    public BigBird(EntityType<? extends PathAwareEntity> entityType, World world)
    {

        super(entityType, world);

    }

    public boolean isInAir() {
        return false;
    }

}
