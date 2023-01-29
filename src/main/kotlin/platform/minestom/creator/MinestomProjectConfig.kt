package com.demonwav.mcdev.platform.minestom.creator

import com.demonwav.mcdev.creator.ProjectCreator
import com.demonwav.mcdev.creator.buildsystem.BuildSystemType
import com.demonwav.mcdev.creator.buildsystem.gradle.GradleBuildSystem
import com.demonwav.mcdev.creator.buildsystem.gradle.GradleCreator
import com.demonwav.mcdev.creator.buildsystem.maven.MavenBuildSystem
import com.demonwav.mcdev.creator.buildsystem.maven.MavenCreator
import com.demonwav.mcdev.platform.minestom.MinestomLikeConfiguration
import com.demonwav.mcdev.util.VersionRange
import com.intellij.openapi.module.Module
import java.nio.file.Path

class MinestomProjectConfig : ProjectConfig(), MinestomLikeConfiguration, MavenCreator, GradleCreator {

    override fun configureRootGradle(rootDirectory: Path, buildSystem: GradleBuildSystem) {
        super.configureRootGradle(rootDirectory, buildSystem)
    }

    override fun configureRootMaven(rootDirectory: Path, buildSystem: MavenBuildSystem) {
        super.configureRootMaven(rootDirectory, buildSystem)
    }

    override val compatibleGradleVersions: VersionRange
        get() = TODO("Not yet implemented")

    override fun buildGradleCreator(
        rootDirectory: Path,
        module: Module,
        buildSystem: GradleBuildSystem
    ): ProjectCreator {
        TODO("Not yet implemented")
    }

    override fun buildMavenCreator(
        rootDirectory: Path,
        module: Module,
        buildSystem: MavenBuildSystem
    ): ProjectCreator {
        TODO("Not yet implemented")
    }
}