package com.kyraltre.tretackshop.datagen;

import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TreItemModelProvider extends ItemModelProvider {
    public TreItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TreTackShop.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(TackShopItems.RAINBOW_INA_BOTTLE.get());
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TreTackShop.MOD_ID,"items/" + item.getRegistryName().getPath()));
    }
//
//      private ItemModelBuilder handheldItem(Item item) {
//          return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/handheld")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"item/" + item.getRegistryName().getPath()));
////  }

}
