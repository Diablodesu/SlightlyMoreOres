package dev.diablodesu.slightlymoreores.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlightlymoreoresModVariables {
	public static boolean guidisabled = true;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
