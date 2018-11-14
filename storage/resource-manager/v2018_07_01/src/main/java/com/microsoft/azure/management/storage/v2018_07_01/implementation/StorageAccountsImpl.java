/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.storage.v2018_07_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.storage.v2018_07_01.StorageAccounts;
import com.microsoft.azure.management.storage.v2018_07_01.StorageAccount;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.storage.v2018_07_01.StorageAccountListKeysResult;
import com.microsoft.azure.management.storage.v2018_07_01.ListAccountSasResponse;
import com.microsoft.azure.management.storage.v2018_07_01.ListServiceSasResponse;
import com.microsoft.azure.management.storage.v2018_07_01.CheckNameAvailabilityResult;
import com.microsoft.azure.management.storage.v2018_07_01.AccountSasParameters;
import com.microsoft.azure.management.storage.v2018_07_01.ServiceSasParameters;

class StorageAccountsImpl extends GroupableResourcesCoreImpl<StorageAccount, StorageAccountImpl, StorageAccountInner, StorageAccountsInner, StorageManager>  implements StorageAccounts {
    protected StorageAccountsImpl(StorageManager manager) {
        super(manager.inner().storageAccounts(), manager);
    }

    @Override
    protected Observable<StorageAccountInner> getInnerAsync(String resourceGroupName, String name) {
        StorageAccountsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        StorageAccountsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<StorageAccount> listByResourceGroup(String resourceGroupName) {
        StorageAccountsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<StorageAccount> listByResourceGroupAsync(String resourceGroupName) {
        StorageAccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<StorageAccountInner>, Observable<StorageAccountInner>>() {
            @Override
            public Observable<StorageAccountInner> call(Page<StorageAccountInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<StorageAccountInner, StorageAccount>() {
            @Override
            public StorageAccount call(StorageAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<StorageAccount> list() {
        StorageAccountsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<StorageAccount> listAsync() {
        StorageAccountsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<StorageAccountInner>, Observable<StorageAccountInner>>() {
            @Override
            public Observable<StorageAccountInner> call(Page<StorageAccountInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<StorageAccountInner, StorageAccount>() {
            @Override
            public StorageAccount call(StorageAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public StorageAccountImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<StorageAccountListKeysResult> listKeysAsync(String resourceGroupName, String accountName) {
        StorageAccountsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, accountName)
        .map(new Func1<StorageAccountListKeysResultInner, StorageAccountListKeysResult>() {
            @Override
            public StorageAccountListKeysResult call(StorageAccountListKeysResultInner inner) {
                return new StorageAccountListKeysResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<StorageAccountListKeysResult> regenerateKeyAsync(String resourceGroupName, String accountName, String keyName) {
        StorageAccountsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, accountName, keyName)
        .map(new Func1<StorageAccountListKeysResultInner, StorageAccountListKeysResult>() {
            @Override
            public StorageAccountListKeysResult call(StorageAccountListKeysResultInner inner) {
                return new StorageAccountListKeysResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ListAccountSasResponse> listAccountSASAsync(String resourceGroupName, String accountName, AccountSasParameters parameters) {
        StorageAccountsInner client = this.inner();
        return client.listAccountSASAsync(resourceGroupName, accountName, parameters)
        .map(new Func1<ListAccountSasResponseInner, ListAccountSasResponse>() {
            @Override
            public ListAccountSasResponse call(ListAccountSasResponseInner inner) {
                return new ListAccountSasResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ListServiceSasResponse> listServiceSASAsync(String resourceGroupName, String accountName, ServiceSasParameters parameters) {
        StorageAccountsInner client = this.inner();
        return client.listServiceSASAsync(resourceGroupName, accountName, parameters)
        .map(new Func1<ListServiceSasResponseInner, ListServiceSasResponse>() {
            @Override
            public ListServiceSasResponse call(ListServiceSasResponseInner inner) {
                return new ListServiceSasResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable failoverAsync(String resourceGroupName, String accountName) {
        StorageAccountsInner client = this.inner();
        return client.failoverAsync(resourceGroupName, accountName).toCompletable();
    }

    @Override
    public Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String name) {
        StorageAccountsInner client = this.inner();
        return client.checkNameAvailabilityAsync(name)
        .map(new Func1<CheckNameAvailabilityResultInner, CheckNameAvailabilityResult>() {
            @Override
            public CheckNameAvailabilityResult call(CheckNameAvailabilityResultInner inner) {
                return new CheckNameAvailabilityResultImpl(inner, manager());
            }
        });
    }

    @Override
    protected StorageAccountImpl wrapModel(StorageAccountInner inner) {
        return  new StorageAccountImpl(inner.name(), inner, manager());
    }

    @Override
    protected StorageAccountImpl wrapModel(String name) {
        return new StorageAccountImpl(name, new StorageAccountInner(), this.manager());
    }

}
