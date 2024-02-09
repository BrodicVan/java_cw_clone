/**
 * This creates a new table creation node.
 *
 * Note: The type of the columns is implied to be varchar.
 *
 * @param pTableName the name of the table to create
 * @param pColumnNames the column names the table is supposed to have.
 */
public CreateTable(final String pTableName,
                   final List<String> pColumnNames){
    tableName = pTableName;
    columnNames = pColumnNames;
}