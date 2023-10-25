package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.SWEM;
import com.alaharranhonor.swem.forge.items.tack.*;

import java.util.ArrayList;
import java.util.List;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

public class TackShopItems {
    public static final DeferredRegister<Item> ITEMS;

    public static final RegistryObject<Item> BUTTERFLY;
    public static final RegistryObject<HalterItem> HALTER_RAINBOW;
    public static final List<RegistryObject<HalterItem>> HALTERS;
    public static final List<RegistryObject<HalterItem>> FLYMASKS;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_RAINBOW;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_RAINBOW_ARMORED;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS_ARMORED;
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_RAINBOW;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_RAINBOW;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_RAINBOW;
    public static final List<RegistryObject<AdventureBlanketItem>> ADVENTURE_BLANKETS;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKETS;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKETS;
    public static final List<RegistryObject<Item>> RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> ROSETTE;
    public static final RegistryObject<Item> TROPHY_1;
    public static final RegistryObject<Item> TROPHY_2;
    public static final RegistryObject<Item> TROPHY_3;


    public TackShopItems() {
    }
    public static void init(IEventBus eventBus) { ITEMS.register(eventBus); }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "tretackshop");

        BUTTERFLY = ITEMS.register("butterfly",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));


        // Rainbow Tack
        HALTER_RAINBOW = ITEMS.register("halter_rainbow",
                () -> new HalterItem("halter_rainbow", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

        ADVENTURE_BLANKET_RAINBOW = ITEMS.register("adventure_blanket_rainbow",
                () -> new AdventureBlanketItem("adventure_blanket_rainbow", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

        WESTERN_BLANKET_RAINBOW = ITEMS.register("western_blanket_rainbow",
                () -> new WesternBlanketItem("western_blanket_rainbow", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

        ENGLISH_BLANKET_RAINBOW = ITEMS.register("english_blanket_rainbow",
                () -> new EnglishBlanketItem("english_blanket_rainbow", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

        PASTURE_BLANKET_RAINBOW = ITEMS.register("pasture_blanket_rainbow",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_rainbow", new Item.Properties()
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

        PASTURE_BLANKET_RAINBOW_ARMORED = ITEMS.register("pasture_blanket_rainbow_armored",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                        "pasture_blanket_rainbow_armored", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

        // 12 Count Items
        PASTURE_BLANKETS = new ArrayList();
        PASTURE_BLANKETS_ARMORED = new ArrayList();
        HALTERS = new ArrayList();
        FLYMASKS = new ArrayList();
        ADVENTURE_BLANKETS = new ArrayList();
        WESTERN_BLANKETS = new ArrayList();
        ENGLISH_BLANKETS = new ArrayList();

        int var1 = 13;
        var rContext = new Object() {
            int var2 = 1;
            };

        while (rContext.var2 < var1) {
            //DyeColor color = var0[var2];
            int counter = rContext.var2;
            HALTERS.add(ITEMS.register("halter_" + Integer.toString(counter), () -> {
                return new HalterItem("halter_" + Integer.toString(counter), (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16));
            }));

            FLYMASKS.add(ITEMS.register("flymask_" + Integer.toString(counter), () -> {
                return new HalterItem("flymask_" + Integer.toString(counter), (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16));
            }));

            ADVENTURE_BLANKETS.add(ITEMS.register("adventure_blanket_" + Integer.toString(counter), () -> {
                return new AdventureBlanketItem("adventure_blanket_" + Integer.toString(counter), (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16));
            }));

            WESTERN_BLANKETS.add(ITEMS.register("western_blanket_" + Integer.toString(counter), () -> {
                return new WesternBlanketItem("western_blanket_" + Integer.toString(counter), (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16));
            }));

            ENGLISH_BLANKETS.add(ITEMS.register("english_blanket_" + Integer.toString(counter), () -> {
                return new EnglishBlanketItem("english_blanket_" + Integer.toString(counter), (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16));
            }));

            PASTURE_BLANKETS.add(ITEMS.register("pasture_blanket_" + Integer.toString(counter), () -> {
                return new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_" + Integer.toString(counter), (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16));
            }));

            PASTURE_BLANKETS_ARMORED.add(ITEMS.register("pasture_blanket_" + Integer.toString(counter) + "_armored", () -> {
                return new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                        "pasture_blanket_" + Integer.toString(counter) + "_armored", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16));
            }));

            ++rContext.var2;
        }

        // 6 Count Items
        RIBBON_THREE_TAILS = new ArrayList();
        RIBBON_TWO_TAILS = new ArrayList();
        RIBBON_ONE_TAIL = new ArrayList();
        ROSETTE = new ArrayList();
         int r = 7;
         var Context = new Object() {
             int b = 1;
         };

         while (Context.b < r) {
             int counter = Context.b;

             RIBBON_THREE_TAILS.add(ITEMS.register("ribbon_three_tails_" + Integer.toString(counter), () -> {
                 return new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB));
             }));
             RIBBON_TWO_TAILS.add(ITEMS.register("ribbon_two_tails_" + Integer.toString(counter), () -> {
                 return new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB));
             }));
             RIBBON_ONE_TAIL.add(ITEMS.register("ribbon_one_tail_" + Integer.toString(counter), () -> {
                 return new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB));
             }));
             ROSETTE.add(ITEMS.register("rosette_" + Integer.toString(counter), () -> {
                 return new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB));
             }));

             ++Context.b;
         }

        TROPHY_1 = ITEMS.register("trophy_1",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        TROPHY_2 = ITEMS.register("trophy_2",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        TROPHY_3 = ITEMS.register("trophy_3",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));

    }
}
