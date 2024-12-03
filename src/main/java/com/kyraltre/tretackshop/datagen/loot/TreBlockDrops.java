package com.kyraltre.tretackshop.datagen.loot;

import com.kyraltre.tretackshop.block.TackShopBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;


public class TreBlockDrops extends BlockLoot {

    public TreBlockDrops(){

    }

    protected void addTables() {


        this.dropSelf((Block) TackShopBlocks.PUMPKIN_RESERVE.get());
        this.dropSelf((Block) TackShopBlocks.PUMPKIN_GRAND.get());

        this.dropSelf((Block) TackShopBlocks.SNOWFLAKE_GRAND.get());
        this.dropSelf((Block) TackShopBlocks.SNOWFLAKE_RESERVE.get());

        this.dropSelf((Block) TackShopBlocks.HEART_GRAND.get());
        this.dropSelf((Block) TackShopBlocks.HEART_RESERVE.get());

        this.dropSelf((Block) TackShopBlocks.CLOVER_GRAND.get());
        this.dropSelf((Block) TackShopBlocks.CLOVER_RESERVE.get());

//        this.dropSelf((Block) TackShopBlocks.SUN_TROPHY.get());
//        this.dropSelf((Block) TackShopBlocks.MOON_TROPHY.get());
//
//        this.dropSelf((Block) TackShopBlocks.FLORAL_GOLD.get());
//        this.dropSelf((Block) TackShopBlocks.FLORAL_SILVER.get());
//        this.dropSelf((Block) TackShopBlocks.FLORAL_BRONZE.get());

       this.dropSelf(TackShopBlocks.CONE_1.get());
       this.dropSelf(TackShopBlocks.CONE_2.get());
       this.dropSelf(TackShopBlocks.CONE_3.get());
        this.dropSelf(TackShopBlocks.CONE_4.get());
        this.dropSelf(TackShopBlocks.CONE_5.get());
        this.dropSelf(TackShopBlocks.CONE_6.get());
        this.dropSelf(TackShopBlocks.CONE_7.get());
        this.dropSelf(TackShopBlocks.CONE_8.get());
        this.dropSelf(TackShopBlocks.CONE_9.get());
        this.dropSelf(TackShopBlocks.CONE_10.get());
        this.dropSelf(TackShopBlocks.CONE_11.get());
        this.dropSelf(TackShopBlocks.CONE_12.get());
        this.dropSelf(TackShopBlocks.CONE_13.get());
        this.dropSelf(TackShopBlocks.CONE_14.get());
        this.dropSelf(TackShopBlocks.CONE_morpho.get());
        this.dropSelf(TackShopBlocks.CONE_monarch.get());
        this.dropSelf(TackShopBlocks.CONE_hound.get());
        this.dropSelf(TackShopBlocks.CONE_rainbow.get());

    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return TackShopBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
