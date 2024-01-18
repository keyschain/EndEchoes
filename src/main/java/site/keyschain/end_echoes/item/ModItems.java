package site.keyschain.end_echoes.item;

import static site.keyschain.end_echoes.Constants.LOG;
import static site.keyschain.end_echoes.Constants.MOD_ID;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;

import java.util.List;

public class ModItems {

    public static final Item ENDIUM_REMNANTS = registerItem("endium_remnant",
            new Item(new FabricItemSettings()));
    public static final Item ENDIUM_INGOT = registerItem("endium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ENDIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("endium_upgrade_smithing_template",
            createEndiumUpgrade());
    public static final Item ENDIUM_PICKAXE = registerItem("endium_pickaxe",
            new PickaxeItem(ModToolMaterial.ENDIUM, 5, -2.7f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_AXE = registerItem("endium_axe",
            new AxeItem(ModToolMaterial.ENDIUM, 9, -2.9f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_SHOVEL = registerItem("endium_shovel",
            new ShovelItem(ModToolMaterial.ENDIUM, 6.5f, -3f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_SWORD = registerItem("endium_sword",
            new SwordItem(ModToolMaterial.ENDIUM, 7, -2.2f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDIUM_HOE = registerItem("endium_hoe",
            new HoeItem(ModToolMaterial.ENDIUM, 1, 0f, new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    private static Item createEndiumUpgrade() {
        return new SmithingTemplateItem(
                Text.translatable("upgrade." + MOD_ID + ".endium.applies_to").formatted(Formatting.BLUE),
                Text.translatable("upgrade." + MOD_ID + ".endium.ingredients").formatted(Formatting.BLUE),
                Text.translatable("upgrade." + MOD_ID + ".endium").formatted(Formatting.GRAY),
                Text.translatable("upgrade." + MOD_ID + ".endium.base_slot_text"),
                Text.translatable("upgrade." + MOD_ID + ".endium.additions_slot_text"),
                getEndiumUpgradeEmptyBaseSlotTextures(),
                getEndiumUpgradeEmptyAdditionsSlotTextures()
        );
    }

    private static List<Identifier> getEndiumUpgradeEmptyBaseSlotTextures() {
        return List.of(
                new Identifier("minecraft", "item/empty_armor_slot_helmet"),
                new Identifier("minecraft", "item/empty_armor_slot_chestplate"),
                new Identifier("minecraft", "item/empty_armor_slot_leggings"),
                new Identifier("minecraft", "item/empty_armor_slot_boots"),
                new Identifier("minecraft", "item/empty_slot_sword"),
                new Identifier("minecraft", "item/empty_slot_axe"),
                new Identifier("minecraft", "item/empty_slot_pickaxe"),
                new Identifier("minecraft", "item/empty_slot_shovel"),
                new Identifier("minecraft", "item/empty_slot_hoe")
        );
    }

    private static List<Identifier> getEndiumUpgradeEmptyAdditionsSlotTextures() {
        return List.of(
                new Identifier("minecraft", "item/empty_slot_ingot")
        );
    }

    public static void registerModItems() {
        LOG.info("Registering Mod Items for " + MOD_ID);
    }

}
