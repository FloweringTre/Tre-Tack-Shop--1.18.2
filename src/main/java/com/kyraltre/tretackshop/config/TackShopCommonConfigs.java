package com.kyraltre.tretackshop.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import org.checkerframework.checker.units.qual.A;

@Mod.EventBusSubscriber(
        modid = "tretackshop",
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class TackShopCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_ADVENTURE_TACK_SETS;
    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_WESTERN_TACK_SETS;
    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_ENGLISH_TACK_SETS;
    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_PADDOCK_TACK_SETS;
    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_ARMOR_EXTRAS_TACK_SETS;

    static {
        BUILDER.push("Award Tack Set Configs for Tre's Tack Shop");
        AWARD_ADVENTURE_TACK_SETS = BUILDER.comment("How many Award Adventure sets do you want loaded?")
                .defineInRange("adventureSetsLoaded", 14, 0, 48);
        AWARD_ARMOR_EXTRAS_TACK_SETS = BUILDER.comment("How many Award Saddle Bags and Cloth Armor sets do you want loaded?")
                .defineInRange("armorAndSaddleBagSetsLoaded", 14, 0, 48);
        AWARD_WESTERN_TACK_SETS = BUILDER.comment("How many Award Western sets do you want loaded?")
                .defineInRange("westernSetsLoaded", 14, 0, 48);
        AWARD_ENGLISH_TACK_SETS = BUILDER.comment("How many Award English sets do you want loaded?")
                .defineInRange("englishSetsLoaded", 14, 0, 48);
        AWARD_PADDOCK_TACK_SETS = BUILDER.comment("How many Award Paddock sets do you want loaded?")
                .defineInRange("paddockSetsLoaded",14, 0, 48);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
