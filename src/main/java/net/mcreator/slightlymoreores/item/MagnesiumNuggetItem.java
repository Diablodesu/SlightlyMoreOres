
package net.mcreator.slightlymoreores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MagnesiumNuggetItem extends Item {
	public MagnesiumNuggetItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
