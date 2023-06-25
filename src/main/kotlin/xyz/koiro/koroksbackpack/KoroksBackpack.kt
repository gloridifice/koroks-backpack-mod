package xyz.koiro.koroksbackpack

import xyz.koiro.koroksbackpack.world.level.block.ModBlocks
import net.minecraft.client.Minecraft
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.runForDist
import xyz.koiro.koroksbackpack.data.ModDataGen
import xyz.koiro.koroksbackpack.world.item.ModItems

@Mod(KoroksBackpack.ID)
object KoroksBackpack {
    const val ID = "koroksbackpack"

    val LOGGER: Logger = LogManager.getLogger(ID)

    init {
        LOGGER.log(Level.INFO, "Hello world!")

        // Register the KDeferredRegister to the mod-specific event bus
        ModCreativeModeTabs.REGISTRY.register(MOD_BUS)
        ModBlocks.REGISTRY.register(MOD_BUS)
        ModItems.REGISTRY.register(MOD_BUS)

        MOD_BUS.addListener(ModCreativeModeTabs::addCreatives)
        MOD_BUS.addListener(ModDataGen::gatherData)
        val obj = runForDist(
            clientTarget = {
                MOD_BUS.addListener(KoroksBackpack::onClientSetup)
                Minecraft.getInstance()
            },
            serverTarget = {
                MOD_BUS.addListener(KoroksBackpack::onServerSetup)
                "test"
            })

        println(obj)
    }

    private fun onClientSetup(event: FMLClientSetupEvent) {
        LOGGER.log(Level.INFO, "Initializing client...")
    }

    private fun onServerSetup(event: FMLDedicatedServerSetupEvent) {
        LOGGER.log(Level.INFO, "Server starting...")
    }
}