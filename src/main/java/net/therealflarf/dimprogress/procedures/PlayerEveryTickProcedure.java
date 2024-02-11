package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerEveryTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
if (<) {if (<=0) {}}else if (>) {}entity.getPersistentData().putDouble("runicPower", );entity.getPersistentData().putDouble("maxRunicPower", );entity.getPersistentData().putDouble("runicPowerRegenerationRate", );entity.getPersistentData().putDouble("runicPowerRegenerationCooldown", );
}
}
