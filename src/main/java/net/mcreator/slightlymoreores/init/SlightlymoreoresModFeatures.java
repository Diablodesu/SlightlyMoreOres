
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
import net.mcreator.slightlymoreores.SlightlymoreoresMod;

@Mod.EventBusSubscriber
public class SlightlymoreoresModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SlightlymoreoresMod.MODID);
	public static final RegistryObject<Feature<?>> URANIUM_ORE = REGISTRY.register("uranium_ore", UraniumOreFeature::feature);
}
