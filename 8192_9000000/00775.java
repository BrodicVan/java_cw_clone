/**
 * Set Redis master server address. Use follow format -- host:port
 *
 * @param masterAddress of Redis
 * @return config
 */
public MasterSlaveServersConfig setMasterAddress(String masterAddress){
    this.masterAddress = masterAddress;
    return this;
}