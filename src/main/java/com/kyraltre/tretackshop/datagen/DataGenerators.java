package com.kyraltre.tretackshop.datagen;

import com.kyraltre.tretackshop.TreTackShop;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = TreTackShop.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
//    @SubscribeEvent
//    public static void gatherData(GatherDataEvent event) {
//        DataGenerator generator = event.getGenerator();
//        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
//
//        generator.addProvider(new TreRecipeProvider(generator));
//        generator.addProvider(new TreItemModelProvider(generator, existingFileHelper));
//    }
}
