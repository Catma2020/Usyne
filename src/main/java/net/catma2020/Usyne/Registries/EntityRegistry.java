package net.catma2020.Usyne.Registries;

import net.catma2020.Usyne.Entities.BigBird;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityRegistry implements ModInitializer
{

    public static final EntityType<net.catma2020.Usyne.Entities.BigBird> BIGBIRD = Registry.register
    (

        Registry.ENTITY_TYPE,
        new Identifier("usyne", "bigbird"),
            //Each bird, of which there are 5 variants, is 3.25 blocks tall, 1.75 blocks wide, and 4 blocks long.
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BigBird::new).dimensions(EntityDimensions.fixed(4.0f, 3.25f)).build()

    );

    @Override
    public void onInitialize()
    {

        FabricDefaultAttributeRegistry.register(BIGBIRD, BigBird.createMobAttributes());

    }

}
