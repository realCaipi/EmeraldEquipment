package com.github.realcaipi.emeraldequipment;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EmeraldEquipment.MODID)
public final class EmeraldEquipment {
	public static final String MODID = "testmod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public EmeraldEquipment() {
		LOGGER.debug("Hello from Test Mod!");
	}
}