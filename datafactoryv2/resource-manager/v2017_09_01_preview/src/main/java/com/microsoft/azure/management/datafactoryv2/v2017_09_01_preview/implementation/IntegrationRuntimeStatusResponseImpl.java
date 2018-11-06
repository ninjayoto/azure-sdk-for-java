/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.IntegrationRuntimeStatusResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.IntegrationRuntimeStatus;

class IntegrationRuntimeStatusResponseImpl extends WrapperImpl<IntegrationRuntimeStatusResponseInner> implements IntegrationRuntimeStatusResponse {
    private final DataFactoryManager manager;
    IntegrationRuntimeStatusResponseImpl(IntegrationRuntimeStatusResponseInner inner, DataFactoryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public IntegrationRuntimeStatus properties() {
        return this.inner().properties();
    }

}