package com.asyncapi.v3._0_0.model.server;

import com.asyncapi.v3.jackson.binding.server.ServerBindingsDeserializer;
import com.asyncapi.v3._0_0.jackson.model.server.ServerVariablesDeserializer;
import com.asyncapi.v3.binding.server.ServerBinding;
import com.asyncapi.v3.ExtendableObject;
import com.asyncapi.v3.Reference;
import com.asyncapi.v3._0_0.jackson.model.ExternalDocumentationDeserializer;
import com.asyncapi.v3._0_0.jackson.model.TagsDeserializer;
import com.asyncapi.v3._0_0.model.ExternalDocumentation;
import com.asyncapi.v3._0_0.model.Tag;
import com.asyncapi.v3.jackson.security_scheme.SecuritySchemesDeserializer;
import com.asyncapi.v3.security_scheme.SecurityScheme;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

/**
 * An object representing a message broker, a server or any other kind of computer program capable of sending and/or
 * receiving data. This object is used to capture details such as URIs, protocols and security configuration.
 * Variable substitution can be used so that some details, for example usernames and passwords, can be injected by
 * code generation tools.
 *
 * @version 3.0.0
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#serverObject">Server</a>
 * @author Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Server extends ExtendableObject {

    /**
     * REQUIRED.
     * <p>
     * The server host name. It MAY include the port. This field supports Server Variables.
     * Variable substitutions will be made when a variable is named in {braces}.
     */
    @NotNull
    @JsonProperty
    @Builder.Default
    private String host = "";

    /**
     * REQUIRED.
     * <p>
     * The protocol this URL supports for connection. Supported protocol include, but are not limited to:
     * amqp, amqps, http, https, jms, kafka, kafka-secure, mqtt, secure-mqtt, stomp, stomps, ws, wss.
     */
    @NotNull
    @JsonProperty
    @Builder.Default
    private String protocol = "";

    /**
     * The version of the protocol used for connection. For instance: AMQP 0.9.1, HTTP 2.0, Kafka 1.0.0, etc.
     */
    @Nullable
    @JsonProperty
    private String protocolVersion;

    /**
     * The path to a resource in the host. This field supports Server Variables.
     * Variable substitutions will be made when a variable is named in {braces}.
     */
    @Nullable
    @JsonProperty
    private String pathname;

    /**
     * An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text
     * representation.
     */
    @Nullable
    @JsonProperty
    private String description;

    /**
     * A human-friendly title for the server.
     */
    @Nullable
    @JsonProperty
    private String title;

    /**
     * A short summary of the server.
     */
    @Nullable
    @JsonProperty
    private String summary;

    /**
     * A map between a variable name and its value.
     * The value is used for substitution in the server's host and pathname template.
     * <p>
     * MUST BE:
     * <ul>
     *     <li>{@link ServerVariable}</li>
     *     <li>{@link Reference}</li>
     * </ul>
     */
    @Nullable
    @JsonProperty
    @JsonDeserialize(using = ServerVariablesDeserializer.class)
    private Map<String, Object> variables;

    /**
     * A declaration of which security schemes can be used with this server. The list of values includes alternative
     * security scheme objects that can be used. Only one of the security scheme objects need to be satisfied to
     * authorize a connection or operation.
     * <p>
     * MUST BE:
     * <ul>
     *     <li>{@link SecurityScheme}</li>
     *     <li>{@link Reference}</li>
     * </ul>
     */
    @Nullable
    @JsonProperty
    @JsonDeserialize(using = SecuritySchemesDeserializer.class)
    private List<Object> security;

    /**
     * A list of tags for logical grouping and categorization of servers.
     * <p>
     * MUST BE:
     * <ul>
     *     <li>{@link Tag}</li>
     *     <li>{@link Reference}</li>
     * </ul>
     */
    @Nullable
    @JsonProperty
    @JsonDeserialize(using = TagsDeserializer.class)
    private List<Object> tags;

    /**
     * Additional external documentation of the exposed API.
     * <p>
     * MUST BE:
     * <ul>
     *     <li>{@link ExternalDocumentation}</li>
     *     <li>{@link Reference}</li>
     * </ul>
     */
    @Nullable
    @JsonProperty
    @JsonDeserialize(using = ExternalDocumentationDeserializer.class)
    private Object externalDocs;

    /**
     * A map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the server.
     * <p>
     * MUST be one of:
     * <ul>
     *     <li>{@link Reference}</li>
     *     <li>{@link ServerBinding}</li>
     * </ul>
     */
    @Nullable
    @JsonDeserialize(using = ServerBindingsDeserializer.class)
    private Map<String, Object> bindings;

}
