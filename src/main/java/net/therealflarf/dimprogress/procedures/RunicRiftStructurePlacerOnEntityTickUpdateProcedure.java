package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RunicRiftStructurePlacerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xOffset = 0;
		double randomChance = 0;
		double zOffset = 0;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dim_progress:deleted_mod_element")))) {
			randomChance = Mth.nextInt(RandomSource.create(), 1, 100);
			if ((world.getBlockState(BlockPos.containing(x + 5, y - 1, z))).getBlock() == Blocks.AIR) {
				xOffset = 3;
				zOffset = -2;
				if (randomChance <= 60) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "runic_rift_basic_hall"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (randomChance <= 70) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "runic_rift_crystal_chest"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (randomChance <= 80) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "runic_rift_prism_room"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (randomChance <= 90) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "runic_rift_large_fourway"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "runic_rift_gate"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x - 5, y - 1, z))).getBlock() == Blocks.AIR) {
				xOffset = -7;
				zOffset = -2;
				if (randomChance <= 60) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "runic_rift_basic_hall"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (randomChance <= 70) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "runic_rift_crystal_chest"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing((x + xOffset) - 5, y - 1, z + zOffset), BlockPos.containing((x + xOffset) - 5, y - 1, z + zOffset),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (randomChance <= 80) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "runic_rift_prism_room"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing((x + xOffset) - 5, y - 1, z + zOffset), BlockPos.containing((x + xOffset) - 5, y - 1, z + zOffset),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (randomChance <= 90) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "runic_rift_large_fourway"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing((x + xOffset) - 10, y - 1, z + zOffset), BlockPos.containing((x + xOffset) - 10, y - 1, z + zOffset),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
		}
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
