package com.kyraltre.tretackshop.item;

import com.alaharranhonor.swem.forge.SWEM;
import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
import com.kyraltre.tretackshop.TreTackShop;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;


public class TackItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TreTackShop.MOD_ID);

    public static final RegistryObject<Item> BUTTERFLY = ITEMS.register("butterfly",
            () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)))
            ;// Icon for mod

    public static final RegistryObject<Item> TROPHY_1 = ITEMS.register("trophy_1",
            () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
    public static final RegistryObject<Item> TROPHY_2 = ITEMS.register("trophy_2",
            () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
    public static final RegistryObject<Item> TROPHY_3 = ITEMS.register("trophy_3",
            () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)))
            ; // Adding 3 CIT trophy variants

    public static final RegistryObject<Item> PASTURE_BLANKET_RAINBOW = ITEMS.register("pasture_blanket_rainbow",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_rainbow", new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
    public  static final RegistryObject<Item> PASTURE_BLANKET_RAINBOW_ARMORED = ITEMS.register("pasture_blanket_rainbow_armored",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                        "pasture_blanket_rainbow_armored",
                        (new Item.Properties()).tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
