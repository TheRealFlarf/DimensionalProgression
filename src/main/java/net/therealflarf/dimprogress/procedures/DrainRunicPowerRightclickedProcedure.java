package net.therealflarf.dimprogress.procedures;

import net.minecraft.world.entity.Entity;

public class DrainRunicPowerRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("runicPower", 0);
	}
}
