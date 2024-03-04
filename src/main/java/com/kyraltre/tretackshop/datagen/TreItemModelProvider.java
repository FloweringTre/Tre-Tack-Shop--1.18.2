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

        //DYE LOOP
        DyeColor[] var5 = DyeColor.values();
        int var7 = var5.length;
        for (int var6 = 0; var6 < var7; ++var6) {
            DyeColor color = var5[var6];
//            ((ItemModelBuilder) this.withExistingParent("flymask_" + color.getName(), "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/halters/flymask_" + color.getName()));
//            ((ItemModelBuilder) this.withExistingParent("flag_" + color.getName(), "item/flag_template"))
//                    .texture("texture", new ResourceLocation("tretackshop", "items/flags/flag_" + color.getName()));
//            ((ItemModelBuilder) this.withExistingParent("cloth_bitless_bridle_" + color.getName(), "item/generated"))
//                    .texture("texture", new ResourceLocation("tretackshop", "items/bridles/cloth_bitless_bridle_" + color.getName()));
//            ((ItemModelBuilder) this.withExistingParent("bareback_blanket_" + color.getName(), "item/generated"))
//                    .texture("texture", new ResourceLocation("tretackshop", "items/blankets/bareback_blanket_" + color.getName()));

        }


        //crafting loop
//
        int var1 = 15;
        int var2 = 1;
        while (var2 < var1) {
             ((ItemModelBuilder) this.withExistingParent("tack_box_single_" + var2, "swem:block/parent/tack_box_single"))
                    .texture("0", new ResourceLocation("tretackshop", "blocks/tack_boxes/tack_box_single_" + var2));
            ((ItemModelBuilder) this.withExistingParent("tack_box_left_" + var2, "swem:block/parent/tack_box_left"))
                    .texture("0", new ResourceLocation("tretackshop", "blocks/tack_boxes/tack_box_half_" + var2));
            ((ItemModelBuilder) this.withExistingParent("tack_box_right_" + var2, "swem:block/parent/tack_box_right"))
                    .texture("0", new ResourceLocation("tretackshop", "blocks/tack_boxes/tack_box_half_" + var2));
            ((ItemModelBuilder) this.withExistingParent("tack_box_" + var2, "tretackshop:blocks/tack_boxes/tack_box_single_" + var2 ))
                    .texture("A", new ResourceLocation("deleteme", "imadork"));


//            ((ItemModelBuilder) this.withExistingParent("saddle_bag_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/saddle_bags/saddle_bag_" + var2 + "_icon"));
//            ((ItemModelBuilder) this.withExistingParent("cloth_horse_armor_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/armor/cloth_horse_armor_" + var2));

//            ((ItemModelBuilder) this.withExistingParent("flag_" + var2, "item/flag_template"))
//                    .texture("texture", new ResourceLocation("tretackshop", "items/flags/flag_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("flag_butterfly_" + var2, "item/flag_template"))
//                    .texture("texture", new ResourceLocation("tretackshop", "items/flags/flag_" + var2 + "_butterfly"));
//            ((ItemModelBuilder) this.withExistingParent("award_flag_" + var2, "item/flag_template"))
//                    .texture("texture", new ResourceLocation("tretackshop", "items/awards/flags/award_flag_" + var2));


//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/pasture_blanket/pasture_blanket_" + var2 + "_icon"));
//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + var2 + "_armored", "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/pasture_blanket/pasture_blanket_" + var2 + "_armored_icon"));
//            ((ItemModelBuilder) this.withExistingParent("quarter_sheet_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/quarter_sheets/quarter_sheet_" + var2));
////
//            ((ItemModelBuilder) this.withExistingParent("halter_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/halters/halter_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("flymask_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/halters/flymask_" + var2));
////
//            ((ItemModelBuilder) this.withExistingParent("adventure_blanket_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/adventure_blanket_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("english_blanket_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/english_blanket_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("western_blanket_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/western_blanket_" + var2));
//                ((ItemModelBuilder) this.withExistingParent("bareback_blanket_" + var2, "item/generated"))
//                      .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/bareback_blanket_" + var2));
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
//            ((ItemModelBuilder) this.withExistingParent("adventure_bridle_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/bridles/adventure_bridle_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("english_bridle_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/bridles/english_bridle_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("western_bridle_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/bridles/western_bridle_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("cloth_bridle_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/bridles/cloth_bridle_" + var2));
//               ((ItemModelBuilder) this.withExistingParent("cloth_bitless_bridle_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/bridles/cloth_bitless_bridle_" + var2));
//
//            ((ItemModelBuilder) this.withExistingParent("adventure_girth_strap_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/girth_straps/adventure_girth_strap_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("english_girth_strap_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/girth_straps/english_girth_strap_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("western_girth_strap_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/girth_straps/western_girth_strap_" + var2));
//            ((ItemModelBuilder) this.withExistingParent("cloth_girth_strap_" + var2, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/girth_straps/cloth_girth_strap_" + var2));
//
            ++var2;
        }


        //award loop   awards/tack/
//
//        int var3 = 49;
//        int var4 = 15;
//        while (var4 < var3) {
//            ((ItemModelBuilder) this.withExistingParent("award_saddle_bag_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/saddle_bags/award_saddle_bag_" + var4 + "_icon"));
//            ((ItemModelBuilder) this.withExistingParent("award_cloth_horse_armor_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/armor/award_cloth_horse_armor_" + var4));
//
//            ((ItemModelBuilder) this.withExistingParent("award_quarter_sheet_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/quarter_sheets/award_quarter_sheet_" + var4));
////
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
//            ((ItemModelBuilder) this.withExistingParent("award_adventure_bridle_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/bridles/award_adventure_bridle_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_english_bridle_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/bridles/award_english_bridle_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_western_bridle_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/bridles/award_western_bridle_" + var4));
//
//            ((ItemModelBuilder) this.withExistingParent("award_adventure_girth_strap_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/girth_straps/award_adventure_girth_strap_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_english_girth_strap_" + var4, "item/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/girth_straps/award_english_girth_strap_" + var4));
//            ((ItemModelBuilder) this.withExistingParent("award_western_girth_strap_" + var4, "item/awards/tack/generated"))
//                    .texture("layer0", new ResourceLocation("tretackshop", "items/awards/tack/girth_straps/award_western_girth_strap_" + var4));
//
//            ++var4;
//        }
//        }
//ONE OFFS

//            int var8 = 2;
//            int var9 = 1;
//            while (var9 < var8) {
////        ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + "rainbow", "item/generated"))
////                .texture("layer0", new ResourceLocation("tretackshop", "items/pasture_blanket/pasture_blanket_" + "rainbow" + "_icon"));
//         ((ItemModelBuilder) this.withExistingParent("quarter_sheet_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/quarter_sheets/quarter_sheet_black" + "rainbow"));
//                ((ItemModelBuilder) this.withExistingParent("quarter_sheet_" + "rainbow", "item/generated"))
//                        .texture("layer0", new ResourceLocation("tretackshop", "items/quarter_sheets/quarter_sheet_white" + "rainbow"));
//
//
//        ((ItemModelBuilder) this.withExistingParent("halter_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/halters/halter_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("flymask_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/halters/flymask_" + "rainbow"));
//
//        ((ItemModelBuilder) this.withExistingParent("adventure_blanket_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/adventure_blanket_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("english_blanket_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/english_blanket_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("western_blanket_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/blankets/western_blanket_" + "rainbow"));
//
//        ((ItemModelBuilder) this.withExistingParent("adventure_breast_collar_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/breast_collars/adventure_breast_collar_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("english_breast_collar_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/breast_collars/english_breast_collar_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("western_breast_collar_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/breast_collars/western_breast_collar_" + "rainbow"));
//
//        ((ItemModelBuilder) this.withExistingParent("adventure_leg_wraps_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/leg_wraps/adventure_leg_wraps_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("english_leg_wraps_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/leg_wraps/english_leg_wraps_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("western_leg_wraps_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/leg_wraps/western_leg_wraps_" + "rainbow"));
//
//        ((ItemModelBuilder) this.withExistingParent("adventure_saddle_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/saddles/adventure_saddle_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("english_saddle_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/saddles/english_saddle_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("western_saddle_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/saddles/western_saddle_" + "rainbow"));
//
//        ((ItemModelBuilder) this.withExistingParent("adventure_bridle_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/bridles/adventure_bridle_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("english_bridle_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/bridles/english_bridle_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("western_bridle_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/bridles/western_bridle_" + "rainbow"));
//
//        ((ItemModelBuilder) this.withExistingParent("adventure_girth_strap_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/girth_straps/adventure_girth_strap_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("english_girth_strap_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/girth_straps/english_girth_strap_" + "rainbow"));
//        ((ItemModelBuilder) this.withExistingParent("western_girth_strap_" + "rainbow", "item/generated"))
//                .texture("layer0", new ResourceLocation("tretackshop", "items/girth_straps/western_girth_strap_" + "rainbow"));
//
//        ++var9;
//    }

    }
        private ItemModelBuilder simpleItem(Item item) {
            return withExistingParent(item.getRegistryName().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(TreTackShop.MOD_ID,"items/" + item.getRegistryName().getPath()));
        }

    private ItemModelBuilder flagItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/flag_template")).texture("texture",
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

