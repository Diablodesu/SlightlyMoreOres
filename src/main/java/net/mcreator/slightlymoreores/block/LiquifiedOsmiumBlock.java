
package net.mcreator.slightlymoreores.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.slightlymoreores.init.SlightlymoreoresModFluids;

public class LiquifiedOsmiumBlock extends LiquidBlock {
	public LiquifiedOsmiumBlock() {
		super(() -> SlightlymoreoresModFluids.LIQUIFIED_OSMIUM.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f).noCollission().noLootTable());
	}
}
