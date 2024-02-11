package com.kyraltre.tretackshop.registry;


import java.util.ArrayList;
import java.util.List;

import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

public class TackShopItems {
    public static final DeferredRegister<Item> ITEMS;

// THIS IS FOR TACK ITEMS THAT __CAN__ BE CRAFTED
    public static final RegistryObject<Item> BUTTERFLY;
    public static final RegistryObject<Item> BUTTERFLY_MONARCH;
//besides this butterfly that is just for the pretty icon <zzzz we love it <zzzz

    public static final RegistryObject<Item> RAINBOW_INA_BOTTLE;

//    public static final List<RegistryObject<Item>> FLAGS_DYED;

    // TACK ITEMS

    // DYED TACK
    //public static final RegistryObject<DyedPastureBlanket> PASTURE_BLANKET_DYED;
    public static final RegistryObject<Item> PELHAM_BRIDLE_BLACK;
    public static final RegistryObject<Item> PELHAM_BRIDLE_BROWN;
    public static final RegistryObject<Item> DOUBLE_BRIDLE;
    public static final RegistryObject<Item> BITLESS_BRIDLE;
    public static final RegistryObject<Item> BAREBACK_SADDLE;
    public static final RegistryObject<Item> BAREBACK_BLANKET;
    public static final RegistryObject<Item> BAREBACK_GIRTH_STRAP;
    public static final RegistryObject<Item> DRESSAGE_SADDLE;
    public static final RegistryObject<Item> DRESSAGE_BLANKET;
    public static final RegistryObject<Item> RACING_SADDLE_BROWN;
    public static final RegistryObject<Item> RACING_SADDLE_BLACK;
    public static final RegistryObject<Item> BITLESS_BRIDLE_BROWN;
    public static final RegistryObject<Item> BAREBACK_SADDLE_BROWN;
    public static final RegistryObject<Item> BAREBACK_GIRTH_STRAP_BROWN;
    public static final RegistryObject<Item> BITLESS_BRIDLE_BEIGE;
    public static final RegistryObject<Item> BAREBACK_SADDLE_BEIGE;
    public static final RegistryObject<Item> BAREBACK_GIRTH_STRAP_BEIGE;
    public static final RegistryObject<Item> HUNTER_BLANKET;
    public static final RegistryObject<Item> BITLESS_BRIDLE_WHITE;
    public static final RegistryObject<Item> BAREBACK_SADDLE_BLACK;
    public static final RegistryObject<Item> BAREBACK_GIRTH_STRAP_WHITE;


    // RAINBOW TACK
    public static final RegistryObject<Item> HALTER_RAINBOW;
    public static final RegistryObject<Item> PASTURE_BLANKET_RAINBOW;
    public static final RegistryObject<Item> PASTURE_BLANKET_RAINBOW_ARMORED;
    public static final RegistryObject<Item> ADVENTURE_BLANKET_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_BLANKET_RAINBOW;
    public static final RegistryObject<Item> WESTERN_BLANKET_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<Item> WESTERN_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_SADDLE_RAINBOW;
    public static final RegistryObject<Item> WESTERN_SADDLE_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_SADDLE_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<Item> WESTERN_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<Item> QUARTER_SHEET_BLACK_RAINBOW;
    public static final RegistryObject<Item> QUARTER_SHEET_WHITE_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_BRIDLE_RAINBOW;
    public static final RegistryObject<Item>WESTERN_BRIDLE_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_BRIDLE_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<Item> WESTERN_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<Item> IRON_HORSE_ARMOR_RAINBOW;
    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR_RAINBOW;
    public static final RegistryObject<Item> SADDLE_BAG_RAINBOW;

    public static final RegistryObject<Item> BAREBACK_BLANKET_RAINBOW;
    public static final RegistryObject<Item> CLOTH_BITLESS_BRIDLE_RAINBOW;

    // TRANSPARENT 'BAREBACK/LIBERTY' TACK
    public static final RegistryObject<Item> ADVENTURE_BLANKET_TRANS;
    public static final RegistryObject<Item> ENGLISH_BLANKET_TRANS;
    public static final RegistryObject<Item> WESTERN_BLANKET_TRANS;
    public static final RegistryObject<Item> ADVENTURE_LEG_WRAPS_TRANS;
    public static final RegistryObject<Item> ADVENTURE_SADDLE_TRANS;
    public static final RegistryObject<Item> WESTERN_SADDLE_TRANS;
    public static final RegistryObject<Item> ENGLISH_SADDLE_TRANS;
    public static final RegistryObject<Item> ADVENTURE_BREAST_COLLAR_TRANS;
    public static final RegistryObject<Item> ADVENTURE_BRIDLE_TRANS;
    public static final RegistryObject<Item> WESTERN_BRIDLE_TRANS;
    public static final RegistryObject<Item> ENGLISH_BRIDLE_TRANS;
    public static final RegistryObject<Item> ADVENTURE_GIRTH_STRAP_TRANS;
    public static final RegistryObject<Item> WESTERN_GIRTH_STRAP_TRANS;
    public static final RegistryObject<Item> ENGLISH_GIRTH_STRAP_TRANS;

//    // SINGLE USE FOR CRAFTING RECIPES ONLY - PASTLE TONES
//    public static final RegistryObject<Item> HALTER_zzzz;
//    public static final RegistryObject<Item>  FLYMASK_zzzz;
//    public static final RegistryObject<Item>  PASTURE_BLANKET_zzzz;
//    public static final RegistryObject<Item>  PASTURE_BLANKET_zzzz_ARMORED;
//    public static final RegistryObject<Item>  ADVENTURE_BLANKET_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_BLANKET_zzzz;
//    public static final RegistryObject<Item>  WESTERN_BLANKET_zzzz;
//    public static final RegistryObject<Item>  ADVENTURE_LEG_WRAPS_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_LEG_WRAPS_zzzz;
//    public static final RegistryObject<Item>  WESTERN_LEG_WRAPS_zzzz;
//    public static final RegistryObject<Item>  ADVENTURE_SADDLE_zzzz;
//    public static final RegistryObject<Item>  WESTERN_SADDLE_zzzz;
//    public static final RegistryObject<Item> ENGLISH_SADDLE_zzzz;
//    public static final RegistryObject<Item>  ADVENTURE_BREAST_COLLAR_zzzz;
//    public static final RegistryObject<Item>  WESTERN_BREAST_COLLAR_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_BREAST_COLLAR_zzzz;
//    public static final RegistryObject<Item> QUARTER_SHEET_zzzz;
//    public static final RegistryObject<Item>  ADVENTURE_BRIDLE_zzzz;
//    public static final RegistryObject<Item>  WESTERN_BRIDLE_zzzz;
//    public static final RegistryObject<Item> ENGLISH_BRIDLE_zzzz;
//    public static final RegistryObject<Item> ADVENTURE_GIRTH_STRAP_zzzz;
//    public static final RegistryObject<Item>  WESTERN_GIRTH_STRAP_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_GIRTH_STRAP_zzzz;
//    public static final RegistryObject<Item>  CLOTH_BRIDLE_zzzz;
//    public static final RegistryObject<Item>  CLOTH_BREAST_COLLAR_zzzz;
//    public static final RegistryObject<Item>  CLOTH_GIRTH_STRAP_zzzz;
//
//    // SINGLE USE FOR CRAFTING RECIPES ONLY - JEWEL TONES
//    public static final RegistryObject<Item>  HALTER_zzzz;
//    public static final RegistryObject<Item>  FLYMASK_zzzz;
//    public static final RegistryObject<Item>  PASTURE_BLANKET_zzzz;
//    public static final RegistryObject<Item>  PASTURE_BLANKET_zzzz_ARMORED;
//    public static final RegistryObject<Item>  ADVENTURE_BLANKET_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_BLANKET_zzzz;
//    public static final RegistryObject<Item>  WESTERN_BLANKET_zzzz;
//    public static final RegistryObject<Item>  ADVENTURE_LEG_WRAPS_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_LEG_WRAPS_zzzz;
//    public static final RegistryObject<Item> WESTERN_LEG_WRAPS_zzzz;
//    public static final RegistryObject<Item> ADVENTURE_SADDLE_zzzz;
//    public static final RegistryObject<Item>  WESTERN_SADDLE_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_SADDLE_zzzz;
//    public static final RegistryObject<Item>  ADVENTURE_BREAST_COLLAR_zzzz;
//    public static final RegistryObject<Item>  WESTERN_BREAST_COLLAR_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_BREAST_COLLAR_zzzz;
//    public static final RegistryObject<Item> QUARTER_SHEET_zzzz;
//    public static final RegistryObject<Item>  ADVENTURE_BRIDLE_zzzz;
//    public static final RegistryObject<Item>  WESTERN_BRIDLE_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_BRIDLE_zzzz;
//    public static final RegistryObject<Item>  CLOTH_BRIDLE_zzzz;
//    public static final RegistryObject<Item>  CLOTH_BREAST_COLLAR_zzzz;
//    public static final RegistryObject<Item>  CLOTH_GIRTH_STRAP_zzzz;
//    public static final RegistryObject<Item> ADVENTURE_GIRTH_STRAP_zzzz;
//    public static final RegistryObject<Item>  WESTERN_GIRTH_STRAP_zzzz;
//    public static final RegistryObject<Item>  ENGLISH_GIRTH_STRAP_zzzz;

    public static final List<RegistryObject<Item>> CLOTH_BITLESS_BRIDLES_DYED;
        public static final List<RegistryObject<Item>> BAREBACK_BLANKETS_DYED;


//    //CRAFTABLE NUMBERED TACK
//    public static final List<RegistryObject<Item>> HALTERS;
//    public static final List<RegistryObject<Item>> FLYMASKS;
//    public static final List<RegistryObject<Item>> PASTURE_BLANKETS;
//    public static final List<RegistryObject<Item>> PASTURE_BLANKETS_ARMORED;
//    public static final List<RegistryObject<Item>> ADVENTURE_BLANKETS;
//    public static final List<RegistryObject<Item>> ENGLISH_BLANKETS;
//    public static final List<RegistryObject<Item>> WESTERN_BLANKETS;
//    public static final List<RegistryObject<Item>> ADVENTURE_LEG_WRAPS;
//    public static final List<RegistryObject<Item>> ENGLISH_LEG_WRAPS;
//    public static final List<RegistryObject<Item>> WESTERN_LEG_WRAPS;
//    public static final List<RegistryObject<Item>> ADVENTURE_SADDLES;
//    public static final List<RegistryObject<Item>> WESTERN_SADDLES;
//    public static final List<RegistryObject<Item>> ENGLISH_SADDLES;
//    public static final List<RegistryObject<Item>> ADVENTURE_BREAST_COLLARS;
//    public static final List<RegistryObject<Item>> WESTERN_BREAST_COLLARS;
//    public static final List<RegistryObject<Item>> ENGLISH_BREAST_COLLARS;
//    public static final List<RegistryObject<Item>> CLOTH_BREAST_COLLARS;
//    public static final List<RegistryObject<Item>> QUARTER_SHEETS_DYED;
//    public static final List<RegistryObject<Item>> QUARTER_SHEETS_NUMBERED;
//    public static final List<RegistryObject<Item>> ADVENTURE_BRIDLES;
//    public static final List<RegistryObject<Item>> WESTERN_BRIDLES;
//    public static final List<RegistryObject<Item>> ENGLISH_BRIDLES;
//    public static final List<RegistryObject<Item>> CLOTH_BRIDLES;
//    public static final List<RegistryObject<Item>>ADVENTURE_GIRTH_STRAPS;
//    public static final List<RegistryObject<Item>> WESTERN_GIRTH_STRAPS;
//    public static final List<RegistryObject<Item>> ENGLISH_GIRTH_STRAPS;
//    public static final List<RegistryObject<Item>> CLOTH_GIRTH_STRAPS;
//    public static final List<RegistryObject<Item>> FLYMASKS_DYED;
public static final RegistryObject<Item> CLOTH_BITLESS_BRIDLE_13;
    public static final RegistryObject<Item>BAREBACK_BLANKET_13;
    public static final RegistryObject<Item>CLOTH_BITLESS_BRIDLE_14;
    public static final RegistryObject<Item>BAREBACK_BLANKET_14;
    public TackShopItems() {
    }
    public static void init(IEventBus eventBus) { ITEMS.register(eventBus); }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "tretackshop");

        CLOTH_BITLESS_BRIDLE_13= ITEMS.register("cloth_bitless_bridle_13",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_BLANKET_13= ITEMS.register("bareback_blanket_13",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        CLOTH_BITLESS_BRIDLE_14= ITEMS.register("cloth_bitless_bridle_14",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_BLANKET_14= ITEMS.register("bareback_blanket_14",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));


        BUTTERFLY = ITEMS.register("butterfly",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        BUTTERFLY_MONARCH = ITEMS.register("butterfly_zzzz",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        // Listed under award tab since it is not craftable... listed here as it is the mod's icon

        RAINBOW_INA_BOTTLE = ITEMS.register("rainbow_ina_bottle",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        // This is what we use to make the rainbow tack

// TACK ITEMS


//        // PASTEL TONE SINGLE USE CRAFTING TACK FOR RECIPE GENERATION
//        HALTER_zzzz = ITEMS.register("halter_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        FLYMASK_zzzz = ITEMS.register("flymask_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        ADVENTURE_SADDLE_zzzz = ITEMS.register("adventure_saddle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BLANKET_zzzz = ITEMS.register("adventure_blanket_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BREAST_COLLAR_zzzz = ITEMS.register("adventure_breast_collar_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_LEG_WRAPS_zzzz = ITEMS.register("adventure_leg_wraps_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BRIDLE_zzzz = ITEMS.register("adventure_bridle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_GIRTH_STRAP_zzzz = ITEMS.register("adventure_girth_strap_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        WESTERN_SADDLE_zzzz = ITEMS.register("western_saddle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BLANKET_zzzz = ITEMS.register("western_blanket_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BREAST_COLLAR_zzzz = ITEMS.register("western_breast_collar_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_LEG_WRAPS_zzzz = ITEMS.register("western_leg_wraps_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BRIDLE_zzzz = ITEMS.register("western_bridle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_GIRTH_STRAP_zzzz = ITEMS.register("western_girth_strap_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        ENGLISH_SADDLE_zzzz = ITEMS.register("english_saddle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BLANKET_zzzz = ITEMS.register("english_blanket_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BREAST_COLLAR_zzzz = ITEMS.register("english_breast_collar_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_LEG_WRAPS_zzzz = ITEMS.register("english_leg_wraps_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BRIDLE_zzzz = ITEMS.register("english_bridle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_GIRTH_STRAP_zzzz = ITEMS.register("english_girth_strap_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        CLOTH_BRIDLE_zzzz = ITEMS.register("cloth_bridle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//       CLOTH_BREAST_COLLAR_zzzz = ITEMS.register("cloth_breast_collar_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        CLOTH_GIRTH_STRAP_zzzz = ITEMS.register("cloth_girth_strap_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        PASTURE_BLANKET_zzzz = ITEMS.register("pasture_blanket_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        PASTURE_BLANKET_zzzz_ARMORED = ITEMS.register("pasture_blanket_zzzz_armored",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        QUARTER_SHEET_zzzz = ITEMS.register("quarter_sheet_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        //JEWEL TONE SINGLE USE CRAFTING TACK FOR RECIPE GENERATION
//        HALTER_zzzz = ITEMS.register("halter_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        FLYMASK_zzzz = ITEMS.register("flymask_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        ADVENTURE_SADDLE_zzzz = ITEMS.register("adventure_saddle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BLANKET_zzzz = ITEMS.register("adventure_blanket_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BREAST_COLLAR_zzzz = ITEMS.register("adventure_breast_collar_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_LEG_WRAPS_zzzz = ITEMS.register("adventure_leg_wraps_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BRIDLE_zzzz = ITEMS.register("adventure_bridle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_GIRTH_STRAP_zzzz = ITEMS.register("adventure_girth_strap_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        WESTERN_SADDLE_zzzz = ITEMS.register("western_saddle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BLANKET_zzzz = ITEMS.register("western_blanket_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BREAST_COLLAR_zzzz = ITEMS.register("western_breast_collar_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_LEG_WRAPS_zzzz = ITEMS.register("western_leg_wraps_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BRIDLE_zzzz = ITEMS.register("western_bridle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_GIRTH_STRAP_zzzz = ITEMS.register("western_girth_strap_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        ENGLISH_SADDLE_zzzz = ITEMS.register("english_saddle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BLANKET_zzzz = ITEMS.register("english_blanket_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BREAST_COLLAR_zzzz = ITEMS.register("english_breast_collar_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_LEG_WRAPS_zzzz = ITEMS.register("english_leg_wraps_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BRIDLE_zzzz = ITEMS.register("english_bridle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_GIRTH_STRAP_zzzz = ITEMS.register("english_girth_strap_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        CLOTH_BRIDLE_zzzz = ITEMS.register("cloth_bridle_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        CLOTH_BREAST_COLLAR_zzzz = ITEMS.register("cloth_breast_collar_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        CLOTH_GIRTH_STRAP_zzzz = ITEMS.register("cloth_girth_strap_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        PASTURE_BLANKET_zzzz = ITEMS.register("pasture_blanket_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        PASTURE_BLANKET_zzzz_ARMORED = ITEMS.register("pasture_blanket_zzzz_armored",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        QUARTER_SHEET_zzzz = ITEMS.register("quarter_sheet_zzzz",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//






    // Dyed Items
//        PASTURE_BLANKET_DYED = ITEMS.register("pasture_blanket_dyed",
//                () -> new DyedPastureBlanket(
//                        "pasture_blanket_dyed", new Item.Properties()
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
// ONE OFF TACK
        PELHAM_BRIDLE_BLACK = ITEMS.register("pelham_bridle_black",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        PELHAM_BRIDLE_BROWN = ITEMS.register("pelham_bridle_brown",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));

        DOUBLE_BRIDLE = ITEMS.register("double_bridle",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BITLESS_BRIDLE = ITEMS.register("bitless_bridle",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_SADDLE = ITEMS.register("bareback_saddle",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_BLANKET = ITEMS.register("bareback_blanket",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_GIRTH_STRAP = ITEMS.register("bareback_girth_strap",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        DRESSAGE_SADDLE = ITEMS.register("dressage_saddle",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        DRESSAGE_BLANKET = ITEMS.register("dressage_blanket",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        RACING_SADDLE_BROWN = ITEMS.register("racing_saddle_brown",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        RACING_SADDLE_BLACK = ITEMS.register("racing_saddle_black",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));

        HUNTER_BLANKET = ITEMS.register("hunter_blanket",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_GIRTH_STRAP_WHITE = ITEMS.register("bareback_girth_strap_white",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BITLESS_BRIDLE_WHITE = ITEMS.register("english_bridle_bitless_white",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_SADDLE_BLACK = ITEMS.register("bareback_saddle_black",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));

        BITLESS_BRIDLE_BROWN = ITEMS.register("english_bridle_bitless_brown",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_SADDLE_BROWN = ITEMS.register("bareback_saddle_brown",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_GIRTH_STRAP_BROWN = ITEMS.register("bareback_girth_strap_brown",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));

        BITLESS_BRIDLE_BEIGE = ITEMS.register("english_bridle_bitless_beige",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_SADDLE_BEIGE = ITEMS.register("bareback_saddle_beige",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_GIRTH_STRAP_BEIGE = ITEMS.register("bareback_girth_strap_beige",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));




    // Rainbow Tack
        HALTER_RAINBOW = ITEMS.register("halter_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));

        ADVENTURE_SADDLE_RAINBOW = ITEMS.register("adventure_saddle_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_BLANKET_RAINBOW = ITEMS.register("adventure_blanket_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_BREAST_COLLAR_RAINBOW = ITEMS.register("adventure_breast_collar_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_LEG_WRAPS_RAINBOW = ITEMS.register("adventure_leg_wraps_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_BRIDLE_RAINBOW = ITEMS.register("adventure_bridle_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_GIRTH_STRAP_RAINBOW = ITEMS.register("adventure_girth_strap_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        IRON_HORSE_ARMOR_RAINBOW = ITEMS.register("iron_horse_armor_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        AMETHYST_HORSE_ARMOR_RAINBOW = ITEMS.register("amethyst_horse_armor_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        SADDLE_BAG_RAINBOW = ITEMS.register("saddle_bag_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));


        WESTERN_SADDLE_RAINBOW = ITEMS.register("western_saddle_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        WESTERN_BLANKET_RAINBOW = ITEMS.register("western_blanket_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        WESTERN_BREAST_COLLAR_RAINBOW = ITEMS.register("western_breast_collar_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        WESTERN_LEG_WRAPS_RAINBOW = ITEMS.register("western_leg_wraps_rainbow",
                () ->  new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        WESTERN_BRIDLE_RAINBOW = ITEMS.register("western_bridle_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        WESTERN_GIRTH_STRAP_RAINBOW = ITEMS.register("western_girth_strap_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));

        ENGLISH_SADDLE_RAINBOW = ITEMS.register("english_saddle_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ENGLISH_BLANKET_RAINBOW = ITEMS.register("english_blanket_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ENGLISH_BREAST_COLLAR_RAINBOW = ITEMS.register("english_breast_collar_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ENGLISH_LEG_WRAPS_RAINBOW = ITEMS.register("english_leg_wraps_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ENGLISH_BRIDLE_RAINBOW = ITEMS.register("english_bridle_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ENGLISH_GIRTH_STRAP_RAINBOW = ITEMS.register("english_girth_strap_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        PASTURE_BLANKET_RAINBOW = ITEMS.register("pasture_blanket_rainbow",
                () -> new Item(
                        new Item.Properties()
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        PASTURE_BLANKET_RAINBOW_ARMORED = ITEMS.register("pasture_blanket_rainbow_armored",
                () -> new Item(
                        (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        QUARTER_SHEET_BLACK_RAINBOW = ITEMS.register("quarter_sheet_black_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        QUARTER_SHEET_WHITE_RAINBOW = ITEMS.register("quarter_sheet_white_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));

        CLOTH_BITLESS_BRIDLE_RAINBOW = ITEMS.register("cloth_bitless_bridle_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        BAREBACK_BLANKET_RAINBOW = ITEMS.register("bareback_blanket_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));


        // TRANSPARENT 'BAREBACK/LIBERTY' TACK
        ADVENTURE_SADDLE_TRANS = ITEMS.register("adventure_saddle_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_BLANKET_TRANS = ITEMS.register("adventure_blanket_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_BREAST_COLLAR_TRANS = ITEMS.register("adventure_breast_collar_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_LEG_WRAPS_TRANS = ITEMS.register("adventure_leg_wraps_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_BRIDLE_TRANS = ITEMS.register("adventure_bridle_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ADVENTURE_GIRTH_STRAP_TRANS = ITEMS.register("adventure_girth_strap_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));

        WESTERN_SADDLE_TRANS = ITEMS.register("western_saddle_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        WESTERN_BLANKET_TRANS = ITEMS.register("western_blanket_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        WESTERN_BRIDLE_TRANS = ITEMS.register("western_bridle_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        WESTERN_GIRTH_STRAP_TRANS = ITEMS.register("western_girth_strap_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));

        ENGLISH_SADDLE_TRANS = ITEMS.register("english_saddle_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ENGLISH_BLANKET_TRANS = ITEMS.register("english_blanket_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ENGLISH_BRIDLE_TRANS = ITEMS.register("english_bridle_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));
        ENGLISH_GIRTH_STRAP_TRANS = ITEMS.register("english_girth_strap_trans",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB)));


//    //DYED TACK ITEMS - Craftable still 
//        QUARTER_SHEETS_DYED = new ArrayList<>();
//        FLYMASKS_DYED = new ArrayList<>();
//        FLAGS_DYED = new ArrayList<>();
        CLOTH_BITLESS_BRIDLES_DYED = new ArrayList<>();
        BAREBACK_BLANKETS_DYED = new ArrayList<>();
//
        DyeColor[] var0 = DyeColor.values();
        int varc = var0.length;

        for (int varb = 0; varb < varc; ++varb) {
            DyeColor color = var0[varb];
//            QUARTER_SHEETS_DYED.add(ITEMS.register("quarter_sheet_" + color.getName(), () ->
//                    new Item(
//                            (new Item.Properties())
//                             .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));

        CLOTH_BITLESS_BRIDLES_DYED.add(ITEMS.register("cloth_bitless_bridle_" + color.getName(), () ->
                    new Item(
                            (new Item.Properties())
                             .tab(TackShopCreativeModTab.TRETACK_TAB))
        ));
        BAREBACK_BLANKETS_DYED.add(ITEMS.register("bareback_blanket_" + color.getName(), () ->
                    new Item(
                            (new Item.Properties())
                             .tab(TackShopCreativeModTab.TRETACK_TAB))
        ));
//            FLYMASKS_DYED.add(ITEMS.register("flymask_" + color.getName(), () ->
//                    new Item(
//                            (new Item.Properties())
//                                    .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            FLAGS_DYED.add(ITEMS.register("flag_" + color.getName(), () ->
//                    new Item((new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)))));
        }
    }
}
