package net.therealflarf.dimprogress.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

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
