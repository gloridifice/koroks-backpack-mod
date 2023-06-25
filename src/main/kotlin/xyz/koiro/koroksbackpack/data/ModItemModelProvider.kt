package xyz.koiro.koroksbackpack.data

import net.minecraft.data.PackOutput
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.common.data.ExistingFileHelper

class ModItemModelProvider(output: PackOutput?, modid: String?, existingFileHelper: ExistingFileHelper?) : ItemModelProvider(output, modid, existingFileHelper) {
    override fun registerModels() {
    }
}