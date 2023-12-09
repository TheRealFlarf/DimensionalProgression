
package net.therealflarf.dimprogress.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class CrimsonCrimsoilGrassBlock extends Block {
	public CrimsonCrimsoilGrassBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
