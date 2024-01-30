package net.therealflarf.dimprogress.block.entity;

import net.therealflarf.dimprogress.init.DimProgressModBlockEntities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

public class DarkGrainBlockEntity extends BlockEntity {
	public DarkGrainBlockEntity(BlockPos pos, BlockState state) {
		super(DimProgressModBlockEntities.DARK_GRAIN.get(), pos, state);
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
