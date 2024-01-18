package site.keyschain.end_echoes.datagen;

import site.keyschain.end_echoes.block.ModBlocks;
import site.keyschain.end_echoes.item.ModItems;

import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRIMORDIAL_REMAINS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENDIUM_REMNANTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDIUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDIUM_SWORD, Models.HANDHELD);
    }
}
