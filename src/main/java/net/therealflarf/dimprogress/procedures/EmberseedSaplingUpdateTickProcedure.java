package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EmberseedSaplingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.15) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"place feature dim_progress:crimson_plains_emberseeds");
		}
	}
}
