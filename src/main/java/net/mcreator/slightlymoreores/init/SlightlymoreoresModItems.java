
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
import net.mcreator.slightlymoreores.SlightlymoreoresMod;

public class SlightlymoreoresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SlightlymoreoresMod.MODID);
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(SlightlymoreoresModBlocks.URANIUM_ORE, CreativeModeTab.TAB_MISC);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
