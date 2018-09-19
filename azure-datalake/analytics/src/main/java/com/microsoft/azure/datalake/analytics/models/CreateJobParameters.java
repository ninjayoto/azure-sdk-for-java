/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters used to submit a new Data Lake Analytics job.
 */
public class CreateJobParameters extends BaseJobParameters {
    /**
     * the friendly name of the job to submit.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * the degree of parallelism used for this job. At most one of
     * degreeOfParallelism and degreeOfParallelismPercent should be specified.
     * If none, a default value of 1 will be used.
     */
    @JsonProperty(value = "degreeOfParallelism")
    private Integer degreeOfParallelism;

    /**
     * the degree of parallelism in percentage used for this job. At most one
     * of degreeOfParallelism and degreeOfParallelismPercent should be
     * specified. If none, a default value of 1 will be used for
     * degreeOfParallelism.
     */
    @JsonProperty(value = "degreeOfParallelismPercent")
    private Double degreeOfParallelismPercent;

    /**
     * the priority value to use for the current job. Lower numbers have a
     * higher priority. By default, a job has a priority of 1000. This must be
     * greater than 0.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * the list of log file name patterns to find in the logFolder. '*' is the
     * only matching character allowed. Example format: jobExecution*.log or
     * *mylog*.txt.
     */
    @JsonProperty(value = "logFilePatterns")
    private List<String> logFilePatterns;

    /**
     * the recurring job relationship information properties.
     */
    @JsonProperty(value = "related")
    private JobRelationshipProperties related;

    /**
     * Get the friendly name of the job to submit.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the friendly name of the job to submit.
     *
     * @param name the name value to set
     * @return the CreateJobParameters object itself.
     */
    public CreateJobParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the degree of parallelism used for this job. At most one of degreeOfParallelism and degreeOfParallelismPercent should be specified. If none, a default value of 1 will be used.
     *
     * @return the degreeOfParallelism value
     */
    public Integer degreeOfParallelism() {
        return this.degreeOfParallelism;
    }

    /**
     * Set the degree of parallelism used for this job. At most one of degreeOfParallelism and degreeOfParallelismPercent should be specified. If none, a default value of 1 will be used.
     *
     * @param degreeOfParallelism the degreeOfParallelism value to set
     * @return the CreateJobParameters object itself.
     */
    public CreateJobParameters withDegreeOfParallelism(Integer degreeOfParallelism) {
        this.degreeOfParallelism = degreeOfParallelism;
        return this;
    }

    /**
     * Get the degree of parallelism in percentage used for this job. At most one of degreeOfParallelism and degreeOfParallelismPercent should be specified. If none, a default value of 1 will be used for degreeOfParallelism.
     *
     * @return the degreeOfParallelismPercent value
     */
    public Double degreeOfParallelismPercent() {
        return this.degreeOfParallelismPercent;
    }

    /**
     * Set the degree of parallelism in percentage used for this job. At most one of degreeOfParallelism and degreeOfParallelismPercent should be specified. If none, a default value of 1 will be used for degreeOfParallelism.
     *
     * @param degreeOfParallelismPercent the degreeOfParallelismPercent value to set
     * @return the CreateJobParameters object itself.
     */
    public CreateJobParameters withDegreeOfParallelismPercent(Double degreeOfParallelismPercent) {
        this.degreeOfParallelismPercent = degreeOfParallelismPercent;
        return this;
    }

    /**
     * Get the priority value to use for the current job. Lower numbers have a higher priority. By default, a job has a priority of 1000. This must be greater than 0.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority value to use for the current job. Lower numbers have a higher priority. By default, a job has a priority of 1000. This must be greater than 0.
     *
     * @param priority the priority value to set
     * @return the CreateJobParameters object itself.
     */
    public CreateJobParameters withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the list of log file name patterns to find in the logFolder. '*' is the only matching character allowed. Example format: jobExecution*.log or *mylog*.txt.
     *
     * @return the logFilePatterns value
     */
    public List<String> logFilePatterns() {
        return this.logFilePatterns;
    }

    /**
     * Set the list of log file name patterns to find in the logFolder. '*' is the only matching character allowed. Example format: jobExecution*.log or *mylog*.txt.
     *
     * @param logFilePatterns the logFilePatterns value to set
     * @return the CreateJobParameters object itself.
     */
    public CreateJobParameters withLogFilePatterns(List<String> logFilePatterns) {
        this.logFilePatterns = logFilePatterns;
        return this;
    }

    /**
     * Get the recurring job relationship information properties.
     *
     * @return the related value
     */
    public JobRelationshipProperties related() {
        return this.related;
    }

    /**
     * Set the recurring job relationship information properties.
     *
     * @param related the related value to set
     * @return the CreateJobParameters object itself.
     */
    public CreateJobParameters withRelated(JobRelationshipProperties related) {
        this.related = related;
        return this;
    }

}