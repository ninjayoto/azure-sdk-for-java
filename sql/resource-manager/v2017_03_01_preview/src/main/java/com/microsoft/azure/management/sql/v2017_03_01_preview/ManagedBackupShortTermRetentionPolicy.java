/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.ManagedBackupShortTermRetentionPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;

/**
 * Type representing ManagedBackupShortTermRetentionPolicy.
 */
public interface ManagedBackupShortTermRetentionPolicy extends HasInner<ManagedBackupShortTermRetentionPolicyInner>, Indexable, Refreshable<ManagedBackupShortTermRetentionPolicy>, Updatable<ManagedBackupShortTermRetentionPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the retentionDays value.
     */
    Integer retentionDays();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ManagedBackupShortTermRetentionPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ManagedBackupShortTermRetentionPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ManagedBackupShortTermRetentionPolicy definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the managedbackupshorttermretentionpolicy definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, managedInstanceName, databaseName.
            */
            WithCreate withExistingDatabasis(String resourceGroupName, String managedInstanceName, String databaseName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ManagedBackupShortTermRetentionPolicy> {
        }
    }
    /**
     * The template for a ManagedBackupShortTermRetentionPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ManagedBackupShortTermRetentionPolicy> {
    }

    /**
     * Grouping of ManagedBackupShortTermRetentionPolicy update stages.
     */
    interface UpdateStages {
    }
}