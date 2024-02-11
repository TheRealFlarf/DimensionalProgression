package net.therealflarf.dimprogress.block.renderer;

public class RunicRiftGateDisplayItemRenderer extends GeoItemRenderer<RunicRiftGateDisplayItem> {
	public RunicRiftGateDisplayItemRenderer() {
		super(new RunicRiftGateDisplayModel());
	}

	@Override
	public RenderType getRenderType(RunicRiftGateDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}