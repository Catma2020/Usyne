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

public class BigBirdModel extends EntityModel<BigBird>
{

	private final ModelPart root;
	private final ModelPart body1;
	private final ModelPart neck;
	/*private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart head;
	private final ModelPart beak;
	private final ModelPart leftWing;
	private final ModelPart rightWing;
	private final ModelPart headFeathers;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;
	private final ModelPart leftFoot;
	private final ModelPart rightFoot;
	private final ModelPart tailFeathers;*/


    //This next part is directly from the Minecraft code for Parrots
    public BigBirdModel(ModelPart root)
    {

        this.root = root;
		this.body1 = root.getChild("body1");
		this.neck = root.getChild(EntityModelPartNames.NECK);
		/*this.body2 = root.getChild("body2");
		this.body3 = root.getChild("body3");
		this.head = root.getChild(EntityModelPartNames.HEAD);
		this.beak = root.getChild(EntityModelPartNames.BEAK);
		this.leftWing = root.getChild(EntityModelPartNames.LEFT_WING);
		this.rightWing = root.getChild(EntityModelPartNames.RIGHT_WING);
		this.headFeathers = this.head.getChild("headfeathers");
		this.leftLeg = root.getChild(EntityModelPartNames.LEFT_LEG);
		this.rightLeg = root.getChild(EntityModelPartNames.RIGHT_LEG);
		this.leftFoot = root.getChild(EntityModelPartNames.LEFT_FRONT_FOOT);
		this.rightFoot = root.getChild(EntityModelPartNames.RIGHT_FRONT_FOOT);
		this.tailFeathers = this.body1.getChild("tailFeathers");*/

    }

    public static TexturedModelData getTexturedModelData()
	{

		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
			//cuboid offset (-from x edge, -from y edge "bottom", -from z edge)
			//18 px of height, 20 px wide, and 20 px long
		modelPartData.addChild("body1", ModelPartBuilder.create().uv(0, 0).cuboid(-10.0f, -14.0f, -28.0f, 20.0f, 18.0f, 20.0f), ModelTransform.pivot(0.0f, 0.0f, 0.0f));
			//6 px of height, 12 px wide, and 14 px long
		modelPartData.addChild(EntityModelPartNames.NECK, ModelPartBuilder.create().uv(0, 40).cuboid(-6.0f, -20.0f, -32.0f, 12.0f, 6.0f, 14.0f), ModelTransform.pivot(0.0f, 0.0f, 0.0f));
		
		return TexturedModelData.of(modelData, 128, 128);
		
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