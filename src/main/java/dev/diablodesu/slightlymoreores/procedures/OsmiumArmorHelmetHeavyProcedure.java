package dev.diablodesu.slightlymoreores.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class OsmiumArmorHelmetHeavyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, false, false));
	}
}
