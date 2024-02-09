/**
 * Database index used for Redis connection
 * Default is <code>0</code>
 *
 * @param database number
 * @return config
 */
public MasterSlaveServersConfig setDatabase(int database){
    this.database = database;
    return this;
}