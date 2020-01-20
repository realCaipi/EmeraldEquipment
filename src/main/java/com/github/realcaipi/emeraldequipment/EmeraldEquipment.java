package com.github.realcaipi.emeraldequipment;

import net.minecraftforge.fml.common.Mod;

@Mod(EmeraldEquipment.MODID)
public final class EmeraldEquipment {
	public static final String MODID = "emeraldequipment";

	public EmeraldEquipment() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModItems.ITEMS.register(modEventBus);
	}
}