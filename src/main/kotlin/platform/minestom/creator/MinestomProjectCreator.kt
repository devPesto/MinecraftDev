package com.demonwav.mcdev.platform.minestom.creator

import com.demonwav.mcdev.creator.BaseProjectCreator
import com.demonwav.mcdev.creator.BasicJavaClassStep
import com.demonwav.mcdev.creator.buildsystem.BuildSystem
import com.intellij.openapi.module.Module
import java.nio.file.Path

sealed class MinestomProjectCreator<T : BuildSystem>(
    protected val rootDirectory: Path,
    protected val rootModule: Module,
    protected val buildSystem: T,
    protected val config: MinestomProjectConfig
) : BaseProjectCreator(rootModule, buildSystem) {

    protected fun setupMainClass(): BasicJavaClassStep {

    }

    protected fun setupDepen


}

