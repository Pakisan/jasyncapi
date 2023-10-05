package com.asyncapi.v3._0_0.model.channel.message;

import com.asyncapi.v3.ExtendableObject;
import lombok.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object that specifies an identifier at design time that can used for message tracing and correlation.
 * <br>
 * For specifying and computing the location of a Correlation ID, a <a href="https://www.asyncapi.com/docs/reference/specification/v2.6.0#runtimeExpression">runtime expression</a> is used.
 *
 * @version 3.0.0
 * @see <a href="https://www.asyncapi.com/docs/reference/specification/v2.6.0#correlationIdObject">CorrelationId</a>
 * @author Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CorrelationId extends ExtendableObject {

    /**
     * An optional description of the identifier. <a href="https://spec.commonmark.org/">CommonMark syntax</a> can be used for rich text representation.
     */
    @Nullable
    private String description;

    /**
     * REQUIRED.
     * <p>
     * A <a href="https://www.asyncapi.com/docs/reference/specification/v2.6.0#runtimeExpression">runtime expression</a> that specifies the location of the correlation ID.
     */
    @NotNull
    @Builder.Default
    private String location = "";

}
