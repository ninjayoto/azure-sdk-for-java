/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes capacity information for a custom resource balancing metric. This
 * can be used to limit the total consumption of this metric by the services of
 * this application.
 */
public class ApplicationMetricDescription {
    /**
     * The name of the metric.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The maximum node capacity for Service Fabric application.
     * This is the maximum Load for an instance of this application on a single
     * node. Even if the capacity of node is greater than this value, Service
     * Fabric will limit the total load of services within the application on
     * each node to this value.
     * If set to zero, capacity for this metric is unlimited on each node.
     * When creating a new application with application capacity defined, the
     * product of MaximumNodes and this value must always be smaller than or
     * equal to TotalApplicationCapacity.
     * When updating existing application with application capacity, the
     * product of MaximumNodes and this value must always be smaller than or
     * equal to TotalApplicationCapacity.
     */
    @JsonProperty(value = "MaximumCapacity")
    private Long maximumCapacity;

    /**
     * The node reservation capacity for Service Fabric application.
     * This is the amount of load which is reserved on nodes which have
     * instances of this application.
     * If MinimumNodes is specified, then the product of these values will be
     * the capacity reserved in the cluster for the application.
     * If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity;
     * this value must be smaller than or equal to MaximumCapacity for each
     * metric.
     */
    @JsonProperty(value = "ReservationCapacity")
    private Long reservationCapacity;

    /**
     * The total metric capacity for Service Fabric application.
     * This is the total metric capacity for this application in the cluster.
     * Service Fabric will try to limit the sum of loads of services within the
     * application to this value.
     * When creating a new application with application capacity defined, the
     * product of MaximumNodes and MaximumCapacity must always be smaller than
     * or equal to this value.
     */
    @JsonProperty(value = "TotalApplicationCapacity")
    private Long totalApplicationCapacity;

    /**
     * Get the name of the metric.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the metric.
     *
     * @param name the name value to set
     * @return the ApplicationMetricDescription object itself.
     */
    public ApplicationMetricDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the maximum node capacity for Service Fabric application.
     This is the maximum Load for an instance of this application on a single node. Even if the capacity of node is greater than this value, Service Fabric will limit the total load of services within the application on each node to this value.
     If set to zero, capacity for this metric is unlimited on each node.
     When creating a new application with application capacity defined, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     When updating existing application with application capacity, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     *
     * @return the maximumCapacity value
     */
    public Long maximumCapacity() {
        return this.maximumCapacity;
    }

    /**
     * Set the maximum node capacity for Service Fabric application.
     This is the maximum Load for an instance of this application on a single node. Even if the capacity of node is greater than this value, Service Fabric will limit the total load of services within the application on each node to this value.
     If set to zero, capacity for this metric is unlimited on each node.
     When creating a new application with application capacity defined, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     When updating existing application with application capacity, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     *
     * @param maximumCapacity the maximumCapacity value to set
     * @return the ApplicationMetricDescription object itself.
     */
    public ApplicationMetricDescription withMaximumCapacity(Long maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        return this;
    }

    /**
     * Get the node reservation capacity for Service Fabric application.
     This is the amount of load which is reserved on nodes which have instances of this application.
     If MinimumNodes is specified, then the product of these values will be the capacity reserved in the cluster for the application.
     If set to zero, no capacity is reserved for this metric.
     When setting application capacity or when updating application capacity; this value must be smaller than or equal to MaximumCapacity for each metric.
     *
     * @return the reservationCapacity value
     */
    public Long reservationCapacity() {
        return this.reservationCapacity;
    }

    /**
     * Set the node reservation capacity for Service Fabric application.
     This is the amount of load which is reserved on nodes which have instances of this application.
     If MinimumNodes is specified, then the product of these values will be the capacity reserved in the cluster for the application.
     If set to zero, no capacity is reserved for this metric.
     When setting application capacity or when updating application capacity; this value must be smaller than or equal to MaximumCapacity for each metric.
     *
     * @param reservationCapacity the reservationCapacity value to set
     * @return the ApplicationMetricDescription object itself.
     */
    public ApplicationMetricDescription withReservationCapacity(Long reservationCapacity) {
        this.reservationCapacity = reservationCapacity;
        return this;
    }

    /**
     * Get the total metric capacity for Service Fabric application.
     This is the total metric capacity for this application in the cluster. Service Fabric will try to limit the sum of loads of services within the application to this value.
     When creating a new application with application capacity defined, the product of MaximumNodes and MaximumCapacity must always be smaller than or equal to this value.
     *
     * @return the totalApplicationCapacity value
     */
    public Long totalApplicationCapacity() {
        return this.totalApplicationCapacity;
    }

    /**
     * Set the total metric capacity for Service Fabric application.
     This is the total metric capacity for this application in the cluster. Service Fabric will try to limit the sum of loads of services within the application to this value.
     When creating a new application with application capacity defined, the product of MaximumNodes and MaximumCapacity must always be smaller than or equal to this value.
     *
     * @param totalApplicationCapacity the totalApplicationCapacity value to set
     * @return the ApplicationMetricDescription object itself.
     */
    public ApplicationMetricDescription withTotalApplicationCapacity(Long totalApplicationCapacity) {
        this.totalApplicationCapacity = totalApplicationCapacity;
        return this;
    }

}
