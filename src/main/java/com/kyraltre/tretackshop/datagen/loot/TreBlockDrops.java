package com.kyraltre.tretackshop.datagen.loot;

import com.kyraltre.tretackshop.block.TackShopBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;


public class TreBlockDrops extends BlockLoot {

    public TreBlockDrops(){

    }

    protected void addTables() {


//        this.dropSelf((Block) TackShopBlocks.PUMPKIN_RESERVE.get());
//        this.dropSelf((Block) TackShopBlocks.PUMPKIN_GRAND.get());
//
//        this.dropSelf((Block) TackShopBlocks.SNOWFLAKE_GRAND.get());
//        this.dropSelf((Block) TackShopBlocks.SNOWFLAKE_RESERVE.get());
//
//        this.dropSelf((Block) TackShopBlocks.HEART_GRAND.get());
//        this.dropSelf((Block) TackShopBlocks.HEART_RESERVE.get());
//
//        this.dropSelf((Block) TackShopBlocks.CLOVER_GRAND.get());
//        this.dropSelf((Block) TackShopBlocks.CLOVER_RESERVE.get());

//        this.dropSelf((Block) TackShopBlocks.SUN_TROPHY.get());
//        this.dropSelf((Block) TackShopBlocks.MOON_TROPHY.get());
//
//        this.dropSelf((Block) TackShopBlocks.FLORAL_GOLD.get());
//        this.dropSelf((Block) TackShopBlocks.FLORAL_SILVER.get());
//        this.dropSelf((Block) TackShopBlocks.FLORAL_BRONZE.get());

    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return TackShopBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
