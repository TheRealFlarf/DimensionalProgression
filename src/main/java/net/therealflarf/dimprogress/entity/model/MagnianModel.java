package net.therealflarf.dimprogress.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.therealflarf.dimprogress.entity.MagnianEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

public class MagnianModel extends GeoModel<MagnianEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagnianEntity entity) {
		return new ResourceLocation("dim_progress", "animations/magnian.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagnianEntity entity) {
		return new ResourceLocation("dim_progress", "geo/magnian.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagnianEntity entity) {
		return new ResourceLocation("dim_progress", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MagnianEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
