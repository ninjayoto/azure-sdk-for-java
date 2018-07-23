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
 * Defines values for HostIsolationMode.
 */
public final class HostIsolationMode extends ExpandableStringEnum<HostIsolationMode> {
    /** Static value None for HostIsolationMode. */
    public static final HostIsolationMode NONE = fromString("None");

    /** Static value Process for HostIsolationMode. */
    public static final HostIsolationMode PROCESS = fromString("Process");

    /** Static value HyperV for HostIsolationMode. */
    public static final HostIsolationMode HYPERV = fromString("HyperV");

    /**
     * Creates or finds a HostIsolationMode from its string representation.
     * @param name a name to look for
     * @return the corresponding HostIsolationMode
     */
    @JsonCreator
    public static HostIsolationMode fromString(String name) {
        return fromString(name, HostIsolationMode.class);
    }

    /**
     * @return known HostIsolationMode values
     */
    public static Collection<HostIsolationMode> values() {
        return values(HostIsolationMode.class);
    }
}
