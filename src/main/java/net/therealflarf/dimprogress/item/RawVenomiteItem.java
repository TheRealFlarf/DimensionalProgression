
package net.therealflarf.dimprogress.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawVenomiteItem extends Item {
	public RawVenomiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
