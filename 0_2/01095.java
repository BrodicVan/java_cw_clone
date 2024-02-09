/**
 * The default constructor accepting all the necessary fields.
 * @param tableName
 * @param columnName
 * @param required
 * @param type
 * @param primaryKey
 * @param foreignKey
 * @param foreignKeyTable
 * @param foreignKeyColumn
 */
public ColumnMapper( String tableName, String columnName, boolean required,
        Integer type, boolean primaryKey, boolean foreignKey, String foreignKeyTable, String foreignKeyColumn ){
    this.tableName = tableName;
    this.columnName = columnName;
    this.required = required;
    this.type = type;
    this.primaryKey = primaryKey;
    this.foreignKey = foreignKey;
    this.foreignKeyTable = foreignKeyTable;
    this.foreignKeyColumn = foreignKeyColumn;
}