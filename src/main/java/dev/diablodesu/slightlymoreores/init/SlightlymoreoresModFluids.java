
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package dev.diablodesu.slightlymoreores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import dev.diablodesu.slightlymoreores.fluid.LiquifiedOsmiumFluid;
import dev.diablodesu.slightlymoreores.SlightlymoreoresMod;

public class SlightlymoreoresModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SlightlymoreoresMod.MODID);
	public static final RegistryObject<FlowingFluid> LIQUIFIED_OSMIUM = REGISTRY.register("liquified_osmium", () -> new LiquifiedOsmiumFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUIFIED_OSMIUM = REGISTRY.register("flowing_liquified_osmium", () -> new LiquifiedOsmiumFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUIFIED_OSMIUM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUIFIED_OSMIUM.get(), RenderType.translucent());
		}
	}
}
