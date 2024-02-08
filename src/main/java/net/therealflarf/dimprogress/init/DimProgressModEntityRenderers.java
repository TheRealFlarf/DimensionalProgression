
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.client.renderer.RunicRiftStructurePlacerRenderer;
import net.therealflarf.dimprogress.client.renderer.MagnianRenderer;
import net.therealflarf.dimprogress.client.renderer.DTHallwayPlacementRenderer;
import net.therealflarf.dimprogress.client.renderer.CottonweaveRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DimProgressModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DimProgressModEntities.COTTONWEAVE.get(), CottonweaveRenderer::new);
		event.registerEntityRenderer(DimProgressModEntities.DT_HALLWAY_PLACEMENT.get(), DTHallwayPlacementRenderer::new);
		event.registerEntityRenderer(DimProgressModEntities.RUNIC_RIFT_STRUCTURE_PLACER.get(), RunicRiftStructurePlacerRenderer::new);
		event.registerEntityRenderer(DimProgressModEntities.MAGNIAN.get(), MagnianRenderer::new);
	}
}
