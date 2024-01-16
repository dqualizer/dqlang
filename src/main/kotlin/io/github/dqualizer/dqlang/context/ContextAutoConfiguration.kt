package io.github.dqualizer.dqlang.context

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration


@Configuration
@ComponentScan(basePackages = ["io.github.dqualizer.dqlang.context"])
class ContextAutoConfiguration
