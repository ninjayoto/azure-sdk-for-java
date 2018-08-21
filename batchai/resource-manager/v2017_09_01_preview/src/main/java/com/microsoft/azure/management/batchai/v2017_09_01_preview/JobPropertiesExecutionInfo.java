/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about the execution of a job in the Azure Batch
 * service.
 */
public class JobPropertiesExecutionInfo {
    /**
     * The time at which the job started running.
     * 'Running' corresponds to the running state. If the job has been
     * restarted or retried, this is the most recent time at which the job
     * started running. This property is present only for job that are in the
     * running or completed state.
     */
    @JsonProperty(value = "startTime", required = true)
    private DateTime startTime;

    /**
     * The time at which the job completed.
     * This property is only returned if the job is in completed state.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The exit code of the job.
     * This property is only returned if the job is in completed state.
     */
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /**
     * Contains details of various errors encountered by the service during job
     * execution.
     */
    @JsonProperty(value = "errors")
    private List<BatchAIError> errors;

    /**
     * Get 'Running' corresponds to the running state. If the job has been restarted or retried, this is the most recent time at which the job started running. This property is present only for job that are in the running or completed state.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set 'Running' corresponds to the running state. If the job has been restarted or retried, this is the most recent time at which the job started running. This property is present only for job that are in the running or completed state.
     *
     * @param startTime the startTime value to set
     * @return the JobPropertiesExecutionInfo object itself.
     */
    public JobPropertiesExecutionInfo withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get this property is only returned if the job is in completed state.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set this property is only returned if the job is in completed state.
     *
     * @param endTime the endTime value to set
     * @return the JobPropertiesExecutionInfo object itself.
     */
    public JobPropertiesExecutionInfo withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get this property is only returned if the job is in completed state.
     *
     * @return the exitCode value
     */
    public Integer exitCode() {
        return this.exitCode;
    }

    /**
     * Set this property is only returned if the job is in completed state.
     *
     * @param exitCode the exitCode value to set
     * @return the JobPropertiesExecutionInfo object itself.
     */
    public JobPropertiesExecutionInfo withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get the errors value.
     *
     * @return the errors value
     */
    public List<BatchAIError> errors() {
        return this.errors;
    }

    /**
     * Set the errors value.
     *
     * @param errors the errors value to set
     * @return the JobPropertiesExecutionInfo object itself.
     */
    public JobPropertiesExecutionInfo withErrors(List<BatchAIError> errors) {
        this.errors = errors;
        return this;
    }

}
