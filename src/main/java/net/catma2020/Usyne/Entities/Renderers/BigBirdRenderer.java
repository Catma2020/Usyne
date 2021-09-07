package net.catma2020.Usyne.Entities.Renderers;

import net.catma2020.Usyne.Entities.BigBird;
import net.catma2020.Usyne.Entities.Models.BigBirdModel;
import net.catma2020.Usyne.Registries.EntityRendererReg;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BigBirdRenderer extends MobEntityRenderer<BigBird, BigBirdModel>
{

    public BigBirdRenderer(EntityRendererFactory.Context context)
    {
                                                                                                //shadow size
        super(context, new BigBirdModel(context.getPart(EntityRendererReg.MODEL_BIGBIRD_LAYER)), 3.0f);

    }

    @Override
    public Identifier getTexture(BigBird entity)
    {

        return new Identifier("usyne", "textures/entity/bigbird/bigbird1.png");

    }

}
