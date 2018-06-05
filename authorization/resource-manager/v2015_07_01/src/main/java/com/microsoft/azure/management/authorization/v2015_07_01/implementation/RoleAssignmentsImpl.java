/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.authorization.v2015_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.authorization.v2015_07_01.RoleAssignments;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.authorization.v2015_07_01.RoleAssignment;

class RoleAssignmentsImpl extends WrapperImpl<RoleAssignmentsInner> implements RoleAssignments {
    private final AuthorizationManager manager;

    RoleAssignmentsImpl(AuthorizationManager manager) {
        super(manager.inner().roleAssignments());
        this.manager = manager;
    }

    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public RoleAssignmentImpl define(String name) {
        return wrapModel(name);
    }

    private RoleAssignmentImpl wrapModel(RoleAssignmentInner inner) {
        return  new RoleAssignmentImpl(inner, manager());
    }

    private RoleAssignmentImpl wrapModel(String name) {
        return new RoleAssignmentImpl(name, this.manager());
    }

    private Observable<Page<RoleAssignmentInner>> listForResourceNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        RoleAssignmentsInner client = this.inner();
        return client.listForResourceNextAsync(nextLink)
        .flatMap(new Func1<Page<RoleAssignmentInner>, Observable<Page<RoleAssignmentInner>>>() {
            @Override
            public Observable<Page<RoleAssignmentInner>> call(Page<RoleAssignmentInner> page) {
                return Observable.just(page).concatWith(listForResourceNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RoleAssignment> listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName) {
        RoleAssignmentsInner client = this.inner();
        return client.listForResourceAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName)
        .flatMap(new Func1<Page<RoleAssignmentInner>, Observable<Page<RoleAssignmentInner>>>() {
            @Override
            public Observable<Page<RoleAssignmentInner>> call(Page<RoleAssignmentInner> page) {
                return listForResourceNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RoleAssignmentInner>, Iterable<RoleAssignmentInner>>() {
            @Override
            public Iterable<RoleAssignmentInner> call(Page<RoleAssignmentInner> page) {
                return page.items();
            }
        })    .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String scope, String roleAssignmentName) {
        RoleAssignmentsInner client = this.inner();
        return client.deleteAsync(scope, roleAssignmentName).toCompletable();
    }

    @Override
    public Observable<RoleAssignment> getAsync(String scope, String roleAssignmentName) {
        RoleAssignmentsInner client = this.inner();
        return client.getAsync(scope, roleAssignmentName)
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteByIdAsync(String roleAssignmentId) {
        RoleAssignmentsInner client = this.inner();
        return client.deleteByIdAsync(roleAssignmentId).toCompletable();
    }

    @Override
    public Observable<RoleAssignment> createByIdAsync(String roleAssignmentId) {
        RoleAssignmentsInner client = this.inner();
        return client.createByIdAsync(roleAssignmentId)
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RoleAssignment> getByIdAsync(String roleAssignmentId) {
        RoleAssignmentsInner client = this.inner();
        return client.getByIdAsync(roleAssignmentId)
        .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    private Observable<Page<RoleAssignmentInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        RoleAssignmentsInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<RoleAssignmentInner>, Observable<Page<RoleAssignmentInner>>>() {
            @Override
            public Observable<Page<RoleAssignmentInner>> call(Page<RoleAssignmentInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RoleAssignment> listByResourceGroupAsync(final String resourceGroupName) {
        RoleAssignmentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<RoleAssignmentInner>, Observable<Page<RoleAssignmentInner>>>() {
            @Override
            public Observable<Page<RoleAssignmentInner>> call(Page<RoleAssignmentInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RoleAssignmentInner>, Iterable<RoleAssignmentInner>>() {
            @Override
            public Iterable<RoleAssignmentInner> call(Page<RoleAssignmentInner> page) {
                return page.items();
            }
        })    .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    private Observable<Page<RoleAssignmentInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        RoleAssignmentsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<RoleAssignmentInner>, Observable<Page<RoleAssignmentInner>>>() {
            @Override
            public Observable<Page<RoleAssignmentInner>> call(Page<RoleAssignmentInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RoleAssignment> listAsync() {
        RoleAssignmentsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<RoleAssignmentInner>, Observable<Page<RoleAssignmentInner>>>() {
            @Override
            public Observable<Page<RoleAssignmentInner>> call(Page<RoleAssignmentInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RoleAssignmentInner>, Iterable<RoleAssignmentInner>>() {
            @Override
            public Iterable<RoleAssignmentInner> call(Page<RoleAssignmentInner> page) {
                return page.items();
            }
        })    .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

    private Observable<Page<RoleAssignmentInner>> listForScopeNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        RoleAssignmentsInner client = this.inner();
        return client.listForScopeNextAsync(nextLink)
        .flatMap(new Func1<Page<RoleAssignmentInner>, Observable<Page<RoleAssignmentInner>>>() {
            @Override
            public Observable<Page<RoleAssignmentInner>> call(Page<RoleAssignmentInner> page) {
                return Observable.just(page).concatWith(listForScopeNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RoleAssignment> listForScopeAsync(final String scope) {
        RoleAssignmentsInner client = this.inner();
        return client.listForScopeAsync(scope)
        .flatMap(new Func1<Page<RoleAssignmentInner>, Observable<Page<RoleAssignmentInner>>>() {
            @Override
            public Observable<Page<RoleAssignmentInner>> call(Page<RoleAssignmentInner> page) {
                return listForScopeNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RoleAssignmentInner>, Iterable<RoleAssignmentInner>>() {
            @Override
            public Iterable<RoleAssignmentInner> call(Page<RoleAssignmentInner> page) {
                return page.items();
            }
        })    .map(new Func1<RoleAssignmentInner, RoleAssignment>() {
            @Override
            public RoleAssignment call(RoleAssignmentInner inner) {
                return new RoleAssignmentImpl(inner, manager());
            }
        });
    }

}