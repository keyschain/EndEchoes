package site.keyschain.end_echoes.datagen;

import static site.keyschain.end_echoes.datagen.ModRecipeHelpers.*;
import site.keyschain.end_echoes.block.ModBlocks;
import site.keyschain.end_echoes.item.ModItems;

import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import java.util.List;


public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> ENDIUM_SMELTABLES = List.of(ModBlocks.PRIMORDIAL_REMAINS);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerBlasting(exporter, ENDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENDIUM_REMNANTS,
                3, 200, "endium_blasting");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDIUM_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.ENDIUM_BLOCK);

        // endium tools upgrade recipe
        offerEndiumUpgradeRecipe(exporter, Items.NETHERITE_PICKAXE, RecipeCategory.TOOLS, ModItems.ENDIUM_PICKAXE);
        offerEndiumUpgradeRecipe(exporter, Items.NETHERITE_AXE, RecipeCategory.TOOLS, ModItems.ENDIUM_AXE);
        offerEndiumUpgradeRecipe(exporter, Items.NETHERITE_SWORD, RecipeCategory.TOOLS, ModItems.ENDIUM_SWORD);
        offerEndiumUpgradeRecipe(exporter, Items.NETHERITE_SHOVEL, RecipeCategory.TOOLS, ModItems.ENDIUM_SHOVEL);
        offerEndiumUpgradeRecipe(exporter, Items.NETHERITE_HOE, RecipeCategory.TOOLS, ModItems.ENDIUM_HOE);

    }

}
