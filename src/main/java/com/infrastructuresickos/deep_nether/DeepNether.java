package com.infrastructuresickos.deep_nether;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("deep_nether")
public class DeepNether {
    public static final Logger LOGGER = LogManager.getLogger();

    public DeepNether() {
        LOGGER.info("DeepNether mod initialized");
    }
}
