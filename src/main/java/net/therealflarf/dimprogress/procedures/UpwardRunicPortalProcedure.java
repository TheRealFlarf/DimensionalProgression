package net.therealflarf.dimprogress.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class UpwardRunicPortalProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_portal_cores")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(y + 0, x + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("activate (x axis)"), true);
		} else if (true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("activate (z axis)"), true);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("do not activate"), true);
		}
	}
}
