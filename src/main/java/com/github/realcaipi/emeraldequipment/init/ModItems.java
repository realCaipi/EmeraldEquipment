package com.github.realcaipi.emeraldequipment.init;

import com.github.realcaipi.emeraldequipment.EmeraldEquipment;
import com.github.realcaipi.emeraldequipment.item.ModItemTier;
import com.github.realcaipi.emeraldequipment.item.armor.ModArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, EmeraldEquipment.MODID);

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
        new SwordItem(ModItemTier.EMERALD, 3, -2.2f, new SwordItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
        new PickaxeItem(ModItemTier.EMERALD, 1, -2.6f, new PickaxeItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
        new AxeItem(ModItemTier.EMERALD, 5, -2.8f, new AxeItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
        new ShovelItem(ModItemTier.EMERALD, 1.5f, -2.8f, new ShovelItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
        new HoeItem(ModItemTier.EMERALD, 0, new HoeItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () ->
        new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new ArmorItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () ->
        new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new ArmorItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () ->
        new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new ArmorItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () ->
        new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new ArmorItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));   
}