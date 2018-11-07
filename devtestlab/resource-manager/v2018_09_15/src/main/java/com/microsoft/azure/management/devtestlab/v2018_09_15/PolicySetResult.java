/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of a policy set evaluation.
 */
public class PolicySetResult {
    /**
     * A value indicating whether this policy set evaluation has discovered
     * violations.
     */
    @JsonProperty(value = "hasError")
    private Boolean hasError;

    /**
     * The list of policy violations.
     */
    @JsonProperty(value = "policyViolations")
    private List<PolicyViolation> policyViolations;

    /**
     * Get a value indicating whether this policy set evaluation has discovered violations.
     *
     * @return the hasError value
     */
    public Boolean hasError() {
        return this.hasError;
    }

    /**
     * Set a value indicating whether this policy set evaluation has discovered violations.
     *
     * @param hasError the hasError value to set
     * @return the PolicySetResult object itself.
     */
    public PolicySetResult withHasError(Boolean hasError) {
        this.hasError = hasError;
        return this;
    }

    /**
     * Get the list of policy violations.
     *
     * @return the policyViolations value
     */
    public List<PolicyViolation> policyViolations() {
        return this.policyViolations;
    }

    /**
     * Set the list of policy violations.
     *
     * @param policyViolations the policyViolations value to set
     * @return the PolicySetResult object itself.
     */
    public PolicySetResult withPolicyViolations(List<PolicyViolation> policyViolations) {
        this.policyViolations = policyViolations;
        return this;
    }

}
