/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import java.util.List;
import com.microsoft.azure.servicefabric.UploadSessionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a image store upload session.
 */
public class UploadSessionInner {
    /**
     * When querying upload session by upload session ID, the result contains
     * only one upload session. When querying upload session by image store
     * relative path, the result might contain multiple upload sessions.
     */
    @JsonProperty(value = "UploadSessions")
    private List<UploadSessionInfo> uploadSessions;

    /**
     * Get when querying upload session by upload session ID, the result contains only one upload session. When querying upload session by image store relative path, the result might contain multiple upload sessions.
     *
     * @return the uploadSessions value
     */
    public List<UploadSessionInfo> uploadSessions() {
        return this.uploadSessions;
    }

    /**
     * Set when querying upload session by upload session ID, the result contains only one upload session. When querying upload session by image store relative path, the result might contain multiple upload sessions.
     *
     * @param uploadSessions the uploadSessions value to set
     * @return the UploadSessionInner object itself.
     */
    public UploadSessionInner withUploadSessions(List<UploadSessionInfo> uploadSessions) {
        this.uploadSessions = uploadSessions;
        return this;
    }

}
