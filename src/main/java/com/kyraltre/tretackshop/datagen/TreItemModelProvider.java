package com.kyraltre.tretackshop.datagen;

import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TreItemModelProvider extends ItemModelProvider {
    public TreItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TreTackShop.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        simpleItem(TackShopItems.RAINBOW_INA_BOTTLE.get());

    //crafting loop
//
//        int var1 = 15;
//        int var2 = 13;
//        while (var2 < var1) {
//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/pasture_blanket/pasture_blanket_" + var2 + "_icon"));
//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + var2 + "_armored", "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/pasture_blanket/pasture_blanket_" + var2 + "_armored_icon"));
//
//            ((ItemModelBuilder) this.withExistingParent("halter_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/halters/halter_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("flymask_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/halters/flymask_" + var2));
//
//            ((ItemModelBuilder) this.withExistingParent("adventure_blanket_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/adventure_blanket_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("english_blanket_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/english_blanket_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("western_blanket_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/western_blanket_" + var2));
//
//            ((ItemModelBuilder) this.withExistingParent("adventure_breast_collar_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/breast_collars/adventure_breast_collar_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("english_breast_collar_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/breast_collars/english_breast_collar_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("western_breast_collar_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/breast_collars/western_breast_collar_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("cloth_breast_collar_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/breast_collars/cloth_breast_collar_" + var2));
//
//            ((ItemModelBuilder) this.withExistingParent("adventure_leg_wraps_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/leg_wraps/adventure_leg_wraps_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("english_leg_wraps_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/leg_wraps/english_leg_wraps_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("western_leg_wraps_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/leg_wraps/western_leg_wraps_" + var2));
//
//            ((ItemModelBuilder) this.withExistingParent("adventure_saddle_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/saddles/adventure_saddle_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("english_saddle_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/saddles/english_saddle_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("western_saddle_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/saddles/western_saddle_" + var2));
//
//            ++var2;
//        }


        //award loop

//        int var3 = 15;
//        int var4 = 13;
//        while (var4 < var3) {
//            ((ItemModelBuilder) this.withExistingParent("award_pasture_blanket_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/pasture_blanket/award_pasture_blanket_" + var4 + "_icon"));
//            ((ItemModelBuilder) this.withExistingParent("award_pasture_blanket_" + var4 + "_armored", "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/pasture_blanket/award_pasture_blanket_" + var4 + "_armored_icon"));
//
//            ((ItemModelBuilder) this.withExistingParent("award_halter_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/halters/award_halter_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_flymask_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/halters/award_flymask_" + var4));
//
//            ((ItemModelBuilder) this.withExistingParent("award_adventure_blanket_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/blankets/award_adventure_blanket_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_english_blanket_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/blankets/award_english_blanket_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_western_blanket_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/blankets/award_western_blanket_" + var4));
//
//            ((ItemModelBuilder) this.withExistingParent("award_adventure_breast_collar_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/breast_collars/award_adventure_breast_collar_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_english_breast_collar_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/breast_collars/award_english_breast_collar_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_western_breast_collar_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/breast_collars/award_western_breast_collar_" + var4));
//
//            ((ItemModelBuilder) this.withExistingParent("award_adventure_leg_wraps_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/leg_wraps/award_adventure_leg_wraps_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_english_leg_wraps_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/leg_wraps/award_english_leg_wraps_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_western_leg_wraps_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/leg_wraps/award_western_leg_wraps_" + var4));
//
//            ((ItemModelBuilder) this.withExistingParent("award_adventure_saddle_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/saddles/award_adventure_saddle_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_english_saddle_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/saddles/award_english_saddle_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_western_saddle_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/saddles/award_western_saddle_" + var4));
//
//            ++var4;
//        }
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TreTackShop.MOD_ID,"items/" + item.getRegistryName().getPath()));
    }
///CRAFTING ITEMS
//    private ItemModelBuilder saddleBlanketItem(Item item) {
//        return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/generated")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"items/blankets" + item.getRegistryName().getPath()));
//    }
//    private ItemModelBuilder breastCollarItem(Item item) {
//        return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/generated")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"items/breast_collars" + item.getRegistryName().getPath()));
//    }
//    private ItemModelBuilder halterItem(Item item) {
//        return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/generated")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"items/halters" + item.getRegistryName().getPath()));
//    }
//    private ItemModelBuilder legWrapItem(Item item) {
//        return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/generated")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"items/leg_wraps" + item.getRegistryName().getPath()));
//    }
//    private ItemModelBuilder pastureBlanketItem(Item item) {
//        return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/generated")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"items/pasture_blanket" + item.getRegistryName().getPath()));
//    }
//    private ItemModelBuilder saddleItem(Item item) {
//        return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/generated")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"items/saddles" + item.getRegistryName().getPath()));
//    }

//
//      private ItemModelBuilder handheldItem(Item item) {
//          return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/handheld")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"item/" + item.getRegistryName().getPath()));
////  }

//    DyeColor[] var1 = DyeColor.values();
//    int var2 = var1.length;
//
//        for(int var3 = 0; var3 < var2; ++var3) {
//        ((ItemModelBuilder)this.withExistingParent("pasture_blanket_" + color.getName(), "item/generated"))
//            .texture("layer0", new ResourceLocation("swem", "items/pasture_blanket_" + color.getName() + "_icon"));
//
//        ((ItemModelBuilder)this.withExistingParent("pasture_blanket_" + color.getName() + "_armored", "item/generated")
//            .texture("layer0", new ResourceLocation("swem", "items/pasture_blanket_" + color.getName() + "_armored_icon"));
//    }

}
