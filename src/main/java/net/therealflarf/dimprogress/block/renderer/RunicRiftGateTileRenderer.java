package net.therealflarf.dimprogress.block.renderer;

public class RunicRiftGateTileRenderer extends GeoBlockRenderer<RunicRiftGateTileEntity> {
	public RunicRiftGateTileRenderer() {
		super(new RunicRiftGateBlockModel());
	}

	@Override
	public RenderType getRenderType(RunicRiftGateTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}