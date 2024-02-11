package net.therealflarf.dimprogress.block.model;

public class RunicRiftGateDisplayModel extends GeoModel<RunicRiftGateDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RunicRiftGateDisplayItem animatable) {
		return new ResourceLocation("dim_progress", "animations/runic_rift_gate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RunicRiftGateDisplayItem animatable) {
		return new ResourceLocation("dim_progress", "geo/runic_rift_gate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RunicRiftGateDisplayItem entity) {
		return new ResourceLocation("dim_progress", "textures/block/runic_rift_gate.png");
	}
}