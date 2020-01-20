package com.github.realcaipi.emeraldequipment.init;

import com.github.realcaipi.emeraldequipment.EmeraldEquipment;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, EmeraldEquipment.MODID);

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
        new SwordItem(ItemTier.DIAMOND, 10, -2.5f, new SwordItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    // public static final Item EMERALD_SWORD = null;
    /*new SwordItem(ItemTier.DIAMOND, 10, -2.5f, 
				new SwordItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP))
			setup( new ArmorItem(ArmorMaterialList.EMERALD, EquipmentSlotType.CHEST,
				new ArmorItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "emerald_chestplate"
			)*/
}