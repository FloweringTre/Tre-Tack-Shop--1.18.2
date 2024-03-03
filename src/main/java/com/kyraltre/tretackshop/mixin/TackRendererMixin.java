package com.kyraltre.tretackshop.mixin;

import com.alaharranhonor.swem.forge.client.render.SWEMHorseRenderer;
import com.alaharranhonor.swem.forge.entities.horse.SWEMHorseEntity;
import com.alaharranhonor.swem.forge.entities.horse.SWEMHorseEntityBase;
import com.alaharranhonor.swem.forge.items.tack.AdventureBridleItem;
import com.alaharranhonor.swem.forge.items.tack.EnglishBridleItem;
import com.alaharranhonor.swem.forge.items.tack.WesternBridleItem;
import com.kyraltre.tretackshop.item.custom.PelhamBridleItem;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.units.qual.A;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.ExtendedGeoEntityRenderer;

import java.util.Arrays;


@Mixin(SWEMHorseRenderer.class)
public abstract class TackRendererMixin extends ExtendedGeoEntityRenderer<SWEMHorseEntity> {

    private static final String[] PELHAM_BRIDLE_BONE_NAMES = new String[]{"WesternBridle", "WesternBridleLeftBit", "WesternBridleRightBit"};
    @Unique
    private static final String[] PELHAM_BRIDLE_REIN_BONE_NAMES = new String[]{"EnglishBridleLeftRein", "EnglishBridleLeftRein1", "EnglishBridleLeftRein2", "EnglishBridleRightRein", "EnglishBridleRightRein1", "EnglishBridleRightRein2", "WesternBridleLeftRein", "WesternBridleLeftRein1", "WesternBridleLeftRein2", "WesternBridleRightRein", "WesternBridleRightRein1", "WesternBridleRightRein2"};
    private static final String[] WESTERN_BRIDLE_BONE_NAMES = new String[]{"WesternBridle", "WesternBridleLeftBit", "WesternBridleRightBit"};
    private static final String[] WESTERN_BRIDLE_REIN_BONE_NAMES = new String[]{"WesternBridleLeftRein", "WesternBridleLeftRein1", "WesternBridleLeftRein2", "WesternBridleRightRein", "WesternBridleRightRein1", "WesternBridleRightRein2"};
    private static final String[] ENGLISH_BRIDLE_BONE_NAMES = new String[]{"EnglishBridle", "EnglishBridleLeftBit", "EnglishBridleRightBit"};
    private static final String[] ENGLISH_BRIDLE_REIN_BONE_NAMES = new String[]{"EnglishBridleLeftRein", "EnglishBridleLeftRein1", "EnglishBridleLeftRein2", "EnglishBridleRightRein", "EnglishBridleRightRein1", "EnglishBridleRightRein2"};

    protected TackRendererMixin(EntityRendererProvider.Context renderManager, AnimatedGeoModel<SWEMHorseEntity> modelProvider) {
        super(renderManager, modelProvider);
    }


    @Inject(
            at = @At(value = "HEAD"),
            method = "checkBridlesForRendering",
            cancellable = true,
            remap = false
)
    private void onCheckBridlesForRendering(SWEMHorseEntity entity, CallbackInfo info) {
       info.cancel();

       ItemStack bridleStack = entity.getHalter();
       boolean bridleRenderFlag = (Boolean)entity.getEntityData().get(SWEMHorseEntityBase.RENDER_BRIDLE);
       if (bridleStack.getItem() instanceof PelhamBridleItem && bridleRenderFlag) {
           Arrays.stream(PELHAM_BRIDLE_BONE_NAMES).forEach((n) -> {
               this.showBone(n, entity);
           });
           if (!entity.isBridleLeashed()) {
               Arrays.stream(PELHAM_BRIDLE_REIN_BONE_NAMES).forEach((n) -> {
                   this.showBone(n, entity);
               });
           } else {
               Arrays.stream(PELHAM_BRIDLE_REIN_BONE_NAMES).forEach((n) -> {
                   this.hideBone(n, entity);
               });
           }
       } else {
           Arrays.stream(PELHAM_BRIDLE_REIN_BONE_NAMES).forEach((n) -> {
               this.hideBone(n, entity);
           });
           Arrays.stream(PELHAM_BRIDLE_REIN_BONE_NAMES).forEach((n) -> {
               this.hideBone(n, entity);
           });
       }
   }

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
