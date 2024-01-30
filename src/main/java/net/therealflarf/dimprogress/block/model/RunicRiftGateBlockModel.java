package net.therealflarf.dimprogress.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.therealflarf.dimprogress.block.entity.RunicRiftGateTileEntity;

import net.minecraft.resources.ResourceLocation;

public class RunicRiftGateBlockModel extends GeoModel<RunicRiftGateTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RunicRiftGateTileEntity animatable) {
		return new ResourceLocation("dim_progress", "animations/runic_rift_gate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RunicRiftGateTileEntity animatable) {
		return new ResourceLocation("dim_progress", "geo/runic_rift_gate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RunicRiftGateTileEntity entity) {
		return new ResourceLocation("dim_progress", "textures/block/runic_rift_gate.png");
	}
}
