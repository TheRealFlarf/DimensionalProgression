package net.therealflarf.dimprogress.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class UpwardRunicPortalProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x - 2, y + 1, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 2, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 3, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 4, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 2, y + 1, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 2, y + 2, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 2, y + 3, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 2, y + 4, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 2, y + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 0, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 5, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 2, y + 5, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y + 5, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x - 1, y + 5, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 5, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))) {
			if (DimProgressModItems.NETHER_PORTAL_CHARGE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill ~1 ~1 ~ ~-1 ~4 ~ air");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill ~1 ~1 ~ ~-1 ~4 ~ minecraft:nether_portal[axis=x]");
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:portal_frame_activate")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:portal_frame_activate")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			} else if (DimProgressModItems.PERGALON_PORTAL_CHARGE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill ~1 ~1 ~ ~-1 ~4 ~ air");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill ~1 ~1 ~ ~-1 ~4 ~ dim_progress:pergalon_portal[axis=x]");
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:portal_frame_activate")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:portal_frame_activate")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:pergalon_portal_activate")), SoundSource.MUSIC, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:pergalon_portal_activate")), SoundSource.MUSIC, 1, 1, false);
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("The portal must be activated with an active Portal Charge"), true);
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z - 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 2, z - 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 3, z - 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 4, z - 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 3, z + 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 4, z + 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 5, z + 0))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 5, z + 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 5, z + 1))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 5, z - 1))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_pillars")))
				&& (world.getBlockState(BlockPos.containing(x + 0, y + 5, z - 2))).is(BlockTags.create(new ResourceLocation("dim_progress:runic_rings")))) {
			if (DimProgressModItems.NETHER_PORTAL_CHARGE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill ~ ~1 ~1 ~ ~4 ~-1 air");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill ~ ~1 ~1 ~ ~4 ~-1 minecraft:nether_portal[axis=z]");
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:portal_frame_activate")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:portal_frame_activate")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			} else if (DimProgressModItems.PERGALON_PORTAL_CHARGE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill ~ ~1 ~1 ~ ~4 ~-1 air");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill ~ ~1 ~1 ~ ~4 ~-1 dim_progress:pergalon_portal[axis=z]");
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:portal_frame_activate")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:portal_frame_activate")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:pergalon_portal_activate")), SoundSource.MUSIC, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dim_progress:pergalon_portal_activate")), SoundSource.MUSIC, 1, 1, false);
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("The portal must be activated with an active Portal Charge"), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Incorrect portal frame structure."), true);
		}
	}
}
