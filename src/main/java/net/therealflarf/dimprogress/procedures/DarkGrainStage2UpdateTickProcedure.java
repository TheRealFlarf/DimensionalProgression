package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DarkGrainStage2UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.2) {
			world.setBlock(BlockPos.containing(x, y, z), DimProgressModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
		}
	}
}
