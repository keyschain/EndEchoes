package site.keyschain.end_echoes.datagen;

import site.keyschain.end_echoes.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PRIMORDIAL_REMAINS);
        addDrop(ModBlocks.ENDIUM_BLOCK);
    }
}
