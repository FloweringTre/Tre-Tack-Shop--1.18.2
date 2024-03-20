package com.kyraltre.trelibrary.mixin;

import com.alaharranhonor.swem.forge.client.render.SWEMHorseRenderer;
import com.alaharranhonor.swem.forge.entities.horse.SWEMHorseEntity;
import com.alaharranhonor.swem.forge.entities.horse.SWEMHorseEntityBase;
import com.alaharranhonor.swem.forge.items.tack.BlanketItem;
import com.alaharranhonor.swem.forge.items.tack.LegWrapsItem;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.ExtendedGeoEntityRenderer;

import java.util.Arrays;


@Mixin(SWEMHorseRenderer.class)
public abstract class LegWrapsRendererMixin extends ExtendedGeoEntityRenderer<SWEMHorseEntity> {

    // Adds the knee and upper legs to the leg wrap bones

    private static final String[] LEG_WRAPS_SHOW_BONE_NAMES = new String[]{"FrontLeftKnee", "FrontLeftLeg", "FrontRightLeg", "FrontRightKnee",
            "BackLeft", "Thigh", "KneeLeft", "BackRight", "Thigh2", "KneeRight",
            "LegWrapsSkull", "LegWrapsBridgeOfNose", "LegWrapsEarLeft", "LegWrapsEarRight", "LegWrapsMiddle", "LegWrapsBackRight", "LegWrapsBackRightHoof", "LegWrapsBackLeft", "LegWrapsBackLeftHoof", "LegWrapsFrontRight", "LegWrapsBackFrontHoof", "LegWrapsFrontLeft", "LegWrapsBackFrontLeft"};

    private static final String[] LEG_WRAPS_HIDE_BONE_NAMES = new String[]{"LegWrapsSkull", "LegWrapsBridgeOfNose", "LegWrapsEarLeft", "LegWrapsEarRight", "LegWrapsMiddle", "LegWrapsBackRight", "LegWrapsBackRightHoof", "LegWrapsBackLeft", "LegWrapsBackLeftHoof", "LegWrapsFrontRight", "LegWrapsBackFrontHoof", "LegWrapsFrontLeft", "LegWrapsBackFrontLeft"};


    protected LegWrapsRendererMixin(EntityRendererProvider.Context renderManager, AnimatedGeoModel<SWEMHorseEntity> modelProvider) {
        super(renderManager, modelProvider);
    }

////     This Injection resets the ENTIRE check legwrap method to reset the bones that are called.
    @Inject(
            at = @At(value = "HEAD"),
            method = "checkLegWrapsForRendering",
            cancellable = true,
            remap = false
    )
    private void checkLegWrapsForRendering(SWEMHorseEntity entity, CallbackInfo info) {
        info.cancel();

        ItemStack stack = entity.getLegWraps();
        if (stack.getItem() instanceof LegWrapsItem) {
            Arrays.stream(LEG_WRAPS_SHOW_BONE_NAMES).forEach((n) -> {
                this.showBone(n, entity);
            });
        } else {
            Arrays.stream(LEG_WRAPS_HIDE_BONE_NAMES).forEach((n) -> {
                this.hideBone(n, entity);
            });
        }

    }

/// The bone calls

    public void hideBone(String boneName, SWEMHorseEntity entity) {
        this.getGeoModelProvider().getModel(this.getGeoModelProvider().getModelLocation(entity)).getBone(boneName).ifPresent((bone) -> {
            bone.setHidden(true);
        });
    }

    public void showBone(String boneName, SWEMHorseEntity entity) {
        this.getGeoModelProvider().getModel(this.getGeoModelProvider().getModelLocation(entity)).getBone(boneName).ifPresent((bone) -> {
            bone.setHidden(false);
        });
    }

}
