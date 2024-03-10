package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.registry.SWEMBlocks;
import com.alaharranhonor.swem.forge.tileentity.*;
import com.kyraltre.tretackshop.block.TackShopBlocks;
import com.kyraltre.tretackshop.tileentity.EggTrophyBE;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.mojang.datafixers.types.Type;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.Builder;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TackShopBlockEntities {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES;
    public static final RegistryObject<BlockEntityType<EggTrophyBE>> E_G_G_TROPHY_THIN;

    public TackShopBlockEntities() {
    }

    public static void init(IEventBus modBus) {BLOCK_ENTITY_TYPES.register(modBus); }

    static {
        BLOCK_ENTITY_TYPES = DeferredRegister.create(Keys.BLOCK_ENTITY_TYPES, "tretackshop");

        E_G_G_TROPHY_THIN = BLOCK_ENTITY_TYPES.register("e_g_g_trophy_thin", () -> {
            return Builder.of(EggTrophyBE::new, new Block[]{(Block)TackShopBlocks.E_G_G_TROPHY_THIN.get()}).build((Type)null);
        });
    }
}
