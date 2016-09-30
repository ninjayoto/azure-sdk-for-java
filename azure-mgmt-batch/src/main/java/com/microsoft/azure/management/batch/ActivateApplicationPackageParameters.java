/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for an ApplicationOperations.ActivateApplicationPackage request.
 */
public class ActivateApplicationPackageParameters {
    /**
     * The format of the application package binary file.
     */
    @JsonProperty(required = true)
    private String format;

    /**
     * Get the format value.
     *
     * @return the format value
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format value.
     *
     * @param format the format value to set
     * @return the ActivateApplicationPackageParameters object itself.
     */
    public ActivateApplicationPackageParameters withFormat(String format) {
        this.format = format;
        return this;
    }

}