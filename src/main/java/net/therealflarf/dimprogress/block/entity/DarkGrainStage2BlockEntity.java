package net.therealflarf.dimprogress.block.entity;

import net.therealflarf.dimprogress.init.DimProgressModBlockEntities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

public class DarkGrainStage2BlockEntity extends BlockEntity {
	public DarkGrainStage2BlockEntity(BlockPos pos, BlockState state) {
		super(DimProgressModBlockEntities.DARK_GRAIN_STAGE_2.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
