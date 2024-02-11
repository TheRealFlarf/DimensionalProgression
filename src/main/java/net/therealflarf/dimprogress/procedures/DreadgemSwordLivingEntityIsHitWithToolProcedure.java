package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DreadgemSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 0) {
			sourceentity.getPersistentData().putDouble("runicPower", (sourceentity.getPersistentData().getDouble("runicPower") + 2));
		}
	}
}
