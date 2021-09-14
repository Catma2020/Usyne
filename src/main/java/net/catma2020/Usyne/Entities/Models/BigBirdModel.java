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
	private final ModelPart head;
	private final ModelPart topBeak;
	private final ModelPart bottomBeak;
	private final ModelPart neck;
	private final ModelPart frontBody;
	private final ModelPart middleBody;
	private final ModelPart backBody;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;
	private final ModelPart leftWing;
	private final ModelPart rightWing;
	private final ModelPart leftFoot;
	private final ModelPart rightFoot;
	private final ModelPart leftToe1;
	private final ModelPart leftToe2;
	private final ModelPart leftToe3;
	private final ModelPart leftToe4;
	private final ModelPart rightToe1;
	private final ModelPart rightToe2;
	private final ModelPart rightToe3;
	private final ModelPart rightToe4;

	public BigBirdModel(ModelPart root)
	{

		this.root = root;
		this.head = root.getChild(EntityModelPartNames.HEAD);
		this.topBeak = root.getChild("TOPBEAK");
		this.bottomBeak = root.getChild("BOTTOMBEAK");
		this.neck = root.getChild(EntityModelPartNames.NECK);
		this.frontBody = root.getChild("FRONTBODY");
		this.middleBody = root.getChild("MIDDLEBODY");
		this.backBody = root.getChild("BACKBODY");
		this.leftLeg = root.getChild(EntityModelPartNames.LEFT_LEG);
		this.rightLeg = root.getChild(EntityModelPartNames.RIGHT_LEG);
		this.leftWing = root.getChild(EntityModelPartNames.LEFT_WING);
		this.rightWing = root.getChild(EntityModelPartNames.RIGHT_WING);
		this.leftFoot = root.getChild(EntityModelPartNames.LEFT_HIND_FOOT);
		this.rightFoot = root.getChild(EntityModelPartNames.RIGHT_HIND_FOOT);
		this.leftToe1 = root.getChild("LEFTTOE1");
		this.leftToe2 = root.getChild("LEFTTOE2");
		this.leftToe3 = root.getChild("LEFTTOE3");
		this.leftToe4 = root.getChild("LEFTTOE4");
		this.rightToe1 = root.getChild("RIGHTTOE1");
		this.rightToe2 = root.getChild("RIGHTTOE2");
		this.rightToe3 = root.getChild("RIGHTTOE3");
		this.rightToe4 = root.getChild("RIGHTTOE4");

	}

	public static TexturedModelData getTexturedModelData()
	{

		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		int uv = 0;

		modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(0, 0).cuboid(-9.0f, -77.0f, -30.0f, 18.0f, 15.0f, 22.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0873f, 0.0f, 0.0f));
		modelPartData.addChild("TOPBEAK", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-7.0f, -71.0f, -17.0f, 14.0f, 2.0f, -14.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.2182f, 0.0f, 0.0f));
		modelPartData.addChild("BOTTOMBEAK", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-5.0f, -62.0f, -35.0f, 10.0f, 3.0f, -9.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		modelPartData.addChild(EntityModelPartNames.NECK, ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-9.0f, -62.0f, -31.0f, 18.0f, 31.0f, 18.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		modelPartData.addChild("FRONTBODY", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-12.0f, -54.0f, -29.0f, 24.0f, 35.0f, 32.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, -0.0436f, 0.0f, 0.0f));
		modelPartData.addChild("MIDDLEBODY", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-10.0f, -49.0f, -2.0f, 20.0f, 31.0f, 25.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, -0.1309f, 0.0f, 0.0f));
		modelPartData.addChild("BACKBODY", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-6.0f, -39.0f, 23.0f, 12.0f, 21.0f, 27.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, -0.1309f, 0.0f, 0.0f));
		modelPartData.addChild(EntityModelPartNames.LEFT_LEG, ModelPartBuilder.create().uv(0, ++uv*128).cuboid(3.0f, -18.0f, 3.0f, 3.0f, 16.0f, 3.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		modelPartData.addChild(EntityModelPartNames.RIGHT_LEG, ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-6.0f, -17.0f, -10.0f, 3.0f, 18.0f, 3.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, -0.2618f, 0.0f, 0.0f));
		modelPartData.addChild(EntityModelPartNames.LEFT_WING, ModelPartBuilder.create().uv(0, ++uv*128).cuboid(12.0f, -50.0f, -27.0f, 4.0f, 30.0f, 80.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, -0.1309f, 0.0f, 0.0f));
		modelPartData.addChild(EntityModelPartNames.RIGHT_WING, ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-16.0f, -50.0f, -27.0f, 4.0f, 30.0f, 80.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, -0.1309f, 0.0f, 0.0f));
		modelPartData.addChild(EntityModelPartNames.LEFT_HIND_FOOT, ModelPartBuilder.create().uv(0, ++uv*128).cuboid(2.0f, -2.0f, 2.0f, 5.0f, 2.0f, 5.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		modelPartData.addChild(EntityModelPartNames.RIGHT_HIND_FOOT, ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-7.0f, -2.0f, -11.0f, 5.0f, 2.0f, 5.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		modelPartData.addChild("LEFTTOE1", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(3.0f, -2.0f, 6.0f, 3.0f, 2.0f, 5.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		modelPartData.addChild("LEFTTOE2", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(6.0f, -2.0f, -5.0f, 2.0f, 2.0f, 8.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, -0.2618f, 0.0f));
		modelPartData.addChild("LEFTTOE3", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(3.0f, -2.0f, -5.0f, 3.0f, 2.0f, 7.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		modelPartData.addChild("LEFTTOE4", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(1.0f, -2.0f, -2.0f, 2.0f, 2.0f, 8.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.3491f, 0.0f));
		modelPartData.addChild("RIGHTTOE1", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-6.0f, -2.0f, -7.0f, 3.0f, 2.0f, 5.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		modelPartData.addChild("RIGHTTOE2", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-6.0f, -2.0f, -15.0f, 2.0f, 2.0f, 8.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, -0.2618f, 0.0f));
		modelPartData.addChild("RIGHTTOE3", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-6.0f, -2.0f, -17.0f, 3.0f, 2.0f, 7.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		modelPartData.addChild("RIGHTTOE4", ModelPartBuilder.create().uv(0, ++uv*128).cuboid(-4.0f, -2.0f, -17.0f, 2.0f, 2.0f, 8.0f), ModelTransform.of(0.0f, 24.0f, 0.0f, 0.0f, 0.3491f, 0.0f));

		return TexturedModelData.of(modelData, 2668, 2668);
		
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