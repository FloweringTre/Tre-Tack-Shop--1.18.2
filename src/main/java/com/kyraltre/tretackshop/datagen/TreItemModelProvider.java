package com.kyraltre.tretackshop.datagen;

import com.kyraltre.tretackshop.TreTackShop;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TreItemModelProvider extends ItemModelProvider {
    public TreItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TreTackShop.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

//    private ItemModelBuilder simpleItem(Item item) {
//        return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/generated")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"items/" + item.getRegistryName().getPath()));
//    }
//
//    private ItemModelBuilder simpleItem(Item item) {
//        return withExistingParent(item.getRegistryName().getPath(),
//                new ResourceLocation("item/generated")).texture("layer0",
//                new ResourceLocation(TreTackShop.MOD_ID,"items/" + item.getRegistryName().getPath()));
//    }

}
