package net.therealflarf.dimprogress.block.entity;

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
