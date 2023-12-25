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
//        ShapedRecipeBuilder.shaped(TackShopItems.RAINBOW_INA_BOTTLE.get(), 3)
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
//        ShapelessRecipeBuilder.shapeless(TackShopItems.QUARTER_SHEET_MORPHO_RAINBOW.get())
//                .requires(TreTags.QUARTER_SHEETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .requires(Items.BLACK_DYE)
//                .group("quarter_sheet")
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "rainbow/quarter_sheet_MORPHO_rainbow"));


/// CRAFTING RECIPES
        // BUTTERFLYS FOR DECOR
//        ShapedRecipeBuilder.shaped(TackShopItems.BUTTERFLY.get(), 3)
//                .define('A', SWTags.STAR_WORMS)
//                .define('B', Items.OAK_SAPLING)
//                .define('C', Items.BLUE_ORCHID)
//                .define('D', Items.LIGHT_BLUE_DYE)
//
//                .pattern("DDD")
//                .pattern("DAD")
//                .pattern("CBC")
//
//                .unlockedBy("has_worms", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(SWTags.STAR_WORMS).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(TackShopItems.BUTTERFLY_MONARCH.get(), 3)
//                .define('A', SWTags.STAR_WORMS)
//                .define('B', Items.OAK_SAPLING)
//                .define('C', Items.DANDELION)
//                .define('D', Items.YELLOW_DYE)
//
//                .pattern("DDD")
//                .pattern("DAD")
//                .pattern("CBC")
//
//                .unlockedBy("has_worms", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(SWTags.STAR_WORMS).build()))
//                .save(pFinishedRecipeConsumer);

/// PASTEL GENERATION
    //PASTURE& QUARTER BLANKETS    
        ShapedRecipeBuilder.shaped(TackShopItems.QUARTER_SHEET_MORPHO.get())
                .define('#', ItemTags.WOOL)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .define('C', Items.LILY_OF_THE_VALLEY)
                .pattern("###")
                .pattern(" ##")
                .pattern("ACB")

                .group("quarter_sheet")
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/quarter_sheet_morpho"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.QUARTER_SHEET_MORPHO.get())
                .requires(TreTags.QUARTER_SHEETS)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(Items.LILY_OF_THE_VALLEY)
                .group("quarter_sheet")
                .unlockedBy("has_quarter_sheet", has(TreTags.QUARTER_SHEETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/dyed_quarter_sheet_morpho"));
        
        ShapedRecipeBuilder.shaped(TackShopItems.PASTURE_BLANKET_MORPHO.get())
                .define('#', ItemTags.CARPETS)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .define('C', ItemTags.SAPLINGS)
                .pattern(" ##")
                .pattern("A#B")
                .pattern("#C#")
                .group("pasture_blanket")
                .unlockedBy("has_carpet", has(ItemTags.CARPETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/pasture_blanket_morpho"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_MORPHO.get())
                .requires(SWTags.PASTURE_BLANKETS)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .group("pasture_blanket")
                .unlockedBy("has_pasture_blanket", has(SWTags.PASTURE_BLANKETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/dyed_pasture_blanket_morpho"));

        ShapedRecipeBuilder.shaped(TackShopItems.PASTURE_BLANKET_MORPHO_ARMORED.get())
                .define('#', ItemTags.CARPETS)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .define('C', ItemTags.SAPLINGS)
                .define('y', Items.IRON_CHESTPLATE)
                .pattern("y##")
                .pattern("A#B")
                .pattern("#C#")
                .group("pasture_blanket_armored")
                .unlockedBy("has_carpet", has(ItemTags.CARPETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/pasture_blanket_armored_morpho"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_MORPHO.get())
                .requires(SWTags.PASTURE_BLANKETS_ARMORED)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .group("pasture_blanket_armored")
                .unlockedBy("has_pasture_blanket_armored", has(SWTags.PASTURE_BLANKETS_ARMORED))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/dyed_pasture_blanket_armored_morpho"));

    //HALTER & FLYMASK
        ShapedRecipeBuilder.shaped(TackShopItems.HALTER_MORPHO.get())
                .define('x', (ItemTags.CARPETS))
                .define('y', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .define('C', ItemTags.SAPLINGS)
                .pattern("x x")
                .pattern("AxB")
                .pattern("yCx")
                .group("halter")
                .unlockedBy("has_iron_nugget", has(net.minecraftforge.common.Tags.Items.NUGGETS_IRON))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/halter_morpho"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.HALTER_MORPHO.get())
                .requires(SWTags.HALTERS)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .unlockedBy("has_halters", has(SWTags.HALTERS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/dye_halter_morpho"));

        ShapedRecipeBuilder.shaped(TackShopItems.FLYMASK_MORPHO.get())
                .define('x', Items.STRING)
                .define('y', SWTags.REFINED_LEATHER)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .define('C', ItemTags.SAPLINGS)
                .pattern("x y")
                .pattern("AxB")
                .pattern("xCx")
                .group("halter")
                .unlockedBy("has_string", has(Items.STRING))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/flymask_morpho"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.FLYMASK_MORPHO.get())
                .requires(TreTags.FLYMASKS)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .unlockedBy("has_flymasks", has(TreTags.FLYMASKS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/dye_flymask_morpho"));

    //BRIDLES
        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_BRIDLE_MORPHO.get())
                .define('x', SWTags.REFINED_LEATHER)
                .define('y', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
                .define('z', Items.TRIPWIRE_HOOK)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .define('C', ItemTags.SAPLINGS)
                .pattern("ABx")
                .pattern("Cxx")
                .pattern("yzx")
                .group("adventure_bridle")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/adventure_bridle_morpho"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BRIDLE_MORPHO.get())
                .requires(TreTags.ADVENTURE_BRIDLES)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .group("adventure_bridle")
                .unlockedBy("has_adventure_bridle", has(TreTags.ADVENTURE_BRIDLES))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/adventure_bridle_morpho_from_bridle"));

        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_BRIDLE_MORPHO.get())
                .define('w', SWTags.REFINED_LEATHER)
                .define('x', Items.IRON_NUGGET)
                .define('y', Items.TRIPWIRE_HOOK)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .define('C', ItemTags.SAPLINGS)
                .pattern("C w")
                .pattern("AwB")
                .pattern("xyw")
                .group("western_bridle")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/western_bridle_morpho" ));
        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BRIDLE_MORPHO.get())
                .requires(SWTags.WESTERN_BRIDLES)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .group("western_bridle")
                .unlockedBy("has_western_bridle", has(SWTags.WESTERN_BRIDLES))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/western_bridle_morpho_from_bridle"));

        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_BRIDLE_MORPHO.get())
                .define('w', SWTags.REFINED_LEATHER)
                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
                .define('y', Items.TRIPWIRE_HOOK)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .define('C', ItemTags.SAPLINGS)
                .pattern("C w")
                .pattern("AwB")
                .pattern("xy ")
                .group("english_bridle")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/english_bridle_morpho"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BRIDLE_MORPHO.get())
                .requires(TreTags.ENGLISH_BRIDLES)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .group("english_bridle")
                .unlockedBy("has_english_bridle", has(TreTags.ENGLISH_BRIDLES))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/english_bridle_morpho_from_bridle"));

        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_BRIDLE_MORPHO.get())
                .define('w', ItemTags.CARPETS)
                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
                .define('y', Items.TRIPWIRE_HOOK)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_PASTEL)
                .define('C', ItemTags.SAPLINGS)
                .pattern("C w")
                .pattern("AwB")
                .pattern("xy ")
                .group("cloth_bridle")
                .unlockedBy("has_carpets", has(ItemTags.CARPETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/cloth_bridle_morpho"));
        ShapelessRecipeBuilder.shapeless(TackShopItems.CLOTH_BRIDLE_MORPHO.get())
                .requires(TreTags.CLOTH_BRIDLES)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_PASTEL)
                .requires(ItemTags.SAPLINGS)
                .group("cloth_bridle")
                .unlockedBy("has_cloth_bridle", has(TreTags.CLOTH_BRIDLES))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "1_rose/cloth_bridle_morpho_from_bridle"));


    //SADDLES
        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_SADDLE_MORPHO.get())
                .define('x', SWTags.REFINED_LEATHER)
                .define('y', Items.TRIPWIRE_HOOK)
                .pattern("xxx")
                .pattern("xxx")
                .pattern("yx ")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_SADDLE_MORPHO.get())
                .define('x', SWTags.REFINED_LEATHER)
                .define('y', Items.IRON_NUGGET)
                .define('z', color.getTag())
                .pattern("xzx")
                .pattern("xxx")
                .pattern("yxx")
                .group("western_saddle")
                .unlockedBy("has_western_saddle", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_saddle/western_saddle_" + color.getName()));
        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_SADDLE_MORPHO.get())
                .requires(SWTags.WESTERN_SADDLES)
                .requires(color.getTag())
                .group("western_saddle")
                .unlockedBy("has_western_saddle", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_saddle/western_saddle_" + color.getName() + "_from_saddle"));

        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_SADDLE_MORPHO.get())
                .define('x', SWTags.REFINED_LEATHER)
                .define('y', Items.TRIPWIRE_HOOK)
                .define('z', DyeColor.BLACK.getTag())
                .pattern(" zx").pattern("xxx")
                .pattern("yx ")
                .group("english_saddle")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);

    //BLANKETS
        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_BLANKET_MORPHO.get())
                .define('y', ItemTags.CARPETS)
                .define('x', SWTags.REFINED_LEATHER)
                .pattern("yxy")
                .pattern("yyy")
                .pattern("yyy")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_BLANKET_MORPHO.get())
                .define('x', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_carpet")))
                .define('y', SWTags.REFINED_LEATHER).pattern("xyx")
                .pattern("xxx")
                .group("western_blanket")
                .unlockedBy("has_western_blanket", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_blanket/western_blanket_" + color.getName()));
        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BLANKET_MORPHO.get())
                .requires(SWTags.WESTERN_BLANKETS)
                .requires(color.getTag())
                .group("western_blanket")
                .unlockedBy("has_western_blanket", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_blanket/western_blanket_" + color.getName() + "_from_blanket"));

        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_BLANKET_MORPHO.get())
                .define('x', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_carpet")))
                .define('y', SWTags.REFINED_LEATHER)
                .pattern("xyx")
                .pattern("xx ")
                .group("english_blanket")
                .unlockedBy("has_english_blanket", has(ItemTags.CARPETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "english_blanket/english_blanket_" + color.getName()));
        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BLANKET_MORPHO.get())
                .requires(SWTags.ENGLISH_BLANKETS)
                .requires(color.getTag())
                .group("english_blanket")
                .unlockedBy("has_english_blanket", has(ItemTags.CARPETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "english_blanket/english_blanket_" + color.getName() + "_from_blanket"));


        //BREAST COLLARS
        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_BREAST_COLLAR_MORPHO.get())
                .define('y', net.minecraftforge.common.Tags.Items.INGOTS_IRON)
                .define('x', SWTags.REFINED_LEATHER)
                .pattern("x x")
                .pattern(" y ")
                .pattern(" y ")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_BREAST_COLLAR_MORPHO.get())
                .define('x', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_carpet")))
                .define('y', SWTags.REFINED_LEATHER)
                .pattern("y y")
                .pattern(" x ")
                .pattern(" y ")
                .group("western_breast_collar")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_breast_collar/western_breast_collar_" + color.getName()));
        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BREAST_COLLAR_MORPHO.get())
                .requires(SWTags.WESTERN_BREAST_COLLARS)
                .requires(color.getTag())
                .group("western_breast_collar")
                .unlockedBy("has_western_breast_collar", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_breast_collar/western_breast_collar_" + color.getName() + "_from_breast_collar"));

        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_BREAST_COLLAR_MORPHO.get())
                .define('x', SWTags.REFINED_LEATHER)
                .define('y', DyeColor.BLACK.getTag())
                .pattern("x x")
                .pattern(" y ")
                .pattern(" x ")
                .group("english_breast_collar")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_BREAST_COLLAR_MORPHO.get())
                .define('x', SWTags.REFINED_LEATHER)
                .define('y', DyeColor.BLACK.getTag())
                .pattern("x x")
                .pattern(" y ")
                .pattern(" x ")
                .group("english_breast_collar")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);


        //GIRTH STRAPS
        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_GIRTH_STRAP_MORPHO.get())
                .define('x', SWTags.REFINED_LEATHER)
                .define('y', net.minecraftforge.common.Tags.Items.INGOTS_IRON)
                .pattern("yx ")
                .pattern(" x ")
                .pattern(" xy")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_GIRTH_STRAP_MORPHO.get())
                .define('x', Items.IRON_NUGGET)
                .define('y', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_carpet")))
                .define('z', SWTags.REFINED_LEATHER)
                .pattern("xy ")
                .pattern(" z ")
                .pattern(" yx")
                .group("western_girth_strap")
                .unlockedBy("has_western_girth_strap", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_girth_strap/western_girth_strap_" + color.getName()));
        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_GIRTH_STRAP_MORPHO.get())
                .requires(SWTags.WESTERN_GIRTH_STRAPS)
                .requires(color.getTag())
                .group("western_girth_strap")
                .unlockedBy("has_western_girth_strap", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_girth_strap/western_girth_strap_" + color.getName() + "_from_girth_strap"));

        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_GIRTH_STRAP_MORPHO.get())
                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
                .define('y', Items.BLACK_CARPET)
                .define('z', SWTags.REFINED_LEATHER)
                .pattern("xz ")
                .pattern(" y ")
                .pattern(" zx")
                .group("english_girth_strap")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TackShopItems.CLOTH_GIRTH_STRAP_MORPHO.get())
                .define('x', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
                .define('y', Items.BLACK_CARPET)
                .define('z', SWTags.REFINED_LEATHER)
                .pattern("xz ")
                .pattern(" y ")
                .pattern(" zx")
                .group("english_girth_strap")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);

        //LEG WRAPS    
        ShapedRecipeBuilder.shaped(TackShopItems.ADVENTURE_LEG_WRAPS_MORPHO.get())
                .define('x', SWTags.REFINED_LEATHER)
                .define('y', net.minecraftforge.common.Tags.Items.NUGGETS_IRON)
                .pattern("x x")
                .pattern("y y")
                .unlockedBy("has_refined_leather", has(SWTags.REFINED_LEATHER))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TackShopItems.WESTERN_LEG_WRAPS_MORPHO.get())
                .define('x', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_carpet")))
                .define('y', Items.DRIED_KELP)
                .pattern("x x")
                .pattern("x x")
                .pattern(" y ")
                .group("western_leg_wraps")
                .unlockedBy("has_western_leg_wraps", has(ItemTags.CARPETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_leg_wraps/western_leg_wraps_" + color.getName()));
        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_LEG_WRAPS_MORPHO.get())
                .requires(SWTags.WESTERN_LEG_WRAPS)
                .requires(color.getTag())
                .group("western_leg_wraps")
                .unlockedBy("has_western_leg_wraps", has(ItemTags.CARPETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "western_leg_wraps/western_leg_wraps_" + color.getName() + "_from_leg_wraps"));

        ShapedRecipeBuilder.shaped(TackShopItems.ENGLISH_LEG_WRAPS_MORPHO.get())
                .define('x', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_carpet")))
                .define('y', Items.DRIED_KELP)
                .pattern("x x")
                .pattern("x x")
                .pattern("y y")
                .group("english_leg_wraps")
                .unlockedBy("has_english_leg_wraps", has(ItemTags.CARPETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "english_leg_wraps/english_leg_wraps_" + color.getName()));
        ShapelessRecipeBuilder var10000 = ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_LEG_WRAPS_MORPHO.get())
                .requires(SWTags.ENGLISH_LEG_WRAPS)
                .requires(color.getTag())
                .group("english_leg_wraps")
                .unlockedBy("has_english_leg_wraps", has(ItemTags.CARPETS));


/// TACK RECIPES
        /// STANDARD COLOR DYE TACK
//        DyeColor[] var2 = DyeColor.values();
//        int var3 = var2.length;
//
//        for (int var4 = 0; var4 < var3; ++var4) {
//            DyeColor color = var2[var4];
//            quarterSheetDyed(color, pFinishedRecipeConsumer);
//        }
//
//    }
//
//    private void quarterSheetDyed(DyeColor color, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
//            ShapedRecipeBuilder.shaped((ItemLike)((RegistryObject)TackShopItems.QUARTER_SHEETS_DYED_MORPHO.get())
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
//            ShapelessRecipeBuilder.shapeless((ItemLike)((RegistryObject)TackShopItems.QUARTER_SHEETS_DYED_MORPHO.get())
//                    .requires(TreTags.QUARTER_SHEETS)
//                    .requires(color.getTag())
//                    .requires(Items.LILY_OF_THE_VALLEY)
//                    .group("quarter_sheet")
//                    .unlockedBy("has_quarter_sheet", has(TreTags.QUARTER_SHEETS))
//                    .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "quarter_sheet/dyed_quarter_sheet_" + color.getName()));
        }
    }