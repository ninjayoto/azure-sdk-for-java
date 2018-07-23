/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UpgradeDomainState.
 */
public final class UpgradeDomainState extends ExpandableStringEnum<UpgradeDomainState> {
    /** Static value Invalid for UpgradeDomainState. */
    public static final UpgradeDomainState INVALID = fromString("Invalid");

    /** Static value Pending for UpgradeDomainState. */
    public static final UpgradeDomainState PENDING = fromString("Pending");

    /** Static value InProgress for UpgradeDomainState. */
    public static final UpgradeDomainState IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for UpgradeDomainState. */
    public static final UpgradeDomainState COMPLETED = fromString("Completed");

    /**
     * Creates or finds a UpgradeDomainState from its string representation.
     * @param name a name to look for
     * @return the corresponding UpgradeDomainState
     */
    @JsonCreator
    public static UpgradeDomainState fromString(String name) {
        return fromString(name, UpgradeDomainState.class);
    }

    /**
     * @return known UpgradeDomainState values
     */
    public static Collection<UpgradeDomainState> values() {
        return values(UpgradeDomainState.class);
    }
}
