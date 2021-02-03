package com.github.jonathanlocke.intellijeasymapmac.services

import com.github.jonathanlocke.intellijeasymapmac.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
