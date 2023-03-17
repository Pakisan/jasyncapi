package com.asyncapi.v2.security_scheme.oauth2.flow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

/**
 * @version 2.6.0
 * @see <a href="https://www.asyncapi.com/docs/reference/specification/v2.6.0#oauthFlowObject">OAuth Flow Object</a>
 * @author Pavel Bodiachevskii
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ImplicitOAuthFlow extends OAuthFlow {

    /**
     * REQUIRED.
     * <p>
     * The authorization URL to be used for this flow. This MUST be in the form of a URL
     */
    @NotNull
    private String authorizationUrl = "";

    @Builder(builderMethodName = "implicitOAuthFlowBuilder")
    public ImplicitOAuthFlow(@Nullable String refreshUrl,
                             @NotNull Map<String, String> scopes,
                             @NotNull String authorizationUrl) {
        super(refreshUrl, scopes);
        this.authorizationUrl = authorizationUrl;
    }

}
