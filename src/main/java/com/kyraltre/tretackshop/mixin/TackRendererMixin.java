package com.kyraltre.tretackshop.mixin;

import com.alaharranhonor.swem.forge.client.render.SWEMHorseRenderer;
import com.alaharranhonor.swem.forge.entities.horse.SWEMHorseEntity;
import com.alaharranhonor.swem.forge.entities.horse.SWEMHorseEntityBase;
import com.alaharranhonor.swem.forge.items.tack.AdventureBridleItem;
import com.alaharranhonor.swem.forge.items.tack.EnglishBridleItem;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
import com.alaharranhonor.swem.forge.items.tack.WesternBridleItem;
import com.kyraltre.tretackshop.item.custom.DyedPastureBlanket;
import com.kyraltre.tretackshop.item.custom.PelhamBridleItem;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.item.DyeableArmorItem;
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

    private static final String[] PELHAM_BRIDLE_BONE_NAMES = new String[]{"WesternBridle", "WesternBridleLeftBit", "WesternBridleRightBit", "EnglishBridle", "EnglishBridleLeftBit", "EnglishBridleRightBit"};
    private static final String[] PELHAM_BRIDLE_REIN_BONE_NAMES = new String[]{"EnglishBridleLeftRein", "EnglishBridleLeftRein1", "EnglishBridleLeftRein2", "EnglishBridleRightRein", "EnglishBridleRightRein1", "EnglishBridleRightRein2", "WesternBridleLeftRein", "WesternBridleLeftRein1", "WesternBridleLeftRein2", "WesternBridleRightRein", "WesternBridleRightRein1", "WesternBridleRightRein2"};
    private static final String[] PASTURE_BLANKET_BONE_NAMES = new String[]{"PBFrontLeft", "PBMiddle", "PBFrontRight", "PBBack"};

    protected TackRendererMixin(EntityRendererProvider.Context renderManager, AnimatedGeoModel<SWEMHorseEntity> modelProvider) {
        super(renderManager, modelProvider);
    }

// This Injection resets the ENTIRE check bridle method to combine all bridles to render collectively. All bridles will render both bits and rein options for any combination a user wants.
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
        if ((bridleStack.getItem() instanceof AdventureBridleItem || bridleStack.getItem() instanceof WesternBridleItem
        || bridleStack.getItem() instanceof EnglishBridleItem) && bridleRenderFlag) {
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
            Arrays.stream(PELHAM_BRIDLE_BONE_NAMES).forEach((n) -> {
                this.hideBone(n, entity);
            });
            Arrays.stream(PELHAM_BRIDLE_REIN_BONE_NAMES).forEach((n) -> {
                this.hideBone(n, entity);
            });
        }
   }

//    @Inject(
//            at = @At(value = "HEAD"),
//            method = "checkPastureBlanketForRendering",
//            cancellable = true,
//            remap = false
//    )
//    private void checkPastureBlanketForRendering(SWEMHorseEntity entity, CallbackInfo info) {
//        info.cancel();
//
//        ItemStack stack = entity.getSWEMArmor();
//        ItemStack itemstack = pLivingEntity.getItemBySlot(pSlot);
//        if (stack.getItem() instanceof PastureBlanketItem) {
//            Arrays.stream(PASTURE_BLANKET_BONE_NAMES).forEach((boneName) -> {
//                this.showBone(boneName, entity);
//            });
//            this.hideBone("BreastLeft", entity);
//            this.hideBone("BreastRight", entity);
//        } else {
//            Arrays.stream(PASTURE_BLANKET_BONE_NAMES).forEach((boneName) -> {
//                this.hideBone(boneName, entity);
//            });
//            this.showBone("BreastLeft", entity);
//            this.showBone("BreastRight", entity);
//        }
//        if (stack.getItem() instanceof DyedPastureBlanket) {
//            int i = ((net.minecraft.world.item.DyeableLeatherItem) DyedPastureBlanket).getColor(itemstack);
//            float f = (float) (i >> 16 & 255) / 255.0F;
//            float f1 = (float) (i >> 8 & 255) / 255.0F;
//            float f2 = (float) (i & 255) / 255.0F;
//            this.renderModel(pPoseStack, pBuffer, p_117123_, flag1, model, f, f1, f2, this.getArmorResource(pLivingEntity, itemstack, pSlot, null));
//            this.renderModel(pPoseStack, pBuffer, p_117123_, flag1, model, 1.0F, 1.0F, 1.0F, this.getArmorResource(pLivingEntity, itemstack, pSlot, "overlay"));
//        } else {
//            this.renderModel(pPoseStack, pBuffer, p_117123_, flag1, model, 1.0F, 1.0F, 1.0F, this.getArmorResource(pLivingEntity, itemstack, pSlot, null));
//        }
//    }



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
