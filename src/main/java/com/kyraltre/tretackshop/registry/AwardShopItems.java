package com.kyraltre.tretackshop.registry;


import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class AwardShopItems {
    public static final DeferredRegister<Item> ITEMS;

// THIS IS FOR AWARD ITEMS THAT CAN NOT BE CRAFTED
    

// TACK ITEMS
    public static final List<RegistryObject<Item>> AWARD_HALTERS;
    public static final List<RegistryObject<Item>> AWARD_FLYMASKS;
    public static final List<RegistryObject<Item>> AWARD_PASTURE_BLANKETS;
    public static final List<RegistryObject<Item>> AWARD_PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<Item>> AWARD_ADVENTURE_BLANKETS;
    public static final List<RegistryObject<Item>> AWARD_ENGLISH_BLANKETS;
    public static final List<RegistryObject<Item>> AWARD_WESTERN_BLANKETS;
    public static final List<RegistryObject<Item>> AWARD_ADVENTURE_LEG_WRAPS;
    public static final List<RegistryObject<Item>> AWARD_ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<Item>> AWARD_WESTERN_LEG_WRAPS;
    public static final List<RegistryObject<Item>> AWARD_ADVENTURE_SADDLES;
    public static final List<RegistryObject<Item>> AWARD_WESTERN_SADDLES;
    public static final List<RegistryObject<Item>> AWARD_ENGLISH_SADDLES;
    public static final List<RegistryObject<Item>> AWARD_ADVENTURE_BREAST_COLLARS;
    public static final List<RegistryObject<Item>> AWARD_WESTERN_BREAST_COLLARS;
    public static final List<RegistryObject<Item>> AWARD_ENGLISH_BREAST_COLLARS;


// AWARD RIBBONS AND TROPHIES
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_GRAND;
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_RESERVE;
    public static final List<RegistryObject<Item>> RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> ROSETTE;
    public static final RegistryObject<Item> TROPHY_1;
    public static final RegistryObject<Item> TROPHY_2;
    public static final RegistryObject<Item> TROPHY_3;
    public static final RegistryObject<Item> MEDAL_1;
    public static final RegistryObject<Item> MEDAL_2;
    public static final RegistryObject<Item> MEDAL_3;


    public AwardShopItems() {
    }
    public static void init(IEventBus eventBus) { ITEMS.register(eventBus); }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "tretackshop");
        
// TACK ITEMS
    // AWARD - Uncraftable Numbered Tack Items -- 12 Count Items
        AWARD_PASTURE_BLANKETS = new ArrayList<>();
        AWARD_PASTURE_BLANKETS_ARMORED = new ArrayList<>();
        AWARD_HALTERS = new ArrayList<>();
        AWARD_FLYMASKS = new ArrayList<>();
        AWARD_ADVENTURE_BLANKETS = new ArrayList<>();
        AWARD_WESTERN_BLANKETS = new ArrayList<>();
        AWARD_ENGLISH_BLANKETS = new ArrayList<>();
        AWARD_ENGLISH_LEG_WRAPS = new ArrayList<>();
        AWARD_WESTERN_LEG_WRAPS = new ArrayList<>();
        AWARD_ADVENTURE_LEG_WRAPS = new ArrayList<>();
        AWARD_ADVENTURE_SADDLES = new ArrayList<>();
        AWARD_WESTERN_SADDLES = new ArrayList<>();
        AWARD_ENGLISH_SADDLES = new ArrayList<>();
        AWARD_ADVENTURE_BREAST_COLLARS = new ArrayList<>();
        AWARD_WESTERN_BREAST_COLLARS = new ArrayList<>();
        AWARD_ENGLISH_BREAST_COLLARS = new ArrayList<>();
        int var1 = 13;
        
        for(int var2 = 1; var2 < var1; ++var2) {
            int counter = var2;
            AWARD_HALTERS.add(ITEMS.register("award_halter_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_FLYMASKS.add(ITEMS.register("award_flymask_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));

            AWARD_ADVENTURE_SADDLES.add(ITEMS.register("award_adventure_saddle_" + counter, () ->
                    new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ADVENTURE_BLANKETS.add(ITEMS.register("award_adventure_blanket_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ADVENTURE_BREAST_COLLARS.add(ITEMS.register("award_adventure_breast_collar_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ADVENTURE_LEG_WRAPS.add(ITEMS.register("award_adventure_leg_wraps_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64))
            ));

            AWARD_WESTERN_SADDLES.add(ITEMS.register("award_western_saddle_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_WESTERN_BLANKETS.add(ITEMS.register("award_western_blanket_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_WESTERN_BREAST_COLLARS.add(ITEMS.register("award_western_breast_collar_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_WESTERN_LEG_WRAPS.add(ITEMS.register("award_western_leg_wraps_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64))
            ));

            AWARD_ENGLISH_SADDLES.add(ITEMS.register("award_english_saddle_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ENGLISH_BLANKETS.add(ITEMS.register("award_english_blanket_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ENGLISH_BREAST_COLLARS.add(ITEMS.register("award_english_breast_collar_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ENGLISH_LEG_WRAPS.add(ITEMS.register("award_english_leg_wraps_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64))
            ));

            AWARD_PASTURE_BLANKETS.add(ITEMS.register("award_pasture_blanket_" + counter,
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_PASTURE_BLANKETS_ARMORED.add(ITEMS.register("award_pasture_blanket_" + counter + "_armored",
                    () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
        }

// AWARD ITEMS

    // Dye Color number items
        RIBBON_THREE_TAILS = new ArrayList<>();
        RIBBON_TWO_TAILS = new ArrayList<>();
        RIBBON_ONE_TAIL = new ArrayList<>();
        ROSETTE = new ArrayList<>();
        DyeColor[] var0 = DyeColor.values();
        int var3 = var0.length;

        for(int var2 = 0; var2 < var3; ++var2) {
            DyeColor color = var0[var2];
             RIBBON_THREE_TAILS.add(ITEMS.register("ribbon_three_tails_" + color.getName(), () ->
                     new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
             ));
             RIBBON_TWO_TAILS.add(ITEMS.register("ribbon_two_tails_" + color.getName(), () ->
                     new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
             ));
             RIBBON_ONE_TAIL.add(ITEMS.register("ribbon_one_tail_" + color.getName(), () ->
                     new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
             ));
             ROSETTE.add(ITEMS.register("rosette_" + color.getName(), () ->
                     new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
             ));
         }

    // One off award items
        RIBBON_THREE_TAILS_GRAND = ITEMS.register("ribbon_three_tails_grand",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        RIBBON_THREE_TAILS_RESERVE = ITEMS.register("ribbon_three_tails_reserve",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        TROPHY_1 = ITEMS.register("trophy_1",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        TROPHY_2 = ITEMS.register("trophy_2",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        TROPHY_3 = ITEMS.register("trophy_3",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MEDAL_1 = ITEMS.register("medal_1",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MEDAL_2 = ITEMS.register("medal_2",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MEDAL_3 = ITEMS.register("medal_3",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

    }
}
