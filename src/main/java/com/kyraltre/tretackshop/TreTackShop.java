package com.kyraltre.tretackshop;

import com.kyraltre.tretackshop.block.TackShopBlocks;
import com.kyraltre.tretackshop.item.TackItems;
import com.kyraltre.tretackshop.registry.TackShopItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TreTackShop.MOD_ID)
public class TreTackShop
{
    public static final String MOD_ID = "tretackshop";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public TreTackShop()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        TackItems.register(eventBus); // registers the deferred items in ModItems
        TackShopItems.init(eventBus);
        TackShopBlocks.register(eventBus); //registers the deferred items in ModBlocks

        eventBus.addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(TackShopBlocks.PUMPKIN_GRAND.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TackShopBlocks.PUMPKIN_RESERVE.get(), RenderType.cutout());

    }


    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
