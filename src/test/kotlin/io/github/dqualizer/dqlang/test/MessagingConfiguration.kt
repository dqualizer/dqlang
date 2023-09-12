package io.github.dqualizer.dqlang.test

import com.rabbitmq.client.Channel
import com.rabbitmq.client.impl.AMQImpl.Queue.DeclareOk
import org.mockito.ArgumentMatchers.anyBoolean
import org.mockito.Mockito
import org.springframework.amqp.rabbit.connection.Connection
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.connection.ConnectionListener
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean

@TestConfiguration
class MessagingConfiguration {
    @Bean
    fun connectionFactory(): ConnectionFactory {
        return object : ConnectionFactory {
            override fun createConnection(): Connection {
                val mockConnection = Mockito.mock(Connection::class.java)
                val mockChannel = Mockito.mock(Channel::class.java)

                Mockito.`when`(
                    mockChannel.queueDeclare(
                        Mockito.anyString(),
                        anyBoolean(),
                        anyBoolean(),
                        anyBoolean(),
                        Mockito.anyMap()
                    )
                ).thenReturn(DeclareOk("dummyName", 0, 0))

                Mockito.`when`(mockConnection.createChannel(anyBoolean())).thenReturn(mockChannel)
                return mockConnection
            }

            override fun getHost(): String? {
                return null
            }

            override fun getPort(): Int {
                return 5672
            }

            override fun getVirtualHost(): String {
                return "localhost"
            }

            override fun getUsername(): String {
                return "testuser"
            }

            override fun addConnectionListener(listener: ConnectionListener) {

            }

            override fun removeConnectionListener(listener: ConnectionListener): Boolean {
                return true
            }

            override fun clearConnectionListeners() {

            }
        }
    }
}