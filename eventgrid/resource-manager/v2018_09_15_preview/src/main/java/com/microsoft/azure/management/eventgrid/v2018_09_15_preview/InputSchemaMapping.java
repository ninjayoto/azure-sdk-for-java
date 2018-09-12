/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_09_15_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * By default, Event Grid expects events to be in the Event Grid event schema.
 * Specifying an input schema mapping enables publishing to Event Grid using a
 * custom input schema. Currently, the only supported type of
 * InputSchemaMapping is 'JsonInputSchemaMapping'.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "inputSchemaMappingType")
@JsonTypeName("InputSchemaMapping")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Json", value = JsonInputSchemaMapping.class)
})
public class InputSchemaMapping {
}
