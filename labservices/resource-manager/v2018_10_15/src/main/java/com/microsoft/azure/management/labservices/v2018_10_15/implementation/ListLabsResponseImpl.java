/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15.implementation;

import com.microsoft.azure.management.labservices.v2018_10_15.ListLabsResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.labservices.v2018_10_15.LabDetails;

class ListLabsResponseImpl extends WrapperImpl<ListLabsResponseInner> implements ListLabsResponse {
    private final LabServicesManager manager;
    ListLabsResponseImpl(ListLabsResponseInner inner, LabServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LabServicesManager manager() {
        return this.manager;
    }

    @Override
    public List<LabDetails> labs() {
        return this.inner().labs();
    }

}
