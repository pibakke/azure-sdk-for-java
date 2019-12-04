/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.BillingResponseListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.BillingResources;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.VmSizeCompatibilityFilterV2;

class BillingResponseListResultImpl extends WrapperImpl<BillingResponseListResultInner> implements BillingResponseListResult {
    private final HDInsightManager manager;
    BillingResponseListResultImpl(BillingResponseListResultInner inner, HDInsightManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public HDInsightManager manager() {
        return this.manager;
    }

    @Override
    public List<BillingResources> billingResources() {
        return this.inner().billingResources();
    }

    @Override
    public List<VmSizeCompatibilityFilterV2> vmSizeFilters() {
        return this.inner().vmSizeFilters();
    }

    @Override
    public List<String> vmSizes() {
        return this.inner().vmSizes();
    }

}