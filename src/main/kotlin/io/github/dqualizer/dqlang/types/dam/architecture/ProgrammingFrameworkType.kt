package io.github.dqualizer.dqlang.types.dam.architecture

import java.lang.module.ModuleDescriptor


enum class ProgrammingFrameworkType(val names: List<String>) {
    SPRING(listOf("spring", "spring-boot", "spring-framework")),
    ASP_NET_CORE(listOf("asp.net-core", "asp.net"))
}

data class ProgrammingFramework(val type: ProgrammingFrameworkType, val version: ModuleDescriptor.Version)
