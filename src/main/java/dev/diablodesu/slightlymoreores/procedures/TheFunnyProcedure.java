package dev.diablodesu.slightlymoreores.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TheFunnyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("uh oh."), false);
		SlightlymoreoresMod.queueServerWork(30, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:explosion ~ ~ ~ ~ ~ ~ 1 999999999 normal @p");
		});
	}
}
