// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Description of a namespace resource. */
@JsonFlatten
@Fluent
public class SBNamespaceUpdateParameters extends ResourceNamespacePatch {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SBNamespaceUpdateParameters.class);

    /*
     * Properties of Sku
     */
    @JsonProperty(value = "sku")
    private SBSku sku;

    /*
     * Provisioning state of the namespace.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The time the namespace was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time the namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "properties.serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /*
     * Identifier for Azure Insights metrics
     */
    @JsonProperty(value = "properties.metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /**
     * Get the sku property: Properties of Sku.
     *
     * @return the sku value.
     */
    public SBSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Properties of Sku.
     *
     * @param sku the sku value to set.
     * @return the SBNamespaceUpdateParameters object itself.
     */
    public SBNamespaceUpdateParameters withSku(SBSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /** {@inheritDoc} */
    @Override
    public SBNamespaceUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SBNamespaceUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (sku() != null) {
            sku().validate();
        }
    }
}
