package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MagmactusBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean ReturnFile = false;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("dim_progress:magmactus_placeable")))) {
			ReturnFile = true;
		} else {
			ReturnFile = false;
		}
		return ReturnFile;
	}
}
