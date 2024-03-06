//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;

import com.alaharranhonor.swem.forge.SWEM;
import com.alaharranhonor.swem.forge.blocks.TackBoxBlock;
import com.alaharranhonor.swem.forge.items.TackBoxBlockItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

public class TackShopBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX;
//    public static final Map<DyeColor, RegistryObject<GrainBinBlock>> GRAIN_BINS_COLOR;
//    public static final Map<String, RegistryObject<GrainBinBlock>> GRAIN_BINS_WOOD;

    public TackShopBlockRegistry() {
    }

    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, TackShopBlockRegistry::itemDefault);
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
        return item(block, TackShopCreativeModTab.TRETACK_TAB);
    }

    private static Supplier<BlockItem> item(RegistryObject<? extends Block> block, CreativeModeTab itemGroup) {
        return () -> {
            return new BlockItem((Block) block.get(), (new Item.Properties()).tab(itemGroup));
        };
    }

    static {
        BLOCKS = DeferredRegister.create(Keys.BLOCKS, "swem");

        TACK_BOX = new ArrayList();
//        GRAIN_BINS_COLOR = new HashMap();
//        GRAIN_BINS_WOOD = new HashMap();

        for (int var2 = 0; var2 < 14; ++var2) {
            int counter = var2+1;

            TACK_BOX.add(register("tack_box_" + counter, () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), counter);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));

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
}
