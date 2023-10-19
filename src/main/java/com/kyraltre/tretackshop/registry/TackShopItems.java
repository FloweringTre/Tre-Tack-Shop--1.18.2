//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
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

    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<Item>> RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> ROSETTE;



    public TackShopItems() {
    }

    public static void init(IEventBus modBus) {
        ITEMS.register(modBus);
    }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "tretackshop");

        PASTURE_BLANKETS = new ArrayList();
        PASTURE_BLANKETS_ARMORED = new ArrayList();
        //DyeColor[] var0 = DyeColor.values();
        int var1 = 13;
        var rContext = new Object() {
            int var2 = 1;
            };

        while (rContext.var2 < var1) {
            //DyeColor color = var0[var2];
            int counter = rContext.var2;
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

    }
}
