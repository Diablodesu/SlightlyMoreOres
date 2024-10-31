package dev.diablodesu.slightlymoreores.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import dev.diablodesu.slightlymoreores.network.SlightlymoreoresModVariables;
import dev.diablodesu.slightlymoreores.SlightlymoreoresMod;

public class ToggleguiprocedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean guidisabled = false;
		if (SlightlymoreoresModVariables.guidisabled == true) {
			SlightlymoreoresModVariables.guidisabled = false;
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("GUI Enabled"), false);
			SlightlymoreoresMod.LOGGER.info("Player enabled test GUI");
		} else {
			if (SlightlymoreoresModVariables.guidisabled == false) {
				SlightlymoreoresModVariables.guidisabled = true;
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("GUI Disabled"), false);
				SlightlymoreoresMod.LOGGER.info("Player disabled test GUI");
			}
		}
	}
}
