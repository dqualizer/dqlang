package io.github.dqualizer.dqlang.types.dam.architecture

import java.lang.module.ModuleDescriptor

data class ProgrammingFramework(val type: String, val version: ModuleDescriptor.Version)
