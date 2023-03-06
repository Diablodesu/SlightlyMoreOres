
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.slightlymoreores.block.UraniumOreBlock;
import net.mcreator.slightlymoreores.SlightlymoreoresMod;

public class SlightlymoreoresModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SlightlymoreoresMod.MODID);
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
}
