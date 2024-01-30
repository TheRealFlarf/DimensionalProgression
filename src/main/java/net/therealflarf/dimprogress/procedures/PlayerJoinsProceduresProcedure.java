package net.therealflarf.dimprogress.procedures;

import net.therealflarf.dimprogress.network.DimProgressModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerJoinsProceduresProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("dim_progress:dimensional_progression_start"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				for (String criteria : _ap.getRemainingCriteria())
					_player.getAdvancements().award(_adv, criteria);
			}
		}
		entity.getPersistentData().putDouble("maxRunicPower", 20);
		entity.getPersistentData().putDouble("runicPower", 20);
		entity.getPersistentData().putDouble("runicPowerRegenerationRate", 80);
		entity.getPersistentData().putDouble("runicPowerRegenerationCooldown", 0);
		if ((entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).isFirstJoin) {
			{
				boolean _setval = false;
				entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.isFirstJoin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
