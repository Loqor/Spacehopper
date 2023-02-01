/*package com.loqor.spchpr.client.models;// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import javax.swing.text.html.parser.Entity;

public class VortexManipulatorModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "vortexmanipulatormodel"), "main");
	private final ModelPart right_arm;

	public VortexManipulatorModel(ModelPart right_arm) {
		this.right_arm = right_arm.getChild("right_arm");;
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -4.0F, 5.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.002F))
		.texOffs(0, 0).addBox(-10.0F, 0.1F, 5.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.002F))
		.texOffs(0, 0).addBox(-5.9F, -3.9F, 5.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.002F))
		.texOffs(0, 0).addBox(-10.1F, -3.9F, 5.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.002F))
		.texOffs(0, 0).addBox(-10.0F, -4.05F, 5.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.0F, -4.3F, 8.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.0F, -4.3F, 5.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.566F, 16.0F, 2.7797F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone = right_arm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-10.0046F, -4.0031F, 5.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}*/