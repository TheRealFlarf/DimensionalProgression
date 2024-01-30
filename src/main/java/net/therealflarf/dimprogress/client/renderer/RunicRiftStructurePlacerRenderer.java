
package net.therealflarf.dimprogress.client.renderer;

import net.therealflarf.dimprogress.entity.RunicRiftStructurePlacerEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class RunicRiftStructurePlacerRenderer extends HumanoidMobRenderer<RunicRiftStructurePlacerEntity, HumanoidModel<RunicRiftStructurePlacerEntity>> {
	public RunicRiftStructurePlacerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RunicRiftStructurePlacerEntity entity) {
		return new ResourceLocation("dim_progress:textures/entities/blank_entity.png");
	}
}
