/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.RequestHistory;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.Request;
import com.microsoft.azure.management.logic.v2016_06_01.Response;
import java.util.Map;

class RequestHistoryImpl extends WrapperImpl<RequestHistoryInner> implements RequestHistory {
    private final LogicManager manager;
    RequestHistoryImpl(RequestHistoryInner inner, LogicManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Request request() {
        return this.inner().request();
    }

    @Override
    public Response response() {
        return this.inner().response();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}