package net.therealflarf.dimprogress.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.therealflarf.dimprogress.block.model.RunicRiftGateDisplayModel;
import net.therealflarf.dimprogress.block.display.RunicRiftGateDisplayItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class RunicRiftGateDisplayItemRenderer extends GeoItemRenderer<RunicRiftGateDisplayItem> {
	public RunicRiftGateDisplayItemRenderer() {
		super(new RunicRiftGateDisplayModel());
	}

	@Override
	public RenderType getRenderType(RunicRiftGateDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
