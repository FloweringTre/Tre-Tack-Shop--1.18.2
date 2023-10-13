package com.kyraltre.tretackshop.item;

import com.kyraltre.tretackshop.TreTackShop;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TreTackShop.MOD_ID);

    public static final RegistryObject<Item> BUTTERFLY = ITEMS.register("butterfly",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TRETACK_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
