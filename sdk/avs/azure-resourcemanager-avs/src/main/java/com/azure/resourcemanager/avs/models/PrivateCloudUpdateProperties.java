// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of a private cloud resource that may be updated. */
@Fluent
public class PrivateCloudUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateCloudUpdateProperties.class);

    /*
     * The default cluster used for management
     */
    @JsonProperty(value = "managementCluster")
    private ManagementCluster managementCluster;

    /*
     * Connectivity to internet is enabled or disabled
     */
    @JsonProperty(value = "internet")
    private InternetEnum internet;

    /*
     * vCenter Single Sign On Identity Sources
     */
    @JsonProperty(value = "identitySources")
    private List<IdentitySource> identitySources;

    /**
     * Get the managementCluster property: The default cluster used for management.
     *
     * @return the managementCluster value.
     */
    public ManagementCluster managementCluster() {
        return this.managementCluster;
    }

    /**
     * Set the managementCluster property: The default cluster used for management.
     *
     * @param managementCluster the managementCluster value to set.
     * @return the PrivateCloudUpdateProperties object itself.
     */
    public PrivateCloudUpdateProperties withManagementCluster(ManagementCluster managementCluster) {
        this.managementCluster = managementCluster;
        return this;
    }

    /**
     * Get the internet property: Connectivity to internet is enabled or disabled.
     *
     * @return the internet value.
     */
    public InternetEnum internet() {
        return this.internet;
    }

    /**
     * Set the internet property: Connectivity to internet is enabled or disabled.
     *
     * @param internet the internet value to set.
     * @return the PrivateCloudUpdateProperties object itself.
     */
    public PrivateCloudUpdateProperties withInternet(InternetEnum internet) {
        this.internet = internet;
        return this;
    }

    /**
     * Get the identitySources property: vCenter Single Sign On Identity Sources.
     *
     * @return the identitySources value.
     */
    public List<IdentitySource> identitySources() {
        return this.identitySources;
    }

    /**
     * Set the identitySources property: vCenter Single Sign On Identity Sources.
     *
     * @param identitySources the identitySources value to set.
     * @return the PrivateCloudUpdateProperties object itself.
     */
    public PrivateCloudUpdateProperties withIdentitySources(List<IdentitySource> identitySources) {
        this.identitySources = identitySources;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managementCluster() != null) {
            managementCluster().validate();
        }
        if (identitySources() != null) {
            identitySources().forEach(e -> e.validate());
        }
    }
}
