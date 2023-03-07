package com.asyncapi.v2.binding.message.amqp

import com.asyncapi.v2.SerDeTest

class AMQPMessageBindingTest: SerDeTest<AMQPMessageBinding>() {

    override fun objectClass() = AMQPMessageBinding::class.java

    override fun baseObjectJson() = "/json/2.6.0/binding/message/amqp/amqpMessageBinding.json"

    override fun extendedObjectJson() = "/json/2.6.0/binding/message/amqp/amqpMessageBinding - extended.json"

    override fun wronglyExtendedObjectJson() = "/json/2.6.0/binding/message/amqp/amqpMessageBinding - wrongly extended.json"

    override fun build(): AMQPMessageBinding {
        return AMQPMessageBinding.builder()
                .contentEncoding("gzip")
                .messageType("user.signup")
                .build()
    }

}