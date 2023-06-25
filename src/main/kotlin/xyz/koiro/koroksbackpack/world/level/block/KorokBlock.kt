package xyz.koiro.koroksbackpack.world.level.block

import net.minecraft.world.level.block.Block

class KorokBlock(properties: Properties) : Block(properties) {
    init {
        properties.strength(-1.0F, 3600000.0F).noLootTable()
    }
}