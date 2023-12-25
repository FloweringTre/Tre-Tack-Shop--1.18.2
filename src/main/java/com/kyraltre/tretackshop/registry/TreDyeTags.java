package com.kyraltre.tretackshop.registry;

import com.kyraltre.tretackshop.TreTackShop;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TreDyeTags {
    //for dying items
    public static final TagKey<Item> DYE_1 = ItemTags.create(TreTackShop.resloc("dyes/rose"));
    public static final TagKey<Item> DYE_2 = ItemTags.create(TreTackShop.resloc("dyes/salmon"));
    public static final TagKey<Item> DYE_3 = ItemTags.create(TreTackShop.resloc("dyes/sunshine"));
    public static final TagKey<Item> DYE_4 = ItemTags.create(TreTackShop.resloc("dyes/mint"));
    public static final TagKey<Item> DYE_5 = ItemTags.create(TreTackShop.resloc("dyes/arctic"));
    public static final TagKey<Item> DYE_6 = ItemTags.create(TreTackShop.resloc("dyes/lavender"));
    public static final TagKey<Item> DYE_7 = ItemTags.create(TreTackShop.resloc("dyes/fuchsia"));
    public static final TagKey<Item> DYE_8 = ItemTags.create(TreTackShop.resloc("dyes/ruby"));
    public static final TagKey<Item> DYE_9 = ItemTags.create(TreTackShop.resloc("dyes/dandelion"));
    public static final TagKey<Item> DYE_10 = ItemTags.create(TreTackShop.resloc("dyes/emerald"));
    public static final TagKey<Item> DYE_11 = ItemTags.create(TreTackShop.resloc("dyes/navy"));
    public static final TagKey<Item> DYE_12 = ItemTags.create(TreTackShop.resloc("dyes/orchid"));
    public static final TagKey<Item> DYE_13 = ItemTags.create(TreTackShop.resloc("dyes/creamsicle"));
    public static final TagKey<Item> DYE_14 = ItemTags.create(TreTackShop.resloc("dyes/topaz"));


    // FOR TONING PASTEL OR JEWEL TONE
    public static final TagKey<Item> TONER_PASTEL = ItemTags.create(TreTackShop.resloc("dyes/toner_pastel"));
    public static final TagKey<Item> TONER_JEWEL = ItemTags.create(TreTackShop.resloc("dyes/toner_jewel"));


    public TreDyeTags() {

    }
}
