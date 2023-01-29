package com.demonwav.mcdev.platform.minestom.creator

import com.demonwav.mcdev.platform.BaseTemplate
import com.intellij.openapi.project.Project

class MinestomTemplate : BaseTemplate() {

    fun applyMainClass(
        project: Project,
        packageName: String,
        className: String
    ): String {
        val props = mapOf(
            "PACKAGE" to packageName,
            "CLASS_NAME" to className
        )

        return project.applyTemplate(, props)
    }
}