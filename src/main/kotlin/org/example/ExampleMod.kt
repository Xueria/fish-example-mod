package org.example

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object ExampleMod : ModInitializer {

    const val MOD_ID = "example"

    @JvmField
    val logger: Logger = LogManager.getLogger(MOD_ID)

    override fun onInitialize() {
        logger.info("Mod {id:$MOD_ID} Initialized!")
    }
}