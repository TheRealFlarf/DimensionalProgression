package net.therealflarf.dimprogress.procedures;

import net.therealflarf.dimprogress.network.DimProgressModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

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

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = entity.getPersistentData().getDouble("runicPower");
			entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerRunicPower = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("maxRunicPower");
			entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerMaxRunicPower = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("runicPowerRegenerationRate");
			entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerRunicPowerRegenerationRate = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("runicPowerRegenerationCooldown");
			entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerRunicPowerRegenerationCooldown = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPower < (entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DimProgressModVariables.PlayerVariables())).PlayerMaxRunicPower) {
			{
				double _setval = (entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPowerRegenerationCooldown - 1;
				entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRunicPowerRegenerationCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPowerRegenerationCooldown <= 0) {
				{
					double _setval = (entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPowerRegenerationRate;
					entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerRunicPowerRegenerationCooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPower + 1;
					entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerRunicPower = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPower > (entity
				.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerMaxRunicPower) {
			{
				double _setval = (entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerMaxRunicPower;
				entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRunicPower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		entity.getPersistentData().putDouble("runicPower", ((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPower));
		entity.getPersistentData().putDouble("maxRunicPower", ((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerMaxRunicPower));
		entity.getPersistentData().putDouble("runicPowerRegenerationRate", ((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPowerRegenerationRate));
		entity.getPersistentData().putDouble("runicPowerRegenerationCooldown",
				((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPowerRegenerationCooldown));
		{
			String _setval = "Runic Power: " + new java.text.DecimalFormat("##").format((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerRunicPower) + "/"
					+ new java.text.DecimalFormat("##").format((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).PlayerMaxRunicPower);
			entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RunicPowerOverlayProvidedText = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
