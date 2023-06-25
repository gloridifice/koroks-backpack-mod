package xyz.koiro.koroksbackpack.world.level.block

import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import xyz.koiro.koroksbackpack.KoroksBackpack
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.MapColor
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import thedarkcolour.kotlinforforge.forge.ObjectHolderDelegate
import thedarkcolour.kotlinforforge.forge.registerObject
import xyz.koiro.koroksbackpack.world.item.ModItems

object ModBlocks {
    val REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KoroksBackpack.ID)

    val KOROK_IRON_BLOCK by registerBlock("korok_iron_block"){ KorokBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE))};

    fun registerBlock(name: String, supplier: () -> Block): ObjectHolderDelegate<Block>{
        val registryBlock = ModBlocks.REGISTRY.register(name, supplier)
        val registryItem = ModItems.REGISTRY.register(name){ BlockItem(registryBlock.get(), Item.Properties())}
        return ObjectHolderDelegate(registryBlock)
    }
}