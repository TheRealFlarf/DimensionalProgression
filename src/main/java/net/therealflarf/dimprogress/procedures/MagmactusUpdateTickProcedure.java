package net.therealflarf.dimprogress.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MagmactusUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!MagmactusBlockValidPlacementConditionProcedure.execute(world, x, y, z)) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
	}
}
