
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.diablodesu.slightlymoreores.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlightlymoreoresModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SlightlymoreoresModBlocks.URANIUM_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.OBSIDIAN_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.OSMIUM_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.OSMIUM_BLOCK.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.MAGNESIUM_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.RUBY_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.RENFORCED_GLASS_BLOCK.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.SAPPHIRE_ORE.get().asItem());
			tabData.accept(SlightlymoreoresModBlocks.BLOCK_OF_URANIUM.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(SlightlymoreoresModBlocks.FUNNY_BLOCK.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
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
			tabData.accept(SlightlymoreoresModItems.RUBY_BATTLE_AXE.get());
			tabData.accept(SlightlymoreoresModItems.LAPIS_ARMOR_HELMET.get());
			tabData.accept(SlightlymoreoresModItems.LAPIS_ARMOR_CHESTPLATE.get());
			tabData.accept(SlightlymoreoresModItems.LAPIS_ARMOR_LEGGINGS.get());
			tabData.accept(SlightlymoreoresModItems.LAPIS_ARMOR_BOOTS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SlightlymoreoresModItems.MAGNESIUM_NUGGET.get());
			tabData.accept(SlightlymoreoresModItems.MAGNESIUM_INGOT.get());
			tabData.accept(SlightlymoreoresModItems.RUBY.get());
			tabData.accept(SlightlymoreoresModItems.SAPPHIRE.get());
			tabData.accept(SlightlymoreoresModItems.URANIUM_INGOT.get());
		}

		if (tabData.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(SlightlymoreoresModItems.MAGNESIUM_PILL.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SlightlymoreoresModItems.RUBY_PICKAXE.get());
			tabData.accept(SlightlymoreoresModItems.RUBY_AXE.get());
			tabData.accept(SlightlymoreoresModItems.RUBY_SHOVEL.get());
			tabData.accept(SlightlymoreoresModItems.RUBYHOE.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_PICKAXE.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_AXE.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_SHOVEL.get());
			tabData.accept(SlightlymoreoresModItems.EMERALD_HOE.get());
			tabData.accept(SlightlymoreoresModItems.ULTRA_PICKAXE.get());
		}
	}
}
