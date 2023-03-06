
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.slightlymoreores.item.UraniumItem;
import net.mcreator.slightlymoreores.item.OsmiumItem;
import net.mcreator.slightlymoreores.item.OsmiumArmorItem;
import net.mcreator.slightlymoreores.item.ObsidianNuggetItem;
import net.mcreator.slightlymoreores.SlightlymoreoresMod;

public class SlightlymoreoresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SlightlymoreoresMod.MODID);
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(SlightlymoreoresModBlocks.URANIUM_ORE, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> OBSIDIAN_ORE = block(SlightlymoreoresModBlocks.OBSIDIAN_ORE, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> OBSIDIAN_NUGGET = REGISTRY.register("obsidian_nugget", () -> new ObsidianNuggetItem());
	public static final RegistryObject<Item> OSMIUM_ORE = block(SlightlymoreoresModBlocks.OSMIUM_ORE, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> OSMIUM = REGISTRY.register("osmium", () -> new OsmiumItem());
	public static final RegistryObject<Item> OSMIUM_ARMOR_HELMET = REGISTRY.register("osmium_armor_helmet", () -> new OsmiumArmorItem.Helmet());
	public static final RegistryObject<Item> OSMIUM_ARMOR_CHESTPLATE = REGISTRY.register("osmium_armor_chestplate", () -> new OsmiumArmorItem.Chestplate());
	public static final RegistryObject<Item> OSMIUM_ARMOR_LEGGINGS = REGISTRY.register("osmium_armor_leggings", () -> new OsmiumArmorItem.Leggings());
	public static final RegistryObject<Item> OSMIUM_ARMOR_BOOTS = REGISTRY.register("osmium_armor_boots", () -> new OsmiumArmorItem.Boots());
	public static final RegistryObject<Item> OSMIUM_BLOCK = block(SlightlymoreoresModBlocks.OSMIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
