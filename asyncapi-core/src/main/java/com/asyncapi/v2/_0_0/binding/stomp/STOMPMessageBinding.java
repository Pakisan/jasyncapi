package com.asyncapi.v2._0_0.binding.stomp;

import com.asyncapi.v2._0_0.binding.MessageBinding;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * This class MUST NOT contain any properties. Its name is reserved for future use.
 *
 * Describes STOMP message binding.
 *
 * @version 0.1.0
 * @see <a href="https://github.com/asyncapi/bindings/tree/master/sqs#message-binding-object">STOMP message binding</a>
 * @author Pavel Bodiachevskii
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class STOMPMessageBinding extends MessageBinding {
}
