/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.arm.resources.implementation;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.rest.RestClient;

/**
 * Generic base class for Azure resource managers.
 * @param <T> specific manager type
 * @param <InnerT> inner management client implementation type
 */
public abstract class ManagerCore<T, InnerT> extends ManagerBaseCore implements HasInner<InnerT> {

    protected final InnerT innerManagementClient;

    protected ManagerCore(RestClient restClient, String subscriptionId, InnerT innerManagementClient) {
        super(subscriptionId);
        this.innerManagementClient = innerManagementClient;
    }

    @Override
    public InnerT inner() {
        return this.innerManagementClient;
    }
}
