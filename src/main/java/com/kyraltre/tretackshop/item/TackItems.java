package com.kyraltre.tretackshop.item;

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
            () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));

    public static final RegistryObject<Item> PASTURE_BLANKET_RAINBOW = ITEMS.register("pasture_blanket_rainbow",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_rainbow", new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
