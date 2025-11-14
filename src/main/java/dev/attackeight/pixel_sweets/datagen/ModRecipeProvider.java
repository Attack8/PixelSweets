package dev.attackeight.pixel_sweets.datagen;

import dev.attackeight.pixel_sweets.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

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

        ShapedRecipeBuilder.shaped(ModItems.SWEET_20.get())
                .define('A', Items.WHEAT)
                .define('B', Items.SWEET_BERRIES)
                .pattern("BBB")
                .pattern("AAA")
                .pattern("BBB")
                .unlockedBy("has_sweet_berries", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SWEET_BERRIES).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SWEET_19.get())
                .define('A', Items.WHEAT)
                .define('B', Items.HONEY_BOTTLE)
                .pattern("BBB")
                .pattern("AAA")
                .pattern("BBB")
                .unlockedBy("has_honey", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.HONEY_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

    }
}
