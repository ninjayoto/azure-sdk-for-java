/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure specific reprotect input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
public class A2AReprotectInput extends ReverseReplicationProviderSpecificInput {
    /**
     * The recovery container Id.
     */
    @JsonProperty(value = "recoveryContainerId")
    private String recoveryContainerId;

    /**
     * The list of vm disk details.
     */
    @JsonProperty(value = "vmDisks")
    private List<A2AVmDiskInputDetails> vmDisks;

    /**
     * The recovery resource group Id. Valid for V2 scenarios.
     */
    @JsonProperty(value = "recoveryResourceGroupId")
    private String recoveryResourceGroupId;

    /**
     * The recovery cloud service Id. Valid for V1 scenarios.
     */
    @JsonProperty(value = "recoveryCloudServiceId")
    private String recoveryCloudServiceId;

    /**
     * The recovery availability set.
     */
    @JsonProperty(value = "recoveryAvailabilitySetId")
    private String recoveryAvailabilitySetId;

    /**
     * The Policy Id.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /**
     * Get the recovery container Id.
     *
     * @return the recoveryContainerId value
     */
    public String recoveryContainerId() {
        return this.recoveryContainerId;
    }

    /**
     * Set the recovery container Id.
     *
     * @param recoveryContainerId the recoveryContainerId value to set
     * @return the A2AReprotectInput object itself.
     */
    public A2AReprotectInput withRecoveryContainerId(String recoveryContainerId) {
        this.recoveryContainerId = recoveryContainerId;
        return this;
    }

    /**
     * Get the list of vm disk details.
     *
     * @return the vmDisks value
     */
    public List<A2AVmDiskInputDetails> vmDisks() {
        return this.vmDisks;
    }

    /**
     * Set the list of vm disk details.
     *
     * @param vmDisks the vmDisks value to set
     * @return the A2AReprotectInput object itself.
     */
    public A2AReprotectInput withVmDisks(List<A2AVmDiskInputDetails> vmDisks) {
        this.vmDisks = vmDisks;
        return this;
    }

    /**
     * Get the recovery resource group Id. Valid for V2 scenarios.
     *
     * @return the recoveryResourceGroupId value
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the recovery resource group Id. Valid for V2 scenarios.
     *
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set
     * @return the A2AReprotectInput object itself.
     */
    public A2AReprotectInput withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get the recovery cloud service Id. Valid for V1 scenarios.
     *
     * @return the recoveryCloudServiceId value
     */
    public String recoveryCloudServiceId() {
        return this.recoveryCloudServiceId;
    }

    /**
     * Set the recovery cloud service Id. Valid for V1 scenarios.
     *
     * @param recoveryCloudServiceId the recoveryCloudServiceId value to set
     * @return the A2AReprotectInput object itself.
     */
    public A2AReprotectInput withRecoveryCloudServiceId(String recoveryCloudServiceId) {
        this.recoveryCloudServiceId = recoveryCloudServiceId;
        return this;
    }

    /**
     * Get the recovery availability set.
     *
     * @return the recoveryAvailabilitySetId value
     */
    public String recoveryAvailabilitySetId() {
        return this.recoveryAvailabilitySetId;
    }

    /**
     * Set the recovery availability set.
     *
     * @param recoveryAvailabilitySetId the recoveryAvailabilitySetId value to set
     * @return the A2AReprotectInput object itself.
     */
    public A2AReprotectInput withRecoveryAvailabilitySetId(String recoveryAvailabilitySetId) {
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
        return this;
    }

    /**
     * Get the Policy Id.
     *
     * @return the policyId value
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the Policy Id.
     *
     * @param policyId the policyId value to set
     * @return the A2AReprotectInput object itself.
     */
    public A2AReprotectInput withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

}
