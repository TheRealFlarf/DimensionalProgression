
package net.therealflarf.dimprogress.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class DreadgemSwordItem extends SwordItem {
	public DreadgemSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 105;
			}

			public float getSpeed() {
				return 9.5f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DimProgressModItems.DELETED_MOD_ELEMENT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DreadgemSwordLivingEntityIsHitWithToolProcedure.execute();
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77On Victim Kill: Grants \u00A752.0RP \u00A77to holder"));
	}
}
