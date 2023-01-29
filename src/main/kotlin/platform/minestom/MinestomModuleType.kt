package com.demonwav.mcdev.platform.minestom

import com.demonwav.mcdev.asset.PlatformAssets
import com.demonwav.mcdev.insight.generation.ui.EventGenerationPanel
import com.demonwav.mcdev.platform.AbstractModuleType
import com.demonwav.mcdev.platform.PlatformType
import com.intellij.psi.PsiClass

object MinestomModuleType : AbstractModuleType<MinestomModule<MinestomModuleType>>("net.minestom", "Minestom") {

    private const val ID = "MINESTOM_MODULE_TYPE"

    override val platformType = PlatformType.MINESTOM
    override val icon = PlatformAssets.MINESTOM_ICON
    override val id = ID
    override val isEventGenAvailable = false

    override fun getEventGenerationPanel(chosenClass: PsiClass): EventGenerationPanel = return super.getEventGenerationPanel(chosenClass)

}