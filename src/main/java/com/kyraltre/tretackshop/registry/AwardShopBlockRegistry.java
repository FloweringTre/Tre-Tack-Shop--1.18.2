//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;

import com.alaharranhonor.swem.forge.blocks.TackBoxBlock;
import com.alaharranhonor.swem.forge.items.TackBoxBlockItem;
import com.kyraltre.tretackshop.block.custom.CloverTrophy;
import com.kyraltre.tretackshop.block.custom.EggTrophy;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class AwardShopBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS;

    public static final List<RegistryObject<EggTrophy>> EGG_TROPHY_THIN;
    public static final List<RegistryObject<EggTrophy>> EGG_TROPHY_THICK;
    public static final List<RegistryObject<EggTrophy>> EGG_TROPHY_CHEV;
    public AwardShopBlockRegistry() {
    }

    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, AwardShopBlockRegistry::itemDefault);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        TackShopItems.ITEMS.register(name, (Supplier) itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> itemDefault(RegistryObject<? extends Block> block) {
        return item(block, TackShopCreativeModTab.TREAWARD_TAB);
    }

    private static Supplier<BlockItem> item(RegistryObject<? extends Block> block, CreativeModeTab itemGroup) {
        return () -> {
            return new BlockItem((Block) block.get(), (new Item.Properties()).tab(itemGroup));
        };
    }

    static {
        BLOCKS = DeferredRegister.create(Keys.BLOCKS, "tretackshop");


        EGG_TROPHY_CHEV = new ArrayList<>();
        EGG_TROPHY_THIN = new ArrayList<>();
        EGG_TROPHY_THICK = new ArrayList<>();

        for (int var1 = 1; var1 < 4; ++var1) {
            EGG_TROPHY_THICK.add(register("e_g_g_trophy_thick_" + var1, () -> {
                return new EggTrophy(Properties.of(Material.METAL).noOcclusion().strength(1.0F));
            }));
            EGG_TROPHY_CHEV.add(register("e_g_g_trophy_chev_" + var1, () -> {
                return new EggTrophy(Properties.of(Material.METAL).noOcclusion().strength(1.0F));
            }));
            EGG_TROPHY_THIN.add(register("e_g_g_trophy_thin_" + var1, () -> {
                return new EggTrophy(Properties.of(Material.METAL).noOcclusion().strength(1.0F));
            }));
        }

//            GRAIN_BINS_COLOR.put(counter, register("bin_grain_" + counter, () -> {
//                return new GrainBinBlock(Properties.of(Material.WOOD).strength(1.0F, 2.0F).noOcclusion());
//            }));
//        }
//
//        Stream.of(WoodType.OAK, WoodType.BIRCH, WoodType.SPRUCE, WoodType.JUNGLE, WoodType.DARK_OAK, WoodType.ACACIA, WoodType.WARPED, WoodType.CRIMSON).forEach((wood) -> {
//            GRAIN_BINS_WOOD.put(wood.name(), register("bin_grain_" + wood.name(), () -> {
//                return new GrainBinBlock(Properties.of(Material.WOOD).strength(1.0F, 2.0F).noOcclusion());
//            }));
//        });

    }
}
