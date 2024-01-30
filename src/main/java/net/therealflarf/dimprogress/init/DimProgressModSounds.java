
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class DimProgressModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DimProgressMod.MODID);
	public static final RegistryObject<SoundEvent> PORTAL_FRAME_ACTIVATE = REGISTRY.register("portal_frame_activate", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dim_progress", "portal_frame_activate")));
	public static final RegistryObject<SoundEvent> PERGALON_INTRODUCTION = REGISTRY.register("pergalon_introduction", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dim_progress", "pergalon_introduction")));
	public static final RegistryObject<SoundEvent> PERGALON_AMBIENT = REGISTRY.register("pergalon_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dim_progress", "pergalon_ambient")));
	public static final RegistryObject<SoundEvent> MUSIC_RUNIC_RIFT = REGISTRY.register("music.runic_rift", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dim_progress", "music.runic_rift")));
	public static final RegistryObject<SoundEvent> MUSIC_PERGALON_PORTAL_ACTIVATE = REGISTRY.register("music.pergalon.portal_activate",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dim_progress", "music.pergalon.portal_activate")));
	public static final RegistryObject<SoundEvent> AMBIENCE_RUNIC_RIFT_LOOP = REGISTRY.register("ambience.runic_rift.loop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dim_progress", "ambience.runic_rift.loop")));
}
