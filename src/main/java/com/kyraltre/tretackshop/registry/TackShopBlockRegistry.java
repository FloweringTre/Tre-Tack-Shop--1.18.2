//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;

import com.alaharranhonor.swem.forge.SWEM;
import com.alaharranhonor.swem.forge.blocks.*;
import com.alaharranhonor.swem.forge.items.TackBoxBlockItem;
import com.alaharranhonor.swem.forge.blocks.HalfBarrelBlock;
import com.alaharranhonor.swem.forge.blocks.SlowFeederBlock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.alaharranhonor.swem.forge.util.SWEMUtil;
import com.kyraltre.tretackshop.block.TackShopBlocks;
import com.kyraltre.tretackshop.block.custom.EggTrophy;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;


public class TackShopBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_RAINBOW;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_HOUND;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_MORPHO;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_MONARCH;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_BAMBOO;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_SWDM_BAMBOO;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_WHITEWASH;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_THATCH;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_MANGROVE;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_CHERRY;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_ACACIA;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_BIRCH;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_CRIMSON;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_JUNGLE;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_DARK_OAK;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_OAK;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_SPRUCE;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_WARPED;

//    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL;
    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER;
//    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER;
//    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAIN;

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

    private static Supplier<BlockItem> item(RegistryObject<? extends Block> block, CreativeModeTab TRETACK_TAB) {
        return () -> {
            return new BlockItem((Block) block.get(), (new Item.Properties()).tab(TRETACK_TAB));
        };
    }

    static {
        BLOCKS = DeferredRegister.create(Keys.BLOCKS, "tretackshop");

        TACK_BOX = new ArrayList();
        TACK_BOX_MONARCH = new ArrayList();
        TACK_BOX_RAINBOW = new ArrayList();
        TACK_BOX_MORPHO = new ArrayList();
        TACK_BOX_HOUND = new ArrayList();
        TACK_BOX_BAMBOO = new ArrayList();
        TACK_BOX_SWDM_BAMBOO = new ArrayList();
        TACK_BOX_CHERRY = new ArrayList();
        TACK_BOX_MANGROVE = new ArrayList();
        TACK_BOX_THATCH = new ArrayList();
        TACK_BOX_WHITEWASH  = new ArrayList();
        TACK_BOX_ACACIA = new ArrayList();
        TACK_BOX_BIRCH = new ArrayList();
        TACK_BOX_CRIMSON = new ArrayList();
        TACK_BOX_DARK_OAK = new ArrayList();
        TACK_BOX_JUNGLE = new ArrayList();
        TACK_BOX_OAK = new ArrayList();
        TACK_BOX_SPRUCE = new ArrayList();
        TACK_BOX_WARPED = new ArrayList<>();

//        HALF_BARREL = new ArrayList();
        SLOW_FEEDER = new ArrayList();
//        GRAIN_FEEDER = new ArrayList();
//        BIN_GRAIN = new ArrayList();

        for (int var2 = 0; var2 < 14; ++var2) {
            int counter = var2 + 1;

            TACK_BOX.add(register("tack_box_" + counter, () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
//            HALF_BARREL.add(register("half_barrel_" + counter, () -> {
//                return new HalfBarrelBlock(Properties.of(Material.METAL).noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
            SLOW_FEEDER.add(register("slow_feeder_" + counter, () -> {
                return new SlowFeederBlock(Properties.of(Material.METAL).noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
//            GRAIN_FEEDER.add(register("grain_feeder_" + counter, () -> {
//                return new GrainFeederBlock(Properties.of(Material.METAL).noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
//            BIN_GRAIN.add(register("bin_grain_" + counter, () -> {
//                return new GrainBinBlock(Properties.of(Material.WOOD).strength(1.0F, 2.0F).noOcclusion());
//            }));
        }


        for (int var3 = 1; var3 < 2; ++var3) {
            TACK_BOX_RAINBOW.add(register("tack_box_" + "rainbow", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_ACACIA.add(register("tack_box_" + "acacia", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_BIRCH.add(register("tack_box_" + "birch", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_CRIMSON.add(register("tack_box_" + "crimson", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_DARK_OAK.add(register("tack_box_" + "dark_oak", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_JUNGLE.add(register("tack_box_" + "jungle", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_OAK.add(register("tack_box_" + "oak", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_SPRUCE.add(register("tack_box_" + "spruce", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_WARPED.add(register("tack_box_" + "warped", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));

            TACK_BOX_SWDM_BAMBOO.add(register("tack_box_" + "swdm_bamboo", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_CHERRY.add(register("tack_box_" + "cherry", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_BAMBOO.add(register("tack_box_" + "bamboo", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_MANGROVE.add(register("tack_box_" + "mangrove", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_THATCH.add(register("tack_box_" + "thatch", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            TACK_BOX_WHITEWASH.add(register("tack_box_" + "whitewash", () -> {
                return new TackBoxBlock(Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));

        }
    }
}
