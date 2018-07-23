/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state chunk of a deployed service package, which
 * contains the service manifest name and the service package aggregated health
 * state.
 */
public class DeployedServicePackageHealthStateChunk extends EntityHealthStateChunk {
    /**
     * The name of the service manifest.
     */
    @JsonProperty(value = "ServiceManifestName")
    private String serviceManifestName;

    /**
     * The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the
     * service
     * is 'SharedProcess' (or if it is not specified, in which case it defaults
     * to 'SharedProcess'), then value of ServicePackageActivationId
     * is always an empty string.
     */
    @JsonProperty(value = "ServicePackageActivationId")
    private String servicePackageActivationId;

    /**
     * Get the name of the service manifest.
     *
     * @return the serviceManifestName value
     */
    public String serviceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the name of the service manifest.
     *
     * @param serviceManifestName the serviceManifestName value to set
     * @return the DeployedServicePackageHealthStateChunk object itself.
     */
    public DeployedServicePackageHealthStateChunk withServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the ActivationId of a deployed service package. If ServicePackageActivationMode specified at the time of creating the service
     is 'SharedProcess' (or if it is not specified, in which case it defaults to 'SharedProcess'), then value of ServicePackageActivationId
     is always an empty string.
     *
     * @return the servicePackageActivationId value
     */
    public String servicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set the ActivationId of a deployed service package. If ServicePackageActivationMode specified at the time of creating the service
     is 'SharedProcess' (or if it is not specified, in which case it defaults to 'SharedProcess'), then value of ServicePackageActivationId
     is always an empty string.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set
     * @return the DeployedServicePackageHealthStateChunk object itself.
     */
    public DeployedServicePackageHealthStateChunk withServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }

}
