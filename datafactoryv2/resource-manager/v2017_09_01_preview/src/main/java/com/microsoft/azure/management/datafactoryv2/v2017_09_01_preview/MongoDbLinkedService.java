/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Linked service for MongoDb data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MongoDb")
@JsonFlatten
public class MongoDbLinkedService extends LinkedServiceInner {
    /**
     * The IP address or server name of the MongoDB server. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /**
     * The authentication type to be used to connect to the MongoDB database.
     * Possible values include: 'Basic', 'Anonymous'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private MongoDbAuthenticationType authenticationType;

    /**
     * The name of the MongoDB database that you want to access. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.databaseName", required = true)
    private Object databaseName;

    /**
     * Username for authentication. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * Password for authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * Database to verify the username and password. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.authSource")
    private Object authSource;

    /**
     * The TCP port number that the MongoDB server uses to listen for client
     * connections. The default value is 27017. Type: integer (or Expression
     * with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /**
     * Specifies whether the connections to the server are encrypted using SSL.
     * The default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /**
     * Specifies whether to allow self-signed certificates from the server. The
     * default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the IP address or server name of the MongoDB server. Type: string (or Expression with resultType string).
     *
     * @return the server value
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the IP address or server name of the MongoDB server. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the authentication type to be used to connect to the MongoDB database. Possible values include: 'Basic', 'Anonymous'.
     *
     * @return the authenticationType value
     */
    public MongoDbAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication type to be used to connect to the MongoDB database. Possible values include: 'Basic', 'Anonymous'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withAuthenticationType(MongoDbAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     *
     * @return the databaseName value
     */
    public Object databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     *
     * @param databaseName the databaseName value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withDatabaseName(Object databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get username for authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set username for authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get password for authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password for authentication.
     *
     * @param password the password value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get database to verify the username and password. Type: string (or Expression with resultType string).
     *
     * @return the authSource value
     */
    public Object authSource() {
        return this.authSource;
    }

    /**
     * Set database to verify the username and password. Type: string (or Expression with resultType string).
     *
     * @param authSource the authSource value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withAuthSource(Object authSource) {
        this.authSource = authSource;
        return this;
    }

    /**
     * Get the TCP port number that the MongoDB server uses to listen for client connections. The default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the TCP port number that the MongoDB server uses to listen for client connections. The default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get specifies whether the connections to the server are encrypted using SSL. The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableSsl value
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set specifies whether the connections to the server are encrypted using SSL. The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableSsl the enableSsl value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get specifies whether to allow self-signed certificates from the server. The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the allowSelfSignedServerCert value
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set specifies whether to allow self-signed certificates from the server. The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}