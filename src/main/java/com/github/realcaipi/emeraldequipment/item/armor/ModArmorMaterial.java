package com.github.realcaipi.emeraldequipment.item.armor;

import java.util.function.Supplier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;

//99% of this code copy pasted from vanilla ArmorMaterial enum
//There must be a better way to do this
public enum ModArmorMaterial implements IArmorMaterial {
    EMERALD("testmod:emerald", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, () -> {
       return Ingredient.fromItems(Items.LEATHER);
    });
 
    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;
 
    private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float p_i48533_8_, Supplier<Ingredient> repairMaterialSupplier) {
       this.name = nameIn;
       this.maxDamageFactor = maxDamageFactorIn;
       this.damageReductionAmountArray = damageReductionAmountsIn;
       this.enchantability = enchantabilityIn;
       this.soundEvent = equipSoundIn;
       this.toughness = p_i48533_8_;
       this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
    }
 
    public int getDurability(EquipmentSlotType slotIn) {
       return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }
 
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
       return this.damageReductionAmountArray[slotIn.getIndex()];
    }
 
    public int getEnchantability() {
       return this.enchantability;
    }
 
    public SoundEvent getSoundEvent() {
       return this.soundEvent;
    }
 
    public Ingredient getRepairMaterial() {
       return this.repairMaterial.getValue();
    }
 
    @OnlyIn(Dist.CLIENT)
    public String getName() {
       return this.name;
    }
 
    public float getToughness() {
       return this.toughness;
    }
 }