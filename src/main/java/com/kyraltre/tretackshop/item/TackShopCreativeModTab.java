package com.kyraltre.tretackshop.item;

import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TackShopCreativeModTab {
    public static final CreativeModeTab TRETACK_TAB = new CreativeModeTab("tretacktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TackShopItems.BUTTERFLY.get()); //this item is the icon of the tab
        }
    };
    public boolean hasSearchBar() {
        return true;
    }
}
