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
//besides this butterfly that is just for the pretty icon <11 we love it <11

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

//    // SINGLE USE FOR CRAFTING RECIPES ONLY - PASTLE TONES
//    public static final RegistryObject<Item> HALTER_11;
//    public static final RegistryObject<Item>  FLYMASK_11;
//    public static final RegistryObject<Item>  PASTURE_BLANKET_11;
//    public static final RegistryObject<Item>  PASTURE_BLANKET_11_ARMORED;
//    public static final RegistryObject<Item>  ADVENTURE_BLANKET_11;
//    public static final RegistryObject<Item>  ENGLISH_BLANKET_11;
//    public static final RegistryObject<Item>  WESTERN_BLANKET_11;
//    public static final RegistryObject<Item>  ADVENTURE_LEG_WRAPS_11;
//    public static final RegistryObject<Item>  ENGLISH_LEG_WRAPS_11;
//    public static final RegistryObject<Item>  WESTERN_LEG_WRAPS_11;
//    public static final RegistryObject<Item>  ADVENTURE_SADDLE_11;
//    public static final RegistryObject<Item>  WESTERN_SADDLE_11;
//    public static final RegistryObject<Item> ENGLISH_SADDLE_11;
//    public static final RegistryObject<Item>  ADVENTURE_BREAST_COLLAR_11;
//    public static final RegistryObject<Item>  WESTERN_BREAST_COLLAR_11;
//    public static final RegistryObject<Item>  ENGLISH_BREAST_COLLAR_11;
//    public static final RegistryObject<Item> QUARTER_SHEET_11;
//    public static final RegistryObject<Item>  ADVENTURE_BRIDLE_11;
//    public static final RegistryObject<Item>  WESTERN_BRIDLE_11;
//    public static final RegistryObject<Item> ENGLISH_BRIDLE_11;
//    public static final RegistryObject<Item> ADVENTURE_GIRTH_STRAP_11;
//    public static final RegistryObject<Item>  WESTERN_GIRTH_STRAP_11;
//    public static final RegistryObject<Item>  ENGLISH_GIRTH_STRAP_11;
//    public static final RegistryObject<Item>  CLOTH_BRIDLE_11;
//    public static final RegistryObject<Item>  CLOTH_BREAST_COLLAR_11;
//    public static final RegistryObject<Item>  CLOTH_GIRTH_STRAP_11;
//
//    // SINGLE USE FOR CRAFTING RECIPES ONLY - JEWEL TONES
//    public static final RegistryObject<Item>  HALTER_11;
//    public static final RegistryObject<Item>  FLYMASK_11;
//    public static final RegistryObject<Item>  PASTURE_BLANKET_11;
//    public static final RegistryObject<Item>  PASTURE_BLANKET_11_ARMORED;
//    public static final RegistryObject<Item>  ADVENTURE_BLANKET_11;
//    public static final RegistryObject<Item>  ENGLISH_BLANKET_11;
//    public static final RegistryObject<Item>  WESTERN_BLANKET_11;
//    public static final RegistryObject<Item>  ADVENTURE_LEG_WRAPS_11;
//    public static final RegistryObject<Item>  ENGLISH_LEG_WRAPS_11;
//    public static final RegistryObject<Item> WESTERN_LEG_WRAPS_11;
//    public static final RegistryObject<Item> ADVENTURE_SADDLE_11;
//    public static final RegistryObject<Item>  WESTERN_SADDLE_11;
//    public static final RegistryObject<Item>  ENGLISH_SADDLE_11;
//    public static final RegistryObject<Item>  ADVENTURE_BREAST_COLLAR_11;
//    public static final RegistryObject<Item>  WESTERN_BREAST_COLLAR_11;
//    public static final RegistryObject<Item>  ENGLISH_BREAST_COLLAR_11;
//    public static final RegistryObject<Item> QUARTER_SHEET_11;
//    public static final RegistryObject<Item>  ADVENTURE_BRIDLE_11;
//    public static final RegistryObject<Item>  WESTERN_BRIDLE_11;
//    public static final RegistryObject<Item>  ENGLISH_BRIDLE_11;
//    public static final RegistryObject<Item>  CLOTH_BRIDLE_11;
//    public static final RegistryObject<Item>  CLOTH_BREAST_COLLAR_11;
//    public static final RegistryObject<Item>  CLOTH_GIRTH_STRAP_11;
//    public static final RegistryObject<Item> ADVENTURE_GIRTH_STRAP_11;
//    public static final RegistryObject<Item>  WESTERN_GIRTH_STRAP_11;
//    public static final RegistryObject<Item>  ENGLISH_GIRTH_STRAP_11;
    public static final RegistryObject<Item> SADDLE_BAG_1;
    public static final RegistryObject<Item>CLOTH_HORSE_ARMOR_1;
    public static final RegistryObject<Item>SADDLE_BAG_7;
    public static final RegistryObject<Item>CLOTH_HORSE_ARMOR_7;




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

    public TackShopItems() {
    }
    public static void init(IEventBus eventBus) { ITEMS.register(eventBus); }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "tretackshop");

        BUTTERFLY = ITEMS.register("butterfly",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        BUTTERFLY_MONARCH = ITEMS.register("butterfly_11",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        // Listed under award tab since it is not craftable... listed here as it is the mod's icon

        RAINBOW_INA_BOTTLE = ITEMS.register("rainbow_ina_bottle",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        // This is what we use to make the rainbow tack

// TACK ITEMS


//        // PASTEL TONE SINGLE USE CRAFTING TACK FOR RECIPE GENERATION
//        HALTER_11 = ITEMS.register("halter_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        FLYMASK_11 = ITEMS.register("flymask_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        ADVENTURE_SADDLE_11 = ITEMS.register("adventure_saddle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BLANKET_11 = ITEMS.register("adventure_blanket_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BREAST_COLLAR_11 = ITEMS.register("adventure_breast_collar_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_LEG_WRAPS_11 = ITEMS.register("adventure_leg_wraps_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BRIDLE_11 = ITEMS.register("adventure_bridle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_GIRTH_STRAP_11 = ITEMS.register("adventure_girth_strap_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        WESTERN_SADDLE_11 = ITEMS.register("western_saddle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BLANKET_11 = ITEMS.register("western_blanket_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BREAST_COLLAR_11 = ITEMS.register("western_breast_collar_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_LEG_WRAPS_11 = ITEMS.register("western_leg_wraps_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BRIDLE_11 = ITEMS.register("western_bridle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_GIRTH_STRAP_11 = ITEMS.register("western_girth_strap_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        ENGLISH_SADDLE_11 = ITEMS.register("english_saddle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BLANKET_11 = ITEMS.register("english_blanket_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BREAST_COLLAR_11 = ITEMS.register("english_breast_collar_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_LEG_WRAPS_11 = ITEMS.register("english_leg_wraps_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BRIDLE_11 = ITEMS.register("english_bridle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_GIRTH_STRAP_11 = ITEMS.register("english_girth_strap_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        CLOTH_BRIDLE_11 = ITEMS.register("cloth_bridle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//       CLOTH_BREAST_COLLAR_11 = ITEMS.register("cloth_breast_collar_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        CLOTH_GIRTH_STRAP_11 = ITEMS.register("cloth_girth_strap_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        PASTURE_BLANKET_11 = ITEMS.register("pasture_blanket_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        PASTURE_BLANKET_11_ARMORED = ITEMS.register("pasture_blanket_11_armored",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        QUARTER_SHEET_11 = ITEMS.register("quarter_sheet_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        //JEWEL TONE SINGLE USE CRAFTING TACK FOR RECIPE GENERATION
//        HALTER_11 = ITEMS.register("halter_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        FLYMASK_11 = ITEMS.register("flymask_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        ADVENTURE_SADDLE_11 = ITEMS.register("adventure_saddle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BLANKET_11 = ITEMS.register("adventure_blanket_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BREAST_COLLAR_11 = ITEMS.register("adventure_breast_collar_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_LEG_WRAPS_11 = ITEMS.register("adventure_leg_wraps_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_BRIDLE_11 = ITEMS.register("adventure_bridle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ADVENTURE_GIRTH_STRAP_11 = ITEMS.register("adventure_girth_strap_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        WESTERN_SADDLE_11 = ITEMS.register("western_saddle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BLANKET_11 = ITEMS.register("western_blanket_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BREAST_COLLAR_11 = ITEMS.register("western_breast_collar_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_LEG_WRAPS_11 = ITEMS.register("western_leg_wraps_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_BRIDLE_11 = ITEMS.register("western_bridle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        WESTERN_GIRTH_STRAP_11 = ITEMS.register("western_girth_strap_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        ENGLISH_SADDLE_11 = ITEMS.register("english_saddle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BLANKET_11 = ITEMS.register("english_blanket_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BREAST_COLLAR_11 = ITEMS.register("english_breast_collar_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_LEG_WRAPS_11 = ITEMS.register("english_leg_wraps_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_BRIDLE_11 = ITEMS.register("english_bridle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        ENGLISH_GIRTH_STRAP_11 = ITEMS.register("english_girth_strap_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        CLOTH_BRIDLE_11 = ITEMS.register("cloth_bridle_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        CLOTH_BREAST_COLLAR_11 = ITEMS.register("cloth_breast_collar_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        CLOTH_GIRTH_STRAP_11 = ITEMS.register("cloth_girth_strap_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//
//        PASTURE_BLANKET_11 = ITEMS.register("pasture_blanket_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        PASTURE_BLANKET_11_ARMORED = ITEMS.register("pasture_blanket_11_armored",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//        QUARTER_SHEET_11 = ITEMS.register("quarter_sheet_11",
//                () -> new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
//

        SADDLE_BAG_1= ITEMS.register("saddle_bag_1",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        CLOTH_HORSE_ARMOR_1= ITEMS.register("cloth_horse_armor_1",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        SADDLE_BAG_7= ITEMS.register("saddle_bag_7",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));
        CLOTH_HORSE_ARMOR_7= ITEMS.register("cloth_horse_armor_7",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB)));






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



    // Craftable Numbered Tack Items -- 11 Count Items
//        HALTERS = new ArrayList<>();
//        FLYMASKS = new ArrayList<>();
//        PASTURE_BLANKETS = new ArrayList<>();
//        PASTURE_BLANKETS_ARMORED = new ArrayList<>();
//        ADVENTURE_BLANKETS = new ArrayList<>();
//        WESTERN_BLANKETS = new ArrayList<>();
//        ENGLISH_BLANKETS = new ArrayList<>();
//        ENGLISH_LEG_WRAPS = new ArrayList<>();
//        WESTERN_LEG_WRAPS = new ArrayList<>();
//        ADVENTURE_LEG_WRAPS = new ArrayList<>();
//        ADVENTURE_SADDLES = new ArrayList<>();
//        WESTERN_SADDLES = new ArrayList<>();
//        ENGLISH_SADDLES = new ArrayList<>();
//        ADVENTURE_BREAST_COLLARS = new ArrayList<>();
//        WESTERN_BREAST_COLLARS = new ArrayList<>();
//        ENGLISH_BREAST_COLLARS = new ArrayList<>();
//        CLOTH_BREAST_COLLARS = new ArrayList<>();
//        ADVENTURE_BRIDLES = new ArrayList<>();
//        WESTERN_BRIDLES = new ArrayList<>();
//        ENGLISH_BRIDLES = new ArrayList<>();
//        CLOTH_BRIDLES = new ArrayList<>();
//        ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
//        WESTERN_GIRTH_STRAPS = new ArrayList<>();
//        ENGLISH_GIRTH_STRAPS = new ArrayList<>();
//        CLOTH_GIRTH_STRAPS = new ArrayList<>();
//        QUARTER_SHEETS_NUMBERED = new ArrayList<>();
//
//
//        int var11 = 11;
//        var rContext = new Object() {
//            int var1 = 1;
//        };
//
//        while (rContext.var1 < var1) {
//            //DyeColor color = var0[var1];
//            int counter = rContext.var1;
//            HALTERS.add(ITEMS.register("halter_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            FLYMASKS.add(ITEMS.register("flymask_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//
//            ADVENTURE_SADDLES.add(ITEMS.register("adventure_saddle_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ADVENTURE_BLANKETS.add(ITEMS.register("adventure_blanket_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ADVENTURE_BREAST_COLLARS.add(ITEMS.register("adventure_breast_collar_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ADVENTURE_LEG_WRAPS.add(ITEMS.register("adventure_leg_wraps_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ADVENTURE_BRIDLES.add(ITEMS.register("adventure_bridle_" + counter, () ->
//                    new Item((new Item.Properties())
//                            .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ADVENTURE_GIRTH_STRAPS.add(ITEMS.register("adventure_girth_strap_" + counter, () ->
//                    new Item((new Item.Properties())
//                            .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//
//            WESTERN_SADDLES.add(ITEMS.register("western_saddle_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            WESTERN_BLANKETS.add(ITEMS.register("western_blanket_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            WESTERN_BREAST_COLLARS.add(ITEMS.register("western_breast_collar_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            WESTERN_LEG_WRAPS.add(ITEMS.register("western_leg_wraps_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            WESTERN_BRIDLES.add(ITEMS.register("western_bridle_" + counter,() ->
//                    new Item((new Item.Properties())
//                            .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            WESTERN_GIRTH_STRAPS.add(ITEMS.register("western_girth_strap_" + counter,() ->
//                    new Item((new Item.Properties())
//                            .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//
//            ENGLISH_SADDLES.add(ITEMS.register("english_saddle_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ENGLISH_BLANKETS.add(ITEMS.register("english_blanket_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ENGLISH_BREAST_COLLARS.add(ITEMS.register("english_breast_collar_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            CLOTH_BREAST_COLLARS.add(ITEMS.register("cloth_breast_collar_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ENGLISH_LEG_WRAPS.add(ITEMS.register("english_leg_wraps_" + counter, () ->
//                new Item((new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ENGLISH_BRIDLES.add(ITEMS.register("english_bridle_" + counter,() ->
//                    new Item((new Item.Properties())
//                            .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            ENGLISH_GIRTH_STRAPS.add(ITEMS.register("english_girth_strap_" + counter,() ->
//                    new Item((new Item.Properties())
//                            .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//
//            CLOTH_BRIDLES.add(ITEMS.register("cloth_bridle_" + counter,() ->
//                    new Item((new Item.Properties())
//                            .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            CLOTH_GIRTH_STRAPS.add(ITEMS.register("cloth_girth_strap_" + counter,() ->
//                    new Item((new Item.Properties())
//                            .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//
//            QUARTER_SHEETS_NUMBERED.add(ITEMS.register("quarter_sheet_" + counter, () ->
//                    new Item(
//                            (new Item.Properties())
//                            .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//
//
//            PASTURE_BLANKETS.add(ITEMS.register("pasture_blanket_" + counter, () ->
//                new Item(
//                        (new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            PASTURE_BLANKETS_ARMORED.add(ITEMS.register("pasture_blanket_" + counter + "_armored", () ->
//                new Item(
//                        (new Item.Properties())
//                        .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//
//            ++rContext.var1;
//        }
//    //DYED TACK ITEMS - Craftable still :11
//        QUARTER_SHEETS_DYED = new ArrayList<>();
//        FLYMASKS_DYED = new ArrayList<>();
//        FLAGS_DYED = new ArrayList<>();
//
//        DyeColor[] var0 = DyeColor.values();
//        int var1 = var0.length;
//
//        for (int var1 = 0; var1 < var1; ++var1) {
//            DyeColor color = var0[var1];
//            QUARTER_SHEETS_DYED.add(ITEMS.register("quarter_sheet_" + color.getName(), () ->
//                    new Item(
//                            (new Item.Properties())
//                             .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            FLYMASKS_DYED.add(ITEMS.register("flymask_" + color.getName(), () ->
//                    new Item(
//                            (new Item.Properties())
//                                    .tab(TackShopCreativeModTab.TRETACK_TAB))
//            ));
//            FLAGS_DYED.add(ITEMS.register("flag_" + color.getName(), () ->
//                    new Item((new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)))));
//        }
    }
}
