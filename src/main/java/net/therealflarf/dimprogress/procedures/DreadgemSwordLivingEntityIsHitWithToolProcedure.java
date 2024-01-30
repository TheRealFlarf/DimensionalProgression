package net.therealflarf.dimprogress.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class DreadgemSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 0) {
			sourceentity.getPersistentData().putDouble("runicPower", (sourceentity.getPersistentData().getDouble("runicPower") + 2));
		}
	}
}
