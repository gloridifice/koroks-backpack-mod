package xyz.koiro.koroksbackpack.world.item

import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraftforge.fml.loading.moddiscovery.ModJarMetadata
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.ObjectHolderDelegate
import thedarkcolour.kotlinforforge.forge.registerObject
import xyz.koiro.koroksbackpack.KoroksBackpack
import xyz.koiro.koroksbackpack.world.level.block.KorokBlock
import xyz.koiro.koroksbackpack.world.level.block.ModBlocks

object ModItems {
    val REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KoroksBackpack.ID)

}