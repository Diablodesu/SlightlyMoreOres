
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dev.diablodesu.slightlymoreores.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import dev.diablodesu.slightlymoreores.client.gui.DiabloguitestScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlightlymoreoresModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SlightlymoreoresModMenus.DIABLOGUITEST.get(), DiabloguitestScreen::new);
		});
	}
}
