package dev.attackeight.pixel_sweets.datagen;

import dev.attackeight.pixel_sweets.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(ModItems.SWEET_28.get())
                .define('A', Items.SWEET_BERRIES)
                .define('B', Items.SUGAR)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_sweet_berries", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SWEET_BERRIES).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_27.get())
                .define('A', ModItems.SWEET_28.get())
                .define('B', Items.SUGAR)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_sweet_27", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SWEET_27.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_26.get())
                .define('A', Items.APPLE)
                .define('B', Items.SWEET_BERRIES)
                .define('C', Items.SUGAR)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .unlockedBy("has_apple", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.APPLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_25.get(), 8)
                .define('A', Items.COCOA_BEANS)
                .define('B', Items.WHEAT)
                .define('C', Items.SUGAR)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .unlockedBy("has_cocoa", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_24.get())
                .define('A', Items.PINK_DYE)
                .define('B', Items.SLIME_BALL)
                .define('C', Items.SUGAR)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_23.get())
                .define('A', Items.MAGENTA_DYE)
                .define('B', Items.SLIME_BALL)
                .define('C', Items.SUGAR)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_22.get())
                .define('A', Items.PURPLE_DYE)
                .define('B', Items.SLIME_BALL)
                .define('C', Items.SUGAR)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_21.get())
                .define('A', Items.RED_DYE)
                .define('B', Items.SLIME_BALL)
                .define('C', Items.SUGAR)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_20.get())
                .define('A', Items.RED_DYE)
                .define('B', Items.SUGAR)
                .define('C', Items.WHEAT)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_19.get())
                .define('A', Items.PURPLE_DYE)
                .define('B', Items.SUGAR)
                .define('C', Items.WHEAT)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_18.get())
                .define('A', Items.PINK_DYE)
                .define('B', Items.SUGAR)
                .define('C', Items.WHEAT)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_17.get())
                .define('A', Items.MAGENTA_DYE)
                .define('B', Items.SUGAR)
                .define('C', Items.WHEAT)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_16.get())
                .define('A', Items.MAGENTA_DYE)
                .define('B', Items.SUGAR)
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_15.get())
                .define('A', Items.PURPLE_DYE)
                .define('B', Items.SUGAR)
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_14.get())
                .define('A', Items.RED_DYE)
                .define('B', Items.SUGAR)
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_13.get())
                .define('A', Items.PINK_DYE)
                .define('B', Items.SUGAR)
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_12.get())
                .define('A', Items.RED_DYE)
                .define('B', Items.WHEAT)
                .pattern("AAA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_11.get())
                .define('A', Items.MAGENTA_DYE)
                .define('B', Items.WHEAT)
                .pattern("AAA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_10.get())
                .define('A', Items.PINK_DYE)
                .define('B', Items.WHEAT)
                .pattern("AAA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_09.get())
                .define('A', Items.COCOA_BEANS)
                .define('B', Items.WHEAT)
                .pattern("AAA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_08.get())
                .define('A', Items.MAGENTA_DYE)
                .define('B', Items.WHEAT)
                .define('C', Items.SUGAR)
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_07.get())
                .define('A', Items.RED_DYE)
                .define('B', Items.WHEAT)
                .define('C', Items.SUGAR)
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_06.get())
                .define('A', Items.SUGAR)
                .define('B', Items.RED_DYE)
                .define('C', Items.MAGENTA_DYE)
                .define('D', Items.PINK_DYE)
                .define('E', Items.PURPLE_DYE)
                .pattern(" C ")
                .pattern("DAB")
                .pattern(" E ")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_05.get())
                .define('A', Items.PINK_DYE)
                .define('B', Items.SUGAR)
                .define('C', Items.WHEAT)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" C ")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_04.get())
                .define('A', Items.MAGENTA_DYE)
                .define('B', Items.SUGAR)
                .define('C', Items.WHEAT)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" C ")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_03.get())
                .define('A', Items.RED_DYE)
                .define('B', Items.SUGAR)
                .define('C', Items.WHEAT)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" C ")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_02.get())
                .define('A', Items.MAGENTA_DYE)
                .define('B', Items.PURPLE_DYE)
                .define('C', Items.STICK)
                .pattern("  A")
                .pattern(" B ")
                .pattern("C  ")
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_01.get())
                .define('A', Items.PINK_DYE)
                .define('B', Items.RED_DYE)
                .define('C', Items.STICK)
                .pattern("  A")
                .pattern(" B ")
                .pattern("C  ")
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_00.get())
                .define('A', Items.SUGAR)
                .define('B', Items.CAKE)
                .define('C', Items.SWEET_BERRIES)
                .pattern("AAA")
                .pattern("CBC")
                .pattern("AAA")
                .unlockedBy("has_cake", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CAKE).build()))
                .save(pFinishedRecipeConsumer);

    }

    public static void gatherData(GatherDataEvent event) {
        event.getGenerator().addProvider(new ModRecipeProvider(event.getGenerator()));
    }
}
