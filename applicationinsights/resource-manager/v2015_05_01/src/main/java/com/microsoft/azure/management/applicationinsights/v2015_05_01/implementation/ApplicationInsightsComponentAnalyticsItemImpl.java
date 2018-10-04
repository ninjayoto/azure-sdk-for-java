/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentAnalyticsItem;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentAnalyticsItemProperties;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ItemScope;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ItemType;

class ApplicationInsightsComponentAnalyticsItemImpl extends WrapperImpl<ApplicationInsightsComponentAnalyticsItemInner> implements ApplicationInsightsComponentAnalyticsItem {
    private final InsightsManager manager;
    ApplicationInsightsComponentAnalyticsItemImpl(ApplicationInsightsComponentAnalyticsItemInner inner, InsightsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public InsightsManager manager() {
        return this.manager;
    }

    @Override
    public String content() {
        return this.inner().content();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ApplicationInsightsComponentAnalyticsItemProperties properties() {
        return this.inner().properties();
    }

    @Override
    public ItemScope scope() {
        return this.inner().scope();
    }

    @Override
    public String timeCreated() {
        return this.inner().timeCreated();
    }

    @Override
    public String timeModified() {
        return this.inner().timeModified();
    }

    @Override
    public ItemType type() {
        return this.inner().type();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

}