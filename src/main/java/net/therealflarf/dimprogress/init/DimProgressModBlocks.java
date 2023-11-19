
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.block.WorldgenTestPortalBlock;
import net.therealflarf.dimprogress.block.SunlitSilicaGlassBlock;
import net.therealflarf.dimprogress.block.SunlitSilicaBlock;
import net.therealflarf.dimprogress.block.SunburstZiolipBlock;
import net.therealflarf.dimprogress.block.RuniconBlockBlock;
import net.therealflarf.dimprogress.block.RunicStoneRingBlock;
import net.therealflarf.dimprogress.block.RunicStonePortalCoreBlock;
import net.therealflarf.dimprogress.block.RunicStonePillarBlock;
import net.therealflarf.dimprogress.block.PyrindStairsBlock;
import net.therealflarf.dimprogress.block.PyrindSlabBlock;
import net.therealflarf.dimprogress.block.PyrindPressurePlateBlock;
import net.therealflarf.dimprogress.block.PyrindPlanksBlock;
import net.therealflarf.dimprogress.block.PyrindLogBlock;
import net.therealflarf.dimprogress.block.PyrindLeavesBlock;
import net.therealflarf.dimprogress.block.PyrindFenceGateBlock;
import net.therealflarf.dimprogress.block.PyrindFenceBlock;
import net.therealflarf.dimprogress.block.PyrindButtonBlock;
import net.therealflarf.dimprogress.block.PurpleZiolipBlock;
import net.therealflarf.dimprogress.block.ProceduralDungeonGenTestPortalBlock;
import net.therealflarf.dimprogress.block.PergalonPortalBlock;
import net.therealflarf.dimprogress.block.NycticSprigsBlock;
import net.therealflarf.dimprogress.block.NycteciumBlock;
import net.therealflarf.dimprogress.block.MagmactusBlock;
import net.therealflarf.dimprogress.block.MagentaZiolipBlock;
import net.therealflarf.dimprogress.block.GrovileSprigsBlock;
import net.therealflarf.dimprogress.block.GrovileCrimsoilGrassBlock;
import net.therealflarf.dimprogress.block.FirebloomBlock;
import net.therealflarf.dimprogress.block.FelsandstoneBlock;
import net.therealflarf.dimprogress.block.FelsandBlock;
import net.therealflarf.dimprogress.block.EmberseedStairsBlock;
import net.therealflarf.dimprogress.block.EmberseedSlabBlock;
import net.therealflarf.dimprogress.block.EmberseedPressurePlateBlock;
import net.therealflarf.dimprogress.block.EmberseedPlanksBlock;
import net.therealflarf.dimprogress.block.EmberseedLogBlock;
import net.therealflarf.dimprogress.block.EmberseedLeavesBlock;
import net.therealflarf.dimprogress.block.EmberseedFenceGateBlock;
import net.therealflarf.dimprogress.block.EmberseedFenceBlock;
import net.therealflarf.dimprogress.block.EmberseedButtonBlock;
import net.therealflarf.dimprogress.block.DreadstoneBricksBlock;
import net.therealflarf.dimprogress.block.DreadstoneBrickStairsBlock;
import net.therealflarf.dimprogress.block.DreadstoneBrickSlabBlock;
import net.therealflarf.dimprogress.block.DreadstoneBlock;
import net.therealflarf.dimprogress.block.DeepslateRuniconOreBlock;
import net.therealflarf.dimprogress.block.DeadPergalonSprigsBlock;
import net.therealflarf.dimprogress.block.DeadCrimsoilGrassBlock;
import net.therealflarf.dimprogress.block.CutFelsandstoneBricksBlock;
import net.therealflarf.dimprogress.block.CutFelsandstoneBrickStairsBlock;
import net.therealflarf.dimprogress.block.CutFelsandstoneBrickSlabBlock;
import net.therealflarf.dimprogress.block.CutFelsandstoneBlock;
import net.therealflarf.dimprogress.block.CrystalGlassBlock;
import net.therealflarf.dimprogress.block.CrimsonSprigsBlock;
import net.therealflarf.dimprogress.block.CrimsonMudBlock;
import net.therealflarf.dimprogress.block.CrimsonCrimsoilGrassBlock;
import net.therealflarf.dimprogress.block.CrimsoilBlock;
import net.therealflarf.dimprogress.block.CrackedDreadstoneBricksBlock;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class DimProgressModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DimProgressMod.MODID);
	public static final RegistryObject<Block> DEEPSLATE_RUNICON_ORE = REGISTRY.register("deepslate_runicon_ore", () -> new DeepslateRuniconOreBlock());
	public static final RegistryObject<Block> RUNICON_BLOCK = REGISTRY.register("runicon_block", () -> new RuniconBlockBlock());
	public static final RegistryObject<Block> RUNIC_STONE_RING = REGISTRY.register("runic_stone_ring", () -> new RunicStoneRingBlock());
	public static final RegistryObject<Block> RUNIC_STONE_PILLAR = REGISTRY.register("runic_stone_pillar", () -> new RunicStonePillarBlock());
	public static final RegistryObject<Block> RUNIC_STONE_PORTAL_CORE = REGISTRY.register("runic_stone_portal_core", () -> new RunicStonePortalCoreBlock());
	public static final RegistryObject<Block> CRYSTAL_GLASS = REGISTRY.register("crystal_glass", () -> new CrystalGlassBlock());
	public static final RegistryObject<Block> DREADSTONE = REGISTRY.register("dreadstone", () -> new DreadstoneBlock());
	public static final RegistryObject<Block> DREADSTONE_BRICKS = REGISTRY.register("dreadstone_bricks", () -> new DreadstoneBricksBlock());
	public static final RegistryObject<Block> DREADSTONE_BRICK_STAIRS = REGISTRY.register("dreadstone_brick_stairs", () -> new DreadstoneBrickStairsBlock());
	public static final RegistryObject<Block> DREADSTONE_BRICK_SLAB = REGISTRY.register("dreadstone_brick_slab", () -> new DreadstoneBrickSlabBlock());
	public static final RegistryObject<Block> CRACKED_DREADSTONE_BRICKS = REGISTRY.register("cracked_dreadstone_bricks", () -> new CrackedDreadstoneBricksBlock());
	public static final RegistryObject<Block> CRIMSOIL = REGISTRY.register("crimsoil", () -> new CrimsoilBlock());
	public static final RegistryObject<Block> CRIMSON_CRIMSOIL_GRASS = REGISTRY.register("crimson_crimsoil_grass", () -> new CrimsonCrimsoilGrassBlock());
	public static final RegistryObject<Block> DEAD_CRIMSOIL_GRASS = REGISTRY.register("dead_crimsoil_grass", () -> new DeadCrimsoilGrassBlock());
	public static final RegistryObject<Block> SUNBURST_ZIOLIP = REGISTRY.register("sunburst_ziolip", () -> new SunburstZiolipBlock());
	public static final RegistryObject<Block> MAGENTA_ZIOLIP = REGISTRY.register("magenta_ziolip", () -> new MagentaZiolipBlock());
	public static final RegistryObject<Block> PURPLE_ZIOLIP = REGISTRY.register("purple_ziolip", () -> new PurpleZiolipBlock());
	public static final RegistryObject<Block> FIREBLOOM = REGISTRY.register("firebloom", () -> new FirebloomBlock());
	public static final RegistryObject<Block> EMBERSEED_LOG = REGISTRY.register("emberseed_log", () -> new EmberseedLogBlock());
	public static final RegistryObject<Block> EMBERSEED_PLANKS = REGISTRY.register("emberseed_planks", () -> new EmberseedPlanksBlock());
	public static final RegistryObject<Block> EMBERSEED_STAIRS = REGISTRY.register("emberseed_stairs", () -> new EmberseedStairsBlock());
	public static final RegistryObject<Block> EMBERSEED_SLAB = REGISTRY.register("emberseed_slab", () -> new EmberseedSlabBlock());
	public static final RegistryObject<Block> EMBERSEED_FENCE = REGISTRY.register("emberseed_fence", () -> new EmberseedFenceBlock());
	public static final RegistryObject<Block> EMBERSEED_FENCE_GATE = REGISTRY.register("emberseed_fence_gate", () -> new EmberseedFenceGateBlock());
	public static final RegistryObject<Block> EMBERSEED_PRESSURE_PLATE = REGISTRY.register("emberseed_pressure_plate", () -> new EmberseedPressurePlateBlock());
	public static final RegistryObject<Block> EMBERSEED_BUTTON = REGISTRY.register("emberseed_button", () -> new EmberseedButtonBlock());
	public static final RegistryObject<Block> FELSAND = REGISTRY.register("felsand", () -> new FelsandBlock());
	public static final RegistryObject<Block> FELSANDSTONE = REGISTRY.register("felsandstone", () -> new FelsandstoneBlock());
	public static final RegistryObject<Block> CUT_FELSANDSTONE = REGISTRY.register("cut_felsandstone", () -> new CutFelsandstoneBlock());
	public static final RegistryObject<Block> CUT_FELSANDSTONE_BRICKS = REGISTRY.register("cut_felsandstone_bricks", () -> new CutFelsandstoneBricksBlock());
	public static final RegistryObject<Block> CUT_FELSANDSTONE_BRICK_STAIRS = REGISTRY.register("cut_felsandstone_brick_stairs", () -> new CutFelsandstoneBrickStairsBlock());
	public static final RegistryObject<Block> CUT_FELSANDSTONE_BRICK_SLAB = REGISTRY.register("cut_felsandstone_brick_slab", () -> new CutFelsandstoneBrickSlabBlock());
	public static final RegistryObject<Block> SUNLIT_SILICA = REGISTRY.register("sunlit_silica", () -> new SunlitSilicaBlock());
	public static final RegistryObject<Block> SUNLIT_SILICA_GLASS = REGISTRY.register("sunlit_silica_glass", () -> new SunlitSilicaGlassBlock());
	public static final RegistryObject<Block> CRIMSON_SPRIGS = REGISTRY.register("crimson_sprigs", () -> new CrimsonSprigsBlock());
	public static final RegistryObject<Block> DEAD_PERGALON_SPRIGS = REGISTRY.register("dead_pergalon_sprigs", () -> new DeadPergalonSprigsBlock());
	public static final RegistryObject<Block> PERGALON_PORTAL = REGISTRY.register("pergalon_portal", () -> new PergalonPortalBlock());
	public static final RegistryObject<Block> WORLDGEN_TEST_PORTAL = REGISTRY.register("worldgen_test_portal", () -> new WorldgenTestPortalBlock());
	public static final RegistryObject<Block> GROVILE_CRIMSOIL_GRASS = REGISTRY.register("grovile_crimsoil_grass", () -> new GrovileCrimsoilGrassBlock());
	public static final RegistryObject<Block> GROVILE_SPRIGS = REGISTRY.register("grovile_sprigs", () -> new GrovileSprigsBlock());
	public static final RegistryObject<Block> NYCTECIUM = REGISTRY.register("nyctecium", () -> new NycteciumBlock());
	public static final RegistryObject<Block> NYCTIC_SPRIGS = REGISTRY.register("nyctic_sprigs", () -> new NycticSprigsBlock());
	public static final RegistryObject<Block> MAGMACTUS = REGISTRY.register("magmactus", () -> new MagmactusBlock());
	public static final RegistryObject<Block> CRIMSON_MUD = REGISTRY.register("crimson_mud", () -> new CrimsonMudBlock());
	public static final RegistryObject<Block> EMBERSEED_LEAVES = REGISTRY.register("emberseed_leaves", () -> new EmberseedLeavesBlock());
	public static final RegistryObject<Block> PYRIND_LOG = REGISTRY.register("pyrind_log", () -> new PyrindLogBlock());
	public static final RegistryObject<Block> PYRIND_PLANKS = REGISTRY.register("pyrind_planks", () -> new PyrindPlanksBlock());
	public static final RegistryObject<Block> PYRIND_STAIRS = REGISTRY.register("pyrind_stairs", () -> new PyrindStairsBlock());
	public static final RegistryObject<Block> PYRIND_SLAB = REGISTRY.register("pyrind_slab", () -> new PyrindSlabBlock());
	public static final RegistryObject<Block> PYRIND_FENCE = REGISTRY.register("pyrind_fence", () -> new PyrindFenceBlock());
	public static final RegistryObject<Block> PYRIND_FENCE_GATE = REGISTRY.register("pyrind_fence_gate", () -> new PyrindFenceGateBlock());
	public static final RegistryObject<Block> PYRIND_PRESSURE_PLATE = REGISTRY.register("pyrind_pressure_plate", () -> new PyrindPressurePlateBlock());
	public static final RegistryObject<Block> PYRIND_BUTTON = REGISTRY.register("pyrind_button", () -> new PyrindButtonBlock());
	public static final RegistryObject<Block> PYRIND_LEAVES = REGISTRY.register("pyrind_leaves", () -> new PyrindLeavesBlock());
	public static final RegistryObject<Block> PROCEDURAL_DUNGEON_GEN_TEST_PORTAL = REGISTRY.register("procedural_dungeon_gen_test_portal", () -> new ProceduralDungeonGenTestPortalBlock());
}
