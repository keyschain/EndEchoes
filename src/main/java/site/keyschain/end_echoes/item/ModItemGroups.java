package site.keyschain.end_echoes.item;
import site.keyschain.end_echoes.Constants;
import static site.keyschain.end_echoes.Constants.LOG;
import static site.keyschain.end_echoes.Constants.MOD_ID;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import site.keyschain.end_echoes.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup END_ECHOES_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "end_echoes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + MOD_ID))
                    // ModItems.ENDIUM_REMNANTS is the item that shows up as the icon of the group
                    .icon(() -> new ItemStack(ModItems.ENDIUM_REMNANTS)).entries((displayContext, entries) -> {
                        // add items that should be in this group here.
                        entries.add(ModBlocks.PRIMORDIAL_REMAINS);
                        entries.add(ModItems.ENDIUM_REMNANTS);
                        entries.add(ModItems.ENDIUM_INGOT);
                        entries.add(ModItems.ENDIUM_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.ENDIUM_PICKAXE);
                        entries.add(ModItems.ENDIUM_AXE);
                        entries.add(ModItems.ENDIUM_SHOVEL);
                        entries.add(ModItems.ENDIUM_SWORD);
                        entries.add(ModItems.ENDIUM_HOE);

                    }).build());

    public static void registerItemGroups() {
        LOG.info("Registering Mod Item Groups for " + Constants.MOD_ID);
    }
}
