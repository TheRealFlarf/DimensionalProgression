
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.procedures.LifeCrystalPropertyValueProviderProcedure;
import net.therealflarf.dimprogress.item.WorldgenTestItem;
import net.therealflarf.dimprogress.item.VenomiteSwordItem;
import net.therealflarf.dimprogress.item.VenomiteShovelItem;
import net.therealflarf.dimprogress.item.VenomitePickaxeItem;
import net.therealflarf.dimprogress.item.VenomiteIngotItem;
import net.therealflarf.dimprogress.item.VenomiteHoeItem;
import net.therealflarf.dimprogress.item.VenomiteAxeItem;
import net.therealflarf.dimprogress.item.TepidbrickItem;
import net.therealflarf.dimprogress.item.RuniconShardItem;
import net.therealflarf.dimprogress.item.RunicGemstoneItem;
import net.therealflarf.dimprogress.item.RawVenomiteItem;
import net.therealflarf.dimprogress.item.RawPastineItem;
import net.therealflarf.dimprogress.item.ProceduralDungeonGenTestItem;
import net.therealflarf.dimprogress.item.PergalonPortalChargeItem;
import net.therealflarf.dimprogress.item.PastineIngotItem;
import net.therealflarf.dimprogress.item.NetherPortalChargeItem;
import net.therealflarf.dimprogress.item.MoltenClayBallItem;
import net.therealflarf.dimprogress.item.LifeCrystalItem;
import net.therealflarf.dimprogress.item.InfusedLifeCrystalItem;
import net.therealflarf.dimprogress.item.DreadgemSwordItem;
import net.therealflarf.dimprogress.item.DreadgemItem;
import net.therealflarf.dimprogress.item.DrainRunicPowerItem;
import net.therealflarf.dimprogress.item.DarkToastItem;
import net.therealflarf.dimprogress.item.DarkLoafItem;
import net.therealflarf.dimprogress.item.DarkGrainsItem;
import net.therealflarf.dimprogress.block.display.RunicRiftGateDisplayItem;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DimProgressModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DimProgressMod.MODID);
	public static final RegistryObject<Item> RUNICON_SHARD = REGISTRY.register("runicon_shard", () -> new RuniconShardItem());
	public static final RegistryObject<Item> DEEPSLATE_RUNICON_ORE = block(DimProgressModBlocks.DEEPSLATE_RUNICON_ORE);
	public static final RegistryObject<Item> RUNICON_BLOCK = block(DimProgressModBlocks.RUNICON_BLOCK);
	public static final RegistryObject<Item> LIFE_CRYSTAL = REGISTRY.register("life_crystal", () -> new LifeCrystalItem());
	public static final RegistryObject<Item> INFUSED_VITALITY_CRYSTAL = REGISTRY.register("infused_vitality_crystal", () -> new InfusedLifeCrystalItem());
	public static final RegistryObject<Item> DARK_GRAIN = block(DimProgressModBlocks.DARK_GRAIN);
	public static final RegistryObject<Item> DARK_GRAINS = REGISTRY.register("dark_grains", () -> new DarkGrainsItem());
	public static final RegistryObject<Item> DARK_LOAF = REGISTRY.register("dark_loaf", () -> new DarkLoafItem());
	public static final RegistryObject<Item> RUNIC_GEMSTONE = REGISTRY.register("runic_gemstone", () -> new RunicGemstoneItem());
	public static final RegistryObject<Item> DARK_TOAST = REGISTRY.register("dark_toast", () -> new DarkToastItem());
	public static final RegistryObject<Item> RUNIC_STONE_RING = block(DimProgressModBlocks.RUNIC_STONE_RING);
	public static final RegistryObject<Item> RUNIC_STONE_PILLAR = block(DimProgressModBlocks.RUNIC_STONE_PILLAR);
	public static final RegistryObject<Item> COTTONWEAVE_SPAWN_EGG = REGISTRY.register("cottonweave_spawn_egg", () -> new ForgeSpawnEggItem(DimProgressModEntities.COTTONWEAVE, -6850259, -8505837, new Item.Properties()));
	public static final RegistryObject<Item> DREADGEM = REGISTRY.register("dreadgem", () -> new DreadgemItem());
	public static final RegistryObject<Item> MAGNIAN_SPAWN_EGG = REGISTRY.register("magnian_spawn_egg", () -> new ForgeSpawnEggItem(DimProgressModEntities.MAGNIAN, -15068665, -37632, new Item.Properties()));
	public static final RegistryObject<Item> DRAIN_RUNIC_POWER = REGISTRY.register("drain_runic_power", () -> new DrainRunicPowerItem());
	public static final RegistryObject<Item> RUNIC_STONE_PORTAL_CORE = block(DimProgressModBlocks.RUNIC_STONE_PORTAL_CORE);
	public static final RegistryObject<Item> RUNIC_DREADSTONE_PORTAL_CORE = block(DimProgressModBlocks.RUNIC_DREADSTONE_PORTAL_CORE);
	public static final RegistryObject<Item> RUNIC_DREADSTONE_PILLAR = block(DimProgressModBlocks.RUNIC_DREADSTONE_PILLAR);
	public static final RegistryObject<Item> RUNIC_DREADSTONE_RING = block(DimProgressModBlocks.RUNIC_DREADSTONE_RING);
	public static final RegistryObject<Item> CRYSTAL_GLASS = block(DimProgressModBlocks.CRYSTAL_GLASS);
	public static final RegistryObject<Item> RUNIC_DEEPSLATE_RING = block(DimProgressModBlocks.RUNIC_DEEPSLATE_RING);
	public static final RegistryObject<Item> RUNIC_DEEPSLATE_PILLAR = block(DimProgressModBlocks.RUNIC_DEEPSLATE_PILLAR);
	public static final RegistryObject<Item> NETHER_PORTAL_CHARGE = REGISTRY.register("nether_portal_charge", () -> new NetherPortalChargeItem());
	public static final RegistryObject<Item> RUNIC_DEEPSLATE_PORTAL_CORE = block(DimProgressModBlocks.RUNIC_DEEPSLATE_PORTAL_CORE);
	public static final RegistryObject<Item> DREADSTONE = block(DimProgressModBlocks.DREADSTONE);
	public static final RegistryObject<Item> FORGE_ANVIL = block(DimProgressModBlocks.FORGE_ANVIL);
	public static final RegistryObject<Item> DREADSTONE_BRICKS = block(DimProgressModBlocks.DREADSTONE_BRICKS);
	public static final RegistryObject<Item> RIFTROCK_COBBLE = block(DimProgressModBlocks.RIFTROCK_COBBLE);
	public static final RegistryObject<Item> DREADSTONE_BRICK_STAIRS = block(DimProgressModBlocks.DREADSTONE_BRICK_STAIRS);
	public static final RegistryObject<Item> DREADSTONE_BRICK_SLAB = block(DimProgressModBlocks.DREADSTONE_BRICK_SLAB);
	public static final RegistryObject<Item> CRACKED_DREADSTONE_BRICKS = block(DimProgressModBlocks.CRACKED_DREADSTONE_BRICKS);
	public static final RegistryObject<Item> CRIMSOIL = block(DimProgressModBlocks.CRIMSOIL);
	public static final RegistryObject<Item> CRIMSON_CRIMSOIL_GRASS = block(DimProgressModBlocks.CRIMSON_CRIMSOIL_GRASS);
	public static final RegistryObject<Item> VOIDENBELLS = doubleBlock(DimProgressModBlocks.VOIDENBELLS);
	public static final RegistryObject<Item> DEAD_CRIMSOIL_GRASS = block(DimProgressModBlocks.DEAD_CRIMSOIL_GRASS);
	public static final RegistryObject<Item> TEAL_ZIOLIP = block(DimProgressModBlocks.TEAL_ZIOLIP);
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
	public static final RegistryObject<Item> EMBERSEED_SAPLING = block(DimProgressModBlocks.EMBERSEED_SAPLING);
	public static final RegistryObject<Item> EMBERSEED_PRESSURE_PLATE = block(DimProgressModBlocks.EMBERSEED_PRESSURE_PLATE);
	public static final RegistryObject<Item> EMBERSEED_BUTTON = block(DimProgressModBlocks.EMBERSEED_BUTTON);
	public static final RegistryObject<Item> PYRIND_SAPLING = block(DimProgressModBlocks.PYRIND_SAPLING);
	public static final RegistryObject<Item> CLOTBARK_SAPLING = block(DimProgressModBlocks.CLOTBARK_SAPLING);
	public static final RegistryObject<Item> NYCTOCAP_STEM = block(DimProgressModBlocks.NYCTOCAP_STEM);
	public static final RegistryObject<Item> FELSAND = block(DimProgressModBlocks.FELSAND);
	public static final RegistryObject<Item> NYCTOCAP_CAP = block(DimProgressModBlocks.NYCTOCAP_CAP);
	public static final RegistryObject<Item> FELSANDSTONE = block(DimProgressModBlocks.FELSANDSTONE);
	public static final RegistryObject<Item> NYCTOCAP_MUSHROOM = block(DimProgressModBlocks.NYCTOCAP_MUSHROOM);
	public static final RegistryObject<Item> CUT_FELSANDSTONE = block(DimProgressModBlocks.CUT_FELSANDSTONE);
	public static final RegistryObject<Item> DREADSTONE_DREADGEM_ORE = block(DimProgressModBlocks.DREADSTONE_DREADGEM_ORE);
	public static final RegistryObject<Item> CUT_FELSANDSTONE_BRICKS = block(DimProgressModBlocks.CUT_FELSANDSTONE_BRICKS);
	public static final RegistryObject<Item> VAESPEN_LOG = block(DimProgressModBlocks.VAESPEN_LOG);
	public static final RegistryObject<Item> CUT_FELSANDSTONE_BRICK_STAIRS = block(DimProgressModBlocks.CUT_FELSANDSTONE_BRICK_STAIRS);
	public static final RegistryObject<Item> CUT_FELSANDSTONE_BRICK_SLAB = block(DimProgressModBlocks.CUT_FELSANDSTONE_BRICK_SLAB);
	public static final RegistryObject<Item> LARGE_RUNICON_CLUSTER = block(DimProgressModBlocks.LARGE_RUNICON_CLUSTER);
	public static final RegistryObject<Item> POLISHED_RIFTROCK = block(DimProgressModBlocks.POLISHED_RIFTROCK);
	public static final RegistryObject<Item> RIFTROCK_BRICKS = block(DimProgressModBlocks.RIFTROCK_BRICKS);
	public static final RegistryObject<Item> RIFTROCK_BRICK_STAIRS = block(DimProgressModBlocks.RIFTROCK_BRICK_STAIRS);
	public static final RegistryObject<Item> RIFTROCK_BRICK_SLAB = block(DimProgressModBlocks.RIFTROCK_BRICK_SLAB);
	public static final RegistryObject<Item> RUNIC_RIFT_GATE = REGISTRY.register(DimProgressModBlocks.RUNIC_RIFT_GATE.getId().getPath(), () -> new RunicRiftGateDisplayItem(DimProgressModBlocks.RUNIC_RIFT_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUNE_CANDLE = block(DimProgressModBlocks.RUNE_CANDLE);
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
	public static final RegistryObject<Item> VAESPEN_PLANKS = block(DimProgressModBlocks.VAESPEN_PLANKS);
	public static final RegistryObject<Item> VAESPEN_STAIRS = block(DimProgressModBlocks.VAESPEN_STAIRS);
	public static final RegistryObject<Item> VAESPEN_SLAB = block(DimProgressModBlocks.VAESPEN_SLAB);
	public static final RegistryObject<Item> VAESPEN_FENCE = block(DimProgressModBlocks.VAESPEN_FENCE);
	public static final RegistryObject<Item> VAESPEN_FENCE_GATE = block(DimProgressModBlocks.VAESPEN_FENCE_GATE);
	public static final RegistryObject<Item> CRIMSON_MUD = block(DimProgressModBlocks.CRIMSON_MUD);
	public static final RegistryObject<Item> VAESPEN_PRESSURE_PLATE = block(DimProgressModBlocks.VAESPEN_PRESSURE_PLATE);
	public static final RegistryObject<Item> VAESPEN_BUTTON = block(DimProgressModBlocks.VAESPEN_BUTTON);
	public static final RegistryObject<Item> EMBERSEED_LEAVES = block(DimProgressModBlocks.EMBERSEED_LEAVES);
	public static final RegistryObject<Item> VAESPEN_DOOR = doubleBlock(DimProgressModBlocks.VAESPEN_DOOR);
	public static final RegistryObject<Item> VAESPEN_TRAPDOOR = block(DimProgressModBlocks.VAESPEN_TRAPDOOR);
	public static final RegistryObject<Item> NYCTOCAP_PLANKS = block(DimProgressModBlocks.NYCTOCAP_PLANKS);
	public static final RegistryObject<Item> NYCTOCAP_STAIRS = block(DimProgressModBlocks.NYCTOCAP_STAIRS);
	public static final RegistryObject<Item> NYCTOCAP_SLAB = block(DimProgressModBlocks.NYCTOCAP_SLAB);
	public static final RegistryObject<Item> PYRIND_LOG = block(DimProgressModBlocks.PYRIND_LOG);
	public static final RegistryObject<Item> PYRIND_PLANKS = block(DimProgressModBlocks.PYRIND_PLANKS);
	public static final RegistryObject<Item> PYRIND_STAIRS = block(DimProgressModBlocks.PYRIND_STAIRS);
	public static final RegistryObject<Item> PYRIND_SLAB = block(DimProgressModBlocks.PYRIND_SLAB);
	public static final RegistryObject<Item> PYRIND_FENCE = block(DimProgressModBlocks.PYRIND_FENCE);
	public static final RegistryObject<Item> CRACKED_POLISHED_HECKROCK_BRICKS = block(DimProgressModBlocks.CRACKED_POLISHED_HECKROCK_BRICKS);
	public static final RegistryObject<Item> PYRIND_FENCE_GATE = block(DimProgressModBlocks.PYRIND_FENCE_GATE);
	public static final RegistryObject<Item> PYRIND_PRESSURE_PLATE = block(DimProgressModBlocks.PYRIND_PRESSURE_PLATE);
	public static final RegistryObject<Item> CHISELED_POLISHED_HECKROCK = block(DimProgressModBlocks.CHISELED_POLISHED_HECKROCK);
	public static final RegistryObject<Item> PYRIND_BUTTON = block(DimProgressModBlocks.PYRIND_BUTTON);
	public static final RegistryObject<Item> PYRIND_LEAVES = block(DimProgressModBlocks.PYRIND_LEAVES);
	public static final RegistryObject<Item> PROCEDURAL_DUNGEON_GEN_TEST = REGISTRY.register("procedural_dungeon_gen_test", () -> new ProceduralDungeonGenTestItem());
	public static final RegistryObject<Item> DT_HALLWAY_PLACEMENT_SPAWN_EGG = REGISTRY.register("dt_hallway_placement_spawn_egg", () -> new ForgeSpawnEggItem(DimProgressModEntities.DT_HALLWAY_PLACEMENT, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> DREADGEM_SWORD = REGISTRY.register("dreadgem_sword", () -> new DreadgemSwordItem());
	public static final RegistryObject<Item> CLOTBARK_LOG = block(DimProgressModBlocks.CLOTBARK_LOG);
	public static final RegistryObject<Item> CLOTBARK_PLANKS = block(DimProgressModBlocks.CLOTBARK_PLANKS);
	public static final RegistryObject<Item> CLOTBARK_STAIRS = block(DimProgressModBlocks.CLOTBARK_STAIRS);
	public static final RegistryObject<Item> CLOTBARK_SLAB = block(DimProgressModBlocks.CLOTBARK_SLAB);
	public static final RegistryObject<Item> RUNIC_RIFT_STRUCTURE_PLACER_SPAWN_EGG = REGISTRY.register("runic_rift_structure_placer_spawn_egg",
			() -> new ForgeSpawnEggItem(DimProgressModEntities.RUNIC_RIFT_STRUCTURE_PLACER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> CLOTBARK_FENCE = block(DimProgressModBlocks.CLOTBARK_FENCE);
	public static final RegistryObject<Item> CLOTBARK_FENCE_GATE = block(DimProgressModBlocks.CLOTBARK_FENCE_GATE);
	public static final RegistryObject<Item> CLOTBARK_PRESSURE_PLATE = block(DimProgressModBlocks.CLOTBARK_PRESSURE_PLATE);
	public static final RegistryObject<Item> CLOTBARK_BUTTON = block(DimProgressModBlocks.CLOTBARK_BUTTON);
	public static final RegistryObject<Item> CLOTBARK_LEAVES = block(DimProgressModBlocks.CLOTBARK_LEAVES);
	public static final RegistryObject<Item> EMBERSEED_DOOR = doubleBlock(DimProgressModBlocks.EMBERSEED_DOOR);
	public static final RegistryObject<Item> PYRIND_DOOR = doubleBlock(DimProgressModBlocks.PYRIND_DOOR);
	public static final RegistryObject<Item> CLOTBARK_DOOR = doubleBlock(DimProgressModBlocks.CLOTBARK_DOOR);
	public static final RegistryObject<Item> EMBERSEED_TRAPDOOR = block(DimProgressModBlocks.EMBERSEED_TRAPDOOR);
	public static final RegistryObject<Item> PYRIND_TRAPDOOR = block(DimProgressModBlocks.PYRIND_TRAPDOOR);
	public static final RegistryObject<Item> CLOTBARK_TRAPDOOR = block(DimProgressModBlocks.CLOTBARK_TRAPDOOR);
	public static final RegistryObject<Item> HECKROCK = block(DimProgressModBlocks.HECKROCK);
	public static final RegistryObject<Item> POLISHED_HECKROCK = block(DimProgressModBlocks.POLISHED_HECKROCK);
	public static final RegistryObject<Item> POLISHED_HECKROCK_SLAB = block(DimProgressModBlocks.POLISHED_HECKROCK_SLAB);
	public static final RegistryObject<Item> POLISHED_HECKROCK_BRICKS = block(DimProgressModBlocks.POLISHED_HECKROCK_BRICKS);
	public static final RegistryObject<Item> POLISHED_HECKROCK_BRICK_STAIRS = block(DimProgressModBlocks.POLISHED_HECKROCK_BRICK_STAIRS);
	public static final RegistryObject<Item> POLISHED_HECKROCK_BRICK_SLAB = block(DimProgressModBlocks.POLISHED_HECKROCK_BRICK_SLAB);
	public static final RegistryObject<Item> POLISHED_HECKROCK_BRICK_WALL = block(DimProgressModBlocks.POLISHED_HECKROCK_BRICK_WALL);
	public static final RegistryObject<Item> POLISHED_HECKROCK_TILES = block(DimProgressModBlocks.POLISHED_HECKROCK_TILES);
	public static final RegistryObject<Item> POLISHED_HECKROCK_TILE_STAIRS = block(DimProgressModBlocks.POLISHED_HECKROCK_TILE_STAIRS);
	public static final RegistryObject<Item> POLISHED_HECKROCK_TILE_SLAB = block(DimProgressModBlocks.POLISHED_HECKROCK_TILE_SLAB);
	public static final RegistryObject<Item> DREADSTONE_VENOMITE_ORE = block(DimProgressModBlocks.DREADSTONE_VENOMITE_ORE);
	public static final RegistryObject<Item> RAW_VENOMITE = REGISTRY.register("raw_venomite", () -> new RawVenomiteItem());
	public static final RegistryObject<Item> VENOMITE_INGOT = REGISTRY.register("venomite_ingot", () -> new VenomiteIngotItem());
	public static final RegistryObject<Item> HECKROCK_VENOMITE_ORE = block(DimProgressModBlocks.HECKROCK_VENOMITE_ORE);
	public static final RegistryObject<Item> VENOMITE_BLOCK = block(DimProgressModBlocks.VENOMITE_BLOCK);
	public static final RegistryObject<Item> RAW_VENOMITE_BLOCK = block(DimProgressModBlocks.RAW_VENOMITE_BLOCK);
	public static final RegistryObject<Item> MOLTEN_CLAY = block(DimProgressModBlocks.MOLTEN_CLAY);
	public static final RegistryObject<Item> VENOMITE_AXE = REGISTRY.register("venomite_axe", () -> new VenomiteAxeItem());
	public static final RegistryObject<Item> VENOMITE_PICKAXE = REGISTRY.register("venomite_pickaxe", () -> new VenomitePickaxeItem());
	public static final RegistryObject<Item> VENOMITE_SWORD = REGISTRY.register("venomite_sword", () -> new VenomiteSwordItem());
	public static final RegistryObject<Item> VENOMITE_SHOVEL = REGISTRY.register("venomite_shovel", () -> new VenomiteShovelItem());
	public static final RegistryObject<Item> VENOMITE_HOE = REGISTRY.register("venomite_hoe", () -> new VenomiteHoeItem());
	public static final RegistryObject<Item> MOLTEN_CLAY_BALL = REGISTRY.register("molten_clay_ball", () -> new MoltenClayBallItem());
	public static final RegistryObject<Item> TEPIDBRICK = REGISTRY.register("tepidbrick", () -> new TepidbrickItem());
	public static final RegistryObject<Item> TEPIDBRICKS = block(DimProgressModBlocks.TEPIDBRICKS);
	public static final RegistryObject<Item> DARK_GRAIN_STAGE_2 = block(DimProgressModBlocks.DARK_GRAIN_STAGE_2);
	public static final RegistryObject<Item> DARK_GRAIN_STAGE_3 = block(DimProgressModBlocks.DARK_GRAIN_STAGE_3);
	public static final RegistryObject<Item> VAESPEN_LEAVES = block(DimProgressModBlocks.VAESPEN_LEAVES);
	public static final RegistryObject<Item> TAINTED_DREADSTONE = block(DimProgressModBlocks.TAINTED_DREADSTONE);
	public static final RegistryObject<Item> BLIGHTBARK_LEAVES = block(DimProgressModBlocks.BLIGHTBARK_LEAVES);
	public static final RegistryObject<Item> BLIGHTBARK_LOG = block(DimProgressModBlocks.BLIGHTBARK_LOG);
	public static final RegistryObject<Item> BLIGHTBARK_PLANKS = block(DimProgressModBlocks.BLIGHTBARK_PLANKS);
	public static final RegistryObject<Item> BLIGHTBARK_STAIRS = block(DimProgressModBlocks.BLIGHTBARK_STAIRS);
	public static final RegistryObject<Item> BLIGHTBARK_SLAB = block(DimProgressModBlocks.BLIGHTBARK_SLAB);
	public static final RegistryObject<Item> GLOWING_BLIGHTBARK_LEAVES = block(DimProgressModBlocks.GLOWING_BLIGHTBARK_LEAVES);
	public static final RegistryObject<Item> OBSIDIAN_BRICKS = block(DimProgressModBlocks.OBSIDIAN_BRICKS);
	public static final RegistryObject<Item> OBSIDIAN_BRICK_STAIRS = block(DimProgressModBlocks.OBSIDIAN_BRICK_STAIRS);
	public static final RegistryObject<Item> OBSIDIAN_BRICK_SLAB = block(DimProgressModBlocks.OBSIDIAN_BRICK_SLAB);
	public static final RegistryObject<Item> OBSIDIAN_BRICK_WALL = block(DimProgressModBlocks.OBSIDIAN_BRICK_WALL);
	public static final RegistryObject<Item> DREADSTONE_PASTINE_ORE = block(DimProgressModBlocks.DREADSTONE_PASTINE_ORE);
	public static final RegistryObject<Item> RAW_PASTINE = REGISTRY.register("raw_pastine", () -> new RawPastineItem());
	public static final RegistryObject<Item> PASTINE_INGOT = REGISTRY.register("pastine_ingot", () -> new PastineIngotItem());
	public static final RegistryObject<Item> DREADGEM_BLOCK = block(DimProgressModBlocks.DREADGEM_BLOCK);
	public static final RegistryObject<Item> PASTINE_BLOCK = block(DimProgressModBlocks.PASTINE_BLOCK);
	public static final RegistryObject<Item> RAW_PASTINE_BLOCK = block(DimProgressModBlocks.RAW_PASTINE_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(LIFE_CRYSTAL.get(), new ResourceLocation("dim_progress:life_crystal_vitality"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) LifeCrystalPropertyValueProviderProcedure.execute(itemStackToRender));
		});
	}
}
