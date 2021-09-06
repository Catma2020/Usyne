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
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BigBird::new).dimensions(EntityDimensions.fixed(0.5f * 5.0f, 0.9f * 5.0f)).build()

    );

    @Override
    public void onInitialize()
    {

        FabricDefaultAttributeRegistry.register(BIGBIRD, BigBird.createMobAttributes());

    }

}
