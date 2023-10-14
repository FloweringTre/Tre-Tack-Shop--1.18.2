//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem.HorseArmorTier;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
import java.util.ArrayList;
import java.util.List;

import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

public class TackShopItems {
    public static final DeferredRegister<Item> ITEMS;

    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS;


    public TackShopItems() {
    }

    public static void init(IEventBus modBus) {
        ITEMS.register(modBus);
    }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "tretackshop");

        PASTURE_BLANKETS = new ArrayList();
        //DyeColor[] var0 = DyeColor.values();
        int var1 = 13;
        var rContext = new Object() {
            int var2 = 1;
            };

        while (rContext.var2 < var1) {
            //DyeColor color = var0[var2];
            int counter = rContext.var2;
            PASTURE_BLANKETS.add(ITEMS.register("pasture_blanket_" + Integer.toString(counter), () -> {
                return new PastureBlanketItem(HorseArmorTier.NONE, 0,
                        "pasture_blanket_" + Integer.toString(counter), (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16));
            }));
            ++rContext.var2;
        }

    }
}
