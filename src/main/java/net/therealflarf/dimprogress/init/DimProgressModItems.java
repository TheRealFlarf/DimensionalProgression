
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.item.RuniconShardItem;
import net.therealflarf.dimprogress.item.RunicGemstoneItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
