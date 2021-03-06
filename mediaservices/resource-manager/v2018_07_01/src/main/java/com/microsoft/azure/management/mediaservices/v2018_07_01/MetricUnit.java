/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for MetricUnit.
 */
public enum MetricUnit {
    /** The number of bytes. */
    BYTES("Bytes"),

    /** The count. */
    COUNT("Count"),

    /** The number of milliseconds. */
    MILLISECONDS("Milliseconds");

    /** The actual serialized value for a MetricUnit instance. */
    private String value;

    MetricUnit(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MetricUnit instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MetricUnit object, or null if unable to parse.
     */
    @JsonCreator
    public static MetricUnit fromString(String value) {
        MetricUnit[] items = MetricUnit.values();
        for (MetricUnit item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
