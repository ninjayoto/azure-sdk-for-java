/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for creating a custom image from a virtual machine.
 */
public class CustomImagePropertiesFromVmFragment {
    /**
     * The source vm identifier.
     */
    @JsonProperty(value = "sourceVmId")
    private String sourceVmId;

    /**
     * The Windows OS information of the VM.
     */
    @JsonProperty(value = "windowsOsInfo")
    private WindowsOsInfoFragment windowsOsInfo;

    /**
     * The Linux OS information of the VM.
     */
    @JsonProperty(value = "linuxOsInfo")
    private LinuxOsInfoFragment linuxOsInfo;

    /**
     * Get the source vm identifier.
     *
     * @return the sourceVmId value
     */
    public String sourceVmId() {
        return this.sourceVmId;
    }

    /**
     * Set the source vm identifier.
     *
     * @param sourceVmId the sourceVmId value to set
     * @return the CustomImagePropertiesFromVmFragment object itself.
     */
    public CustomImagePropertiesFromVmFragment withSourceVmId(String sourceVmId) {
        this.sourceVmId = sourceVmId;
        return this;
    }

    /**
     * Get the Windows OS information of the VM.
     *
     * @return the windowsOsInfo value
     */
    public WindowsOsInfoFragment windowsOsInfo() {
        return this.windowsOsInfo;
    }

    /**
     * Set the Windows OS information of the VM.
     *
     * @param windowsOsInfo the windowsOsInfo value to set
     * @return the CustomImagePropertiesFromVmFragment object itself.
     */
    public CustomImagePropertiesFromVmFragment withWindowsOsInfo(WindowsOsInfoFragment windowsOsInfo) {
        this.windowsOsInfo = windowsOsInfo;
        return this;
    }

    /**
     * Get the Linux OS information of the VM.
     *
     * @return the linuxOsInfo value
     */
    public LinuxOsInfoFragment linuxOsInfo() {
        return this.linuxOsInfo;
    }

    /**
     * Set the Linux OS information of the VM.
     *
     * @param linuxOsInfo the linuxOsInfo value to set
     * @return the CustomImagePropertiesFromVmFragment object itself.
     */
    public CustomImagePropertiesFromVmFragment withLinuxOsInfo(LinuxOsInfoFragment linuxOsInfo) {
        this.linuxOsInfo = linuxOsInfo;
        return this;
    }

}