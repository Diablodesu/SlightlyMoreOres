
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.slightlymoreores.block.UraniumOreBlock;
import net.mcreator.slightlymoreores.block.SapphireOreBlock;
import net.mcreator.slightlymoreores.block.RubyOreBlock;
import net.mcreator.slightlymoreores.block.RenforcedGlassBlockBlock;
import net.mcreator.slightlymoreores.block.OsmiumOreBlock;
import net.mcreator.slightlymoreores.block.OsmiumDimensionPortalBlock;
import net.mcreator.slightlymoreores.block.OsmiumBlockBlock;
import net.mcreator.slightlymoreores.block.ObsidianOreBlock;
import net.mcreator.slightlymoreores.block.MagnesiumOreBlock;
import net.mcreator.slightlymoreores.block.LiquifiedOsmiumBlock;
import net.mcreator.slightlymoreores.SlightlymoreoresMod;

public class SlightlymoreoresModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SlightlymoreoresMod.MODID);
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> OBSIDIAN_ORE = REGISTRY.register("obsidian_ore", () -> new ObsidianOreBlock());
	public static final RegistryObject<Block> OSMIUM_ORE = REGISTRY.register("osmium_ore", () -> new OsmiumOreBlock());
	public static final RegistryObject<Block> OSMIUM_BLOCK = REGISTRY.register("osmium_block", () -> new OsmiumBlockBlock());
	public static final RegistryObject<Block> OSMIUM_DIMENSION_PORTAL = REGISTRY.register("osmium_dimension_portal", () -> new OsmiumDimensionPortalBlock());
	public static final RegistryObject<Block> LIQUIFIED_OSMIUM = REGISTRY.register("liquified_osmium", () -> new LiquifiedOsmiumBlock());
	public static final RegistryObject<Block> MAGNESIUM_ORE = REGISTRY.register("magnesium_ore", () -> new MagnesiumOreBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RENFORCED_GLASS_BLOCK = REGISTRY.register("renforced_glass_block", () -> new RenforcedGlassBlockBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
}
