package site.keyschain.end_echoes.item;

import static site.keyschain.end_echoes.Constants.LOG;
import static site.keyschain.end_echoes.Constants.MOD_ID;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ModItems {

    public static final Item ENDIUM_REMNANTS = registerItem("endium_remnant",
            new Item(new FabricItemSettings()));
    public static final Item ENDIUM_INGOT = registerItem("endium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ENDIUM_PICKAXE = registerItem("endium_pickaxe",
            new PickaxeItem(ModToolMaterial.ENDIUM, 3, 2f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_AXE = registerItem("endium_axe",
            new AxeItem(ModToolMaterial.ENDIUM, 8, 1f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_SHOVEL = registerItem("endium_shovel",
            new ShovelItem(ModToolMaterial.ENDIUM, 2, 1.5f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_SWORD = registerItem("endium_sword",
            new SwordItem(ModToolMaterial.ENDIUM, 7, 4f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_HOE = registerItem("endium_hoe",
            new HoeItem(ModToolMaterial.ENDIUM, 2, 1f, new FabricItemSettings().maxCount(1)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDIUM_REMNANTS);
        entries.add(ENDIUM_INGOT);
        entries.add(ENDIUM_PICKAXE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        LOG.info("Registering Mod Items for " + MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
