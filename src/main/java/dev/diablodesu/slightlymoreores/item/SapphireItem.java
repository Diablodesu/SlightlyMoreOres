
package dev.diablodesu.slightlymoreores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SapphireItem extends Item {
	public SapphireItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
