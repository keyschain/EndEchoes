package site.keyschain.end_echoes.item.custom;

import static site.keyschain.end_echoes.Constants.MOD_ID;

import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModUpgradeItem {
    public static Item create(String type) {
        return new SmithingTemplateItem(
                Text.translatable("upgrade." + MOD_ID + "." + type + ".applies_to").formatted(Formatting.BLUE),
                Text.translatable("upgrade." + MOD_ID + "." + type + ".ingredients").formatted(Formatting.BLUE),
                Text.translatable("upgrade." + MOD_ID + "." + type).formatted(Formatting.GRAY),
                Text.translatable("upgrade." + MOD_ID + "." + type + ".base_slot_text"),
                Text.translatable("upgrade." + MOD_ID + "." + type + ".additions_slot_text"),
                getUpgradeEmptyBaseSlotTextures(),
                getUpgradeEmptyAdditionsSlotTextures()
        );
    }

    private static List<Identifier> getUpgradeEmptyBaseSlotTextures() {
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

    private static List<Identifier> getUpgradeEmptyAdditionsSlotTextures() {
        return List.of(
                new Identifier("minecraft", "item/empty_slot_ingot")
        );
    }
}
