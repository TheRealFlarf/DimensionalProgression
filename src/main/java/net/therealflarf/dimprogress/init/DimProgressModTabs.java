
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class DimProgressModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimProgressMod.MODID);
	public static final RegistryObject<CreativeModeTab> DP_MISC = REGISTRY.register("dp_misc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dim_progress.dp_misc")).icon(() -> new ItemStack(DimProgressModItems.RUNICON_SHARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DimProgressModItems.RUNICON_SHARD.get());
				tabData.accept(DimProgressModItems.RUNIC_GEMSTONE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DP_NATURAL = REGISTRY.register("dp_natural",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dim_progress.dp_natural")).icon(() -> new ItemStack(Blocks.GRASS_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(DimProgressModBlocks.DEEPSLATE_RUNICON_ORE.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DP_BUILDING = REGISTRY.register("dp_building",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dim_progress.dp_building")).icon(() -> new ItemStack(Blocks.MOSSY_STONE_BRICKS)).displayItems((parameters, tabData) -> {
				tabData.accept(DimProgressModBlocks.RUNICON_BLOCK.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_STONE_RING.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_STONE_PILLAR.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_STONE_PORTAL_CORE.get().asItem());
				tabData.accept(DimProgressModBlocks.CRYSTAL_GLASS.get().asItem());
			})

					.build());
}
