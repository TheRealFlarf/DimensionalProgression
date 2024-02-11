
package net.therealflarf.dimprogress.client.renderer;

public class CottonweaveRenderer extends MobRenderer<CottonweaveEntity, Modelcottonweave<CottonweaveEntity>> {

	public CottonweaveRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcottonweave(context.bakeLayer(Modelcottonweave.LAYER_LOCATION)), 0.6f);

	}

	@Override
	public ResourceLocation getTextureLocation(CottonweaveEntity entity) {
		return new ResourceLocation("dim_progress:textures/entities/cottonweave.png");
	}

}
