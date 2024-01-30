
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.therealflarf.dimprogress.init;

import net.therealflarf.dimprogress.entity.RunicRiftStructurePlacerEntity;
import net.therealflarf.dimprogress.entity.DTHallwayPlacementEntity;
import net.therealflarf.dimprogress.entity.CottonweaveEntity;
import net.therealflarf.dimprogress.DimProgressMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DimProgressModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DimProgressMod.MODID);
	public static final RegistryObject<EntityType<CottonweaveEntity>> COTTONWEAVE = register("cottonweave", EntityType.Builder.<CottonweaveEntity>of(CottonweaveEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CottonweaveEntity::new).fireImmune().sized(0.7f, 0.8f));
	public static final RegistryObject<EntityType<DTHallwayPlacementEntity>> DT_HALLWAY_PLACEMENT = register("dt_hallway_placement",
			EntityType.Builder.<DTHallwayPlacementEntity>of(DTHallwayPlacementEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(DTHallwayPlacementEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RunicRiftStructurePlacerEntity>> RUNIC_RIFT_STRUCTURE_PLACER = register("runic_rift_structure_placer",
			EntityType.Builder.<RunicRiftStructurePlacerEntity>of(RunicRiftStructurePlacerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RunicRiftStructurePlacerEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CottonweaveEntity.init();
			DTHallwayPlacementEntity.init();
			RunicRiftStructurePlacerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(COTTONWEAVE.get(), CottonweaveEntity.createAttributes().build());
		event.put(DT_HALLWAY_PLACEMENT.get(), DTHallwayPlacementEntity.createAttributes().build());
		event.put(RUNIC_RIFT_STRUCTURE_PLACER.get(), RunicRiftStructurePlacerEntity.createAttributes().build());
	}
}
