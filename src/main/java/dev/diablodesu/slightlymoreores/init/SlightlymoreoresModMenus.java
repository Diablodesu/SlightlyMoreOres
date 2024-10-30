
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dev.diablodesu.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import dev.diablodesu.slightlymoreores.world.inventory.DiabloguitestMenu;
import dev.diablodesu.slightlymoreores.SlightlymoreoresMod;

public class SlightlymoreoresModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SlightlymoreoresMod.MODID);
	public static final RegistryObject<MenuType<DiabloguitestMenu>> DIABLOGUITEST = REGISTRY.register("diabloguitest", () -> IForgeMenuType.create(DiabloguitestMenu::new));
}
