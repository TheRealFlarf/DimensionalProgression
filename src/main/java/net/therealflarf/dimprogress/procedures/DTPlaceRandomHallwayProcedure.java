package net.therealflarf.dimprogress.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DTPlaceRandomHallwayProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomChance = 0;
		double xOffset = 0;
		double zOffset = 0;
		boolean canContinue = false;
		randomChance = Mth.nextInt(RandomSource.create(), 1, 100);
		canContinue = false;
		if ((world.getBlockState(BlockPos.containing(x + 5, y - 1, z))).getBlock() == Blocks.AIR) {
			xOffset = 3;
			zOffset = -2;
			canContinue = true;
		}
		if (canContinue) {
			if (randomChance <= 60) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_hallway_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (randomChance <= 90) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_intersection_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_ending_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			canContinue = false;
		}
		if ((world.getBlockState(BlockPos.containing(x - 5, y - 1, z))).getBlock() == Blocks.AIR) {
			xOffset = -7;
			zOffset = -2;
			canContinue = true;
		}
		if (canContinue) {
			if (randomChance <= 60) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_hallway_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (randomChance <= 90) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_intersection_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_ending_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			canContinue = false;
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 5))).getBlock() == Blocks.AIR) {
			zOffset = 3;
			xOffset = -2;
			canContinue = true;
		}
		if (canContinue) {
			if (randomChance <= 60) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_hallway_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (randomChance <= 90) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_intersection_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_ending_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			canContinue = false;
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 5))).getBlock() == Blocks.AIR) {
			zOffset = -7;
			xOffset = -2;
			canContinue = true;
		}
		if (canContinue) {
			if (randomChance <= 60) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_hallway_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (randomChance <= 90) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_intersection_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("dim_progress", "dt_ending_basic"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + xOffset, y - 1, z + zOffset), BlockPos.containing(x + xOffset, y - 1, z + zOffset),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			canContinue = false;
		}
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
