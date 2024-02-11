package net.therealflarf.dimprogress.block.entity;

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
