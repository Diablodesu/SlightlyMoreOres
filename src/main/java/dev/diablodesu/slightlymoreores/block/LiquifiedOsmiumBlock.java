
package dev.diablodesu.slightlymoreores.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import dev.diablodesu.slightlymoreores.init.SlightlymoreoresModFluids;

public class LiquifiedOsmiumBlock extends LiquidBlock {
	public LiquifiedOsmiumBlock() {
		super(() -> SlightlymoreoresModFluids.LIQUIFIED_OSMIUM.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
