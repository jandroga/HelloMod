package com.jteam.brownffins.data;

import com.jteam.brownffins.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;

import java.util.function.Consumer;

public class TutRecipes extends RecipeProvider {

    public TutRecipes(DataGenerator generator) {
        super(generator);

    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(Registration.BROWNFFIN_BLOCK.get())
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', Registration.BROWNFFIN.get())
                .group("brownffins")
                .unlockedBy("a", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BROWNFFIN.get()))
                .save(finishedRecipeConsumer);
    }
}
