package com.kyraltre.tretackshop.datagen;

import com.alaharranhonor.swem.forge.registry.SWEMItems;
import com.alaharranhonor.swem.forge.registry.SWEMTags;
import com.kyraltre.tretackshop.registry.TackShopItems;
import com.kyraltre.tretackshop.registry.TreTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;


public class TreRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public TreRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    @Override
        protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

//GIVING RAINBOW CHIC A RECIPE FOR THE PURPOSE OF USING IT FOR THE RAINBOW TACK
        ShapedRecipeBuilder.shaped(SWEMItems.RAINBOW_CHIC.get(), 3)
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.RED_DYE)
                .define('C', Items.ORANGE_DYE)
                .define('D', Items.YELLOW_DYE)
                .define('E', Items.GREEN_DYE)
                .define('F', Items.BLUE_DYE)
                .define('G', Items.PURPLE_DYE)

                .pattern("BCD")
                .pattern("GFE")
                .pattern("AAA")

                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

//RAINBOW TACK ITEMS CRAFTING
        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_RAINBOW.get())
                .requires(SWEMTags.PASTURE_BLANKETS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_RAINBOW_ARMORED.get())
                .requires(SWEMTags.PASTURE_BLANKETS_ARMORED)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_SADDLE_RAINBOW.get())
                .requires(SWEMTags.ADVENTURE_SADDLES)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_SADDLE_RAINBOW.get())
                .requires(TreTags.ENGLISH_SADDLES)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_SADDLE_RAINBOW.get())
                .requires(SWEMTags.WESTERN_SADDLES)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BREAST_COLLAR_RAINBOW.get())
                .requires(TreTags.ADVENTURE_BREAST_COLLARS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BREAST_COLLAR_RAINBOW.get())
                .requires(TreTags.ENGLISH_BREAST_COLLARS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BREAST_COLLAR_RAINBOW.get())
                .requires(SWEMTags.WESTERN_BREAST_COLLARS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BLANKET_RAINBOW.get())
                .requires(TreTags.ADVENTURE_BLANKETS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BREAST_COLLAR_RAINBOW.get())
                .requires(SWEMTags.ENGLISH_BLANKETS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BREAST_COLLAR_RAINBOW.get())
                .requires(SWEMTags.WESTERN_BLANKETS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_LEG_WRAPS_RAINBOW.get())
                .requires(TreTags.ADVENTURE_LEG_WRAPS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_LEG_WRAPS_RAINBOW.get())
                .requires(TreTags.ENGLISH_LEG_WRAPS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_LEG_WRAPS_RAINBOW.get())
                .requires(SWEMTags.WESTERN_LEG_WRAPS)
                .requires(SWEMItems.RAINBOW_CHIC.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWEMItems.RAINBOW_CHIC.get()).build()))
                .save(pFinishedRecipeConsumer);

        //        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BLANKET_RAINBOW.get())
//                .requires(Items.PINK_DYE)
//                .requires(Items.RED_DYE)
//                .requires(Items.ORANGE_DYE)
//                .requires(Items.YELLOW_DYE)
//                .requires(Items.GREEN_DYE)
//                .requires(Items.BLUE_DYE)
//                .requires(Items.PURPLE_DYE)
//                .requires(Items.OAK_SAPLING)
//                .requires(SWEMItems.ADVENTURE_BLANKET)
//
//                .unlockedBy("has_adventure_blanket", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(SWEMItems.ADVENTURE_BLANKET.get()).build()))
//                .save(pFinishedRecipeConsumer);

    }
}