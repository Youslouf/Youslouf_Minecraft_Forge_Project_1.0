package com.youslouf.tutorialmod.item;

import com.youslouf.tutorialmod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> FLUORITE = ITEMS.register("fluorite",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
