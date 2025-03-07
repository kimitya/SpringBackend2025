/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.7
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baeldung.petstore.client.invoker.auth;

import java.util.Optional;
import java.util.function.Supplier;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

/**
 * Provides support for RFC 6750 - Bearer Token usage for OAUTH 2.0 Authorization.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T20:30:34.675278+05:00[Asia/Almaty]", comments = "Generator version: 7.12.0")
public class OAuth implements Authentication {
    private Supplier<String> tokenSupplier;

    /**
     * Returns the bearer token used for Authorization.
     *
     * @return The bearer token
     */
    public String getAccessToken() {
        return tokenSupplier.get();
    }

    /**
     * Sets the bearer access token used for Authorization.
     *
     * @param accessToken The bearer token to send in the Authorization header
     */
    public void setAccessToken(String accessToken) {
        setAccessToken(() -> accessToken);
    }

    /**
     * Sets the supplier of bearer tokens used for Authorization.
     *
     * @param tokenSupplier The supplier of bearer tokens to send in the Authorization header
     */
    public void setAccessToken(Supplier<String> tokenSupplier) {
        this.tokenSupplier = tokenSupplier;
    }

    @Override
    public void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams, MultiValueMap<String, String> cookieParams) {
        Optional.ofNullable(tokenSupplier).map(Supplier::get).ifPresent(accessToken ->
            headerParams.add(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
        );
    }
}
