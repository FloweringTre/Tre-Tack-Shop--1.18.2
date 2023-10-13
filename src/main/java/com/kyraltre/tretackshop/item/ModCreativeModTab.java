package com.kyraltre.tretackshop.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab TRETACK_TAB = new CreativeModeTab("tretacktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BUTTERFLY.get()); //this item is the icon of the tab
        }
    };
}
