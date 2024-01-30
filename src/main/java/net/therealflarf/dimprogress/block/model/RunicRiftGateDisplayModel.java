package net.therealflarf.dimprogress.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.therealflarf.dimprogress.block.display.RunicRiftGateDisplayItem;

import net.minecraft.resources.ResourceLocation;

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
