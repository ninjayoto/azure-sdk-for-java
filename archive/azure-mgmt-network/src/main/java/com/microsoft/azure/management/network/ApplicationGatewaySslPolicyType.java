/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ApplicationGatewaySslPolicyType.
 */
public final class ApplicationGatewaySslPolicyType {
    /** Static value Predefined for ApplicationGatewaySslPolicyType. */
    public static final ApplicationGatewaySslPolicyType PREDEFINED = new ApplicationGatewaySslPolicyType("Predefined");

    /** Static value Custom for ApplicationGatewaySslPolicyType. */
    public static final ApplicationGatewaySslPolicyType CUSTOM = new ApplicationGatewaySslPolicyType("Custom");

    private String value;

    /**
     * Creates a custom value for ApplicationGatewaySslPolicyType.
     * @param value the custom value
     */
    public ApplicationGatewaySslPolicyType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ApplicationGatewaySslPolicyType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ApplicationGatewaySslPolicyType rhs = (ApplicationGatewaySslPolicyType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
