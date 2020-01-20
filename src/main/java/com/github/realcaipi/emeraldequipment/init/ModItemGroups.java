package com.github.realcaipi.emeraldequipment.init;

import java.util.function.Supplier;

import com.github.realcaipi.emeraldequipment.EmeraldEquipment;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class ModItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(EmeraldEquipment.MODID, () -> new ItemStack(ModItems.EMERALD_SWORD.get()));

    public static class ModItemGroup extends ItemGroup {
        private final Supplier<ItemStack> iconSupplier;

        @Override
        public ItemStack createIcon(){
            return iconSupplier.get();
        }

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier){
            super(name);
            this.iconSupplier = iconSupplier;
        }
    }
}