package com.github.realcaipi.emeraldequipment;

import com.github.realcaipi.emeraldequipment.init.ModItems;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EmeraldEquipment.MODID)
public final class EmeraldEquipment {
	public static final String MODID = "emeraldequipment";

	public EmeraldEquipment() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModItems.ITEMS.register(modEventBus);
	}
}