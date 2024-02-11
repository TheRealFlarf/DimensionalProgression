package net.therealflarf.dimprogress.block.listener;

import net.therealflarf.dimprogress.init.DimProgressModBlockEntities;
import net.therealflarf.dimprogress.block.renderer.RunicRiftGateTileRenderer;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(modid = DimProgressMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(DimProgressModBlockEntities.RUNIC_RIFT_GATE.get(), context -> new RunicRiftGateTileRenderer());
	}
}
