package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DarkGrainUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.2) {
			world.setBlock(BlockPos.containing(x, y, z), DimProgressModBlocks.DARK_GRAIN_STAGE_2.get().defaultBlockState(), 3);
		}
	}
}
