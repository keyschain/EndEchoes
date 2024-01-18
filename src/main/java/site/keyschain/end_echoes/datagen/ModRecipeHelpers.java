package site.keyschain.end_echoes.datagen;

import net.minecraft.data.DataWriter;
import site.keyschain.end_echoes.item.ModItems;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.getItemPath;

import net.minecraft.data.DataProvider;

import java.util.concurrent.CompletableFuture;


public class ModRecipeHelpers implements DataProvider {
    public static void offerEndiumUpgradeRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDIUM_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(input), Ingredient.ofItems(ModItems.ENDIUM_INGOT), category, result).criterion("has_endium_ingot",
                conditionsFromItem(ModItems.ENDIUM_INGOT)).offerTo(exporter, getItemPath(result) + "_smithing");
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}

