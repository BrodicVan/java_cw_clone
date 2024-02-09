// Constructor needed by Java RPC server
protected Cursor(final Database database, final CursorConfig config){
    this.database = database;
    this.config = config;
}