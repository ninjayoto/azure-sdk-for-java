/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import org.joda.time.DateTime;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The MigrateSqlServerSqlMITaskOutputMigrationLevel model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("MigrationLevelOutput")
public class MigrateSqlServerSqlMITaskOutputMigrationLevel extends MigrateSqlServerSqlMITaskOutput {
    /**
     * Migration start time.
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startedOn;

    /**
     * Migration end time.
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endedOn;

    /**
     * Current status of migration. Possible values include: 'Default',
     * 'Connecting', 'SourceAndTargetSelected', 'SelectLogins', 'Configured',
     * 'Running', 'Error', 'Stopped', 'Completed', 'CompletedWithWarnings'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationStatus status;

    /**
     * Current state of migration. Possible values include: 'None',
     * 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

    /**
     * Selected agent jobs as a map from name to id.
     */
    @JsonProperty(value = "agentJobs", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> agentJobs;

    /**
     * Selected logins as a map from name to id.
     */
    @JsonProperty(value = "logins", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> logins;

    /**
     * Migration progress message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Map of server role migration results.
     */
    @JsonProperty(value = "serverRoleResults", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, StartMigrationScenarioServerRoleResult> serverRoleResults;

    /**
     * Map of users to database name of orphaned users.
     */
    @JsonProperty(value = "orphanedUsers", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> orphanedUsers;

    /**
     * Selected databases as a map from database name to database id.
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> databases;

    /**
     * Source server version.
     */
    @JsonProperty(value = "sourceServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerVersion;

    /**
     * Source server brand version.
     */
    @JsonProperty(value = "sourceServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerBrandVersion;

    /**
     * Target server version.
     */
    @JsonProperty(value = "targetServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerVersion;

    /**
     * Target server brand version.
     */
    @JsonProperty(value = "targetServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerBrandVersion;

    /**
     * Migration exceptions and warnings.
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /**
     * Get migration start time.
     *
     * @return the startedOn value
     */
    public DateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get migration end time.
     *
     * @return the endedOn value
     */
    public DateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get current status of migration. Possible values include: 'Default', 'Connecting', 'SourceAndTargetSelected', 'SelectLogins', 'Configured', 'Running', 'Error', 'Stopped', 'Completed', 'CompletedWithWarnings'.
     *
     * @return the status value
     */
    public MigrationStatus status() {
        return this.status;
    }

    /**
     * Get current state of migration. Possible values include: 'None', 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     *
     * @return the state value
     */
    public MigrationState state() {
        return this.state;
    }

    /**
     * Get selected agent jobs as a map from name to id.
     *
     * @return the agentJobs value
     */
    public Map<String, String> agentJobs() {
        return this.agentJobs;
    }

    /**
     * Get selected logins as a map from name to id.
     *
     * @return the logins value
     */
    public Map<String, String> logins() {
        return this.logins;
    }

    /**
     * Get migration progress message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get map of server role migration results.
     *
     * @return the serverRoleResults value
     */
    public Map<String, StartMigrationScenarioServerRoleResult> serverRoleResults() {
        return this.serverRoleResults;
    }

    /**
     * Get map of users to database name of orphaned users.
     *
     * @return the orphanedUsers value
     */
    public Map<String, String> orphanedUsers() {
        return this.orphanedUsers;
    }

    /**
     * Get selected databases as a map from database name to database id.
     *
     * @return the databases value
     */
    public Map<String, String> databases() {
        return this.databases;
    }

    /**
     * Get source server version.
     *
     * @return the sourceServerVersion value
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Get source server brand version.
     *
     * @return the sourceServerBrandVersion value
     */
    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Get target server version.
     *
     * @return the targetServerVersion value
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Get target server brand version.
     *
     * @return the targetServerBrandVersion value
     */
    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Get migration exceptions and warnings.
     *
     * @return the exceptionsAndWarnings value
     */
    public List<ReportableException> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

}