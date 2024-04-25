
package dev.diablodesu.slightlymoreores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RoseQuartzIngotItem extends Item {
	public RoseQuartzIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
