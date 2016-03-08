/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.datalake.analytics.models;


/**
 * A Data Lake Analytics catalog U-SQL procedure item.
 */
public class USqlProcedure extends CatalogItem {
    /**
     * Gets or sets the name of the database.
     */
    private String databaseName;

    /**
     * Gets or sets the name of the schema associated with this procedure and
     * database.
     */
    private String schemaName;

    /**
     * Gets or sets the name of the procedure.
     */
    private String procName;

    /**
     * Gets or sets the defined query of the procedure.
     */
    private String definition;

    /**
     * Get the databaseName value.
     *
     * @return the databaseName value
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName value.
     *
     * @param databaseName the databaseName value to set
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * Get the schemaName value.
     *
     * @return the schemaName value
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * Set the schemaName value.
     *
     * @param schemaName the schemaName value to set
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * Get the procName value.
     *
     * @return the procName value
     */
    public String getProcName() {
        return this.procName;
    }

    /**
     * Set the procName value.
     *
     * @param procName the procName value to set
     */
    public void setProcName(String procName) {
        this.procName = procName;
    }

    /**
     * Get the definition value.
     *
     * @return the definition value
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * Set the definition value.
     *
     * @param definition the definition value to set
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

}
