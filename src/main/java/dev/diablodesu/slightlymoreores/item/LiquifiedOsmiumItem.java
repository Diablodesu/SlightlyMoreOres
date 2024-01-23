
package dev.diablodesu.slightlymoreores.item;

import net.minecraft.network.chat.Component;

public class LiquifiedOsmiumItem extends BucketItem {

	public LiquifiedOsmiumItem() {
		super(SlightlymoreoresModFluids.LIQUIFIED_OSMIUM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
