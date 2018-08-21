/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Input details specific to fabrics during Network Mapping.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("FabricSpecificCreateNetworkMappingInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureToAzure", value = AzureToAzureCreateNetworkMappingInput.class),
    @JsonSubTypes.Type(name = "VmmToAzure", value = VmmToAzureCreateNetworkMappingInput.class),
    @JsonSubTypes.Type(name = "VmmToVmm", value = VmmToVmmCreateNetworkMappingInput.class)
})
public class FabricSpecificCreateNetworkMappingInput {
}
