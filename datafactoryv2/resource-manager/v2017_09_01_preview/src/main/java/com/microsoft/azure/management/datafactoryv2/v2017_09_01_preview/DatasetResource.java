/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.DatasetResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.DataFactoryManager;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.DatasetInner;
import java.util.Map;
import java.util.List;

/**
 * Type representing DatasetResource.
 */
public interface DatasetResource extends HasInner<DatasetResourceInner>, Indexable, Refreshable<DatasetResource>, Updatable<DatasetResource.Update>, HasManager<DataFactoryManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    DatasetInner properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DatasetResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithFactory, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DatasetResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DatasetResource definition.
         */
        interface Blank extends WithFactory {
        }

        /**
         * The stage of the datasetresource definition allowing to specify Factory.
         */
        interface WithFactory {
           /**
            * Specifies resourceGroupName, factoryName.
            */
            WithProperties withExistingFactory(String resourceGroupName, String factoryName);
        }

        /**
         * The stage of the datasetresource definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            */
            WithCreate withProperties(DatasetInner properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DatasetResource> {
        }
    }
    /**
     * The template for a DatasetResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DatasetResource>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of DatasetResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the datasetresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             */
            Update withProperties(DatasetInner properties);
        }

    }
}