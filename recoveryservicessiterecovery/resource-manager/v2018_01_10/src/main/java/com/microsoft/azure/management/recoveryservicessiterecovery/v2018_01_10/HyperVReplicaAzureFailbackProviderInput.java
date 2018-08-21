/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * HvrA provider specific input for failback.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzureFailback")
public class HyperVReplicaAzureFailbackProviderInput extends ProviderSpecificFailoverInput {
    /**
     * Data sync option.
     */
    @JsonProperty(value = "dataSyncOption")
    private String dataSyncOption;

    /**
     * ALR options to create alternate recovery.
     */
    @JsonProperty(value = "recoveryVmCreationOption")
    private String recoveryVmCreationOption;

    /**
     * Provider ID for alternate location.
     */
    @JsonProperty(value = "providerIdForAlternateRecovery")
    private String providerIdForAlternateRecovery;

    /**
     * Get data sync option.
     *
     * @return the dataSyncOption value
     */
    public String dataSyncOption() {
        return this.dataSyncOption;
    }

    /**
     * Set data sync option.
     *
     * @param dataSyncOption the dataSyncOption value to set
     * @return the HyperVReplicaAzureFailbackProviderInput object itself.
     */
    public HyperVReplicaAzureFailbackProviderInput withDataSyncOption(String dataSyncOption) {
        this.dataSyncOption = dataSyncOption;
        return this;
    }

    /**
     * Get aLR options to create alternate recovery.
     *
     * @return the recoveryVmCreationOption value
     */
    public String recoveryVmCreationOption() {
        return this.recoveryVmCreationOption;
    }

    /**
     * Set aLR options to create alternate recovery.
     *
     * @param recoveryVmCreationOption the recoveryVmCreationOption value to set
     * @return the HyperVReplicaAzureFailbackProviderInput object itself.
     */
    public HyperVReplicaAzureFailbackProviderInput withRecoveryVmCreationOption(String recoveryVmCreationOption) {
        this.recoveryVmCreationOption = recoveryVmCreationOption;
        return this;
    }

    /**
     * Get provider ID for alternate location.
     *
     * @return the providerIdForAlternateRecovery value
     */
    public String providerIdForAlternateRecovery() {
        return this.providerIdForAlternateRecovery;
    }

    /**
     * Set provider ID for alternate location.
     *
     * @param providerIdForAlternateRecovery the providerIdForAlternateRecovery value to set
     * @return the HyperVReplicaAzureFailbackProviderInput object itself.
     */
    public HyperVReplicaAzureFailbackProviderInput withProviderIdForAlternateRecovery(String providerIdForAlternateRecovery) {
        this.providerIdForAlternateRecovery = providerIdForAlternateRecovery;
        return this;
    }

}
