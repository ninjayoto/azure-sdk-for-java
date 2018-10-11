/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview.implementation;

import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.EncryptionIdentity;
import java.util.Map;
import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.DataLakeStoreAccountProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Store account information.
 */
public class DataLakeStoreAccountInner {
    /**
     * the account regional location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * the account name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * the namespace and type of the account.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * the account subscription ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The Key vault encryption identity, if any.
     */
    @JsonProperty(value = "identity")
    private EncryptionIdentity identity;

    /**
     * the value of custom properties.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * the Data Lake Store account properties.
     */
    @JsonProperty(value = "properties")
    private DataLakeStoreAccountProperties properties;

    /**
     * Get the account regional location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the account regional location.
     *
     * @param location the location value to set
     * @return the DataLakeStoreAccountInner object itself.
     */
    public DataLakeStoreAccountInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the account name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the account name.
     *
     * @param name the name value to set
     * @return the DataLakeStoreAccountInner object itself.
     */
    public DataLakeStoreAccountInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespace and type of the account.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the account subscription ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the Key vault encryption identity, if any.
     *
     * @return the identity value
     */
    public EncryptionIdentity identity() {
        return this.identity;
    }

    /**
     * Set the Key vault encryption identity, if any.
     *
     * @param identity the identity value to set
     * @return the DataLakeStoreAccountInner object itself.
     */
    public DataLakeStoreAccountInner withIdentity(EncryptionIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the value of custom properties.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the value of custom properties.
     *
     * @param tags the tags value to set
     * @return the DataLakeStoreAccountInner object itself.
     */
    public DataLakeStoreAccountInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the Data Lake Store account properties.
     *
     * @return the properties value
     */
    public DataLakeStoreAccountProperties properties() {
        return this.properties;
    }

    /**
     * Set the Data Lake Store account properties.
     *
     * @param properties the properties value to set
     * @return the DataLakeStoreAccountInner object itself.
     */
    public DataLakeStoreAccountInner withProperties(DataLakeStoreAccountProperties properties) {
        this.properties = properties;
        return this;
    }

}