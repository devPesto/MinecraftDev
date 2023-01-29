package com.demonwav.mcdev.platform.minestom

import com.demonwav.mcdev.facet.MinecraftFacet
import com.demonwav.mcdev.platform.AbstractModule
import com.demonwav.mcdev.platform.AbstractModuleType

class MinestomModule<out T: AbstractModuleType<*>>(facet: MinecraftFacet, type: T): AbstractModule(facet) {


}