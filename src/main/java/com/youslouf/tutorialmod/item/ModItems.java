package com.youslouf.tutorialmod.item;

import com.youslouf.tutorialmod.TutorialMod;
import com.youslouf.tutorialmod.item.custom.ChemicalBurnItem;
import com.youslouf.tutorialmod.item.custom.ModArmorItem;
import com.youslouf.tutorialmod.item.custom.fluorite_dropper;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> FLUORITE = ITEMS.register("fluorite",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));

    public static final RegistryObject<Item> FLUORITE_DROPPER = ITEMS.register("fluorite_dropper",
            () -> new fluorite_dropper(new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE).durability(32)));

    public static final RegistryObject<Item> FLUORITE_FLOSS = ITEMS.register("fluorite_floss",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE).food(ModFoods.FLUORITE_FLOSS)));

    public static final RegistryObject<Item> FLUORITE_SUGAR = ITEMS.register("fluorite_sugar",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));


    public static final RegistryObject<Item> FLUORITE_SWORD = ITEMS.register("fluorite_sword",
            () -> new ChemicalBurnItem(ModTiers.FLUORITE_TIER, 8, 3f,
                    new Item. Properties().tab(ModCreativeTab.TAB_FLUORITE)));
    public static final RegistryObject<Item> FLUORITE_PICKAXE = ITEMS.register("fluorite_pickaxe",
            () -> new PickaxeItem(ModTiers.FLUORITE_TIER, 5, 1f,
                    new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));
    public static final RegistryObject<Item> FLUORITE_SHOVEL = ITEMS.register("fluorite_shovel",
            () -> new ShovelItem(ModTiers.FLUORITE_TIER, 3, 1f,
                    new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));
    public static final RegistryObject<Item> FLUORITE_AXE = ITEMS.register("fluorite_axe",
            () -> new AxeItem(ModTiers.FLUORITE_TIER, 10, 1f,
                    new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));

    public static final RegistryObject<Item> FLUORITE_HELMET = ITEMS.register("fluorite_helmet",
            () -> new ArmorItem(ModArmourMaterials.FLUORITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));
    public static final RegistryObject<Item> FLUORITE_CHESTPLATE = ITEMS.register("fluorite_chestplate",
            () -> new ArmorItem(ModArmourMaterials.FLUORITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));
    public static final RegistryObject<Item> FLUORITE_LEGGINGS = ITEMS.register("fluorite_leggings",
            () -> new ArmorItem(ModArmourMaterials.FLUORITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));
    public static final RegistryObject<Item> FLUORITE_BOOTS = ITEMS.register("fluorite_boots",
            () -> new ModArmorItem(ModArmourMaterials.FLUORITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeTab.TAB_FLUORITE)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
