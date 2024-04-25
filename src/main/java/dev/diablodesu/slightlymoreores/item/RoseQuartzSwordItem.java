
package dev.diablodesu.slightlymoreores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import dev.diablodesu.slightlymoreores.init.SlightlymoreoresModItems;

public class RoseQuartzSwordItem extends SwordItem {
	public RoseQuartzSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2032;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlightlymoreoresModItems.ROSE_QUARTZ_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}
