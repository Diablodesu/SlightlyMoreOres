
package net.mcreator.slightlymoreores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ObsidianNuggetItem extends Item {
	public ObsidianNuggetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
