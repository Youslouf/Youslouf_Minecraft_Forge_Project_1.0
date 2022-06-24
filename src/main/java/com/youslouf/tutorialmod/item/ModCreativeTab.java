package com.youslouf.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab TAB_FLUORITE = new CreativeModeTab("FLUORITE") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FLUORITE.get());
        }

    };
}
