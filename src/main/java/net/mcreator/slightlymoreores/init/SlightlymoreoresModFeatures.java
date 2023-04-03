
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.slightlymoreores.world.features.ores.UraniumOreFeature;
import net.mcreator.slightlymoreores.world.features.ores.RubyOreFeature;
import net.mcreator.slightlymoreores.world.features.ores.OsmiumOreFeature;
import net.mcreator.slightlymoreores.world.features.ores.ObsidianOreFeature;
import net.mcreator.slightlymoreores.world.features.ores.MagnesiumOreFeature;
import net.mcreator.slightlymoreores.SlightlymoreoresMod;

@Mod.EventBusSubscriber
public class SlightlymoreoresModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SlightlymoreoresMod.MODID);
	public static final RegistryObject<Feature<?>> URANIUM_ORE = REGISTRY.register("uranium_ore", UraniumOreFeature::feature);
	public static final RegistryObject<Feature<?>> OBSIDIAN_ORE = REGISTRY.register("obsidian_ore", ObsidianOreFeature::feature);
	public static final RegistryObject<Feature<?>> OSMIUM_ORE = REGISTRY.register("osmium_ore", OsmiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> MAGNESIUM_ORE = REGISTRY.register("magnesium_ore", MagnesiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::feature);
}
