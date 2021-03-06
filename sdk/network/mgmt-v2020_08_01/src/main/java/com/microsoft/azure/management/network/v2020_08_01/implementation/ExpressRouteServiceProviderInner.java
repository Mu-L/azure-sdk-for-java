/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_08_01.ExpressRouteServiceProviderBandwidthsOffered;
import com.microsoft.azure.management.network.v2020_08_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A ExpressRouteResourceProvider object.
 */
@JsonFlatten
@SkipParentValidation
public class ExpressRouteServiceProviderInner extends Resource {
    /**
     * A list of peering locations.
     */
    @JsonProperty(value = "properties.peeringLocations")
    private List<String> peeringLocations;

    /**
     * A list of bandwidths offered.
     */
    @JsonProperty(value = "properties.bandwidthsOffered")
    private List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered;

    /**
     * The provisioning state of the express route service provider resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get a list of peering locations.
     *
     * @return the peeringLocations value
     */
    public List<String> peeringLocations() {
        return this.peeringLocations;
    }

    /**
     * Set a list of peering locations.
     *
     * @param peeringLocations the peeringLocations value to set
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withPeeringLocations(List<String> peeringLocations) {
        this.peeringLocations = peeringLocations;
        return this;
    }

    /**
     * Get a list of bandwidths offered.
     *
     * @return the bandwidthsOffered value
     */
    public List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered() {
        return this.bandwidthsOffered;
    }

    /**
     * Set a list of bandwidths offered.
     *
     * @param bandwidthsOffered the bandwidthsOffered value to set
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withBandwidthsOffered(List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered) {
        this.bandwidthsOffered = bandwidthsOffered;
        return this;
    }

    /**
     * Get the provisioning state of the express route service provider resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withId(String id) {
        this.id = id;
        return this;
    }

}
