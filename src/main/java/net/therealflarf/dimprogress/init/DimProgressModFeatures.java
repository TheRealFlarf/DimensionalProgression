
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.world.features.plants.NycticSprigsFeature;
import net.therealflarf.dimprogress.world.features.plants.GrovileSprigsFeature;
import net.therealflarf.dimprogress.world.features.plants.FirebloomFeature;
import net.therealflarf.dimprogress.world.features.plants.DeadPergalonSprigsFeature;
import net.therealflarf.dimprogress.world.features.plants.CrimsonSprigsFeature;
import net.therealflarf.dimprogress.world.features.ores.DeepslateRuniconOreFeature;
import net.therealflarf.dimprogress.world.features.SunlitSilicaPrismSmallFeature;
import net.therealflarf.dimprogress.world.features.SunlitSilicaPrismLargeFeature;
import net.therealflarf.dimprogress.world.features.PergalonNegativeHeckrockPlacementFeature;
import net.therealflarf.dimprogress.world.features.MagmaticDesertMagmactusGeneratorFeature;
import net.therealflarf.dimprogress.world.features.MagmaticDesertMagmaPatchFeature;
import net.therealflarf.dimprogress.world.features.MagmaticDesertLavaPatchesFeature;
import net.therealflarf.dimprogress.world.features.MagmaticDesertFirePatchFeature;
import net.therealflarf.dimprogress.world.features.MagmaticDesertFelsandstonePatchFeature;
import net.therealflarf.dimprogress.world.features.BloodredBogWaterPoolsFeature;
import net.therealflarf.dimprogress.world.features.BloodredBogMudPatchFeature;
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
	public static final RegistryObject<Feature<?>> FIREBLOOM = REGISTRY.register("firebloom", FirebloomFeature::new);
	public static final RegistryObject<Feature<?>> CRIMSON_SPRIGS = REGISTRY.register("crimson_sprigs", CrimsonSprigsFeature::new);
	public static final RegistryObject<Feature<?>> DEAD_PERGALON_SPRIGS = REGISTRY.register("dead_pergalon_sprigs", DeadPergalonSprigsFeature::new);
	public static final RegistryObject<Feature<?>> GROVILE_SPRIGS = REGISTRY.register("grovile_sprigs", GrovileSprigsFeature::new);
	public static final RegistryObject<Feature<?>> NYCTIC_SPRIGS = REGISTRY.register("nyctic_sprigs", NycticSprigsFeature::new);
	public static final RegistryObject<Feature<?>> MAGMATIC_DESERT_MAGMACTUS_GENERATOR = REGISTRY.register("magmatic_desert_magmactus_generator", MagmaticDesertMagmactusGeneratorFeature::new);
	public static final RegistryObject<Feature<?>> MAGMATIC_DESERT_LAVA_PATCHES = REGISTRY.register("magmatic_desert_lava_patches", MagmaticDesertLavaPatchesFeature::new);
	public static final RegistryObject<Feature<?>> MAGMATIC_DESERT_FELSANDSTONE_PATCH = REGISTRY.register("magmatic_desert_felsandstone_patch", MagmaticDesertFelsandstonePatchFeature::new);
	public static final RegistryObject<Feature<?>> MAGMATIC_DESERT_FIRE_PATCH = REGISTRY.register("magmatic_desert_fire_patch", MagmaticDesertFirePatchFeature::new);
	public static final RegistryObject<Feature<?>> MAGMATIC_DESERT_MAGMA_PATCH = REGISTRY.register("magmatic_desert_magma_patch", MagmaticDesertMagmaPatchFeature::new);
	public static final RegistryObject<Feature<?>> SUNLIT_SILICA_PRISM_LARGE = REGISTRY.register("sunlit_silica_prism_large", SunlitSilicaPrismLargeFeature::new);
	public static final RegistryObject<Feature<?>> SUNLIT_SILICA_PRISM_SMALL = REGISTRY.register("sunlit_silica_prism_small", SunlitSilicaPrismSmallFeature::new);
	public static final RegistryObject<Feature<?>> BLOODRED_BOG_MUD_PATCH = REGISTRY.register("bloodred_bog_mud_patch", BloodredBogMudPatchFeature::new);
	public static final RegistryObject<Feature<?>> BLOODRED_BOG_WATER_POOLS = REGISTRY.register("bloodred_bog_water_pools", BloodredBogWaterPoolsFeature::new);
	public static final RegistryObject<Feature<?>> PERGALON_NEGATIVE_HECKROCK_PLACEMENT = REGISTRY.register("pergalon_negative_heckrock_placement", PergalonNegativeHeckrockPlacementFeature::new);
}
