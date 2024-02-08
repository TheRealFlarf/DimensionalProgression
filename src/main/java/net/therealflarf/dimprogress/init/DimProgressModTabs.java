
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DimProgressModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimProgressMod.MODID);
	public static final RegistryObject<CreativeModeTab> DP_MISC = REGISTRY.register("dp_misc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dim_progress.dp_misc")).icon(() -> new ItemStack(DimProgressModItems.RUNICON_SHARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DimProgressModItems.RUNICON_SHARD.get());
				tabData.accept(DimProgressModItems.RUNIC_GEMSTONE.get());
				tabData.accept(DimProgressModItems.LIFE_CRYSTAL.get());
				tabData.accept(DimProgressModItems.INFUSED_VITALITY_CRYSTAL.get());
				tabData.accept(DimProgressModItems.MOLTEN_CLAY_BALL.get());
				tabData.accept(DimProgressModItems.TEPIDBRICK.get());
				tabData.accept(DimProgressModBlocks.DARK_GRAIN.get().asItem());
				tabData.accept(DimProgressModItems.DARK_GRAINS.get());
				tabData.accept(DimProgressModItems.DARK_LOAF.get());
				tabData.accept(DimProgressModItems.DARK_TOAST.get());
				tabData.accept(DimProgressModItems.RAW_VENOMITE.get());
				tabData.accept(DimProgressModItems.VENOMITE_INGOT.get());
				tabData.accept(DimProgressModItems.DRAIN_RUNIC_POWER.get());
				tabData.accept(DimProgressModItems.COTTONWEAVE_SPAWN_EGG.get());
				tabData.accept(DimProgressModItems.DREADGEM.get());
				tabData.accept(DimProgressModItems.MAGNIAN_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DP_NATURAL = REGISTRY.register("dp_natural",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dim_progress.dp_natural")).icon(() -> new ItemStack(DimProgressModBlocks.CRIMSON_CRIMSOIL_GRASS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DimProgressModBlocks.DEEPSLATE_RUNICON_ORE.get().asItem());
				tabData.accept(DimProgressModBlocks.RIFTROCK_COBBLE.get().asItem());
				tabData.accept(DimProgressModBlocks.DREADSTONE.get().asItem());
				tabData.accept(DimProgressModBlocks.DREADSTONE_VENOMITE_ORE.get().asItem());
				tabData.accept(DimProgressModBlocks.HECKROCK.get().asItem());
				tabData.accept(DimProgressModBlocks.HECKROCK_VENOMITE_ORE.get().asItem());
				tabData.accept(DimProgressModBlocks.SUNBURST_ZIOLIP.get().asItem());
				tabData.accept(DimProgressModBlocks.MAGENTA_ZIOLIP.get().asItem());
				tabData.accept(DimProgressModBlocks.PURPLE_ZIOLIP.get().asItem());
				tabData.accept(DimProgressModBlocks.FIREBLOOM.get().asItem());
				tabData.accept(DimProgressModBlocks.VOIDENBELLS.get().asItem());
				tabData.accept(DimProgressModBlocks.TEAL_ZIOLIP.get().asItem());
				tabData.accept(DimProgressModBlocks.FELSAND.get().asItem());
				tabData.accept(DimProgressModBlocks.MAGMACTUS.get().asItem());
				tabData.accept(DimProgressModBlocks.FELSANDSTONE.get().asItem());
				tabData.accept(DimProgressModBlocks.SUNLIT_SILICA.get().asItem());
				tabData.accept(DimProgressModBlocks.MOLTEN_CLAY.get().asItem());
				tabData.accept(DimProgressModBlocks.CRIMSOIL.get().asItem());
				tabData.accept(DimProgressModBlocks.CRIMSON_MUD.get().asItem());
				tabData.accept(DimProgressModBlocks.CRIMSON_SPRIGS.get().asItem());
				tabData.accept(DimProgressModBlocks.CRIMSON_CRIMSOIL_GRASS.get().asItem());
				tabData.accept(DimProgressModBlocks.DEAD_PERGALON_SPRIGS.get().asItem());
				tabData.accept(DimProgressModBlocks.DEAD_CRIMSOIL_GRASS.get().asItem());
				tabData.accept(DimProgressModBlocks.GROVILE_SPRIGS.get().asItem());
				tabData.accept(DimProgressModBlocks.GROVILE_CRIMSOIL_GRASS.get().asItem());
				tabData.accept(DimProgressModBlocks.NYCTIC_SPRIGS.get().asItem());
				tabData.accept(DimProgressModBlocks.NYCTECIUM.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_LOG.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_LEAVES.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_SAPLING.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_LOG.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_LEAVES.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_SAPLING.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_LOG.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_LEAVES.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_SAPLING.get().asItem());
				tabData.accept(DimProgressModBlocks.NYCTOCAP_STEM.get().asItem());
				tabData.accept(DimProgressModBlocks.NYCTOCAP_CAP.get().asItem());
				tabData.accept(DimProgressModBlocks.NYCTOCAP_MUSHROOM.get().asItem());
				tabData.accept(DimProgressModBlocks.DREADSTONE_DREADGEM_ORE.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DP_BUILDING = REGISTRY.register("dp_building",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dim_progress.dp_building")).icon(() -> new ItemStack(DimProgressModBlocks.CUT_FELSANDSTONE_BRICKS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DimProgressModBlocks.RUNICON_BLOCK.get().asItem());
				tabData.accept(DimProgressModBlocks.LARGE_RUNICON_CLUSTER.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_STONE_PORTAL_CORE.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_STONE_PILLAR.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_STONE_RING.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_DREADSTONE_PORTAL_CORE.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_DREADSTONE_PILLAR.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_DREADSTONE_RING.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_RIFTROCK.get().asItem());
				tabData.accept(DimProgressModBlocks.RIFTROCK_BRICKS.get().asItem());
				tabData.accept(DimProgressModBlocks.CRYSTAL_GLASS.get().asItem());
				tabData.accept(DimProgressModBlocks.DREADSTONE_BRICKS.get().asItem());
				tabData.accept(DimProgressModBlocks.DREADSTONE_BRICK_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.DREADSTONE_BRICK_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.CRACKED_DREADSTONE_BRICKS.get().asItem());
				tabData.accept(DimProgressModBlocks.SUNLIT_SILICA_GLASS.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_PLANKS.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_FENCE.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_FENCE_GATE.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_PRESSURE_PLATE.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_BUTTON.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_TRAPDOOR.get().asItem());
				tabData.accept(DimProgressModBlocks.EMBERSEED_DOOR.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_PLANKS.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_FENCE.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_FENCE_GATE.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_PRESSURE_PLATE.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_BUTTON.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_DOOR.get().asItem());
				tabData.accept(DimProgressModBlocks.PYRIND_TRAPDOOR.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_PLANKS.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_FENCE.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_FENCE_GATE.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_PRESSURE_PLATE.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_BUTTON.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_DOOR.get().asItem());
				tabData.accept(DimProgressModBlocks.CLOTBARK_TRAPDOOR.get().asItem());
				tabData.accept(DimProgressModBlocks.NYCTOCAP_PLANKS.get().asItem());
				tabData.accept(DimProgressModBlocks.NYCTOCAP_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.NYCTOCAP_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.CUT_FELSANDSTONE.get().asItem());
				tabData.accept(DimProgressModBlocks.CUT_FELSANDSTONE_BRICKS.get().asItem());
				tabData.accept(DimProgressModBlocks.CUT_FELSANDSTONE_BRICK_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.CUT_FELSANDSTONE_BRICK_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_HECKROCK.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_HECKROCK_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_HECKROCK_BRICKS.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_HECKROCK_BRICK_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_HECKROCK_BRICK_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_HECKROCK_BRICK_WALL.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_HECKROCK_TILES.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_HECKROCK_TILE_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.POLISHED_HECKROCK_TILE_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.VENOMITE_BLOCK.get().asItem());
				tabData.accept(DimProgressModBlocks.RAW_VENOMITE_BLOCK.get().asItem());
				tabData.accept(DimProgressModBlocks.TEPIDBRICKS.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_DEEPSLATE_RING.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_DEEPSLATE_PILLAR.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_DEEPSLATE_PORTAL_CORE.get().asItem());
				tabData.accept(DimProgressModBlocks.RIFTROCK_BRICK_STAIRS.get().asItem());
				tabData.accept(DimProgressModBlocks.RIFTROCK_BRICK_SLAB.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNE_CANDLE.get().asItem());
				tabData.accept(DimProgressModBlocks.RUNIC_RIFT_GATE.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DP_TOOLS = REGISTRY.register("dp_tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dim_progress.dp_tools")).icon(() -> new ItemStack(DimProgressModItems.NETHER_PORTAL_CHARGE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DimProgressModItems.NETHER_PORTAL_CHARGE.get());
				tabData.accept(DimProgressModItems.PERGALON_PORTAL_CHARGE.get());
				tabData.accept(DimProgressModItems.WORLDGEN_TEST.get());
				tabData.accept(DimProgressModItems.PROCEDURAL_DUNGEON_GEN_TEST.get());
				tabData.accept(DimProgressModItems.VENOMITE_AXE.get());
				tabData.accept(DimProgressModItems.VENOMITE_PICKAXE.get());
				tabData.accept(DimProgressModItems.VENOMITE_SHOVEL.get());
				tabData.accept(DimProgressModItems.VENOMITE_HOE.get());
				tabData.accept(DimProgressModItems.VENOMITE_SWORD.get());
				tabData.accept(DimProgressModItems.DREADGEM_SWORD.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DimProgressModItems.DT_HALLWAY_PLACEMENT_SPAWN_EGG.get());
			tabData.accept(DimProgressModItems.RUNIC_RIFT_STRUCTURE_PLACER_SPAWN_EGG.get());
		}
	}
}
