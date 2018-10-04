/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupUsageSummaries;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupManagementUsage;

class BackupUsageSummariesImpl extends WrapperImpl<BackupUsageSummariesInner> implements BackupUsageSummaries {
    private final RecoveryServicesManager manager;

    BackupUsageSummariesImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupUsageSummaries());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private BackupManagementUsageImpl wrapModel(BackupManagementUsageInner inner) {
        return  new BackupManagementUsageImpl(inner, manager());
    }

    @Override
    public Observable<BackupManagementUsage> listAsync(String vaultName, String resourceGroupName) {
        BackupUsageSummariesInner client = this.inner();
        return client.listAsync(vaultName, resourceGroupName)
        .flatMap(new Func1<List<BackupManagementUsageInner>, Observable<BackupManagementUsageInner>>() {
            @Override
            public Observable<BackupManagementUsageInner> call(List<BackupManagementUsageInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<BackupManagementUsageInner, BackupManagementUsage>() {
            @Override
            public BackupManagementUsage call(BackupManagementUsageInner inner) {
                return wrapModel(inner);
            }
        });
    }

}