package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MagmactusUpdateTickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
if (!) {world.destroyBlock(BlockPos.containing(x,y,z), false);}
}
}
