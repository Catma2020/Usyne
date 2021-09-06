package net.catma2020.Usyne.Entities.Models;

import com.google.common.collect.ImmutableList;

import net.catma2020.Usyne.Entities.BigBird;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class BigBirdModel extends EntityModel<BigBird>
{

	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart leftWing;
	private final ModelPart rightWing;
	private final ModelPart head;
	private final ModelPart feather;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;

    //This next part is directly from the Minecraft code for Parrots
    public BigBirdModel(ModelPart root)
    {

        this.root = root;
		this.body = root.getChild(EntityModelPartNames.BODY);
		this.tail = root.getChild(EntityModelPartNames.TAIL);
		this.leftWing = root.getChild(EntityModelPartNames.LEFT_WING);
		this.rightWing = root.getChild(EntityModelPartNames.RIGHT_WING);
		this.head = root.getChild(EntityModelPartNames.HEAD);
		this.feather = this.head.getChild("feather");
		this.leftLeg = root.getChild(EntityModelPartNames.LEFT_LEG);
		this.rightLeg = root.getChild(EntityModelPartNames.RIGHT_LEG);

    }

    public static TexturedModelData getTexturedModelData()
	{

		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		modelPartData.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create().uv(2, 8).cuboid(-1.5F*5.0f, 0.0F*5.0f, -1.5F*5.0f, 3.0F * 5.0f, 6.0F * 5.0f, 3.0F * 5.0f), ModelTransform.pivot(0.0F, 16.5F, -3.0F));
		modelPartData.addChild(EntityModelPartNames.TAIL, ModelPartBuilder.create().uv(22, 1).cuboid(-1.5F*5.0f, -1.0F*5.0f, -1.0F*5.0f, 3.0F * 5.0f, 4.0F * 5.0f, 1.0F * 5.0f), ModelTransform.pivot(0.0F, 21.07F, 1.16F));
		modelPartData.addChild(EntityModelPartNames.LEFT_WING, ModelPartBuilder.create().uv(19, 8).cuboid(-0.5F*5.0f, 0.0F*5.0f, -1.5F*5.0f, 1.0F * 5.0f, 5.0F * 5.0f, 3.0F * 5.0f), ModelTransform.pivot(1.5F, 16.94F, -2.76F));
		modelPartData.addChild(EntityModelPartNames.RIGHT_WING, ModelPartBuilder.create().uv(19, 8).cuboid(-0.5F*5.0f, 0.0F*5.0f, -1.5F*5.0f, 1.0F * 5.0f, 5.0F * 5.0f, 3.0F * 5.0f), ModelTransform.pivot(-1.5F, 16.94F, -2.76F));
		ModelPartData modelPartData2 = modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(2, 2).cuboid(-1.0F*5.0f, -1.5F*5.0f, -1.0F*5.0f, 2.0F* 5.0f, 3.0F* 5.0f, 2.0F* 5.0f), ModelTransform.pivot(0.0F, 15.69F, -2.76F));
		modelPartData2.addChild("head2", ModelPartBuilder.create().uv(10, 0).cuboid(-1.0F*5.0f, -0.5F*5.0f, -2.0F*5.0f, 2.0F* 5.0f, 1.0F* 5.0f, 4.0F* 5.0f), ModelTransform.pivot(0.0F, -2.0F, -1.0F));
		modelPartData2.addChild("beak1", ModelPartBuilder.create().uv(11, 7).cuboid(-0.5F*5.0f, -1.0F*5.0f, -0.5F*5.0f, 1.0F* 5.0f, 2.0F* 5.0f, 1.0F* 5.0f), ModelTransform.pivot(0.0F, -0.5F, -1.5F));
		modelPartData2.addChild("beak2", ModelPartBuilder.create().uv(16, 7).cuboid(-0.5F*5.0f, 0.0F*5.0f, -0.5F*5.0f, 1.0F* 5.0f, 2.0F* 5.0f, 1.0F* 5.0f), ModelTransform.pivot(0.0F, -1.75F, -2.45F));
		modelPartData2.addChild("feather", ModelPartBuilder.create().uv(2, 18).cuboid(0.0F*5.0f, -4.0F*5.0f, -2.0F*5.0f, 0.0F* 5.0f, 5.0F* 5.0f, 4.0F* 5.0f), ModelTransform.pivot(0.0F, -2.15F, 0.15F));
		ModelPartBuilder modelPartBuilder = ModelPartBuilder.create().uv(14, 18).cuboid(-0.5F*5.0f, 0.0F*5.0f, -0.5F*5.0f, 1.0F* 5.0f, 2.0F* 5.0f, 1.0F* 5.0f);
		modelPartData.addChild(EntityModelPartNames.LEFT_LEG, modelPartBuilder, ModelTransform.pivot(1.0F, 22.0F, -1.05F));
		modelPartData.addChild(EntityModelPartNames.RIGHT_LEG, modelPartBuilder, ModelTransform.pivot(-1.0F, 22.0F, -1.05F));
		return TexturedModelData.of(modelData, 32, 32);
		
	}

	public ModelPart getPart()
	{

		return this.root;
	
	}

	@Override
    public void setAngles(BigBird bigbird, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch)
	{

    }
 
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha)
	{

        ImmutableList.of(this.root).forEach((modelRenderer) ->
		{

            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);

        });

    }

}