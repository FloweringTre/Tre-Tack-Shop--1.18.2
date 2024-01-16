package com.kyraltre.tretackshop.datagen;

import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.registry.SWTags;
import com.kyraltre.tretackshop.registry.TackShopItems;
import com.kyraltre.tretackshop.registry.TreDyeTags;
import com.kyraltre.tretackshop.registry.TreTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;


public class TreRecipeProvider extends RecipeProvider {
        public TreRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    @Override
        protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

//GIVING RAINBOW_INA_BOTTLE A RECIPE FOR THE PURPOSE OF USING IT FOR THE RAINBOW TACK
//        ShapedRecipeBuilder.shaped(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .define('A', Items.GLASS_BOTTLE)
//                .define('B', Items.RED_DYE)
//                .define('C', Items.ORANGE_DYE)
//                .define('D', Items.YELLOW_DYE)
//                .define('E', Items.GREEN_DYE)
//                .define('F', Items.BLUE_DYE)
//                .define('G', Items.PURPLE_DYE)
//
//                .pattern("BCD")
//                .pattern("GFE")
//                .pattern("AAA")
//
//                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.GLASS_BOTTLE).build()))
//                .save(pFinishedRecipeConsumer);

////RAINBOW TACK ITEMS CRAFTING
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_RAINBOW.get())
//                .requires(SWTags.PASTURE_BLANKETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("pasture_blanket")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/pasture_blanket_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_RAINBOW_ARMORED.get())
//                .requires(SWTags.PASTURE_BLANKETS_ARMORED)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("pasture_blanket")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/pasture_blanket_rainbow_armored"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.HALTER_RAINBOW.get())
//                .requires(SWTags.HALTERS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("halter")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/halter_rainbow"));
//
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_SADDLE_RAINBOW.get())
//                .requires(SWTags.ADVENTURE_SADDLES)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("saddle")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/adventure_saddle_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_SADDLE_RAINBOW.get())
//                .requires(TreTags.ENGLISH_SADDLES)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("saddle")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/english_saddle_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_SADDLE_RAINBOW.get())
//                .requires(SWTags.WESTERN_SADDLES)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("saddle")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/western_saddle_rainbow"));
//
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BLANKET_RAINBOW.get())
//                .requires(TreTags.ADVENTURE_BLANKETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("blanket")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/adventure_blanket_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BLANKET_RAINBOW.get())
//                .requires(SWTags.ENGLISH_BLANKETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("blanket")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/english_blanket_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BLANKET_RAINBOW.get())
//                .requires(SWTags.WESTERN_BLANKETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("blanket")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/western_blanket_rainbow"));
//
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BREAST_COLLAR_RAINBOW.get())
//                .requires(TreTags.ADVENTURE_BREAST_COLLARS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("breast_collar")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/adventure_breast_collar_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BREAST_COLLAR_RAINBOW.get())
//                .requires(TreTags.ENGLISH_BREAST_COLLARS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("breast_collar")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/english_breast_collar_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BREAST_COLLAR_RAINBOW.get())
//                .requires(SWTags.WESTERN_BREAST_COLLARS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("breast_collar")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/western_breast_collar_rainbow"));
//
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_LEG_WRAPS_RAINBOW.get())
//                .requires(TreTags.ADVENTURE_LEG_WRAPS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("leg_wraps")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/adventure_leg_wraps_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_LEG_WRAPS_RAINBOW.get())
//                .requires(SWTags.ENGLISH_LEG_WRAPS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("leg_wraps")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/english_leg_wraps_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_LEG_WRAPS_RAINBOW.get())
//                .requires(SWTags.WESTERN_LEG_WRAPS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("leg_wraps")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/western_leg_wraps_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BRIDLE_RAINBOW.get())
//                .requires(TreTags.ADVENTURE_BRIDLES)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("bridle")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/adventure_bridle_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BRIDLE_RAINBOW.get())
//                .requires(TreTags.ENGLISH_BRIDLES)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("bridle")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/english_bridle_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BRIDLE_RAINBOW.get())
//                .requires(SWTags.WESTERN_BRIDLES)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("bridle")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/western_bridle_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_GIRTH_STRAP_RAINBOW.get())
//                .requires(TreTags.ADVENTURE_GIRTH_STRAPS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("girth_strap")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/adventure_girth_strap_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_GIRTH_STRAP_RAINBOW.get())
//                .requires(TreTags.ENGLISH_GIRTH_STRAPS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("girth_strap")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/english_girth_strap_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_GIRTH_STRAP_RAINBOW.get())
//                .requires(SWTags.WESTERN_GIRTH_STRAPS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("girth_strap")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/western_girth_strap_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.QUARTER_SHEET_WHITE_RAINBOW.get())
//                .requires(TreTags.QUARTER_SHEETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .requires(Items.WHITE_DYE)
//                .group("quarter_sheet")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/quarter_sheet_white_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.QUARTER_SHEET_BLACK_RAINBOW.get())
//                .requires(TreTags.QUARTER_SHEETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .requires(Items.BLACK_DYE)
//                .group("quarter_sheet")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/quarter_sheet_black_rainbow"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.IRON_HORSE_ARMOR_RAINBOW.get())
//                .requires(TreTags.IRON_ARMOR)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("iron_armor")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/iron_horse_armor_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.AMETHYST_HORSE_ARMOR_RAINBOW.get())
//                .requires(SWTags.AMETHYST_ARMOR)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("amethyst_armor")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/amethyst_horse_armor_rainbow"));
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.SADDLE_BAG_RAINBOW.get())
//                .requires(SWTags.SADDLE_BAGS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .group("saddle_bags")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/saddle_bag_rainbow"));


//ONE OFF TACK RECIPES
//        ShapedRecipeBuilder.shaped(TackShopItems.PELHAM_BRIDLE_BROWN.get())
//                .define('w', SWTags.REFINED_LEATHER)
//                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', Items.STRING)
//                .define('B', Items.BROWN_DYE)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("C w")
//                .pattern("ywB")
//                .pattern("xyA")
//                .group("pelham_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "pelham/pelham_brown"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PELHAM_BRIDLE_BROWN.get())
//                .requires(TreTags.ENGLISH_BRIDLES)
//                .requires(Items.BROWN_DYE)
//                .requires(Items.TRIPWIRE_HOOK)
//                .requires(ItemTags.SAPLINGS)
//                .group("pelham_bridle")
//                .unlockedBy("has_english_bridle", has(TreTags.ENGLISH_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "pelham/pelham_brown_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.PELHAM_BRIDLE_BLACK.get())
//                .define('w', SWTags.REFINED_LEATHER)
//                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', Items.STRING)
//                .define('B', Items.BLACK_DYE)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("C w")
//                .pattern("ywB")
//                .pattern("xyA")
//                .group("pelham_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "pelham/pelham_black"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PELHAM_BRIDLE_BLACK.get())
//                .requires(TreTags.ENGLISH_BRIDLES)
//                .requires(Items.BLACK_DYE)
//                .requires(Items.TRIPWIRE_HOOK)
//                .requires(ItemTags.SAPLINGS)
//                .group("pelham_bridle")
//                .unlockedBy("has_english_bridle", has(TreTags.ENGLISH_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "pelham/pelham_black_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.DOUBLE_BRIDLE.get())
//                .define('w', SWTags.REFINED_LEATHER)
//                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', Items.STRING)
//                .define('B', Items.BLACK_DYE)
//                .define('C', Items.LILY_OF_THE_VALLEY)
//                .pattern("C w")
//                .pattern("ywB")
//                .pattern("xyA")
//                .group("pelham_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "pelham/moon_double"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.DOUBLE_BRIDLE.get())
//                .requires(TreTags.ENGLISH_BRIDLES)
//                .requires(Items.BLACK_DYE)
//                .requires(Items.TRIPWIRE_HOOK)
//                .requires(Items.LILY_OF_THE_VALLEY)
//                .group("pelham_bridle")
//                .unlockedBy("has_english_bridle", has(TreTags.ENGLISH_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "pelham/moon_double_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.BITLESS_BRIDLE.get())
//                .define('w', SWTags.REFINED_LEATHER)
//                .define('A', Items.STRING)
//                .define('B', Items.BLACK_DYE)
//                .define('C', Items.LILY_OF_THE_VALLEY)
//                .pattern("C w")
//                .pattern("wwB")
//                .pattern("AAA")
//                .group("bitless_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "bareback/bitless_bridle"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.BITLESS_BRIDLE.get())
//                .requires(TreTags.ENGLISH_BRIDLES)
//                .requires(Items.BLACK_DYE)
//                .requires(Items.STRING)
//                .requires(Items.LILY_OF_THE_VALLEY)
//                .group("bitless_bridle")
//                .unlockedBy("has_english_bridle", has(TreTags.ENGLISH_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "bareback/bitless_bridle_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.BAREBACK_SADDLE.get())
//                .define('x', Items.WHITE_WOOL)
//                .define('y', Items.IRON_NUGGET)
//                .define('C', Items.LILY_OF_THE_VALLEY)
//                .pattern("x x")
//                .pattern("xxx")
//                .pattern("y C")
//                .group("bareback_saddle")
//                .unlockedBy("has_white_wool", has(Items.WHITE_WOOL))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "bareback/bareback_saddle"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.BAREBACK_SADDLE.get())
//                .requires(TreTags.ENGLISH_SADDLES)
//                .requires(Items.WHITE_WOOL)
//                .requires(Items.LILY_OF_THE_VALLEY)
//                .group("bareback_saddle")
//                .unlockedBy("has_english_saddle", has(TreTags.ENGLISH_SADDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "bareback/bareback_saddle" + "_from_saddle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.BAREBACK_BLANKET.get())
//                .define('x', Items.BLACK_WOOL)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('C', Items.LILY_OF_THE_VALLEY)
//                .pattern("xyx")
//                .pattern("xx ")
//                .pattern(" C ")
//                .group("bareback_blanket")
//                .unlockedBy("has_black_wool", has(Items.BLACK_WOOL))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "bareback/bareback_blanket"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.BAREBACK_BLANKET.get())
//                .requires(SWTags.ENGLISH_BLANKETS)
//                .requires(Items.BLACK_WOOL)
//                .requires(Items.LILY_OF_THE_VALLEY)
//                .group("bareback_blanket")
//                .unlockedBy("has_english_blanket", has(SWTags.ENGLISH_BLANKETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "bareback/bareback_blanket" + "_from_blanket"));
//
//          ShapedRecipeBuilder.shaped(TackShopItems.BAREBACK_GIRTH_STRAP.get())
//                .define('x', Items.IRON_NUGGET)
//                .define('z', Items.BLACK_WOOL)
//                .define('C', Items.LILY_OF_THE_VALLEY)
//                .pattern("xzC")
//                .pattern(" z ")
//                .pattern(" zx")
//                .group("bareback_girth_strap")
//                  .unlockedBy("has_black_wool", has(Items.BLACK_WOOL))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "bareback/bareback_girth_strap"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.BAREBACK_GIRTH_STRAP.get())
//                .requires(TreTags.ENGLISH_GIRTH_STRAPS)
//                .requires(Items.BLACK_WOOL)
//                .requires(Items.LILY_OF_THE_VALLEY)
//                .group("bareback_girth_strap")
//                .unlockedBy("has_english_girth_strap", has(TreTags.ENGLISH_GIRTH_STRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "bareback/bareback_girth_strap" + "_from_girth_strap"));

/// CRAFTING RECIPES
        // BUTTERFLYS FOR DECOR
//        ShapedRecipeBuilder.shaped(TackShopItems.BUTTERFLY.get(), 1)
//                .define('A', SWTags.STAR_WORMS)
//                .define('B', Items.OAK_SAPLING)
//                .define('C', Items.BLUE_ORCHID)
//                .define('D', Items.LIGHT_BLUE_DYE)
//                .pattern("DDD")
//                .pattern("DAD")
//                .pattern("CBC")
//
//                .unlockedBy("has_worms", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(SWTags.STAR_WORMS).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(TackShopItems.BUTTERFLY_MONARCH.get(), 1)
//                .define('A', SWTags.STAR_WORMS)
//                .define('B', Items.OAK_SAPLING)
//                .define('C', Items.DANDELION)
//                .define('D', Items.YELLOW_DYE)
//                .pattern("DDD")
//                .pattern("DAD")
//                .pattern("CBC")
//
//                .unlockedBy("has_worms", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(SWTags.STAR_WORMS).build()))
//                .save(pFinishedRecipeConsumer);

///// PASTEL GENERATION
//    //PASTURE& QUARTER BLANKETS
//        ShapedRecipeBuilder.shaped(TackShopItems.QUARTER_SHEET_1.get())
//                .define('#', ItemTags.WOOL)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', Items.LILY_OF_THE_VALLEY)
//                .pattern("###")
//                .pattern(" ##")
//                .pattern("ACB")
//
//                .group("quarter_sheet")
//                .unlockedBy("has_wool", has(ItemTags.WOOL))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/quarter_sheet_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.QUARTER_SHEET_1.get())
//                .requires(TreTags.QUARTER_SHEETS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(Items.LILY_OF_THE_VALLEY)
//                .group("quarter_sheet")
//                .unlockedBy("has_quarter_sheet", has(TreTags.QUARTER_SHEETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/dyed_quarter_sheet_1"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.PASTURE_BLANKET_1.get())
//                .define('#', ItemTags.CARPETS)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern(" ##")
//                .pattern("A#B")
//                .pattern("#C#")
//                .group("pasture_blanket")
//                .unlockedBy("has_carpet", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/pasture_blanket_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_1.get())
//                .requires(SWTags.PASTURE_BLANKETS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("pasture_blanket")
//                .unlockedBy("has_pasture_blanket", has(SWTags.PASTURE_BLANKETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/dyed_pasture_blanket_1"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.PASTURE_BLANKET_1_ARMORED.get())
//                .define('#', ItemTags.CARPETS)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .define('y', Items.IRON_CHESTPLATE)
//                .pattern("y##")
//                .pattern("A#B")
//                .pattern("#C#")
//                .group("pasture_blanket_armored")
//                .unlockedBy("has_carpet", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/pasture_blanket_armored_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_1_ARMORED.get())
//                .requires(SWTags.PASTURE_BLANKETS_ARMORED)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("pasture_blanket_armored")
//                .unlockedBy("has_pasture_blanket_armored", has(SWTags.PASTURE_BLANKETS_ARMORED))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/dyed_pasture_blanket_armored_1"));
//
//    //HALTER & FLYMASK
//        ShapedRecipeBuilder.shaped(TackShopItems.HALTER_1.get())
//                .define('x', (ItemTags.CARPETS))
//                .define('y', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x x")
//                .pattern("AxB")
//                .pattern("yCx")
//                .group("halter")
//                .unlockedBy("has_iron_nugget", has(net.minecraftforge.common.Tags.Items.NUGGETS_IRON))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/halter_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.HALTER_1.get())
//                .requires(SWTags.HALTERS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .unlockedBy("has_halters", has(SWTags.HALTERS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/dye_halter_1"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.FLYMASK_1.get())
//                .define('x', Items.STRING)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x y")
//                .pattern("AxB")
//                .pattern("xCx")
//                .group("halter")
//                .unlockedBy("has_string", has(Items.STRING))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/flymask_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.FLYMASK_1.get())
//                .requires(TreTags.FLYMASKS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .unlockedBy("has_flymasks", has(TreTags.FLYMASKS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/dye_flymask_1"));
//
//    //BRIDLES
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_BRIDLE_1.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('z', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("ABx")
//                .pattern("Cxx")
//                .pattern("yzx")
//                .group("adventure_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_bridle_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BRIDLE_1.get())
//                .requires(TreTags.ADVENTURE_BRIDLES)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_bridle")
//                .unlockedBy("has_adventure_bridle", has(TreTags.ADVENTURE_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_bridle_1_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_BRIDLE_1.get())
//                .define('w', SWTags.REFINED_LEATHER)
//                .define('x', Items.IRON_NUGGET)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("C w")
//                .pattern("AwB")
//                .pattern("xyw")
//                .group("western_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_bridle_1" ));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BRIDLE_1.get())
//                .requires(SWTags.WESTERN_BRIDLES)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_bridle")
//                .unlockedBy("has_western_bridle", has(SWTags.WESTERN_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_bridle_1_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_BRIDLE_1.get())
//                .define('w', SWTags.REFINED_LEATHER)
//                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("C w")
//                .pattern("AwB")
//                .pattern("xy ")
//                .group("english_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_bridle_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BRIDLE_1.get())
//                .requires(TreTags.ENGLISH_BRIDLES)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_bridle")
//                .unlockedBy("has_english_bridle", has(TreTags.ENGLISH_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_bridle_1_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_BRIDLE_1.get())
//                .define('w', ItemTags.CARPETS)
//                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("C w")
//                .pattern("AwB")
//                .pattern("xy ")
//                .group("cloth_bridle")
//                .unlockedBy("has_carpets", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/cloth_bridle_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.CLOTH_BRIDLE_1.get())
//                .requires(TreTags.CLOTH_BRIDLES)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("cloth_bridle")
//                .unlockedBy("has_cloth_bridle", has(TreTags.CLOTH_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/cloth_bridle_1_from_bridle"));
//
//
//    //SADDLES
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_SADDLE_1.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xxx")
//                .pattern("BxA")
//                .pattern("yxC")
//                .group("adventure_saddle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_saddle_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_SADDLE_1.get())
//                .requires(SWTags.ADVENTURE_SADDLES)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_saddle")
//                .unlockedBy("has_adventure_saddle", has(SWTags.ADVENTURE_SADDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_saddle_1" + "_from_saddle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_SADDLE_1.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', Items.IRON_NUGGET)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xAx")
//                .pattern("xBx")
//                .pattern("yxC")
//                .group("western_saddle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_saddle_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_SADDLE_1.get())
//                .requires(SWTags.WESTERN_SADDLES)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_saddle")
//                .unlockedBy("has_western_saddle", has(SWTags.WESTERN_SADDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_saddle_1" + "_from_saddle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_SADDLE_1.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern(" Ax")
//                .pattern("xxB")
//                .pattern("yxC")
//                .group("english_saddle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_saddle_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_SADDLE_1.get())
//                .requires(TreTags.ENGLISH_SADDLES)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_saddle")
//                .unlockedBy("has_english_saddle", has(TreTags.ENGLISH_SADDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_saddle_1" + "_from_saddle"));
//
//
//    //BLANKETS
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_BLANKET_1.get())
//                .define('y', ItemTags.CARPETS)
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("yxy")
//                .pattern("AyB")
//                .pattern("yCy")
//                .group("adventure_blanket")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_blanket_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BLANKET_1.get())
//                .requires(TreTags.ADVENTURE_BLANKETS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_blanket")
//                .unlockedBy("has_adventure_blanket", has(TreTags.ADVENTURE_BLANKETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_blanket_1" + "_from_blanket"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_BLANKET_1.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xyx")
//                .pattern("xxx")
//                .pattern("ACB")
//                .group("western_blanket")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_blanket_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BLANKET_1.get())
//                .requires(SWTags.WESTERN_BLANKETS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_blanket")
//                .unlockedBy("has_western_blanket", has(SWTags.WESTERN_BLANKETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_blanket_1" + "_from_blanket"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_BLANKET_1.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xyx")
//                .pattern("xx ")
//                .pattern("ACB")
//                .group("english_blanket")
//                .unlockedBy("has_carpets", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_blanket_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BLANKET_1.get())
//                .requires(SWTags.ENGLISH_BLANKETS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_blanket")
//                .unlockedBy("has_english_blanket", has(SWTags.ENGLISH_BLANKETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_blanket_1" + "_from_blanket"));
//
//
//    //BREAST COLLARS
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_BREAST_COLLAR_1.get())
//                .define('y', net.minecraftforge.common.Tags.Items.INGOTS_IRON)
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xCx")
//                .pattern("AyB")
//                .pattern(" y ")
//                .group("adventure_breast_collar")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/advenuture_breast_collar_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BREAST_COLLAR_1.get())
//                .requires(TreTags.ADVENTURE_BREAST_COLLARS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_breast_collar")
//                .unlockedBy("has_adventure_breast_collar", has(TreTags.ADVENTURE_BREAST_COLLARS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_breast_collar_1" + "_from_breast_collar"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_BREAST_COLLAR_1.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("yCy")
//                .pattern("AxB")
//                .pattern(" y ")
//                .group("western_breast_collar")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_breast_collar_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BREAST_COLLAR_1.get())
//                .requires(SWTags.WESTERN_BREAST_COLLARS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_breast_collar")
//                .unlockedBy("has_western_breast_collar", has(SWTags.WESTERN_BREAST_COLLARS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_breast_collar_1" + "_from_breast_collar"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_BREAST_COLLAR_1.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xCx")
//                .pattern("A B")
//                .pattern(" x ")
//                .group("english_breast_collar")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_breast_collar_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BREAST_COLLAR_1.get())
//                .requires(TreTags.ENGLISH_BREAST_COLLARS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_breast_collar")
//                .unlockedBy("has_english_breast_collar", has(TreTags.ENGLISH_BREAST_COLLARS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_breast_collar_1" + "_from_breast_collar"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_BREAST_COLLAR_1.get())
//                .define('x', ItemTags.WOOL)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xCx")
//                .pattern("A B")
//                .pattern(" x ")
//                .group("cloth_breast_collar")
//                .unlockedBy("has_wool", has(ItemTags.WOOL))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/cloth_breast_collar_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.CLOTH_BREAST_COLLAR_1.get())
//                .requires(TreTags.CLOTH_BREAST_COLLARS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("cloth_breast_collar")
//                .unlockedBy("has_cloth_breast_collar", has(TreTags.CLOTH_BREAST_COLLARS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/cloth_breast_collar_1" + "_from_breast_collar"));
//
//
//    //GIRTH STRAPS
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_GIRTH_STRAP_1.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', net.minecraftforge.common.Tags.Items.INGOTS_IRON)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("yxA")
//                .pattern(" xB")
//                .pattern("Cxy")
//                .group("adventure_girth_strap")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_girth_strap_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_GIRTH_STRAP_1.get())
//                .requires(TreTags.ADVENTURE_GIRTH_STRAPS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_girth_strap")
//                .unlockedBy("has_adventure_girth_strap", has(TreTags.ADVENTURE_GIRTH_STRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_girth_strap_1" + "_from_girth_strap"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_GIRTH_STRAP_1.get())
//                .define('x', Items.IRON_NUGGET)
//                .define('y', ItemTags.CARPETS)
//                .define('z', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xyA")
//                .pattern(" zB")
//                .pattern("Cyx")
//                .group("western_girth_strap")
//                .unlockedBy("has_western_girth_strap", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_girth_strap_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_GIRTH_STRAP_1.get())
//                .requires(SWTags.WESTERN_GIRTH_STRAPS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_girth_strap")
//                .unlockedBy("has_western_girth_strap", has(SWTags.WESTERN_GIRTH_STRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_girth_strap_1" + "_from_girth_strap"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_GIRTH_STRAP_1.get())
//                .define('x', Items.IRON_NUGGET)
//                .define('z', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xz ")
//                .pattern("ACB")
//                .pattern(" zx")
//                .group("english_girth_strap")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_girth_strap_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_GIRTH_STRAP_1.get())
//                .requires(TreTags.ENGLISH_GIRTH_STRAPS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_girth_strap")
//                .unlockedBy("has_english_girth_strap", has(TreTags.ENGLISH_GIRTH_STRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_girth_strap_1" + "_from_girth_strap"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_GIRTH_STRAP_1.get())
//                .define('x', Items.IRON_NUGGET)
//                .define('y', ItemTags.WOOL)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xyA")
//                .pattern(" yB")
//                .pattern("Cyx")
//                .group("cloth_girth_strap")
//                .unlockedBy("has_wool", has(ItemTags.WOOL))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/cloth_girth_strap_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.CLOTH_GIRTH_STRAP_1.get())
//                .requires(TreTags.CLOTH_GIRTH_STRAPS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("cloth_girth_strap")
//                .unlockedBy("has_cloth_girth_strap", has(TreTags.CLOTH_GIRTH_STRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/cloth_girth_strap_1" + "_from_girth_strap"));
//
//        //LEG WRAPS
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_LEG_WRAPS_1.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', Items.IRON_NUGGET)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x x")
//                .pattern("A B")
//                .pattern("yCy")
//                .group("adventure_leg_wraps")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_leg_wraps_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_LEG_WRAPS_1.get())
//                .requires(TreTags.ADVENTURE_LEG_WRAPS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_leg_wraps")
//                .unlockedBy("has_adventure_leg_wraps", has(TreTags.ADVENTURE_LEG_WRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/adventure_leg_wraps_1" + "_from_leg_wraps"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_LEG_WRAPS_1.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', Items.DRIED_KELP)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x x")
//                .pattern("xCx")
//                .pattern("AyB")
//                .group("western_leg_wraps")
//                .unlockedBy("has_carpets", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_leg_wraps_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_LEG_WRAPS_1.get())
//                .requires(SWTags.WESTERN_LEG_WRAPS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_leg_wraps")
//                .unlockedBy("has_western_leg_wraps", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/western_leg_wraps_1" + "_from_leg_wraps"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_LEG_WRAPS_1.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', Items.DRIED_KELP)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x x")
//                .pattern("A B")
//                .pattern("yCy")
//                .group("english_leg_wraps")
//                .unlockedBy("has_carpets", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_leg_wraps_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_LEG_WRAPS_1.get())
//                .requires(SWTags.ENGLISH_LEG_WRAPS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_leg_wraps")
//                .unlockedBy("has_english_leg_wraps", has(SWTags.ENGLISH_LEG_WRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_creamsicle/english_leg_wraps_1" + "_from_leg_wraps"));
//
//
//
///// JEWEL GENERATION
//    //PASTURE& QUARTER BLANKETS
//        ShapedRecipeBuilder.shaped(TackShopItems.QUARTER_SHEET_71.get())
//                .define('#', ItemTags.WOOL)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', Items.LILY_OF_THE_VALLEY)
//                .pattern("###")
//                .pattern(" ##")
//                .pattern("ACB")
//                .group("quarter_sheet")
//                .unlockedBy("has_wool", has(ItemTags.WOOL))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/quarter_sheet_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.QUARTER_SHEET_71.get())
//                .requires(TreTags.QUARTER_SHEETS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(Items.LILY_OF_THE_VALLEY)
//                .group("quarter_sheet")
//                .unlockedBy("has_quarter_sheet", has(TreTags.QUARTER_SHEETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/dyed_quarter_sheet_71"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.PASTURE_BLANKET_71.get())
//                .define('#', ItemTags.CARPETS)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern(" ##")
//                .pattern("A#B")
//                .pattern("#C#")
//                .group("pasture_blanket")
//                .unlockedBy("has_carpet", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/pasture_blanket_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_71.get())
//                .requires(SWTags.PASTURE_BLANKETS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("pasture_blanket")
//                .unlockedBy("has_pasture_blanket", has(SWTags.PASTURE_BLANKETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/dyed_pasture_blanket_71"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.PASTURE_BLANKET_71_ARMORED.get())
//                .define('#', ItemTags.CARPETS)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .define('y', Items.IRON_CHESTPLATE)
//                .pattern("y##")
//                .pattern("A#B")
//                .pattern("#C#")
//                .group("pasture_blanket_armored")
//                .unlockedBy("has_carpet", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/pasture_blanket_armored_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_71_ARMORED.get())
//                .requires(SWTags.PASTURE_BLANKETS_ARMORED)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("pasture_blanket_armored")
//                .unlockedBy("has_pasture_blanket_armored", has(SWTags.PASTURE_BLANKETS_ARMORED))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/dyed_pasture_blanket_armored_71"));
//
//    //HALTER & FLYMASK
//        ShapedRecipeBuilder.shaped(TackShopItems.HALTER_71.get())
//                .define('x', (ItemTags.CARPETS))
//                .define('y', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x x")
//                .pattern("AxB")
//                .pattern("yCx")
//                .group("halter")
//                .unlockedBy("has_iron_nugget", has(net.minecraftforge.common.Tags.Items.NUGGETS_IRON))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/halter_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.HALTER_71.get())
//                .requires(SWTags.HALTERS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .unlockedBy("has_halters", has(SWTags.HALTERS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/dye_halter_71"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.FLYMASK_71.get())
//                .define('x', Items.STRING)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x y")
//                .pattern("AxB")
//                .pattern("xCx")
//                .group("halter")
//                .unlockedBy("has_string", has(Items.STRING))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/flymask_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.FLYMASK_71.get())
//                .requires(TreTags.FLYMASKS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .unlockedBy("has_flymasks", has(TreTags.FLYMASKS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/dye_flymask_71"));
//
//    //BRIDLES
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_BRIDLE_71.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('z', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("ABx")
//                .pattern("Cxx")
//                .pattern("yzx")
//                .group("adventure_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_bridle_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BRIDLE_71.get())
//                .requires(TreTags.ADVENTURE_BRIDLES)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_bridle")
//                .unlockedBy("has_adventure_bridle", has(TreTags.ADVENTURE_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_bridle_71_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_BRIDLE_71.get())
//                .define('w', SWTags.REFINED_LEATHER)
//                .define('x', Items.IRON_NUGGET)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("C w")
//                .pattern("AwB")
//                .pattern("xyw")
//                .group("western_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_bridle_71" ));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BRIDLE_71.get())
//                .requires(SWTags.WESTERN_BRIDLES)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_bridle")
//                .unlockedBy("has_western_bridle", has(SWTags.WESTERN_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_bridle_71_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_BRIDLE_71.get())
//                .define('w', SWTags.REFINED_LEATHER)
//                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("C w")
//                .pattern("AwB")
//                .pattern("xy ")
//                .group("english_bridle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_bridle_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BRIDLE_71.get())
//                .requires(TreTags.ENGLISH_BRIDLES)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_bridle")
//                .unlockedBy("has_english_bridle", has(TreTags.ENGLISH_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_bridle_71_from_bridle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_BRIDLE_71.get())
//                .define('w', ItemTags.CARPETS)
//                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("C w")
//                .pattern("AwB")
//                .pattern("xy ")
//                .group("cloth_bridle")
//                .unlockedBy("has_carpets", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/cloth_bridle_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.CLOTH_BRIDLE_71.get())
//                .requires(TreTags.CLOTH_BRIDLES)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("cloth_bridle")
//                .unlockedBy("has_cloth_bridle", has(TreTags.CLOTH_BRIDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/cloth_bridle_71_from_bridle"));
//
//
//    //SADDLES
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_SADDLE_71.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xxx")
//                .pattern("BxA")
//                .pattern("yxC")
//                .group("adventure_saddle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_saddle_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_SADDLE_71.get())
//                .requires(SWTags.ADVENTURE_SADDLES)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_saddle")
//                .unlockedBy("has_adventure_saddle", has(SWTags.ADVENTURE_SADDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_saddle_71" + "_from_saddle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_SADDLE_71.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', Items.IRON_NUGGET)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xAx")
//                .pattern("xBx")
//                .pattern("yxC")
//                .group("western_saddle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_saddle_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_SADDLE_71.get())
//                .requires(SWTags.WESTERN_SADDLES)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_saddle")
//                .unlockedBy("has_western_saddle", has(SWTags.WESTERN_SADDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_saddle_71" + "_from_saddle"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_SADDLE_71.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', Items.TRIPWIRE_HOOK)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern(" Ax")
//                .pattern("xxB")
//                .pattern("yxC")
//                .group("english_saddle")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_saddle_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_SADDLE_71.get())
//                .requires(TreTags.ENGLISH_SADDLES)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_saddle")
//                .unlockedBy("has_english_saddle", has(TreTags.ENGLISH_SADDLES))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_saddle_71" + "_from_saddle"));
//
//
//    //BLANKETS
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_BLANKET_71.get())
//                .define('y', ItemTags.CARPETS)
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("yxy")
//                .pattern("AyB")
//                .pattern("yCy")
//                .group("adventure_blanket")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_blanket_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BLANKET_71.get())
//                .requires(TreTags.ADVENTURE_BLANKETS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_blanket")
//                .unlockedBy("has_adventure_blanket", has(TreTags.ADVENTURE_BLANKETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_blanket_71" + "_from_blanket"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_BLANKET_71.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xyx")
//                .pattern("xxx")
//                .pattern("ACB")
//                .group("western_blanket")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_blanket_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BLANKET_71.get())
//                .requires(SWTags.WESTERN_BLANKETS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_blanket")
//                .unlockedBy("has_western_blanket", has(SWTags.WESTERN_BLANKETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_blanket_71" + "_from_blanket"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_BLANKET_71.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xyx")
//                .pattern("xx ")
//                .pattern("ACB")
//                .group("english_blanket")
//                .unlockedBy("has_carpets", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_blanket_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BLANKET_71.get())
//                .requires(SWTags.ENGLISH_BLANKETS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_blanket")
//                .unlockedBy("has_english_blanket", has(SWTags.ENGLISH_BLANKETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_blanket_71" + "_from_blanket"));
//
//
//    //BREAST COLLARS
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_BREAST_COLLAR_71.get())
//                .define('y', net.minecraftforge.common.Tags.Items.INGOTS_IRON)
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xCx")
//                .pattern("AyB")
//                .pattern(" y ")
//                .group("adventure_breast_collar")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/advenuture_breast_collar_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BREAST_COLLAR_71.get())
//                .requires(TreTags.ADVENTURE_BREAST_COLLARS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_breast_collar")
//                .unlockedBy("has_adventure_breast_collar", has(TreTags.ADVENTURE_BREAST_COLLARS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_breast_collar_71" + "_from_breast_collar"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_BREAST_COLLAR_71.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("yCy")
//                .pattern("AxB")
//                .pattern(" y ")
//                .group("western_breast_collar")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_breast_collar_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BREAST_COLLAR_71.get())
//                .requires(SWTags.WESTERN_BREAST_COLLARS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_breast_collar")
//                .unlockedBy("has_western_breast_collar", has(SWTags.WESTERN_BREAST_COLLARS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_breast_collar_71" + "_from_breast_collar"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_BREAST_COLLAR_71.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xCx")
//                .pattern("A B")
//                .pattern(" x ")
//                .group("english_breast_collar")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_breast_collar_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BREAST_COLLAR_71.get())
//                .requires(TreTags.ENGLISH_BREAST_COLLARS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_breast_collar")
//                .unlockedBy("has_english_breast_collar", has(TreTags.ENGLISH_BREAST_COLLARS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_breast_collar_71" + "_from_breast_collar"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_BREAST_COLLAR_71.get())
//                .define('x', ItemTags.WOOL)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xCx")
//                .pattern("A B")
//                .pattern(" x ")
//                .group("cloth_breast_collar")
//                .unlockedBy("has_wool", has(ItemTags.WOOL))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/cloth_breast_collar_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.CLOTH_BREAST_COLLAR_71.get())
//                .requires(TreTags.CLOTH_BREAST_COLLARS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("cloth_breast_collar")
//                .unlockedBy("has_cloth_breast_collar", has(TreTags.CLOTH_BREAST_COLLARS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/cloth_breast_collar_71" + "_from_breast_collar"));
//
//
//    //GIRTH STRAPS
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_GIRTH_STRAP_71.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', net.minecraftforge.common.Tags.Items.INGOTS_IRON)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("yxA")
//                .pattern(" xB")
//                .pattern("Cxy")
//                .group("adventure_girth_strap")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_girth_strap_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_GIRTH_STRAP_71.get())
//                .requires(TreTags.ADVENTURE_GIRTH_STRAPS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_girth_strap")
//                .unlockedBy("has_adventure_girth_strap", has(TreTags.ADVENTURE_GIRTH_STRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_girth_strap_71" + "_from_girth_strap"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_GIRTH_STRAP_71.get())
//                .define('x', Items.IRON_NUGGET)
//                .define('y', ItemTags.CARPETS)
//                .define('z', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xyA")
//                .pattern(" zB")
//                .pattern("Cyx")
//                .group("western_girth_strap")
//                .unlockedBy("has_western_girth_strap", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_girth_strap_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_GIRTH_STRAP_71.get())
//                .requires(SWTags.WESTERN_GIRTH_STRAPS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_girth_strap")
//                .unlockedBy("has_western_girth_strap", has(SWTags.WESTERN_GIRTH_STRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_girth_strap_71" + "_from_girth_strap"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_GIRTH_STRAP_71.get())
//                .define('x', Items.IRON_NUGGET)
//                .define('z', SWTags.REFINED_LEATHER)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xz ")
//                .pattern("ACB")
//                .pattern(" zx")
//                .group("english_girth_strap")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_girth_strap_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_GIRTH_STRAP_71.get())
//                .requires(TreTags.ENGLISH_GIRTH_STRAPS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_girth_strap")
//                .unlockedBy("has_english_girth_strap", has(TreTags.ENGLISH_GIRTH_STRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_girth_strap_71" + "_from_girth_strap"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_GIRTH_STRAP_71.get())
//                .define('x', Items.IRON_NUGGET)
//                .define('y', ItemTags.WOOL)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("xyA")
//                .pattern(" yB")
//                .pattern("Cyx")
//                .group("cloth_girth_strap")
//                .unlockedBy("has_wool", has(ItemTags.WOOL))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/cloth_girth_strap_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.CLOTH_GIRTH_STRAP_71.get())
//                .requires(TreTags.CLOTH_GIRTH_STRAPS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("cloth_girth_strap")
//                .unlockedBy("has_cloth_girth_strap", has(TreTags.CLOTH_GIRTH_STRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/cloth_girth_strap_71" + "_from_girth_strap"));
//
//    //LEG WRAPS
//        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_LEG_WRAPS_71.get())
//                .define('x', SWTags.REFINED_LEATHER)
//                .define('y', Items.IRON_NUGGET)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x x")
//                .pattern("A B")
//                .pattern("yCy")
//                .group("adventure_leg_wraps")
//                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_leg_wraps_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_LEG_WRAPS_71.get())
//                .requires(TreTags.ADVENTURE_LEG_WRAPS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("adventure_leg_wraps")
//                .unlockedBy("has_adventure_leg_wraps", has(TreTags.ADVENTURE_LEG_WRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/adventure_leg_wraps_71" + "_from_leg_wraps"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_LEG_WRAPS_71.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', Items.DRIED_KELP)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x x")
//                .pattern("xCx")
//                .pattern("AyB")
//                .group("western_leg_wraps")
//                .unlockedBy("has_carpets", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_leg_wraps_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_LEG_WRAPS_71.get())
//                .requires(SWTags.WESTERN_LEG_WRAPS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("western_leg_wraps")
//                .unlockedBy("has_western_leg_wraps", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/western_leg_wraps_71" + "_from_leg_wraps"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_LEG_WRAPS_71.get())
//                .define('x', ItemTags.CARPETS)
//                .define('y', Items.DRIED_KELP)
//                .define('A', TreDyeTags.DYE_71)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x x")
//                .pattern("A B")
//                .pattern("yCy")
//                .group("english_leg_wraps")
//                .unlockedBy("has_carpets", has(ItemTags.CARPETS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_leg_wraps_71"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_LEG_WRAPS_71.get())
//                .requires(SWTags.ENGLISH_LEG_WRAPS)
//                .requires(TreDyeTags.DYE_71)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("english_leg_wraps")
//                .unlockedBy("has_english_leg_wraps", has(SWTags.ENGLISH_LEG_WRAPS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "71_topaz/english_leg_wraps_71" + "_from_leg_wraps"));
    //SADDLE BAGS
        ShapedRecipeBuilder.shaped(TackShopItems.SADDLE_BAG_1.get())
                .define('x', ItemTags.CARPETS)
                .define('y', Items.CHEST)
                .define('z', SWTags.REFINED_LEATHER)
                .define('C', ItemTags.SAPLINGS)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .pattern("xBx")
                .pattern("zAz")
                .pattern("yCy")
                .group("saddle_bags")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1/saddle_bag_1"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.SADDLE_BAG_1.get())
                .requires(SWTags.SADDLE_BAGS)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .group("saddle_bags")
                .unlockedBy("has_saddle_bags", has(SWTags.SADDLE_BAGS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1/dyed_saddle_bag_1"));
        ShapedRecipeBuilder.shaped(TackShopItems.SADDLE_BAG_7.get())
                .define('x', ItemTags.CARPETS)
                .define('y', Items.CHEST)
                .define('z', SWTags.REFINED_LEATHER)
                .define('C', ItemTags.SAPLINGS)
                .define('A', TreDyeTags.DYE_7)
                .define('B', TreDyeTags.TONER_JEWEL)
                .pattern("xBx")
                .pattern("zAz")
                .pattern("yCy")
                .group("saddle_bags")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "7/saddle_bag_7"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.SADDLE_BAG_7.get())
                .requires(SWTags.SADDLE_BAGS)
                .requires(TreDyeTags.DYE_7)
                .requires(TreDyeTags.TONER_JEWEL)
                .requires(ItemTags.SAPLINGS)
                .group("saddle_bags")
                .unlockedBy("has_saddle_bags", has(SWTags.SADDLE_BAGS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "7/dyed_saddle_bag_7"));

//CLOTH ARMOR
        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_HORSE_ARMOR_1.get())
                .define('y', ItemTags.CARPETS)
                .define('C', ItemTags.SAPLINGS)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .pattern("yBy")
                .pattern("yAy")
                .pattern("yCy")
                .group("cloth_armor")
                .unlockedBy("has_banner", has(ItemTags.BANNERS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1/cloth_horse_armor_1"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.CLOTH_HORSE_ARMOR_1.get())
                .requires(TreTags.CLOTH_ARMOR)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .group("cloth_armor")
                .unlockedBy("has_cloth_armor", has(TreTags.CLOTH_ARMOR))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1/dyed_cloth_horse_armor_1"));
        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_HORSE_ARMOR_7.get())
                .define('y', ItemTags.CARPETS)
                .define('C', ItemTags.SAPLINGS)
                .define('A', TreDyeTags.DYE_7)
                .define('B', TreDyeTags.TONER_JEWEL)
                .pattern("yBy")
                .pattern("yAy")
                .pattern("yCy")
                .group("cloth_armor")
                .unlockedBy("has_banner", has(ItemTags.BANNERS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "7/cloth_horse_armor_7"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.CLOTH_HORSE_ARMOR_7.get())
                .requires(TreTags.CLOTH_ARMOR)
                .requires(TreDyeTags.DYE_7)
                .requires(TreDyeTags.TONER_JEWEL)
                .requires(ItemTags.SAPLINGS)
                .group("cloth_armor")
                .unlockedBy("has_cloth_armor", has(TreTags.CLOTH_ARMOR))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "7/dyed_cloth_horse_armor_7"));






//        ShapedRecipeBuilder.shaped(TackShopItems.FLAG_1.get())
//                .define('x', Items.STRING)
//                .define('y', Items.IRON_NUGGET)
//                .define('z', (ItemTags.BANNERS))
//                .define('C', ItemTags.SAPLINGS)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .pattern("yzx")
//                .pattern("yAB")
//                .pattern("yC ")
//                .group("flags")
//                .group("flags")
//                .unlockedBy("has_banner", has(ItemTags.BANNERS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "flag_1/flag_1"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.FLAG_1.get())
//                .requires(TreTags.FLAGS)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("flags")
//                .unlockedBy("has_flag", has(TreTags.FLAGS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "flag_1/dyed_flag_1"));
//        ShapedRecipeBuilder.shaped(TackShopItems.FLAG_BUTTERFLY_1.get())
//                .define('x', Items.STRING)
//                .define('y', Items.IRON_NUGGET)
//                .define('z', (ItemTags.BANNERS))
//                .define('C', TreTags.BUTTERFLY)
//                .define('A', TreDyeTags.DYE_1)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .pattern("yzx")
//                .pattern("yAB")
//                .pattern("yC ")
//                .group("flags")
//                .unlockedBy("has_butterfly", has(TreTags.BUTTERFLY))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "butterfly_flag_1/flag_1_butterfly"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.FLAG_BUTTERFLY_1.get())
//                .requires(TreTags.FLAGS_PLAIN)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .requires(TreTags.BUTTERFLY)
//                .group("flags")
//                .unlockedBy("has_flag", has(TreTags.FLAGS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "butterfly_flag_1/dyed_flag_1_butterfly"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.FLAG_BUTTERFLY_1.get())
//                .requires(TreTags.FLAGS_BUTTERFLY)
//                .requires(TreDyeTags.DYE_1)
//                .requires(TreDyeTags.TONER_PASTEL)
//                .group("flags")
//                .unlockedBy("has_butterfly_flag", has(TreTags.FLAGS_BUTTERFLY))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "butterfly_flag_1/dyed_butterfly_flag_1_butterfly"));
//
//        ShapedRecipeBuilder.shaped(TackShopItems.FLAG_7.get())
//                .define('x', Items.STRING)
//                .define('y', Items.IRON_NUGGET)
//                .define('z', (ItemTags.BANNERS))
//                .define('C', ItemTags.SAPLINGS)
//                .define('A', TreDyeTags.DYE_7)
//                .define('B', TreDyeTags.TONER_JEWEL)
//                .pattern("yzx")
//                .pattern("yAB")
//                .pattern("yC ")
//                .group("flags")
//                .group("flags")
//                .unlockedBy("has_banner", has(ItemTags.BANNERS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "flag_7/flag_7"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.FLAG_7.get())
//                .requires(TreTags.FLAGS)
//                .requires(TreDyeTags.DYE_7)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(ItemTags.SAPLINGS)
//                .group("flags")
//                .unlockedBy("has_flag", has(TreTags.FLAGS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "flag_7/dyed_flag_7"));
//        ShapedRecipeBuilder.shaped(TackShopItems.FLAG_BUTTERFLY_7.get())
//                .define('x', Items.STRING)
//                .define('y', Items.IRON_NUGGET)
//                .define('z', (ItemTags.BANNERS))
//                .define('C', TreTags.BUTTERFLY)
//                .define('A', TreDyeTags.DYE_7)
//                .define('B', TreDyeTags.TONER_PASTEL)
//                .pattern("yzx")
//                .pattern("yAB")
//                .pattern("yC ")
//                .group("flags")
//                .unlockedBy("has_butterfly", has(TreTags.BUTTERFLY))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "butterfly_flag_7/flag_7_butterfly"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.FLAG_BUTTERFLY_7.get())
//                .requires(TreTags.FLAGS_PLAIN)
//                .requires(TreDyeTags.DYE_7)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .requires(TreTags.BUTTERFLY)
//                .group("flags")
//                .unlockedBy("has_flag", has(TreTags.FLAGS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "butterfly_flag_7/dyed_flag_7_butterfly"));
//        ShapelessRecipeBuilder.shapeless(TackShopItems.FLAG_BUTTERFLY_7.get())
//                .requires(TreTags.FLAGS_BUTTERFLY)
//                .requires(TreDyeTags.DYE_7)
//                .requires(TreDyeTags.TONER_JEWEL)
//                .group("flags")
//                .unlockedBy("has_butterfly_flag", has(TreTags.FLAGS_BUTTERFLY))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "butterfly_flag_7/dyed_butterfly_flag_7_butterfly"));



/// TACK RECIPES
        /// STANDARD COLOR DYE TACK
//        DyeColor[] var0 = DyeColor.values();
//        int var1 = var0.length;
//
//        for (int var1 = 0; var1 < var1; ++var1) {
//            DyeColor color = var0[var1];
//            flymaskDyed(color, pFinishedRecipeConsumer);
//            flagDyed(color, pFinishedRecipeConsumer);
//            //quarterSheetDyed(color, pFinishedRecipeConsumer);
//
//        }
//
//    }
//private void flymaskDyed(DyeColor color, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
//            ShapedRecipeBuilder.shaped((ItemLike)((RegistryObject)TackShopItems.FLYMASKS_DYED.get(color.getId())).get())
//                .define('x', Items.STRING)
//                .define('y', SWTags.REFINED_LEATHER)
//                .define('A', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_carpet")))
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("x y")
//                .pattern("AxA")
//                .pattern("xCx")
//                .group("halter")
//                .unlockedBy("has_string", has(Items.STRING))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "dyed_flymask/flymask_"+ color.getName()));
//        ShapelessRecipeBuilder.shapeless((ItemLike)((RegistryObject)TackShopItems.FLYMASKS_DYED.get(color.getId())).get())
//                .requires(TreTags.FLYMASKS)
//                .requires(color.getTag())
//                .requires(ItemTags.SAPLINGS)
//                .unlockedBy("has_flymasks", has(TreTags.FLYMASKS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "dyed_flymask/dyed_flymask_"+ color.getName()));
//}
//
//private void flagDyed(DyeColor color, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
//        ShapedRecipeBuilder.shaped((ItemLike)((RegistryObject)TackShopItems.FLAGS_DYED.get(color.getId())).get())
//                .define('x', Items.STRING)
//                .define('y', Items.IRON_NUGGET)
//                .define('A', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_banner")))
//                .define('C', ItemTags.SAPLINGS)
//                .pattern("yAx")
//                .pattern("yxx")
//                .pattern("yC ")
//                .group("flags")
//                .unlockedBy("has_banner", has(ItemTags.BANNERS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "dyed_flags/flag_"+ color.getName()));
//        ShapelessRecipeBuilder.shapeless((ItemLike)((RegistryObject)TackShopItems.FLAGS_DYED.get(color.getId())).get())
//                .requires(TreTags.FLAGS)
//                .requires(color.getTag())
//                .requires(ItemTags.SAPLINGS)
//                .unlockedBy("has_flag", has(TreTags.FLAGS))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "dyed_flags/dyed_flag_"+ color.getName()));
    }

//    private void quarterSheetDyed(DyeColor color, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
//            ShapedRecipeBuilder.shaped((ItemLike)((RegistryObject)TackShopItems.QUARTER_SHEETS_DYED.get(color.getId())).get())
//                    .define('#', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_wool")))
//                    .define('x', Items.LILY_OF_THE_VALLEY)
//                    .pattern("###")
//                    .pattern(" ##")
//                    .pattern(" x ")
//
//                    .group("quarter_sheet")
//                    .unlockedBy("has_wool", has(ItemTags.WOOL))
//                    .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "quarter_sheet/quarter_sheet_" + color.getName()));
//
//            ShapelessRecipeBuilder.shapeless((ItemLike)((RegistryObject)TackShopItems.QUARTER_SHEETS_DYED.get(color.getId())).get())
//                    .requires(TreTags.QUARTER_SHEETS)
//                    .requires(color.getTag())
//                    .requires(Items.LILY_OF_THE_VALLEY)
//                    .group("quarter_sheet")
//                    .unlockedBy("has_quarter_sheet", has(TreTags.QUARTER_SHEETS))
//                    .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "quarter_sheet/dyed_quarter_sheet_" + color.getName()));
//        }
    }