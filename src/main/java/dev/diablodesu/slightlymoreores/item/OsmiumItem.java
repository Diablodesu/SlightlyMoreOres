
package dev.diablodesu.slightlymoreores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OsmiumItem extends Item {
	public OsmiumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
