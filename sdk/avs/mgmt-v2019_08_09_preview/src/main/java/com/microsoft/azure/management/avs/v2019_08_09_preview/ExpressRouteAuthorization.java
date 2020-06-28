/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authorization for an ExpressRoute.
 */
public class ExpressRouteAuthorization {
    /**
     * The name of the ExpressRoute.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The ID of the ExpressRoute.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The key of the ExpressRoute.
     */
    @JsonProperty(value = "key", access = JsonProperty.Access.WRITE_ONLY)
    private String key;

    /**
     * Get the name of the ExpressRoute.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the ExpressRoute.
     *
     * @param name the name value to set
     * @return the ExpressRouteAuthorization object itself.
     */
    public ExpressRouteAuthorization withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ID of the ExpressRoute.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the key of the ExpressRoute.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

}
