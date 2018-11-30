/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.servicefabric.EntityHealth;

/**
 * Represents a base class for stateful service replica or stateless service
 * instance health.
 * Contains the replica aggregated health state, the health events and the
 * unhealthy evaluations.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("ReplicaHealth")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceReplicaHealth.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceInstanceHealth.class)
})
public class ReplicaHealthInner extends EntityHealth {
    /**
     * Id of the partition to which this replica belongs.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /**
     * Get id of the partition to which this replica belongs.
     *
     * @return the partitionId value
     */
    public UUID partitionId() {
        return this.partitionId;
    }

    /**
     * Set id of the partition to which this replica belongs.
     *
     * @param partitionId the partitionId value to set
     * @return the ReplicaHealthInner object itself.
     */
    public ReplicaHealthInner withPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

}
