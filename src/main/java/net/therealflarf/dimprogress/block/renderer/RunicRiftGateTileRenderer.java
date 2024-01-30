package net.therealflarf.dimprogress.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.therealflarf.dimprogress.block.model.RunicRiftGateBlockModel;
import net.therealflarf.dimprogress.block.entity.RunicRiftGateTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class RunicRiftGateTileRenderer extends GeoBlockRenderer<RunicRiftGateTileEntity> {
	public RunicRiftGateTileRenderer() {
		super(new RunicRiftGateBlockModel());
	}

	@Override
	public RenderType getRenderType(RunicRiftGateTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
