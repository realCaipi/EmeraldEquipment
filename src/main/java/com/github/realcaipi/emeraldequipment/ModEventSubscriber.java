package com.github.realcaipi.emeraldequipment;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraft.util.ResourceLocation;

@EventBusSubscriber(modid = EmeraldEquipment.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		/*event.getRegistry().registerAll(
			setup( new SwordItem(ItemTier.DIAMOND, 10, -2.5f, 
				new SwordItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "emerald_sword"
			),
			setup( new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST,
				new ArmorItem.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "emerald_chestplate"
			)
		);*/
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(EmeraldEquipment.MODID, name));
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}
}