/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.NodeEventInner;

/**
 * Node Close event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeClose")
public class NodeCloseEvent extends NodeEventInner {
    /**
     * Id of Node.
     */
    @JsonProperty(value = "NodeId", required = true)
    private String nodeId;

    /**
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private String nodeInstance;

    /**
     * Describes error.
     */
    @JsonProperty(value = "Error", required = true)
    private String error;

    /**
     * Get id of Node.
     *
     * @return the nodeId value
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Set id of Node.
     *
     * @param nodeId the nodeId value to set
     * @return the NodeCloseEvent object itself.
     */
    public NodeCloseEvent withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get id of Node instance.
     *
     * @return the nodeInstance value
     */
    public String nodeInstance() {
        return this.nodeInstance;
    }

    /**
     * Set id of Node instance.
     *
     * @param nodeInstance the nodeInstance value to set
     * @return the NodeCloseEvent object itself.
     */
    public NodeCloseEvent withNodeInstance(String nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get describes error.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set describes error.
     *
     * @param error the error value to set
     * @return the NodeCloseEvent object itself.
     */
    public NodeCloseEvent withError(String error) {
        this.error = error;
        return this;
    }

}
