package com.asyncapi.v3._0_0.model;

import com.asyncapi.v3.ExtendableObject;
import com.asyncapi.v3._0_0.model.channel.Channel;
import com.asyncapi.v3._0_0.model.component.Components;
import com.asyncapi.v3._0_0.model.info.Info;
import com.asyncapi.v3._0_0.model.server.Server;
import lombok.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the root document object for the API specification.
 * It combines resource listing and API declaration together into one document.
 *
 * @version 3.0.0
 * @see <a href="https://www.asyncapi.com/docs/reference/specification/v3.0.0-next-major-spec.14#A2SObject">AsyncAPI</a>
 * @author Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AsyncAPI extends ExtendableObject {

    /**
     * Required.
     * <p>
     * Specifies the AsyncAPI Specification version being used.
     * It can be used by tooling Specifications and clients to interpret the version.
     * The structure shall be major.minor.patch, where patch versions must be compatible
     * with the existing major.minor tooling.
     * <p>
     * Typically patch versions will be introduced to address errors in the documentation,
     * and tooling should typically be compatible with the corresponding major.minor (1.0.*).
     * Patch versions will correspond to patches of this document.
     */
    @NotNull
    @Builder.Default
    private final String asyncapi = "3.0.0";

    /**
     * Identifier of the application the AsyncAPI document is defining.
     * <p>
     * This field represents a unique universal identifier of the application the AsyncAPI document is defining.
     * It must conform to the URI format, according to RFC3986.
     * <p>
     * It is RECOMMENDED to use a URN to globally and uniquely identify the application during long periods of time,
     * even after it becomes unavailable or ceases to exist.
     */
    @Nullable
    private String id;

    /**
     * A string representing the default content type to use when encoding/decoding a message's payload.
     * The value MUST be a specific media type (e.g. application/json).
     * This value MUST be used by schema parsers when the contentType property is omitted.
     * <p>
     * In case a message can't be encoded/decoded using this value, schema parsers MUST use their default content type.
     */
    @Nullable
    private String defaultContentType;

    /**
     * Required.
     * <p>
     * Provides metadata about the API. The metadata can be used by the clients if needed.
     */
    @NotNull
    @Builder.Default
    private Info info = new Info();

    /**
     * Provides connection details of servers.
     */
    @Nullable
    private Map<String, Server> servers;

    /**
     * The available channels and messages for the API.
     * <p>
     * Holds the relative paths to the individual channel and their operations. Channel paths are relative to servers.
     * <p>
     * Channels are also known as "topics", "routing keys", "event types" or "paths".
     */
    @Nullable
    @Builder.Default
    private Map<String, Channel> channels = new HashMap<>();

    /**
     * The available operations for the API.
     */
    @Nullable
    @Builder.Default
    private Map<String, Channel> operations = new HashMap<>();

    /**
     * An element to hold various schemas for the specification.
     */
    @Nullable
    private Components components;

}

