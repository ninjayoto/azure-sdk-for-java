/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Referenced dependency.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DependencyReference")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SelfDependencyTumblingWindowTriggerReference", value = SelfDependencyTumblingWindowTriggerReference.class),
    @JsonSubTypes.Type(name = "TriggerDependencyReference", value = TriggerDependencyReference.class)
})
public class DependencyReference {
}