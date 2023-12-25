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
        ShapedRecipeBuilder.shaped(TackShopItems.RAINBOW_INA_BOTTLE.get(), 3)
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
//
////RAINBOW TACK ITEMS CRAFTING
        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_RAINBOW.get())
                .requires(SWTags.PASTURE_BLANKETS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.PASTURE_BLANKET_RAINBOW_ARMORED.get())
                .requires(SWTags.PASTURE_BLANKETS_ARMORED)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.HALTER_RAINBOW.get())
                .requires(SWTags.HALTERS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_SADDLE_RAINBOW.get())
                .requires(SWTags.ADVENTURE_SADDLES)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_SADDLE_RAINBOW.get())
                .requires(TreTags.ENGLISH_SADDLES)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_SADDLE_RAINBOW.get())
                .requires(SWTags.WESTERN_SADDLES)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BLANKET_RAINBOW.get())
                .requires(TreTags.ADVENTURE_BLANKETS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BLANKET_RAINBOW.get())
                .requires(SWTags.ENGLISH_BLANKETS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BLANKET_RAINBOW.get())
                .requires(SWTags.WESTERN_BLANKETS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BREAST_COLLAR_RAINBOW.get())
                .requires(TreTags.ADVENTURE_BREAST_COLLARS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BREAST_COLLAR_RAINBOW.get())
                .requires(TreTags.ENGLISH_BREAST_COLLARS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BREAST_COLLAR_RAINBOW.get())
                .requires(SWTags.WESTERN_BREAST_COLLARS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_LEG_WRAPS_RAINBOW.get())
                .requires(TreTags.ADVENTURE_LEG_WRAPS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_LEG_WRAPS_RAINBOW.get())
                .requires(SWTags.ENGLISH_LEG_WRAPS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_LEG_WRAPS_RAINBOW.get())
                .requires(SWTags.WESTERN_LEG_WRAPS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_BRIDLE_RAINBOW.get())
                .requires(TreTags.ADVENTURE_BRIDLES)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_BRIDLE_RAINBOW.get())
                .requires(TreTags.ENGLISH_BRIDLES)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_BRIDLE_RAINBOW.get())
                .requires(SWTags.WESTERN_BRIDLES)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ADVENTURE_GIRTH_STRAP_RAINBOW.get())
                .requires(TreTags.ADVENTURE_GIRTH_STRAPS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.ENGLISH_GIRTH_STRAP_RAINBOW.get())
                .requires(TreTags.ENGLISH_GIRTH_STRAPS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.WESTERN_GIRTH_STRAP_RAINBOW.get())
                .requires(SWTags.WESTERN_GIRTH_STRAPS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.QUARTER_SHEET_WHITE_RAINBOW.get())
                .requires(TreTags.QUARTER_SHEETS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TackShopItems.QUARTER_SHEET_BLACK_RAINBOW.get())
                .requires(TreTags.QUARTER_SHEETS)
                .requires(TackShopItems.RAINBOW_INA_BOTTLE.get())
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_rainbow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TackShopItems.RAINBOW_INA_BOTTLE.get()).build()))
                .save(pFinishedRecipeConsumer);


/// CRAFTING RECIPES
        // BUTTERFLYS FOR DECOR
        ShapedRecipeBuilder.shaped(TackShopItems.BUTTERFLY.get(), 3)
                .define('A', SWTags.STAR_WORMS)
                .define('B', Items.OAK_SAPLING)
                .define('C', Items.BLUE_ORCHID)
                .define('D', Items.LIGHT_BLUE_DYE)

                .pattern("DDD")
                .pattern("DAD")
                .pattern("CBC")

                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWTags.STAR_WORMS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TackShopItems.BUTTERFLY_MONARCH.get(), 3)
                .define('A', SWTags.STAR_WORMS)
                .define('B', Items.OAK_SAPLING)
                .define('C', Items.DANDELION)
                .define('D', Items.YELLOW_DYE)

                .pattern("DDD")
                .pattern("DAD")
                .pattern("CBC")

                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(SWTags.STAR_WORMS).build()))
                .save(pFinishedRecipeConsumer);

/// TACK RECIPES
        /// NUMBERED TACK
        int var5 = 15;
        var rContext = new Object() {
            int var6 = 1;
        };

        while (rContext.var6 < var5) {
            Number counter = rContext.var6;
            quarterSheetNumbered(counter, pFinishedRecipeConsumer);
            ++rContext.var6;
        }


        /// STANDARD COLOR DYE TACK
        DyeColor[] var2 = DyeColor.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            DyeColor color = var2[var4];
            quarterSheetDyed(color, pFinishedRecipeConsumer);
        }

    }

    private void quarterSheetDyed(DyeColor color, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
            ShapedRecipeBuilder.shaped((ItemLike)((RegistryObject)TackShopItems.QUARTER_SHEETS_DYED.get(color.getId())).get())
                    .define('#', (ItemLike)ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color.getName() + "_wool")))
                    .define('x', Items.LILY_OF_THE_VALLEY)
                    .pattern("###")
                    .pattern(" ##")
                    .pattern(" x ")

                    .group("quarter_sheet")
                    .unlockedBy("has_wool", has(ItemTags.WOOL))
                    .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "quarter_sheet/quarter_sheet_" + color.getName()));

            ShapelessRecipeBuilder.shapeless((ItemLike)((RegistryObject)TackShopItems.QUARTER_SHEETS_DYED.get(color.getId())).get())
                    .requires(TreTags.QUARTER_SHEETS)
                    .requires(color.getTag())
                    .requires(Items.LILY_OF_THE_VALLEY)
                    .group("quarter_sheet")
                    .unlockedBy("has_quarter_sheet", has(TreTags.QUARTER_SHEETS))
                    .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "quarter_sheet/dyed_quarter_sheet_" + color.getName()));
        }
    private void quarterSheetNumbered(Number counter, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped((ItemLike)((RegistryObject)TackShopItems.QUARTER_SHEETS_NUMBERED.get(counter).get())
                .define('#', ItemTags.WOOL)
                .define('A', TreDyeTags.DYE_1)
                .define('B', TreDyeTags.TONER_1)
                .define('x', Items.LILY_OF_THE_VALLEY)
                .pattern("###")
                .pattern(" ##")
                .pattern("AxB")

                .group("quarter_sheet")
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "quarter_sheet/quarter_sheet_" + counter)));

        ShapelessRecipeBuilder.shapeless((ItemLike)((RegistryObject)TackShopItems.QUARTER_SHEETS_DYED.get(color.getId())).get())
                .requires(TreTags.QUARTER_SHEETS)
                .requires(TreDyeTags.DYE_1)
                .requires(TreDyeTags.TONER_1)
                .requires(Items.LILY_OF_THE_VALLEY)
                .group("quarter_sheet")
                .unlockedBy("has_quarter_sheet", has(TreTags.QUARTER_SHEETS))
                .save(pFinishedRecipeConsumer, new ResourceLocation("tretackshop", "quarter_sheet/dyed_quarter_sheet_" + counter));
    }
}