
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.world.features.plants.CrimsonSprigsFeature;
import net.therealflarf.dimprogress.world.features.ores.DeepslateRuniconOreFeature;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class DimProgressModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DimProgressMod.MODID);
	public static final RegistryObject<Feature<?>> DEEPSLATE_RUNICON_ORE = REGISTRY.register("deepslate_runicon_ore", DeepslateRuniconOreFeature::new);
	public static final RegistryObject<Feature<?>> CRIMSON_SPRIGS = REGISTRY.register("crimson_sprigs", CrimsonSprigsFeature::new);
}
