package com.kyraltre.tretackshop.item;

import com.kyraltre.tretackshop.registry.AwardShopItems;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TackShopCreativeModTab {
    public static final CreativeModeTab TRETACK_TAB = new CreativeModeTab("tretacktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TackShopItems.BUTTERFLY.get()); //this item is the icon of the tab
        }
        @Override
        public boolean hasSearchBar() { return true; }



    }.setBackgroundImage(new ResourceLocation("minecraft","textures/gui/container/creative_inventory/tab_item_search.png"));

    public static final CreativeModeTab TREAWARD_TAB = new CreativeModeTab("treawardtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AwardShopItems.RIBBON_THREE_TAILS_GRAND.get()); //this item is the icon of the tab
        }
        @Override
        public boolean hasSearchBar() { return true; }



    }.setBackgroundImage(new ResourceLocation("minecraft","textures/gui/container/creative_inventory/tab_item_search.png"));


}