/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2016_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.implementation.NotificationHubResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.implementation.NotificationHubsManager;
import java.util.Map;
import java.util.List;

/**
 * Type representing NotificationHubResource.
 */
public interface NotificationHubResource extends HasInner<NotificationHubResourceInner>, Indexable, Refreshable<NotificationHubResource>, Updatable<NotificationHubResource.Update>, HasManager<NotificationHubsManager> {
    /**
     * @return the admCredential value.
     */
    AdmCredential admCredential();

    /**
     * @return the apnsCredential value.
     */
    ApnsCredential apnsCredential();

    /**
     * @return the authorizationRules value.
     */
    List<SharedAccessAuthorizationRuleProperties> authorizationRules();

    /**
     * @return the baiduCredential value.
     */
    BaiduCredential baiduCredential();

    /**
     * @return the gcmCredential value.
     */
    GcmCredential gcmCredential();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the mpnsCredential value.
     */
    MpnsCredential mpnsCredential();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the notificationHubResourceName value.
     */
    String notificationHubResourceName();

    /**
     * @return the registrationTtl value.
     */
    String registrationTtl();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the wnsCredential value.
     */
    WnsCredential wnsCredential();

    /**
     * The entirety of the NotificationHubResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNamespace, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NotificationHubResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NotificationHubResource definition.
         */
        interface Blank extends WithNamespace {
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify Namespace.
         */
        interface WithNamespace {
           /**
            * Specifies resourceGroupName, namespaceName.
            */
            WithLocation withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify AdmCredential.
         */
        interface WithAdmCredential {
            /**
             * Specifies admCredential.
             */
            WithCreate withAdmCredential(AdmCredential admCredential);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify ApnsCredential.
         */
        interface WithApnsCredential {
            /**
             * Specifies apnsCredential.
             */
            WithCreate withApnsCredential(ApnsCredential apnsCredential);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify AuthorizationRules.
         */
        interface WithAuthorizationRules {
            /**
             * Specifies authorizationRules.
             */
            WithCreate withAuthorizationRules(List<SharedAccessAuthorizationRuleProperties> authorizationRules);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify BaiduCredential.
         */
        interface WithBaiduCredential {
            /**
             * Specifies baiduCredential.
             */
            WithCreate withBaiduCredential(BaiduCredential baiduCredential);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify GcmCredential.
         */
        interface WithGcmCredential {
            /**
             * Specifies gcmCredential.
             */
            WithCreate withGcmCredential(GcmCredential gcmCredential);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify MpnsCredential.
         */
        interface WithMpnsCredential {
            /**
             * Specifies mpnsCredential.
             */
            WithCreate withMpnsCredential(MpnsCredential mpnsCredential);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify NotificationHubCreateOrUpdateParametersName.
         */
        interface WithNotificationHubCreateOrUpdateParametersName {
            /**
             * Specifies notificationHubCreateOrUpdateParametersName.
             */
            WithCreate withNotificationHubCreateOrUpdateParametersName(String notificationHubCreateOrUpdateParametersName);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify RegistrationTtl.
         */
        interface WithRegistrationTtl {
            /**
             * Specifies registrationTtl.
             */
            WithCreate withRegistrationTtl(String registrationTtl);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the notificationhubresource definition allowing to specify WnsCredential.
         */
        interface WithWnsCredential {
            /**
             * Specifies wnsCredential.
             */
            WithCreate withWnsCredential(WnsCredential wnsCredential);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NotificationHubResource>, DefinitionStages.WithAdmCredential, DefinitionStages.WithApnsCredential, DefinitionStages.WithAuthorizationRules, DefinitionStages.WithBaiduCredential, DefinitionStages.WithGcmCredential, DefinitionStages.WithMpnsCredential, DefinitionStages.WithNotificationHubCreateOrUpdateParametersName, DefinitionStages.WithRegistrationTtl, DefinitionStages.WithSku, DefinitionStages.WithTags, DefinitionStages.WithWnsCredential {
        }
    }
    /**
     * The template for a NotificationHubResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NotificationHubResource>, UpdateStages.WithAdmCredential, UpdateStages.WithApnsCredential, UpdateStages.WithAuthorizationRules, UpdateStages.WithBaiduCredential, UpdateStages.WithGcmCredential, UpdateStages.WithMpnsCredential, UpdateStages.WithNotificationHubCreateOrUpdateParametersName, UpdateStages.WithRegistrationTtl, UpdateStages.WithSku, UpdateStages.WithTags, UpdateStages.WithWnsCredential {
    }

    /**
     * Grouping of NotificationHubResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the notificationhubresource update allowing to specify AdmCredential.
         */
        interface WithAdmCredential {
            /**
             * Specifies admCredential.
             */
            Update withAdmCredential(AdmCredential admCredential);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify ApnsCredential.
         */
        interface WithApnsCredential {
            /**
             * Specifies apnsCredential.
             */
            Update withApnsCredential(ApnsCredential apnsCredential);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify AuthorizationRules.
         */
        interface WithAuthorizationRules {
            /**
             * Specifies authorizationRules.
             */
            Update withAuthorizationRules(List<SharedAccessAuthorizationRuleProperties> authorizationRules);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify BaiduCredential.
         */
        interface WithBaiduCredential {
            /**
             * Specifies baiduCredential.
             */
            Update withBaiduCredential(BaiduCredential baiduCredential);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify GcmCredential.
         */
        interface WithGcmCredential {
            /**
             * Specifies gcmCredential.
             */
            Update withGcmCredential(GcmCredential gcmCredential);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify MpnsCredential.
         */
        interface WithMpnsCredential {
            /**
             * Specifies mpnsCredential.
             */
            Update withMpnsCredential(MpnsCredential mpnsCredential);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify NotificationHubCreateOrUpdateParametersName.
         */
        interface WithNotificationHubCreateOrUpdateParametersName {
            /**
             * Specifies notificationHubCreateOrUpdateParametersName.
             */
            Update withNotificationHubCreateOrUpdateParametersName(String notificationHubCreateOrUpdateParametersName);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify RegistrationTtl.
         */
        interface WithRegistrationTtl {
            /**
             * Specifies registrationTtl.
             */
            Update withRegistrationTtl(String registrationTtl);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the notificationhubresource update allowing to specify WnsCredential.
         */
        interface WithWnsCredential {
            /**
             * Specifies wnsCredential.
             */
            Update withWnsCredential(WnsCredential wnsCredential);
        }

    }
}
