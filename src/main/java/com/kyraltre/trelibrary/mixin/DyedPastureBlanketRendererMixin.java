package com.kyraltre.trelibrary.mixin;

public class DyedPastureBlanketRendererMixin {

    //// WORK IN PROGRESS -- COMMENTED OUT SO IT DOESNT WORK RIGHT NOW

    //     private static final String[] PASTURE_BLANKET_BONE_NAMES = new String[]{"PBFrontLeft", "PBMiddle", "PBFrontRight", "PBBack"};

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
}
