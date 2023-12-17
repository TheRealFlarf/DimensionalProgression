
package net.therealflarf.dimprogress.item;

import net.therealflarf.dimprogress.init.DimProgressModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class VenomiteHoeItem extends HoeItem {
	public VenomiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DimProgressModItems.VENOMITE_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
