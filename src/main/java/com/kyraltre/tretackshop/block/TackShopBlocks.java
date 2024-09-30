package com.kyraltre.tretackshop.block;

import com.alaharranhonor.swem.forge.blocks.ConeBase;
import com.alaharranhonor.swem.forge.blocks.HalfBarrelBlock;
import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.block.custom.*;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class TackShopBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TreTackShop.MOD_ID);

    public static final RegistryObject<Block> PUMPKIN_GRAND = registerBlock("pumpkin_grand",
            () -> new PumpkinTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public static final RegistryObject<Block> PUMPKIN_RESERVE = registerBlock("pumpkin_reserve",
            () -> new PumpkinTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public static final RegistryObject<Block> SNOWFLAKE_GRAND = registerBlock("snowflake_grand", () ->
            new SnowflakeTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> SNOWFLAKE_RESERVE = registerBlock("snowflake_reserve",
            () -> new SnowflakeTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> HEART_GRAND = registerBlock("heart_grand", () ->
            new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> HEART_RESERVE = registerBlock("heart_reserve",
            () -> new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public static final RegistryObject<Block> CLOVER_GRAND = registerBlock("clover_grand", () ->
            new CloverTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> CLOVER_RESERVE = registerBlock("clover_reserve",
            () -> new CloverTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public static final RegistryObject<Block> CONE_1 = registerBlock("cone_1",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_2 = registerBlock("cone_2",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_3 = registerBlock("cone_3",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_4 = registerBlock("cone_4",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_5 = registerBlock("cone_5",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_6 = registerBlock("cone_6",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_7 = registerBlock("cone_7",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_8 = registerBlock("cone_8",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_9 = registerBlock("cone_9",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_10 = registerBlock("cone_10",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_11 = registerBlock("cone_11",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_12 = registerBlock("cone_12",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_13 = registerBlock("cone_13",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_14 = registerBlock("cone_14",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_monarch = registerBlock("cone_monarch",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_morpho = registerBlock("cone_morpho",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);
    public static final RegistryObject<Block> CONE_hound = registerBlock("cone_hound",
            () -> new ConeBase(), TackShopCreativeModTab.TREBLOCK_TAB);

//    public static final RegistryObject<Block> FLORAL_GOLD = registerBlock("floral_gold", () ->
//            new FloralTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);
//    public static final RegistryObject<Block> FLORAL_SILVER = registerBlock("floral_silver", () ->
//            new FloralTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);
//    public static final RegistryObject<Block> FLORAL_BRONZE = registerBlock("floral_bronze", () ->
//            new FloralTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);
//
//    public static final RegistryObject<Block> SUN_TROPHY = registerBlock("sun_trophy", () ->
//            new CelestialTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);
//    public static final RegistryObject<Block> MOON_TROPHY = registerBlock("moon_trophy",
//            () -> new CelestialTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
            return TackShopItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
