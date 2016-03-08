/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.datalake.store;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.datalake.store.models.AclStatusResult;
import com.microsoft.azure.management.datalake.store.models.ContentSummaryResult;
import com.microsoft.azure.management.datalake.store.models.FileOperationResult;
import com.microsoft.azure.management.datalake.store.models.FileStatusesResult;
import com.microsoft.azure.management.datalake.store.models.FileStatusResult;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.InputStream;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in FileSystemOperations.
 */
public interface FileSystemOperations {
    /**
     * Appends to the specified file. This method supports multiple concurrent appends to the file. NOTE: Concurrent append and normal (serial) append CANNOT be used interchangeably. Once a file has been appended to using either append option, it can only be appended to using that append option.
     *
     * @param filePath The Data Lake Store path (starting with '/') of the file to which to append using concurrent append.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param streamContents The file contents to include when appending to the file.
     * @param op The constant value for the operation.
     * @param appendMode Indicates the concurrent append call should create the file if it doesn't exist or just open the existing file for append
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> concurrentAppend(String filePath, String accountName, InputStream streamContents, String op, String appendMode) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Appends to the specified file. This method supports multiple concurrent appends to the file. NOTE: Concurrent append and normal (serial) append CANNOT be used interchangeably. Once a file has been appended to using either append option, it can only be appended to using that append option.
     *
     * @param filePath The Data Lake Store path (starting with '/') of the file to which to append using concurrent append.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param streamContents The file contents to include when appending to the file.
     * @param op The constant value for the operation.
     * @param appendMode Indicates the concurrent append call should create the file if it doesn't exist or just open the existing file for append
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall concurrentAppendAsync(String filePath, String accountName, InputStream streamContents, String op, String appendMode, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Checks if the specified access is available at the given path.
     *
     * @param path The Data Lake Store path (starting with '/') of the file or directory for which to check access.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param fsaction File system operation read/write/execute in string form, matching regex pattern '[rwx-]{3}'
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> checkAccess(String path, String accountName, String op, String fsaction) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Checks if the specified access is available at the given path.
     *
     * @param path The Data Lake Store path (starting with '/') of the file or directory for which to check access.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param fsaction File system operation read/write/execute in string form, matching regex pattern '[rwx-]{3}'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall checkAccessAsync(String path, String accountName, String op, String fsaction, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a directory.
     *
     * @param path The Data Lake Store path (starting with '/') of the directory to create.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FileOperationResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FileOperationResult> mkdirs(String path, String accountName, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a directory.
     *
     * @param path The Data Lake Store path (starting with '/') of the directory to create.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall mkdirsAsync(String path, String accountName, String op, final ServiceCallback<FileOperationResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Concatenates the list of source files into the destination file.
     *
     * @param destinationPath The Data Lake Store path (starting with '/') of the destination file resulting from the concatenation.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param sources A list of comma seperated Data Lake Store paths (starting with '/') of the files to concatenate, in the order in which they should be concatenated.
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> concat(String destinationPath, String accountName, List<String> sources, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Concatenates the list of source files into the destination file.
     *
     * @param destinationPath The Data Lake Store path (starting with '/') of the destination file resulting from the concatenation.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param sources A list of comma seperated Data Lake Store paths (starting with '/') of the files to concatenate, in the order in which they should be concatenated.
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall concatAsync(String destinationPath, String accountName, List<String> sources, String op, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Concatenates the list of source files into the destination file. This method accepts more source file paths than the Concat method. This method and the parameters it accepts are subject to change for usability in an upcoming version.
     *
     * @param msConcatDestinationPath The Data Lake Store path (starting with '/') of the destination file resulting from the concatenation.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param streamContents A list of Data Lake Store paths (starting with '/') of the source files. Must be in the format: sources=&lt;comma separated list&gt;
     * @param op The constant value for the operation.
     * @param deletesourcedirectory Caution: Setting this parameter to true will delete the parent directory of all source files provided to the MsConcat method.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> msConcat(String msConcatDestinationPath, String accountName, InputStream streamContents, String op, Boolean deletesourcedirectory) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Concatenates the list of source files into the destination file. This method accepts more source file paths than the Concat method. This method and the parameters it accepts are subject to change for usability in an upcoming version.
     *
     * @param msConcatDestinationPath The Data Lake Store path (starting with '/') of the destination file resulting from the concatenation.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param streamContents A list of Data Lake Store paths (starting with '/') of the source files. Must be in the format: sources=&lt;comma separated list&gt;
     * @param op The constant value for the operation.
     * @param deletesourcedirectory Caution: Setting this parameter to true will delete the parent directory of all source files provided to the MsConcat method.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall msConcatAsync(String msConcatDestinationPath, String accountName, InputStream streamContents, String op, Boolean deletesourcedirectory, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the list of file status objects specified by the file path, with optional pagination parameters.
     *
     * @param listFilePath The Data Lake Store path (starting with '/') of the directory to list.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FileStatusesResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FileStatusesResult> listFileStatus(String listFilePath, String accountName, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the list of file status objects specified by the file path, with optional pagination parameters.
     *
     * @param listFilePath The Data Lake Store path (starting with '/') of the directory to list.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listFileStatusAsync(String listFilePath, String accountName, String op, final ServiceCallback<FileStatusesResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the file content summary object specified by the file path.
     *
     * @param getContentSummaryFilePath The Data Lake Store path (starting with '/') of the file for which to retrieve the summary.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ContentSummaryResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ContentSummaryResult> getContentSummary(String getContentSummaryFilePath, String accountName, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the file content summary object specified by the file path.
     *
     * @param getContentSummaryFilePath The Data Lake Store path (starting with '/') of the file for which to retrieve the summary.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getContentSummaryAsync(String getContentSummaryFilePath, String accountName, String op, final ServiceCallback<ContentSummaryResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the file status object specified by the file path.
     *
     * @param getFilePath The Data Lake Store path (starting with '/') of the file or directory for which to retrieve the status.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FileStatusResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FileStatusResult> getFileStatus(String getFilePath, String accountName, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the file status object specified by the file path.
     *
     * @param getFilePath The Data Lake Store path (starting with '/') of the file or directory for which to retrieve the status.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getFileStatusAsync(String getFilePath, String accountName, String op, final ServiceCallback<FileStatusResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Appends to the specified file. This method does not support multiple concurrent appends to the file. NOTE: Concurrent append and normal (serial) append CANNOT be used interchangeably. Once a file has been appended to using either append option, it can only be appended to using that append option. Use the ConcurrentAppend option if you would like support for concurrent appends.
     *
     * @param directFilePath The Data Lake Store path (starting with '/') of the file to which to append.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param streamContents The file contents to include when appending to the file.
     * @param op The constant value for the operation.
     * @param append The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> append(String directFilePath, String accountName, InputStream streamContents, String op, String append) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Appends to the specified file. This method does not support multiple concurrent appends to the file. NOTE: Concurrent append and normal (serial) append CANNOT be used interchangeably. Once a file has been appended to using either append option, it can only be appended to using that append option. Use the ConcurrentAppend option if you would like support for concurrent appends.
     *
     * @param directFilePath The Data Lake Store path (starting with '/') of the file to which to append.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param streamContents The file contents to include when appending to the file.
     * @param op The constant value for the operation.
     * @param append The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall appendAsync(String directFilePath, String accountName, InputStream streamContents, String op, String append, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a file with optionally specified content.
     *
     * @param directFilePath The Data Lake Store path (starting with '/') of the file to create.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param write The constant value for the operation.
     * @param streamContents The file contents to include when creating the file. This parameter is optional, resulting in an empty file if not specified.
     * @param overwrite The indication of if the file should be overwritten.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> create(String directFilePath, String accountName, String op, String write, InputStream streamContents, Boolean overwrite) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a file with optionally specified content.
     *
     * @param directFilePath The Data Lake Store path (starting with '/') of the file to create.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param write The constant value for the operation.
     * @param streamContents The file contents to include when creating the file. This parameter is optional, resulting in an empty file if not specified.
     * @param overwrite The indication of if the file should be overwritten.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createAsync(String directFilePath, String accountName, String op, String write, InputStream streamContents, Boolean overwrite, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Opens and reads from the specified file.
     *
     * @param directFilePath The Data Lake Store path (starting with '/') of the file to open.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param read The constant value for the operation.
     * @param length the Long value
     * @param offset the Long value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<InputStream> open(String directFilePath, String accountName, String op, String read, Long length, Long offset) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Opens and reads from the specified file.
     *
     * @param directFilePath The Data Lake Store path (starting with '/') of the file to open.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param read The constant value for the operation.
     * @param length the Long value
     * @param offset the Long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall openAsync(String directFilePath, String accountName, String op, String read, Long length, Long offset, final ServiceCallback<InputStream> serviceCallback) throws IllegalArgumentException;

    /**
     * Sets the Access Control List (ACL) for a file or folder.
     *
     * @param setAclFilePath The Data Lake Store path (starting with '/') of the file or directory on which to set the ACL.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param aclspec The ACL spec included in ACL creation operations in the format '[default:]user|group|other::r|-w|-x|-'
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> setAcl(String setAclFilePath, String accountName, String aclspec, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Sets the Access Control List (ACL) for a file or folder.
     *
     * @param setAclFilePath The Data Lake Store path (starting with '/') of the file or directory on which to set the ACL.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param aclspec The ACL spec included in ACL creation operations in the format '[default:]user|group|other::r|-w|-x|-'
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall setAclAsync(String setAclFilePath, String accountName, String aclspec, String op, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Modifies existing Access Control List (ACL) entries on a file or folder.
     *
     * @param modifyAclFilePath The Data Lake Store path (starting with '/') of the file or directory with the ACL being modified.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param aclspec The ACL specification included in ACL modification operations in the format '[default:]user|group|other::r|-w|-x|-'
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> modifyAclEntries(String modifyAclFilePath, String accountName, String aclspec, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Modifies existing Access Control List (ACL) entries on a file or folder.
     *
     * @param modifyAclFilePath The Data Lake Store path (starting with '/') of the file or directory with the ACL being modified.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param aclspec The ACL specification included in ACL modification operations in the format '[default:]user|group|other::r|-w|-x|-'
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall modifyAclEntriesAsync(String modifyAclFilePath, String accountName, String aclspec, String op, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Removes existing Access Control List (ACL) entries for a file or folder.
     *
     * @param removeAclFilePath The Data Lake Store path (starting with '/') of the file or directory with the ACL being removed.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param aclspec The ACL spec included in ACL removal operations in the format '[default:]user|group|other'
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> removeAclEntries(String removeAclFilePath, String accountName, String aclspec, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Removes existing Access Control List (ACL) entries for a file or folder.
     *
     * @param removeAclFilePath The Data Lake Store path (starting with '/') of the file or directory with the ACL being removed.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param aclspec The ACL spec included in ACL removal operations in the format '[default:]user|group|other'
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall removeAclEntriesAsync(String removeAclFilePath, String accountName, String aclspec, String op, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Removes the existing Access Control List (ACL) of the specified file or directory.
     *
     * @param aclFilePath The Data Lake Store path (starting with '/') of the file or directory with the ACL being removed.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> removeAcl(String aclFilePath, String accountName, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Removes the existing Access Control List (ACL) of the specified file or directory.
     *
     * @param aclFilePath The Data Lake Store path (starting with '/') of the file or directory with the ACL being removed.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall removeAclAsync(String aclFilePath, String accountName, String op, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets Access Control List (ACL) entries for the specified file or directory.
     *
     * @param aclFilePath The Data Lake Store path (starting with '/') of the file or directory for which to get the ACL.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the AclStatusResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<AclStatusResult> getAclStatus(String aclFilePath, String accountName, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets Access Control List (ACL) entries for the specified file or directory.
     *
     * @param aclFilePath The Data Lake Store path (starting with '/') of the file or directory for which to get the ACL.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAclStatusAsync(String aclFilePath, String accountName, String op, final ServiceCallback<AclStatusResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes the requested file or directory, optionally recursively.
     *
     * @param filePath The Data Lake Store path (starting with '/') of the file or directory to delete.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param recursive The optional switch indicating if the delete should be recursive
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FileOperationResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FileOperationResult> delete(String filePath, String accountName, String op, Boolean recursive) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes the requested file or directory, optionally recursively.
     *
     * @param filePath The Data Lake Store path (starting with '/') of the file or directory to delete.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param recursive The optional switch indicating if the delete should be recursive
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String filePath, String accountName, String op, Boolean recursive, final ServiceCallback<FileOperationResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Rename a file or directory.
     *
     * @param renameFilePath The Data Lake Store path (starting with '/') of the file or directory to move/rename.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param destination The path to move/rename the file or folder to
     * @param op The constant value for the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FileOperationResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FileOperationResult> rename(String renameFilePath, String accountName, String destination, String op) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Rename a file or directory.
     *
     * @param renameFilePath The Data Lake Store path (starting with '/') of the file or directory to move/rename.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param destination The path to move/rename the file or folder to
     * @param op The constant value for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall renameAsync(String renameFilePath, String accountName, String destination, String op, final ServiceCallback<FileOperationResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Sets the owner of a file or directory.
     *
     * @param setOwnerFilePath The Data Lake Store path (starting with '/') of the file or directory for which to set the owner.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param owner The AAD Object ID of the user owner of the file or directory. If empty, the property will remain unchanged.
     * @param group The AAD Object ID of the group owner of the file or directory. If empty, the property will remain unchanged.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> setOwner(String setOwnerFilePath, String accountName, String op, String owner, String group) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Sets the owner of a file or directory.
     *
     * @param setOwnerFilePath The Data Lake Store path (starting with '/') of the file or directory for which to set the owner.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param owner The AAD Object ID of the user owner of the file or directory. If empty, the property will remain unchanged.
     * @param group The AAD Object ID of the group owner of the file or directory. If empty, the property will remain unchanged.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall setOwnerAsync(String setOwnerFilePath, String accountName, String op, String owner, String group, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Sets the permission of the file or folder.
     *
     * @param setPermissionFilePath The Data Lake Store path (starting with '/') of the file or directory for which to set the permission.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param permission A string representation of the permission (i.e 'rwx'). If empty, this property remains unchanged.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> setPermission(String setPermissionFilePath, String accountName, String op, String permission) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Sets the permission of the file or folder.
     *
     * @param setPermissionFilePath The Data Lake Store path (starting with '/') of the file or directory for which to set the permission.
     * @param accountName The Azure Data Lake Store account to execute filesystem operations on.
     * @param op The constant value for the operation.
     * @param permission A string representation of the permission (i.e 'rwx'). If empty, this property remains unchanged.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall setPermissionAsync(String setPermissionFilePath, String accountName, String op, String permission, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}
