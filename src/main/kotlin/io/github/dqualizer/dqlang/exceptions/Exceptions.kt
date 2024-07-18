package io.github.dqualizer.dqlang.exceptions

data class EnvironmentNotFoundException(val environment: String) : Exception("Environment $environment was not found")

data class ServiceNotFoundException(val contextID: String) : Exception("No service id found in $contextID.")

data class ContextNotFoundException(val context: String) : Exception("Context $context was not found")
