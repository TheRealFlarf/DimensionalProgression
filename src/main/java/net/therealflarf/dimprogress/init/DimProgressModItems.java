
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.item.WorldgenTestItem;
import net.therealflarf.dimprogress.item.RuniconShardItem;
import net.therealflarf.dimprogress.item.RunicGemstoneItem;
import net.therealflarf.dimprogress.item.PergalonPortalChargeItem;
import net.therealflarf.dimprogress.item.NetherPortalChargeItem;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class DimProgressModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DimProgressMod.MODID);
	public static final RegistryObject<Item> RUNICON_SHARD = REGISTRY.register("runicon_shard", () -> new RuniconShardItem());
	public static final RegistryObject<Item> DEEPSLATE_RUNICON_ORE = block(DimProgressModBlocks.DEEPSLATE_RUNICON_ORE);
	public static final RegistryObject<Item> RUNICON_BLOCK = block(DimProgressModBlocks.RUNICON_BLOCK);
	public static final RegistryObject<Item> RUNIC_GEMSTONE = REGISTRY.register("runic_gemstone", () -> new RunicGemstoneItem());
	public static final RegistryObject<Item> RUNIC_STONE_RING = block(DimProgressModBlocks.RUNIC_STONE_RING);
	public static final RegistryObject<Item> RUNIC_STONE_PILLAR = block(DimProgressModBlocks.RUNIC_STONE_PILLAR);
	public static final RegistryObject<Item> RUNIC_STONE_PORTAL_CORE = block(DimProgressModBlocks.RUNIC_STONE_PORTAL_CORE);
	public static final RegistryObject<Item> CRYSTAL_GLASS = block(DimProgressModBlocks.CRYSTAL_GLASS);
	public static final RegistryObject<Item> NETHER_PORTAL_CHARGE = REGISTRY.register("nether_portal_charge", () -> new NetherPortalChargeItem());
	public static final RegistryObject<Item> DREADSTONE = block(DimProgressModBlocks.DREADSTONE);
	public static final RegistryObject<Item> DREADSTONE_BRICKS = block(DimProgressModBlocks.DREADSTONE_BRICKS);
	public static final RegistryObject<Item> DREADSTONE_BRICK_STAIRS = block(DimProgressModBlocks.DREADSTONE_BRICK_STAIRS);
	public static final RegistryObject<Item> DREADSTONE_BRICK_SLAB = block(DimProgressModBlocks.DREADSTONE_BRICK_SLAB);
	public static final RegistryObject<Item> CRACKED_DREADSTONE_BRICKS = block(DimProgressModBlocks.CRACKED_DREADSTONE_BRICKS);
	public static final RegistryObject<Item> CRIMSOIL = block(DimProgressModBlocks.CRIMSOIL);
	public static final RegistryObject<Item> CRIMSON_CRIMSOIL_GRASS = block(DimProgressModBlocks.CRIMSON_CRIMSOIL_GRASS);
	public static final RegistryObject<Item> DEAD_CRIMSOIL_GRASS = block(DimProgressModBlocks.DEAD_CRIMSOIL_GRASS);
	public static final RegistryObject<Item> SUNBURST_ZIOLIP = block(DimProgressModBlocks.SUNBURST_ZIOLIP);
	public static final RegistryObject<Item> MAGENTA_ZIOLIP = block(DimProgressModBlocks.MAGENTA_ZIOLIP);
	public static final RegistryObject<Item> PURPLE_ZIOLIP = block(DimProgressModBlocks.PURPLE_ZIOLIP);
	public static final RegistryObject<Item> FIREBLOOM = block(DimProgressModBlocks.FIREBLOOM);
	public static final RegistryObject<Item> EMBERSEED_LOG = block(DimProgressModBlocks.EMBERSEED_LOG);
	public static final RegistryObject<Item> EMBERSEED_PLANKS = block(DimProgressModBlocks.EMBERSEED_PLANKS);
	public static final RegistryObject<Item> EMBERSEED_STAIRS = block(DimProgressModBlocks.EMBERSEED_STAIRS);
	public static final RegistryObject<Item> EMBERSEED_SLAB = block(DimProgressModBlocks.EMBERSEED_SLAB);
	public static final RegistryObject<Item> EMBERSEED_FENCE = block(DimProgressModBlocks.EMBERSEED_FENCE);
	public static final RegistryObject<Item> EMBERSEED_FENCE_GATE = block(DimProgressModBlocks.EMBERSEED_FENCE_GATE);
	public static final RegistryObject<Item> EMBERSEED_PRESSURE_PLATE = block(DimProgressModBlocks.EMBERSEED_PRESSURE_PLATE);
	public static final RegistryObject<Item> EMBERSEED_BUTTON = block(DimProgressModBlocks.EMBERSEED_BUTTON);
	public static final RegistryObject<Item> FELSAND = block(DimProgressModBlocks.FELSAND);
	public static final RegistryObject<Item> FELSANDSTONE = block(DimProgressModBlocks.FELSANDSTONE);
	public static final RegistryObject<Item> CUT_FELSANDSTONE = block(DimProgressModBlocks.CUT_FELSANDSTONE);
	public static final RegistryObject<Item> CUT_FELSANDSTONE_BRICKS = block(DimProgressModBlocks.CUT_FELSANDSTONE_BRICKS);
	public static final RegistryObject<Item> CUT_FELSANDSTONE_BRICK_STAIRS = block(DimProgressModBlocks.CUT_FELSANDSTONE_BRICK_STAIRS);
	public static final RegistryObject<Item> CUT_FELSANDSTONE_BRICK_SLAB = block(DimProgressModBlocks.CUT_FELSANDSTONE_BRICK_SLAB);
	public static final RegistryObject<Item> SUNLIT_SILICA = block(DimProgressModBlocks.SUNLIT_SILICA);
	public static final RegistryObject<Item> SUNLIT_SILICA_GLASS = block(DimProgressModBlocks.SUNLIT_SILICA_GLASS);
	public static final RegistryObject<Item> CRIMSON_SPRIGS = block(DimProgressModBlocks.CRIMSON_SPRIGS);
	public static final RegistryObject<Item> DEAD_PERGALON_SPRIGS = block(DimProgressModBlocks.DEAD_PERGALON_SPRIGS);
	public static final RegistryObject<Item> PERGALON_PORTAL_CHARGE = REGISTRY.register("pergalon_portal_charge", () -> new PergalonPortalChargeItem());
	public static final RegistryObject<Item> WORLDGEN_TEST = REGISTRY.register("worldgen_test", () -> new WorldgenTestItem());
	public static final RegistryObject<Item> GROVILE_CRIMSOIL_GRASS = block(DimProgressModBlocks.GROVILE_CRIMSOIL_GRASS);
	public static final RegistryObject<Item> GROVILE_SPRIGS = block(DimProgressModBlocks.GROVILE_SPRIGS);
	public static final RegistryObject<Item> NYCTECIUM = block(DimProgressModBlocks.NYCTECIUM);
	public static final RegistryObject<Item> NYCTIC_SPRIGS = block(DimProgressModBlocks.NYCTIC_SPRIGS);
	public static final RegistryObject<Item> MAGMACTUS = block(DimProgressModBlocks.MAGMACTUS);
	public static final RegistryObject<Item> CRIMSON_MUD = block(DimProgressModBlocks.CRIMSON_MUD);
	public static final RegistryObject<Item> EMBERSEED_LEAVES = block(DimProgressModBlocks.EMBERSEED_LEAVES);
	public static final RegistryObject<Item> PYRIND_LOG = block(DimProgressModBlocks.PYRIND_LOG);
	public static final RegistryObject<Item> PYRIND_PLANKS = block(DimProgressModBlocks.PYRIND_PLANKS);
	public static final RegistryObject<Item> PYRIND_STAIRS = block(DimProgressModBlocks.PYRIND_STAIRS);
	public static final RegistryObject<Item> PYRIND_SLAB = block(DimProgressModBlocks.PYRIND_SLAB);
	public static final RegistryObject<Item> PYRIND_FENCE = block(DimProgressModBlocks.PYRIND_FENCE);
	public static final RegistryObject<Item> PYRIND_FENCE_GATE = block(DimProgressModBlocks.PYRIND_FENCE_GATE);
	public static final RegistryObject<Item> PYRIND_PRESSURE_PLATE = block(DimProgressModBlocks.PYRIND_PRESSURE_PLATE);
	public static final RegistryObject<Item> PYRIND_BUTTON = block(DimProgressModBlocks.PYRIND_BUTTON);
	public static final RegistryObject<Item> PYRIND_LEAVES = block(DimProgressModBlocks.PYRIND_LEAVES);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
