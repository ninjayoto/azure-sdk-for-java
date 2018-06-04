/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2016_03_01.Providers;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appservice.v2016_03_01.ApplicationStack;
import com.microsoft.azure.management.appservice.v2016_03_01.CsmOperationDescription;

class ProvidersImpl extends WrapperImpl<ProvidersInner> implements Providers {
    private final AppServiceManager manager;

    ProvidersImpl(AppServiceManager manager) {
        super(manager.inner().providers());
        this.manager = manager;
    }

    public AppServiceManager manager() {
        return this.manager;
    }

    private Observable<Page<ApplicationStackInner>> getAvailableStacksNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ProvidersInner client = this.inner();
        return client.getAvailableStacksNextAsync(nextLink)
        .flatMap(new Func1<Page<ApplicationStackInner>, Observable<Page<ApplicationStackInner>>>() {
            @Override
            public Observable<Page<ApplicationStackInner>> call(Page<ApplicationStackInner> page) {
                return Observable.just(page).concatWith(getAvailableStacksNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<ApplicationStack> getAvailableStacksAsync() {
        ProvidersInner client = this.inner();
        return client.getAvailableStacksAsync()
        .flatMap(new Func1<Page<ApplicationStackInner>, Observable<Page<ApplicationStackInner>>>() {
            @Override
            public Observable<Page<ApplicationStackInner>> call(Page<ApplicationStackInner> page) {
                return getAvailableStacksNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<ApplicationStackInner>, Iterable<ApplicationStackInner>>() {
            @Override
            public Iterable<ApplicationStackInner> call(Page<ApplicationStackInner> page) {
                return page.items();
            }
       })
        .map(new Func1<ApplicationStackInner, ApplicationStack>() {
            @Override
            public ApplicationStack call(ApplicationStackInner inner) {
                return new ApplicationStackImpl(inner, manager());
            }
       });
    }

    private Observable<Page<ApplicationStackInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ProvidersInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<ApplicationStackInner>, Observable<Page<ApplicationStackInner>>>() {
            @Override
            public Observable<Page<ApplicationStackInner>> call(Page<ApplicationStackInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<ApplicationStack> listAsync() {
        ProvidersInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<ApplicationStackInner>, Observable<Page<ApplicationStackInner>>>() {
            @Override
            public Observable<Page<ApplicationStackInner>> call(Page<ApplicationStackInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<ApplicationStackInner>, Iterable<ApplicationStackInner>>() {
            @Override
            public Iterable<ApplicationStackInner> call(Page<ApplicationStackInner> page) {
                return page.items();
            }
       })
        .map(new Func1<ApplicationStackInner, ApplicationStack>() {
            @Override
            public ApplicationStack call(ApplicationStackInner inner) {
                return new ApplicationStackImpl(inner, manager());
            }
       });
    }

    private Observable<Page<CsmOperationDescriptionInner>> listOperationsNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ProvidersInner client = this.inner();
        return client.listOperationsNextAsync(nextLink)
        .flatMap(new Func1<Page<CsmOperationDescriptionInner>, Observable<Page<CsmOperationDescriptionInner>>>() {
            @Override
            public Observable<Page<CsmOperationDescriptionInner>> call(Page<CsmOperationDescriptionInner> page) {
                return Observable.just(page).concatWith(listOperationsNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<CsmOperationDescription> listOperationsAsync() {
        ProvidersInner client = this.inner();
        return client.listOperationsAsync()
        .flatMap(new Func1<Page<CsmOperationDescriptionInner>, Observable<Page<CsmOperationDescriptionInner>>>() {
            @Override
            public Observable<Page<CsmOperationDescriptionInner>> call(Page<CsmOperationDescriptionInner> page) {
                return listOperationsNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<CsmOperationDescriptionInner>, Iterable<CsmOperationDescriptionInner>>() {
            @Override
            public Iterable<CsmOperationDescriptionInner> call(Page<CsmOperationDescriptionInner> page) {
                return page.items();
            }
       })
        .map(new Func1<CsmOperationDescriptionInner, CsmOperationDescription>() {
            @Override
            public CsmOperationDescription call(CsmOperationDescriptionInner inner) {
                return new CsmOperationDescriptionImpl(inner, manager());
            }
       });
    }

}