package net.therealflarf.dimprogress.procedures;

import net.therealflarf.dimprogress.network.DimProgressModVariables;

import net.minecraft.world.entity.Entity;

public class RunicPowerOverlayTextProviderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(DimProgressModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DimProgressModVariables.PlayerVariables())).RunicPowerOverlayProvidedText;
	}
}
