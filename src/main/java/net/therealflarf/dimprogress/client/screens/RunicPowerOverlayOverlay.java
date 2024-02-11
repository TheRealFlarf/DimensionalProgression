
package net.therealflarf.dimprogress.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class RunicPowerOverlayOverlay {

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();

		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;

		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}

		if (true) {

			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					RunicPowerOverlayTextProviderProcedure.execute(), w / 2 + -213, h - 10, -65281, false);

		}

	}

}
