
package net.therealflarf.dimprogress.client.renderer;

import net.therealflarf.dimprogress.entity.DTHallwayPlacementEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DTHallwayPlacementRenderer extends HumanoidMobRenderer<DTHallwayPlacementEntity, HumanoidModel<DTHallwayPlacementEntity>> {
	public DTHallwayPlacementRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<DTHallwayPlacementEntity, HumanoidModel<DTHallwayPlacementEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dim_progress:textures/entities/blank_entity.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, DTHallwayPlacementEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DTHallwayPlacementEntity entity) {
		return new ResourceLocation("dim_progress:textures/entities/blank_entity.png");
	}
}
