
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.slightlymoreores.item.UraniumItem;
import net.mcreator.slightlymoreores.item.SapphireItem;
import net.mcreator.slightlymoreores.item.RubyhoeItem;
import net.mcreator.slightlymoreores.item.RubySwordItem;
import net.mcreator.slightlymoreores.item.RubyShovelItem;
import net.mcreator.slightlymoreores.item.RubyPickaxeItem;
import net.mcreator.slightlymoreores.item.RubyItem;
import net.mcreator.slightlymoreores.item.RubyAxeItem;
import net.mcreator.slightlymoreores.item.RubyArmorItem;
import net.mcreator.slightlymoreores.item.OsmiumItem;
import net.mcreator.slightlymoreores.item.OsmiumDimensionItem;
import net.mcreator.slightlymoreores.item.OsmiumArmorItem;
import net.mcreator.slightlymoreores.item.ObsidianNuggetItem;
import net.mcreator.slightlymoreores.item.MagnesiumPillItem;
import net.mcreator.slightlymoreores.item.MagnesiumNuggetItem;
import net.mcreator.slightlymoreores.item.MagnesiumIngotItem;
import net.mcreator.slightlymoreores.item.LiquifiedOsmiumItem;
import net.mcreator.slightlymoreores.item.EmeraldSwordItem;
import net.mcreator.slightlymoreores.item.EmeraldPickaxeItem;
import net.mcreator.slightlymoreores.item.EmeraldArmorItem;
import net.mcreator.slightlymoreores.SlightlymoreoresMod;

public class SlightlymoreoresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SlightlymoreoresMod.MODID);
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(SlightlymoreoresModBlocks.URANIUM_ORE);
	public static final RegistryObject<Item> OBSIDIAN_ORE = block(SlightlymoreoresModBlocks.OBSIDIAN_ORE);
	public static final RegistryObject<Item> OBSIDIAN_NUGGET = REGISTRY.register("obsidian_nugget", () -> new ObsidianNuggetItem());
	public static final RegistryObject<Item> OSMIUM_ORE = block(SlightlymoreoresModBlocks.OSMIUM_ORE);
	public static final RegistryObject<Item> OSMIUM = REGISTRY.register("osmium", () -> new OsmiumItem());
	public static final RegistryObject<Item> OSMIUM_ARMOR_HELMET = REGISTRY.register("osmium_armor_helmet", () -> new OsmiumArmorItem.Helmet());
	public static final RegistryObject<Item> OSMIUM_ARMOR_CHESTPLATE = REGISTRY.register("osmium_armor_chestplate", () -> new OsmiumArmorItem.Chestplate());
	public static final RegistryObject<Item> OSMIUM_ARMOR_LEGGINGS = REGISTRY.register("osmium_armor_leggings", () -> new OsmiumArmorItem.Leggings());
	public static final RegistryObject<Item> OSMIUM_ARMOR_BOOTS = REGISTRY.register("osmium_armor_boots", () -> new OsmiumArmorItem.Boots());
	public static final RegistryObject<Item> OSMIUM_BLOCK = block(SlightlymoreoresModBlocks.OSMIUM_BLOCK);
	public static final RegistryObject<Item> OSMIUM_DIMENSION = REGISTRY.register("osmium_dimension", () -> new OsmiumDimensionItem());
	public static final RegistryObject<Item> LIQUIFIED_OSMIUM_BUCKET = REGISTRY.register("liquified_osmium_bucket", () -> new LiquifiedOsmiumItem());
	public static final RegistryObject<Item> MAGNESIUM_NUGGET = REGISTRY.register("magnesium_nugget", () -> new MagnesiumNuggetItem());
	public static final RegistryObject<Item> MAGNESIUM_ORE = block(SlightlymoreoresModBlocks.MAGNESIUM_ORE);
	public static final RegistryObject<Item> MAGNESIUM_INGOT = REGISTRY.register("magnesium_ingot", () -> new MagnesiumIngotItem());
	public static final RegistryObject<Item> MAGNESIUM_PILL = REGISTRY.register("magnesium_pill", () -> new MagnesiumPillItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(SlightlymoreoresModBlocks.RUBY_ORE);
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBYHOE = REGISTRY.register("rubyhoe", () -> new RubyhoeItem());
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> RENFORCED_GLASS_BLOCK = block(SlightlymoreoresModBlocks.RENFORCED_GLASS_BLOCK);
	public static final RegistryObject<Item> SAPPHIRE_ORE = block(SlightlymoreoresModBlocks.SAPPHIRE_ORE);
	public static final RegistryObject<Item> EMERALD_ARMOR_HELMET = REGISTRY.register("emerald_armor_helmet", () -> new EmeraldArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armor_chestplate", () -> new EmeraldArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOR_LEGGINGS = REGISTRY.register("emerald_armor_leggings", () -> new EmeraldArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOR_BOOTS = REGISTRY.register("emerald_armor_boots", () -> new EmeraldArmorItem.Boots());
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldSwordItem());
	public static final RegistryObject<Item> EMERALD_PICKAXE = REGISTRY.register("emerald_pickaxe", () -> new EmeraldPickaxeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
