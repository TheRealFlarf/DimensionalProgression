package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.jei_recipes.ForgeAnvilRecipeTypeRecipe;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

@Mod.EventBusSubscriber(modid = DimProgressMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DimProgressModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "dim_progress");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("forge_anvil_recipe_type", () -> ForgeAnvilRecipeTypeRecipe.Serializer.INSTANCE);
		});
	}
}
