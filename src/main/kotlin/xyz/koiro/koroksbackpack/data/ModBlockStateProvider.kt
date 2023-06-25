package xyz.koiro.koroksbackpack.data

import net.minecraft.data.PackOutput
import net.minecraft.world.level.block.Block
import net.minecraftforge.client.model.generators.BlockStateProvider
import net.minecraftforge.common.data.ExistingFileHelper
import xyz.koiro.koroksbackpack.world.level.block.ModBlocks

class ModBlockStateProvider(output: PackOutput?, modid: String?, exFileHelper: ExistingFileHelper?) : BlockStateProvider(output, modid, exFileHelper) {
    override fun registerStatesAndModels() {
        blockWithItem(ModBlocks.KOROK_IRON_BLOCK)
    }

    private fun blockWithItem(block: Block){
        this.simpleBlockWithItem(block, cubeAll(block))
    }
}