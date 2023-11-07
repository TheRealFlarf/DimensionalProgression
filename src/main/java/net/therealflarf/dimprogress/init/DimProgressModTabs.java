
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
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
				tabData.accept(DimProgressModBlocks.DREADSTONE.get().asItem());
				tabData.accept(DimProgressModBlocks.CRIMSOIL.get().asItem());
				tabData.accept(DimProgressModBlocks.CRIMSON_CRIMSOIL_GRASS.get().asItem());
				tabData.accept(DimProgressModBlocks.DEAD_CRIMSOIL_GRASS.get().asItem());
				tabData.accept(DimProgressModBlocks.SUNBURST_ZIOLIP.get().asItem());
				tabData.accept(DimProgressModBlocks.MAGENTA_ZIOLIP.get().asItem());
				tabData.accept(DimProgressModBlocks.PURPLE_ZIOLIP.get().asItem());
				tabData.accept(DimProgressModBlocks.FIREBLOOM.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_LOG.get().asItem());
				tabData.accept(DimProgressModBlocks.FELSAND.get().asItem());
				tabData.accept(DimProgressModBlocks.FELSANDSTONE.get().asItem());
				tabData.accept(DimProgressModBlocks.SUNLIT_SILICA.get().asItem());
				tabData.accept(DimProgressModBlocks.CRIMSON_SPRIGS.get().asItem());
				tabData.accept(DimProgressModBlocks.DEAD_PERGALON_SPRIGS.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DP_BUILDING = REGISTRY.register("dp_building",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dim_progress.dp_building")).icon(() -> new ItemStack(Blocks.MOSSY_STONE_BRICKS)).displayItems((parameters, tabData) -> {
				tabData.accept(DimProgressModBlocks.RUNICON_BLOCK.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_STONE_RING.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_STONE_PILLAR.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_STONE_PORTAL_CORE.get().asItem());
				tabData.accept(DimProgressModBlocks.CRYSTAL_GLASS.get().asItem());
				tabData.accept(DimProgressModBlocks.DREADSTONE_BRICKS.get().asItem());
				tabData.accept(DimProgressModBlocks.DREADSTONE_BRICK_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.DREADSTONE_BRICK_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.CRACKED_DREADSTONE_BRICKS.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_PLANKS.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_FENCE.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_FENCE_GATE.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_PRESSURE_PLATE.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_BUTTON.get().asItem());
				tabData.accept(DimProgressModBlocks.CUT_FELSANDSTONE.get().asItem());
				tabData.accept(DimProgressModBlocks.CUT_FELSANDSTONE_BRICKS.get().asItem());
				tabData.accept(DimProgressModBlocks.CUT_FELSANDSTONE_BRICK_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.CUT_FELSANDSTONE_BRICK_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.SUNLIT_SILICA_GLASS.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DP_TOOLS = REGISTRY.register("dp_tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dim_progress.dp_tools")).icon(() -> new ItemStack(Items.DIAMOND_AXE)).displayItems((parameters, tabData) -> {
				tabData.accept(DimProgressModItems.NETHER_PORTAL_CHARGE.get());
				tabData.accept(DimProgressModItems.PERGALON_PORTAL_CHARGE.get());
				tabData.accept(DimProgressModItems.WORLDGEN_TEST.get());
			})

					.build());
}
