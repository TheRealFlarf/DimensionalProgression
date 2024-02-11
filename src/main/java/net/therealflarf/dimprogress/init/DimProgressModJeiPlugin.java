
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.jei_recipes.ForgeAnvilRecipeTypeRecipeCategory;
import net.therealflarf.dimprogress.jei_recipes.ForgeAnvilRecipeTypeRecipe;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class DimProgressModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<ForgeAnvilRecipeTypeRecipe> ForgeAnvilRecipeType_Type = new mezz.jei.api.recipe.RecipeType<>(ForgeAnvilRecipeTypeRecipeCategory.UID, ForgeAnvilRecipeTypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("dim_progress:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ForgeAnvilRecipeTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<ForgeAnvilRecipeTypeRecipe> ForgeAnvilRecipeTypeRecipes = recipeManager.getAllRecipesFor(ForgeAnvilRecipeTypeRecipe.Type.INSTANCE);
		registration.addRecipes(ForgeAnvilRecipeType_Type, ForgeAnvilRecipeTypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(DimProgressModBlocks.FORGE_ANVIL.get().asItem()), ForgeAnvilRecipeType_Type);
	}
}
