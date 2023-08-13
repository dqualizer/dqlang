package io.github.dqualizer.dqlang.messaging

import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

@Component
class QueueFactory(
    val applicationContext: ApplicationContext,
    val queueConfiguration: QueueConfiguration
) : InitializingBean {

    override fun afterPropertiesSet() {
        val factory = applicationContext.autowireCapableBeanFactory;

        for (queueConfig in queueConfiguration.queues) {
            val queueName = queueConfig.value.name.orElse(queueConfig.key)
            val queue = Queue(queueName, queueConfig.value.durable)
            factory.autowireBean(queue)
            factory.initializeBean(queue, queueConfig.key)
        }
    }
}
