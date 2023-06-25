package xyz.koiro.koroksbackpack.data

import net.minecraft.data.PackOutput
import net.minecraftforge.common.data.LanguageProvider
import xyz.koiro.koroksbackpack.world.level.block.ModBlocks

class ENLanguageProvider(output: PackOutput, modid: String, locale: String) : LanguageProvider(output, modid, locale) {
    override fun addTranslations() {
        addBlock({ModBlocks.KOROK_IRON_BLOCK}, "Korok Iron Block");
    }
}
class CNLanguageProvider(output: PackOutput, modid: String, locale: String) : LanguageProvider(output, modid, locale) {
    override fun addTranslations() {
        addBlock({ModBlocks.KOROK_IRON_BLOCK}, "克洛格铁纹块");
    }
}