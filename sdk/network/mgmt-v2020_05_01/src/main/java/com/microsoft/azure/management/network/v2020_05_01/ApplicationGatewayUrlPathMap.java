/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * UrlPathMaps give a url path to the backend mapping information for
 * PathBasedRouting.
 */
@JsonFlatten
public class ApplicationGatewayUrlPathMap extends SubResource {
    /**
     * Default backend address pool resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendAddressPool")
    private SubResource defaultBackendAddressPool;

    /**
     * Default backend http settings resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendHttpSettings")
    private SubResource defaultBackendHttpSettings;

    /**
     * Default Rewrite rule set resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultRewriteRuleSet")
    private SubResource defaultRewriteRuleSet;

    /**
     * Default redirect configuration resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultRedirectConfiguration")
    private SubResource defaultRedirectConfiguration;

    /**
     * Path rule of URL path map resource.
     */
    @JsonProperty(value = "properties.pathRules")
    private List<ApplicationGatewayPathRule> pathRules;

    /**
     * The provisioning state of the URL path map resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name of the URL path map that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get default backend address pool resource of URL path map.
     *
     * @return the defaultBackendAddressPool value
     */
    public SubResource defaultBackendAddressPool() {
        return this.defaultBackendAddressPool;
    }

    /**
     * Set default backend address pool resource of URL path map.
     *
     * @param defaultBackendAddressPool the defaultBackendAddressPool value to set
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withDefaultBackendAddressPool(SubResource defaultBackendAddressPool) {
        this.defaultBackendAddressPool = defaultBackendAddressPool;
        return this;
    }

    /**
     * Get default backend http settings resource of URL path map.
     *
     * @return the defaultBackendHttpSettings value
     */
    public SubResource defaultBackendHttpSettings() {
        return this.defaultBackendHttpSettings;
    }

    /**
     * Set default backend http settings resource of URL path map.
     *
     * @param defaultBackendHttpSettings the defaultBackendHttpSettings value to set
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withDefaultBackendHttpSettings(SubResource defaultBackendHttpSettings) {
        this.defaultBackendHttpSettings = defaultBackendHttpSettings;
        return this;
    }

    /**
     * Get default Rewrite rule set resource of URL path map.
     *
     * @return the defaultRewriteRuleSet value
     */
    public SubResource defaultRewriteRuleSet() {
        return this.defaultRewriteRuleSet;
    }

    /**
     * Set default Rewrite rule set resource of URL path map.
     *
     * @param defaultRewriteRuleSet the defaultRewriteRuleSet value to set
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withDefaultRewriteRuleSet(SubResource defaultRewriteRuleSet) {
        this.defaultRewriteRuleSet = defaultRewriteRuleSet;
        return this;
    }

    /**
     * Get default redirect configuration resource of URL path map.
     *
     * @return the defaultRedirectConfiguration value
     */
    public SubResource defaultRedirectConfiguration() {
        return this.defaultRedirectConfiguration;
    }

    /**
     * Set default redirect configuration resource of URL path map.
     *
     * @param defaultRedirectConfiguration the defaultRedirectConfiguration value to set
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withDefaultRedirectConfiguration(SubResource defaultRedirectConfiguration) {
        this.defaultRedirectConfiguration = defaultRedirectConfiguration;
        return this;
    }

    /**
     * Get path rule of URL path map resource.
     *
     * @return the pathRules value
     */
    public List<ApplicationGatewayPathRule> pathRules() {
        return this.pathRules;
    }

    /**
     * Set path rule of URL path map resource.
     *
     * @param pathRules the pathRules value to set
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withPathRules(List<ApplicationGatewayPathRule> pathRules) {
        this.pathRules = pathRules;
        return this;
    }

    /**
     * Get the provisioning state of the URL path map resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the URL path map that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the URL path map that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
