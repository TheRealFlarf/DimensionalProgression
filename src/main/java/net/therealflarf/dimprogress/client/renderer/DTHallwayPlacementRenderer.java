
package net.therealflarf.dimprogress.client.renderer;

import net.therealflarf.dimprogress.entity.DTHallwayPlacementEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class DTHallwayPlacementRenderer extends HumanoidMobRenderer<DTHallwayPlacementEntity, HumanoidModel<DTHallwayPlacementEntity>> {
	public DTHallwayPlacementRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new EyesLayer<DTHallwayPlacementEntity, HumanoidModel<DTHallwayPlacementEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dim_progress:textures/entities/blank_entity.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DTHallwayPlacementEntity entity) {
		return new ResourceLocation("dim_progress:textures/entities/blank_entity.png");
	}
}
