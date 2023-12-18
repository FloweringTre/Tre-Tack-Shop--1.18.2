package com.kyraltre.tretackshop.datagen;

import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.registry.SWTags;
import com.kyraltre.tretackshop.registry.TackShopItems;
import com.kyraltre.tretackshop.registry.TreTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
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
//
////RAINBOW TACK ITEMS CRAFTING
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_RAINBOW.get())
//                .requires(SWTags.PASTURE_BLANKETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_RAINBOW_ARMORED.get())
//                .requires(SWTags.PASTURE_BLANKETS_ARMORED)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.HALTER_RAINBOW.get())
//                .requires(SWTags.HALTERS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_SADDLE_RAINBOW.get())
//                .requires(SWTags.ADVENTURE_SADDLES)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_SADDLE_RAINBOW.get())
//                .requires(TreTags.ENGLISH_SADDLES)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_SADDLE_RAINBOW.get())
//                .requires(SWTags.WESTERN_SADDLES)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BLANKET_RAINBOW.get())
//                .requires(TreTags.ADVENTURE_BLANKETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BLANKET_RAINBOW.get())
//                .requires(SWTags.ENGLISH_BLANKETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BLANKET_RAINBOW.get())
//                .requires(SWTags.WESTERN_BLANKETS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BREAST_COLLAR_RAINBOW.get())
//                .requires(TreTags.ADVENTURE_BREAST_COLLARS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BREAST_COLLAR_RAINBOW.get())
//                .requires(TreTags.ENGLISH_BREAST_COLLARS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BREAST_COLLAR_RAINBOW.get())
//                .requires(SWTags.WESTERN_BREAST_COLLARS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_LEG_WRAPS_RAINBOW.get())
//                .requires(TreTags.ADVENTURE_LEG_WRAPS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_LEG_WRAPS_RAINBOW.get())
//                .requires(SWTags.ENGLISH_LEG_WRAPS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_LEG_WRAPS_RAINBOW.get())
//                .requires(SWTags.WESTERN_LEG_WRAPS)
//                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
//                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
//                .save(pFinishedRecipeConsumer);


/// CRAFTING RECIPES


    }
}