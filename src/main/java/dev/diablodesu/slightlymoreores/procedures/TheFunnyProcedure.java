package dev.diablodesu.slightlymoreores.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class TheFunnyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, (float) (0 / 0), Level.ExplosionInteraction.TNT);
	}
}
