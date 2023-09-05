
package net.mcreator.slightlymoreores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.slightlymoreores.init.SlightlymoreoresModFluids;

public class LiquifiedOsmiumItem extends BucketItem {
	public LiquifiedOsmiumItem() {
		super(SlightlymoreoresModFluids.LIQUIFIED_OSMIUM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
