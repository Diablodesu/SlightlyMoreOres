
package net.mcreator.slightlymoreores.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.slightlymoreores.init.SlightlymoreoresModItems;
import net.mcreator.slightlymoreores.init.SlightlymoreoresModFluids;
import net.mcreator.slightlymoreores.init.SlightlymoreoresModFluidTypes;
import net.mcreator.slightlymoreores.init.SlightlymoreoresModBlocks;

public abstract class LiquifiedOsmiumFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SlightlymoreoresModFluidTypes.LIQUIFIED_OSMIUM_TYPE.get(), () -> SlightlymoreoresModFluids.LIQUIFIED_OSMIUM.get(),
			() -> SlightlymoreoresModFluids.FLOWING_LIQUIFIED_OSMIUM.get()).explosionResistance(100f).tickRate(11).bucket(() -> SlightlymoreoresModItems.LIQUIFIED_OSMIUM_BUCKET.get())
			.block(() -> (LiquidBlock) SlightlymoreoresModBlocks.LIQUIFIED_OSMIUM.get());

	private LiquifiedOsmiumFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquifiedOsmiumFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquifiedOsmiumFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
