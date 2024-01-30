
package net.therealflarf.dimprogress.client.renderer;

import net.therealflarf.dimprogress.entity.CottonweaveEntity;
import net.therealflarf.dimprogress.client.model.Modelcottonweave;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CottonweaveRenderer extends MobRenderer<CottonweaveEntity, Modelcottonweave<CottonweaveEntity>> {
	public CottonweaveRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcottonweave(context.bakeLayer(Modelcottonweave.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(CottonweaveEntity entity) {
		return new ResourceLocation("dim_progress:textures/entities/cottonweave.png");
	}
}
