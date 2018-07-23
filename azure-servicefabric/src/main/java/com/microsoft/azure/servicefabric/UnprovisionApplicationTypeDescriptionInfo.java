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
 * Describes the operation to unregister or unprovision an application type and
 * its version that was registered with the Service Fabric.
 */
public class UnprovisionApplicationTypeDescriptionInfo {
    /**
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /**
     * The flag indicating whether or not unprovision should occur
     * asynchronously. When set to true, the unprovision operation returns when
     * the request is accepted by the system, and the unprovision operation
     * continues without any timeout limit. The default value is false.
     * However, we recommend setting it to true for large application packages
     * that were provisioned.
     */
    @JsonProperty(value = "Async")
    private Boolean async;

    /**
     * Get the version of the application type as defined in the application manifest.
     *
     * @return the applicationTypeVersion value
     */
    public String applicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set the version of the application type as defined in the application manifest.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set
     * @return the UnprovisionApplicationTypeDescriptionInfo object itself.
     */
    public UnprovisionApplicationTypeDescriptionInfo withApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get the flag indicating whether or not unprovision should occur asynchronously. When set to true, the unprovision operation returns when the request is accepted by the system, and the unprovision operation continues without any timeout limit. The default value is false. However, we recommend setting it to true for large application packages that were provisioned.
     *
     * @return the async value
     */
    public Boolean async() {
        return this.async;
    }

    /**
     * Set the flag indicating whether or not unprovision should occur asynchronously. When set to true, the unprovision operation returns when the request is accepted by the system, and the unprovision operation continues without any timeout limit. The default value is false. However, we recommend setting it to true for large application packages that were provisioned.
     *
     * @param async the async value to set
     * @return the UnprovisionApplicationTypeDescriptionInfo object itself.
     */
    public UnprovisionApplicationTypeDescriptionInfo withAsync(Boolean async) {
        this.async = async;
        return this;
    }

}
