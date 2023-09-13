
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.diablodesu.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import dev.diablodesu.slightlymoreores.world.features.ores.UraniumOreFeature;
import dev.diablodesu.slightlymoreores.world.features.ores.SapphireOreFeature;
import dev.diablodesu.slightlymoreores.world.features.ores.RubyOreFeature;
import dev.diablodesu.slightlymoreores.world.features.ores.OsmiumOreFeature;
import dev.diablodesu.slightlymoreores.world.features.ores.ObsidianOreFeature;
import dev.diablodesu.slightlymoreores.world.features.ores.MagnesiumOreFeature;
import dev.diablodesu.slightlymoreores.SlightlymoreoresMod;

@Mod.EventBusSubscriber
public class SlightlymoreoresModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SlightlymoreoresMod.MODID);
	public static final RegistryObject<Feature<?>> URANIUM_ORE = REGISTRY.register("uranium_ore", UraniumOreFeature::new);
	public static final RegistryObject<Feature<?>> OBSIDIAN_ORE = REGISTRY.register("obsidian_ore", ObsidianOreFeature::new);
	public static final RegistryObject<Feature<?>> OSMIUM_ORE = REGISTRY.register("osmium_ore", OsmiumOreFeature::new);
	public static final RegistryObject<Feature<?>> MAGNESIUM_ORE = REGISTRY.register("magnesium_ore", MagnesiumOreFeature::new);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::new);
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", SapphireOreFeature::new);
}
