package io.redspace.ironsspellbooks.item;

import io.redspace.ironsspellbooks.util.SpellbookModCreativeTabs;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ShrivingStoneItem extends Item {
    private static final Component description = Component.translatable("item.irons_spellbooks.shriving_stone_desc").withStyle(ChatFormatting.GRAY);
    public ShrivingStoneItem() {
        super(new Properties().tab(SpellbookModCreativeTabs.SPELL_MATERIALS_TAB));
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> lines, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, lines, pIsAdvanced);
        lines.add(description);
    }
}
