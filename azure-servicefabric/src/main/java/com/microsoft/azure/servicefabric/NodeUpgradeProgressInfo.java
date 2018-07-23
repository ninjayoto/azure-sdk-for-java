/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the upgrading node and its status.
 */
public class NodeUpgradeProgressInfo {
    /**
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /**
     * The state of the upgrading node. Possible values include: 'Invalid',
     * 'PreUpgradeSafetyCheck', 'Upgrading', 'PostUpgradeSafetyCheck'.
     */
    @JsonProperty(value = "UpgradePhase")
    private NodeUpgradePhase upgradePhase;

    /**
     * List of pending safety checks.
     */
    @JsonProperty(value = "PendingSafetyChecks")
    private List<SafetyCheckWrapper> pendingSafetyChecks;

    /**
     * Get the name of a Service Fabric node.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set
     * @return the NodeUpgradeProgressInfo object itself.
     */
    public NodeUpgradeProgressInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the state of the upgrading node. Possible values include: 'Invalid', 'PreUpgradeSafetyCheck', 'Upgrading', 'PostUpgradeSafetyCheck'.
     *
     * @return the upgradePhase value
     */
    public NodeUpgradePhase upgradePhase() {
        return this.upgradePhase;
    }

    /**
     * Set the state of the upgrading node. Possible values include: 'Invalid', 'PreUpgradeSafetyCheck', 'Upgrading', 'PostUpgradeSafetyCheck'.
     *
     * @param upgradePhase the upgradePhase value to set
     * @return the NodeUpgradeProgressInfo object itself.
     */
    public NodeUpgradeProgressInfo withUpgradePhase(NodeUpgradePhase upgradePhase) {
        this.upgradePhase = upgradePhase;
        return this;
    }

    /**
     * Get list of pending safety checks.
     *
     * @return the pendingSafetyChecks value
     */
    public List<SafetyCheckWrapper> pendingSafetyChecks() {
        return this.pendingSafetyChecks;
    }

    /**
     * Set list of pending safety checks.
     *
     * @param pendingSafetyChecks the pendingSafetyChecks value to set
     * @return the NodeUpgradeProgressInfo object itself.
     */
    public NodeUpgradeProgressInfo withPendingSafetyChecks(List<SafetyCheckWrapper> pendingSafetyChecks) {
        this.pendingSafetyChecks = pendingSafetyChecks;
        return this;
    }

}
