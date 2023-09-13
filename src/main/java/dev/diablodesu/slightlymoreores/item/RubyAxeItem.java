
package dev.diablodesu.slightlymoreores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import dev.diablodesu.slightlymoreores.init.SlightlymoreoresModItems;

public class RubyAxeItem extends AxeItem {
	public RubyAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2032;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlightlymoreoresModItems.RUBY.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
