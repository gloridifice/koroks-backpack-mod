package xyz.koiro.koroksbackpack.data

import net.minecraft.data.DataProvider
import net.minecraftforge.data.event.GatherDataEvent
import xyz.koiro.koroksbackpack.KoroksBackpack


object ModDataGen {
    fun gatherData(event: GatherDataEvent) {
        val efh = event.existingFileHelper;
        val modid = KoroksBackpack.ID;

        //Model and BlockState
        event.generator.addProvider(event.includeClient(), DataProvider.Factory { ModItemModelProvider(it, modid, efh) })
        event.generator.addProvider(event.includeClient(), DataProvider.Factory { ModBlockStateProvider(it, modid, efh) })

        //Language
        event.generator.addProvider(event.includeClient(), DataProvider.Factory { CNLanguageProvider(it, modid, "zh_cn") })
        event.generator.addProvider(event.includeClient(), DataProvider.Factory { ENLanguageProvider(it, modid, "en_us") })
    }
}