
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.block.DeepslateRuniconOreBlock;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class DimProgressModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DimProgressMod.MODID);
	public static final RegistryObject<Block> DEEPSLATE_RUNICON_ORE = REGISTRY.register("deepslate_runicon_ore", () -> new DeepslateRuniconOreBlock());
}
