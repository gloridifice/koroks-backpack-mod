package xyz.koiro.koroksbackpack

import net.minecraft.core.registries.Registries
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent
import net.minecraftforge.registries.DeferredRegister
import thedarkcolour.kotlinforforge.forge.registerObject
import xyz.koiro.koroksbackpack.world.level.block.ModBlocks

object ModCreativeModeTabs {
    val REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KoroksBackpack.ID)

    val MAIN_TAB = CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 2).icon(){ ItemStack(Items.APPLE) }.build()
    val KOROKSBACKPACK_TAB = REGISTRY.registerObject("koroksbackpack_main"){
        MAIN_TAB
    }

    fun addCreatives(event: BuildCreativeModeTabContentsEvent){
        if (event.tab == MAIN_TAB){
            event.accept(ModBlocks.KOROK_IRON_BLOCK)
        }
    }
}
