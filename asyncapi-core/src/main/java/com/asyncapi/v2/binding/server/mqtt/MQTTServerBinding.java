package com.asyncapi.v2.binding.server.mqtt;

import com.asyncapi.v2.binding.server.ServerBinding;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Describes MQTT server binding.
 * <p>
 * Contains information about the server representation in MQTT.
 *
 * @version 0.1.0
 * @see <a href="https://github.com/asyncapi/bindings/tree/master/mqtt#server-binding-object">MQTT server binding</a>
 * @author Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MQTTServerBinding extends ServerBinding {

    /**
     * The client identifier.
     */
    @Nullable
    private String clientId;

    /**
     * Whether to create a persisten connection or not. When false, the connection will be persistent.
     */
    private boolean cleanSession;

    /**
     * Last Will and Testament configuration.
     */
    @Nullable
    private LastWillConfiguration lastWill;

    /**
     * Interval in seconds of the longest period of time the broker and the client can endure without sending a message.
     */
    private int keepAlive;

    /**
     * The version of this binding. If omitted, "latest" MUST be assumed.
     */
    @Nullable
    @Builder.Default
    private String bindingVersion = "0.1.0";

    @Data
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LastWillConfiguration {

        /**
         * The topic where the Last Will and Testament message will be sent.
         */
        @NotNull
        private String topic;

        /**
         * Defines how hard the broker/client will try to ensure that the Last Will and Testament message is received.
         * Its value MUST be either 0, 1 or 2.
         */
        private int qos;

        /**
         * Last Will message.
         */
        @Nullable
        private String message;

        /**
         * Whether the broker should retain the Last Will and Testament message or not.
         */
        private boolean retain;

    }

}
