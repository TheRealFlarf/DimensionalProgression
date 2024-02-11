
package net.therealflarf.dimprogress.client.renderer;

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
