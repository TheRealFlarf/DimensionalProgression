
package net.therealflarf.dimprogress.jei_recipes;

import net.therealflarf.dimprogress.init.DimProgressModJeiPlugin;
import net.therealflarf.dimprogress.init.DimProgressModBlocks;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class ForgeAnvilRecipeTypeRecipeCategory implements IRecipeCategory<ForgeAnvilRecipeTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("dim_progress", "forge_anvil_recipe_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("dim_progress", "textures/screens/forge_anvil_ui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public ForgeAnvilRecipeTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 352, 332);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(DimProgressModBlocks.FORGE_ANVIL.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<ForgeAnvilRecipeTypeRecipe> getRecipeType() {
		return DimProgressModJeiPlugin.ForgeAnvilRecipeType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Forging");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, ForgeAnvilRecipeTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 79, 17).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 79, 53).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 16, 26).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 34, 26).addIngredients(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.INPUT, 16, 44).addIngredients(recipe.getIngredients().get(4));
		builder.addSlot(RecipeIngredientRole.INPUT, 34, 44).addIngredients(recipe.getIngredients().get(5));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 133, 35).addItemStack(recipe.getResultItem(null));
	}
}
