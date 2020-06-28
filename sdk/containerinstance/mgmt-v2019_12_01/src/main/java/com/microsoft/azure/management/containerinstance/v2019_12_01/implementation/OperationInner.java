/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2019_12_01.implementation;

import com.microsoft.azure.management.containerinstance.v2019_12_01.OperationDisplay;
import com.microsoft.azure.management.containerinstance.v2019_12_01.ContainerInstanceOperationsOrigin;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An operation for Azure Container Instance service.
 */
public class OperationInner {
    /**
     * The name of the operation.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The display information of the operation.
     */
    @JsonProperty(value = "display", required = true)
    private OperationDisplay display;

    /**
     * The additional properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * The intended executor of the operation. Possible values include: 'User',
     * 'System'.
     */
    @JsonProperty(value = "origin")
    private ContainerInstanceOperationsOrigin origin;

    /**
     * Get the name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the operation.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display information of the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display information of the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the additional properties.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the additional properties.
     *
     * @param properties the properties value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the intended executor of the operation. Possible values include: 'User', 'System'.
     *
     * @return the origin value
     */
    public ContainerInstanceOperationsOrigin origin() {
        return this.origin;
    }

    /**
     * Set the intended executor of the operation. Possible values include: 'User', 'System'.
     *
     * @param origin the origin value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(ContainerInstanceOperationsOrigin origin) {
        this.origin = origin;
        return this;
    }

}
