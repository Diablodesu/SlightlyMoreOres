
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package dev.diablodesu.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import dev.diablodesu.slightlymoreores.fluid.types.LiquifiedOsmiumFluidType;
import dev.diablodesu.slightlymoreores.SlightlymoreoresMod;

public class SlightlymoreoresModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SlightlymoreoresMod.MODID);
	public static final RegistryObject<FluidType> LIQUIFIED_OSMIUM_TYPE = REGISTRY.register("liquified_osmium", () -> new LiquifiedOsmiumFluidType());
}
