package net.catma2020.Usyne.Entities.Models;

import net.catma2020.Usyne.Entities.BigBird;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class BigBirdModel extends EntityModel<BigBird>
{

	private final ModelPart root;
	private final ModelPart rightFootToe3_r1;
	private final ModelPart rightFootToe1_r1;
	private final ModelPart rightWing_r1;
	private final ModelPart topBeak_r1;
	private final ModelPart head_r1;
	private final ModelPart frontBody_r1;
	private final ModelPart rightLeg_r1;

	public BigBirdModel()
	{

		textureWidth = 16;
		textureHeight = 16;
		root = new ModelPart(this);
		root.setPivot(0.0F, 24.0F, 0.0F);
		root.setTextureOffset(0, 0).addCuboid(2.0F, -2.0F, 2.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addCuboid(3.0F, -18.0F, 3.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addCuboid(-10.0F, -62.0F, -31.0F, 18.0F, 31.0F, 18.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addCuboid(-5.0F, -62.0F, -35.0F, 10.0F, 3.0F, -9.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addCuboid(3.0F, -2.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addCuboid(3.0F, -2.0F, 6.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addCuboid(-7.0F, -2.0F, -11.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addCuboid(-6.0F, -2.0F, -17.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addCuboid(-6.0F, -2.0F, -7.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		rightFootToe3_r1 = new ModelPart(this);
		rightFootToe3_r1.setPivot(0.0F, 0.0F, 0.0F);
		root.addChild(rightFootToe3_r1);
		setRotationAngle(rightFootToe3_r1, 0.0F, -0.2618F, 0.0F);
		rightFootToe3_r1.setTextureOffset(0, 0).addCuboid(-6.0F, -2.0F, -15.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		rightFootToe3_r1.setTextureOffset(0, 0).addCuboid(6.0F, -2.0F, -5.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);

		rightFootToe1_r1 = new ModelPart(this);
		rightFootToe1_r1.setPivot(0.0F, 0.0F, 0.0F);
		root.addChild(rightFootToe1_r1);
		setRotationAngle(rightFootToe1_r1, 0.0F, 0.3491F, 0.0F);
		rightFootToe1_r1.setTextureOffset(0, 0).addCuboid(-4.0F, -2.0F, -17.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		rightFootToe1_r1.setTextureOffset(0, 0).addCuboid(1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);

		rightWing_r1 = new ModelPart(this);
		rightWing_r1.setPivot(0.0F, 0.0F, 0.0F);
		root.addChild(rightWing_r1);
		setRotationAngle(rightWing_r1, -0.1309F, 0.0F, 0.0F);
		rightWing_r1.setTextureOffset(0, 0).addCuboid(-16.0F, -50.0F, -27.0F, 4.0F, 30.0F, 80.0F, 0.0F, false);
		rightWing_r1.setTextureOffset(0, 0).addCuboid(12.0F, -50.0F, -27.0F, 4.0F, 30.0F, 80.0F, 0.0F, false);
		rightWing_r1.setTextureOffset(0, 0).addCuboid(-6.0F, -39.0F, 23.0F, 12.0F, 21.0F, 27.0F, 0.0F, false);
		rightWing_r1.setTextureOffset(0, 0).addCuboid(-10.0F, -49.0F, -2.0F, 20.0F, 31.0F, 25.0F, 0.0F, false);

		topBeak_r1 = new ModelPart(this);
		topBeak_r1.setPivot(0.0F, 0.0F, 0.0F);
		root.addChild(topBeak_r1);
		setRotationAngle(topBeak_r1, 0.2182F, 0.0F, 0.0F);
		topBeak_r1.setTextureOffset(0, 0).addCuboid(-7.0F, -71.0F, -17.0F, 14.0F, 2.0F, -14.0F, 0.0F, false);

		head_r1 = new ModelPart(this);
		head_r1.setPivot(0.0F, 0.0F, 0.0F);
		root.addChild(head_r1);
		setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0F);
		head_r1.setTextureOffset(0, 0).addCuboid(-9.0F, -77.0F, -30.0F, 18.0F, 15.0F, 22.0F, 0.0F, false);

		frontBody_r1 = new ModelPart(this);
		frontBody_r1.setPivot(0.0F, 0.0F, 0.0F);
		root.addChild(frontBody_r1);
		setRotationAngle(frontBody_r1, -0.0436F, 0.0F, 0.0F);
		frontBody_r1.setTextureOffset(0, 0).addCuboid(-12.0F, -54.0F, -29.0F, 24.0F, 35.0F, 32.0F, 0.0F, false);

		rightLeg_r1 = new ModelPart(this);
		rightLeg_r1.setPivot(0.0F, 0.0F, 0.0F);
		root.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, -0.2618F, 0.0F, 0.0F);
		rightLeg_r1.setTextureOffset(0, 0).addCuboid(-6.0F, -17.0F, -10.0F, 3.0F, 18.0F, 3.0F, 0.0F, false);

	}

	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
			//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha)
	{
			
			root.render(matrixStack, buffer, packedLight, packedOverlay);

	}
	public void setRotationAngle(ModelPart bone, float x, float y, float z)
	{

			bone.pitch = x;
			bone.yaw = y;
			bone.roll = z;

	}
	
}