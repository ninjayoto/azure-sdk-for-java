/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The disk encryption properties.
 */
public class DiskEncryptionProperties {
    /**
     * Base key vault URI where the customers key is located eg.
     * https://myvault.vault.azure.net.
     */
    @JsonProperty(value = "vaultUri")
    private String vaultUri;

    /**
     * Key name that is used for enabling disk encryption.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /**
     * Specific key version that is used for enabling disk encryption.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /**
     * Algorithm identifier for encryption, default RSA-OAEP. Possible values
     * include: 'RSA-OAEP', 'RSA-OAEP-256', 'RSA1_5'.
     */
    @JsonProperty(value = "encryptionAlgorithm")
    private JsonWebKeyEncryptionAlgorithm encryptionAlgorithm;

    /**
     * Resource ID of Managed Identity that is used to access the key vault.
     */
    @JsonProperty(value = "msiResourceId")
    private String msiResourceId;

    /**
     * Get base key vault URI where the customers key is located eg. https://myvault.vault.azure.net.
     *
     * @return the vaultUri value
     */
    public String vaultUri() {
        return this.vaultUri;
    }

    /**
     * Set base key vault URI where the customers key is located eg. https://myvault.vault.azure.net.
     *
     * @param vaultUri the vaultUri value to set
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withVaultUri(String vaultUri) {
        this.vaultUri = vaultUri;
        return this;
    }

    /**
     * Get key name that is used for enabling disk encryption.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set key name that is used for enabling disk encryption.
     *
     * @param keyName the keyName value to set
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get specific key version that is used for enabling disk encryption.
     *
     * @return the keyVersion value
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set specific key version that is used for enabling disk encryption.
     *
     * @param keyVersion the keyVersion value to set
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get algorithm identifier for encryption, default RSA-OAEP. Possible values include: 'RSA-OAEP', 'RSA-OAEP-256', 'RSA1_5'.
     *
     * @return the encryptionAlgorithm value
     */
    public JsonWebKeyEncryptionAlgorithm encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * Set algorithm identifier for encryption, default RSA-OAEP. Possible values include: 'RSA-OAEP', 'RSA-OAEP-256', 'RSA1_5'.
     *
     * @param encryptionAlgorithm the encryptionAlgorithm value to set
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withEncryptionAlgorithm(JsonWebKeyEncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * Get resource ID of Managed Identity that is used to access the key vault.
     *
     * @return the msiResourceId value
     */
    public String msiResourceId() {
        return this.msiResourceId;
    }

    /**
     * Set resource ID of Managed Identity that is used to access the key vault.
     *
     * @param msiResourceId the msiResourceId value to set
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withMsiResourceId(String msiResourceId) {
        this.msiResourceId = msiResourceId;
        return this;
    }

}
