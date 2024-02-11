
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.block.entity.RunicRiftGateTileEntity;
import net.therealflarf.dimprogress.block.entity.DarkGrainStage2BlockEntity;
import net.therealflarf.dimprogress.block.entity.DarkGrainBlockEntity;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class DimProgressModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DimProgressMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DARK_GRAIN = register("dark_grain", DimProgressModBlocks.DARK_GRAIN, DarkGrainBlockEntity::new);
	public static final RegistryObject<BlockEntityType<RunicRiftGateTileEntity>> RUNIC_RIFT_GATE = REGISTRY.register("runic_rift_gate",
			() -> BlockEntityType.Builder.of(RunicRiftGateTileEntity::new, DimProgressModBlocks.RUNIC_RIFT_GATE.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> DARK_GRAIN_STAGE_2 = register("dark_grain_stage_2", DimProgressModBlocks.DARK_GRAIN_STAGE_2, DarkGrainStage2BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
