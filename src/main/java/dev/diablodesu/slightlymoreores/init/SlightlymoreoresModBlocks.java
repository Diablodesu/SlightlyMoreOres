
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.diablodesu.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import dev.diablodesu.slightlymoreores.block.UraniumOreBlock;
import dev.diablodesu.slightlymoreores.block.SapphireOreBlock;
import dev.diablodesu.slightlymoreores.block.RubyOreBlock;
import dev.diablodesu.slightlymoreores.block.RenforcedGlassBlockBlock;
import dev.diablodesu.slightlymoreores.block.OsmiumOreBlock;
import dev.diablodesu.slightlymoreores.block.OsmiumDimensionPortalBlock;
import dev.diablodesu.slightlymoreores.block.OsmiumBlockBlock;
import dev.diablodesu.slightlymoreores.block.ObsidianOreBlock;
import dev.diablodesu.slightlymoreores.block.MagnesiumOreBlock;
import dev.diablodesu.slightlymoreores.block.LiquifiedOsmiumBlock;
import dev.diablodesu.slightlymoreores.SlightlymoreoresMod;

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
