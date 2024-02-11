package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class LifeCrystalHasItemGlowingEffectProcedure {
	public static boolean execute(ItemStack itemstack) {
		boolean ReturnValue = false;
		if (itemstack.getOrCreateTag().getDouble("vitality") >= 10) {
			ReturnValue = true;
		} else {
			ReturnValue = false;
		}
		return ReturnValue;
	}
}
