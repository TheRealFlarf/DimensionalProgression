
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.world.inventory.ForgeAnvilUIMenu;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class DimProgressModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DimProgressMod.MODID);
	public static final RegistryObject<MenuType<ForgeAnvilUIMenu>> FORGE_ANVIL_UI = REGISTRY.register("forge_anvil_ui", () -> IForgeMenuType.create(ForgeAnvilUIMenu::new));
}
