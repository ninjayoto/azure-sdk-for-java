/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15.implementation;

import com.microsoft.azure.management.labservices.v2018_10_15.OperationResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.labservices.v2018_10_15.OperationError;

class OperationResultImpl extends WrapperImpl<OperationResultInner> implements OperationResult {
    private final LabServicesManager manager;
    private String locationName;
    private String operationName;

    OperationResultImpl(OperationResultInner inner,  LabServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LabServicesManager manager() {
        return this.manager;
    }



    @Override
    public OperationError error() {
        return this.inner().error();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

}
