package com.youslouf.tutorialmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier FLUORITE_TIER = new ForgeTier(3, 1400, 9f,
            5f, 28, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.FLUORITE.get()));
}
