/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.AdvisorInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;
import org.joda.time.DateTime;

/**
 * Type representing DatabasisServerAdvisor.
 */
public interface DatabasisServerAdvisor extends HasInner<AdvisorInner>, Indexable, Refreshable<DatabasisServerAdvisor>, Updatable<DatabasisServerAdvisor.Update>, HasManager<SqlManager> {
    /**
     * @return the advisorStatus value.
     */
    AdvisorStatus advisorStatus();

    /**
     * @return the autoExecuteValue value.
     */
    AutoExecuteStatus autoExecuteValue();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastChecked value.
     */
    DateTime lastChecked();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the recommendationsStatus value.
     */
    String recommendationsStatus();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DatabasisServerAdvisor definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithAutoExecuteValue, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DatabasisServerAdvisor definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DatabasisServerAdvisor definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the databasisserveradvisor definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, serverName, databaseName.
            */
            WithAutoExecuteValue withExistingDatabasis(String resourceGroupName, String serverName, String databaseName);
        }

        /**
         * The stage of the databasisserveradvisor definition allowing to specify AutoExecuteValue.
         */
        interface WithAutoExecuteValue {
           /**
            * Specifies autoExecuteValue.
            */
            WithCreate withAutoExecuteValue(AutoExecuteStatus autoExecuteValue);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DatabasisServerAdvisor> {
        }
    }
    /**
     * The template for a DatabasisServerAdvisor update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DatabasisServerAdvisor>, UpdateStages.WithAutoExecuteValue {
    }

    /**
     * Grouping of DatabasisServerAdvisor update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the databasisserveradvisor update allowing to specify AutoExecuteValue.
         */
        interface WithAutoExecuteValue {
            /**
             * Specifies autoExecuteValue.
             */
            Update withAutoExecuteValue(AutoExecuteStatus autoExecuteValue);
        }

    }
}