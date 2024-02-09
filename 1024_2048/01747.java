/**
 * @param ip  
 * @param alarmSettings  
 * @param zookeeperCluster 
 */
public ZKServerPerformanceCollector( String ip, AlarmSettings alarmSettings, ZooKeeperCluster zookeeperCluster ){
	this.ip = ip;
	this.alarmSettings = alarmSettings;
	this.zookeeperCluster = zookeeperCluster;
}