package net.therealflarf.dimprogress.procedures;

import net.minecraft.world.item.ItemStack;

public class LifeCrystalPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("vitality");
	}
}
