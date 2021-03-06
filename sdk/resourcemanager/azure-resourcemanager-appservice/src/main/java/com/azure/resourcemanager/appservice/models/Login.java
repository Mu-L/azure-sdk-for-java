// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Login model. */
@JsonFlatten
@Fluent
public class Login extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Login.class);

    /*
     * The routes property.
     */
    @JsonProperty(value = "properties.routes")
    private LoginRoutes routes;

    /*
     * The tokenStore property.
     */
    @JsonProperty(value = "properties.tokenStore")
    private TokenStore tokenStore;

    /*
     * The preserveUrlFragmentsForLogins property.
     */
    @JsonProperty(value = "properties.preserveUrlFragmentsForLogins")
    private Boolean preserveUrlFragmentsForLogins;

    /*
     * The allowedExternalRedirectUrls property.
     */
    @JsonProperty(value = "properties.allowedExternalRedirectUrls")
    private List<String> allowedExternalRedirectUrls;

    /*
     * The cookieExpiration property.
     */
    @JsonProperty(value = "properties.cookieExpiration")
    private CookieExpiration cookieExpiration;

    /*
     * The nonce property.
     */
    @JsonProperty(value = "properties.nonce")
    private Nonce nonce;

    /**
     * Get the routes property: The routes property.
     *
     * @return the routes value.
     */
    public LoginRoutes routes() {
        return this.routes;
    }

    /**
     * Set the routes property: The routes property.
     *
     * @param routes the routes value to set.
     * @return the Login object itself.
     */
    public Login withRoutes(LoginRoutes routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the tokenStore property: The tokenStore property.
     *
     * @return the tokenStore value.
     */
    public TokenStore tokenStore() {
        return this.tokenStore;
    }

    /**
     * Set the tokenStore property: The tokenStore property.
     *
     * @param tokenStore the tokenStore value to set.
     * @return the Login object itself.
     */
    public Login withTokenStore(TokenStore tokenStore) {
        this.tokenStore = tokenStore;
        return this;
    }

    /**
     * Get the preserveUrlFragmentsForLogins property: The preserveUrlFragmentsForLogins property.
     *
     * @return the preserveUrlFragmentsForLogins value.
     */
    public Boolean preserveUrlFragmentsForLogins() {
        return this.preserveUrlFragmentsForLogins;
    }

    /**
     * Set the preserveUrlFragmentsForLogins property: The preserveUrlFragmentsForLogins property.
     *
     * @param preserveUrlFragmentsForLogins the preserveUrlFragmentsForLogins value to set.
     * @return the Login object itself.
     */
    public Login withPreserveUrlFragmentsForLogins(Boolean preserveUrlFragmentsForLogins) {
        this.preserveUrlFragmentsForLogins = preserveUrlFragmentsForLogins;
        return this;
    }

    /**
     * Get the allowedExternalRedirectUrls property: The allowedExternalRedirectUrls property.
     *
     * @return the allowedExternalRedirectUrls value.
     */
    public List<String> allowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls;
    }

    /**
     * Set the allowedExternalRedirectUrls property: The allowedExternalRedirectUrls property.
     *
     * @param allowedExternalRedirectUrls the allowedExternalRedirectUrls value to set.
     * @return the Login object itself.
     */
    public Login withAllowedExternalRedirectUrls(List<String> allowedExternalRedirectUrls) {
        this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
        return this;
    }

    /**
     * Get the cookieExpiration property: The cookieExpiration property.
     *
     * @return the cookieExpiration value.
     */
    public CookieExpiration cookieExpiration() {
        return this.cookieExpiration;
    }

    /**
     * Set the cookieExpiration property: The cookieExpiration property.
     *
     * @param cookieExpiration the cookieExpiration value to set.
     * @return the Login object itself.
     */
    public Login withCookieExpiration(CookieExpiration cookieExpiration) {
        this.cookieExpiration = cookieExpiration;
        return this;
    }

    /**
     * Get the nonce property: The nonce property.
     *
     * @return the nonce value.
     */
    public Nonce nonce() {
        return this.nonce;
    }

    /**
     * Set the nonce property: The nonce property.
     *
     * @param nonce the nonce value to set.
     * @return the Login object itself.
     */
    public Login withNonce(Nonce nonce) {
        this.nonce = nonce;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Login withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (routes() != null) {
            routes().validate();
        }
        if (tokenStore() != null) {
            tokenStore().validate();
        }
        if (cookieExpiration() != null) {
            cookieExpiration().validate();
        }
        if (nonce() != null) {
            nonce().validate();
        }
    }
}
