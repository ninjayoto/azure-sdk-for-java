/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes an input data source that contains stream data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("StreamInputDataSource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.Storage/Blob", value = BlobStreamInputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.ServiceBus/EventHub", value = EventHubStreamInputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.Devices/IotHubs", value = IoTHubStreamInputDataSource.class)
})
public class StreamInputDataSource {
}
