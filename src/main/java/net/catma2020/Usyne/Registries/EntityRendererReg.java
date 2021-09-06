package net.catma2020.Usyne.Registries;

import net.catma2020.Usyne.Entities.Models.BigBirdModel;
import net.catma2020.Usyne.Entities.Renderers.BigBirdRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class EntityRendererReg implements ClientModInitializer
{

    public static final EntityModelLayer MODEL_BIGBIRD_LAYER = new EntityModelLayer(new Identifier("usyne", "bigbird"), "main");

    @Override
    public void onInitializeClient()
    {

        EntityRendererRegistry.register(EntityRegistry.BIGBIRD, (context) -> {return new BigBirdRenderer(context);});

        EntityModelLayerRegistry.registerModelLayer(MODEL_BIGBIRD_LAYER, BigBirdModel::getTexturedModelData);

    }

}
