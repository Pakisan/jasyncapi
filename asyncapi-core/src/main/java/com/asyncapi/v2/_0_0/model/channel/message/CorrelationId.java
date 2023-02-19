package com.asyncapi.v2._0_0.model.channel.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object that specifies an identifier at design time that can used for message tracing and correlation.
 * <br>
 * For specifying and computing the location of a Correlation ID, a runtime expression is used.
 *
 * @version 2.0.0
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#correlationIdObject">CorrelationId</a>
 * @author Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CorrelationId {

    /**
     * An optional description of the identifier. CommonMark syntax can be used for rich text representation.
     */
    @Nullable
    private String description;

    /**
     * REQUIRED.
     *
     * A runtime expression that specifies the location of the correlation ID.
     */
    @NotNull
    private String location;

}
