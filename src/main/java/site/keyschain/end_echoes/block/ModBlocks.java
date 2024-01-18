package site.keyschain.end_echoes.block;

import static site.keyschain.end_echoes.Constants.LOG;
import static site.keyschain.end_echoes.Constants.MOD_ID;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class ModBlocks {

    public static final Block PRIMORDIAL_REMAINS = registerBlock("primordial_remains",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));
    public static final Block ENDIUM_BLOCK = registerBlock("endium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        LOG.info("Registering Mod Blocks for " + MOD_ID);
    }
}
