
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.diablodesu.slightlymoreores.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import dev.diablodesu.slightlymoreores.SlightlymoreoresMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlightlymoreoresModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SlightlymoreoresMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SlightlymoreoresModBlocks.URANIUM_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.OBSIDIAN_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.OSMIUM_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.OSMIUM_BLOCK.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.MAGNESIUM_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.RUBY_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.RENFORCED_GLASS_BLOCK.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.SAPPHIRE_ORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SlightlymoreoresModItems.OSMIUM_ARMOR_HELMET.get());
			tabData.accept(SlightlymoreoresModItems.OSMIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(SlightlymoreoresModItems.OSMIUM_ARMOR_LEGGINGS.get());
			tabData.accept(SlightlymoreoresModItems.OSMIUM_ARMOR_BOOTS.get());
			tabData.accept(SlightlymoreoresModItems.RUBY_ARMOR_HELMET.get());
			tabData.accept(SlightlymoreoresModItems.RUBY_ARMOR_CHESTPLATE.get());
			tabData.accept(SlightlymoreoresModItems.RUBY_ARMOR_LEGGINGS.get());
			tabData.accept(SlightlymoreoresModItems.RUBY_ARMOR_BOOTS.get());
			tabData.accept(SlightlymoreoresModItems.RUBY_SWORD.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_ARMOR_HELMET.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_ARMOR_CHESTPLATE.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_ARMOR_LEGGINGS.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_ARMOR_BOOTS.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_SWORD.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_BATTLE_AXE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(SlightlymoreoresModItems.URANIUM.get());
			tabData.accept(SlightlymoreoresModItems.OBSIDIAN_NUGGET.get());
			tabData.accept(SlightlymoreoresModItems.OSMIUM.get());
			tabData.accept(SlightlymoreoresModItems.LIQUIFIED_OSMIUM_BUCKET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SlightlymoreoresModItems.MAGNESIUM_NUGGET.get());
			tabData.accept(SlightlymoreoresModItems.MAGNESIUM_INGOT.get());
			tabData.accept(SlightlymoreoresModItems.RUBY.get());
			tabData.accept(SlightlymoreoresModItems.SAPPHIRE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(SlightlymoreoresModItems.MAGNESIUM_PILL.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SlightlymoreoresModItems.RUBY_PICKAXE.get());
			tabData.accept(SlightlymoreoresModItems.RUBY_AXE.get());
			tabData.accept(SlightlymoreoresModItems.RUBY_SHOVEL.get());
			tabData.accept(SlightlymoreoresModItems.RUBYHOE.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_PICKAXE.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_AXE.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_SHOVEL.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_HOE.get());
		}
	}
}
