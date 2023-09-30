
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.block.RuniconBlockBlock;
import net.therealflarf.dimprogress.block.RunicStoneRingBlock;
import net.therealflarf.dimprogress.block.RunicStonePortalCoreBlock;
import net.therealflarf.dimprogress.block.RunicStonePillarBlock;
import net.therealflarf.dimprogress.block.DeepslateRuniconOreBlock;
import net.therealflarf.dimprogress.block.CrystalGlassBlock;
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
}
