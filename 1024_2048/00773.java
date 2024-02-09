/**
 * Sets whether the request should wait for there to be no initializing shards before
 * retrieving the cluster health status.  Defaults to {@code false}, meaning the
 * operation does not wait on there being no more initializing shards.  Set to <code>true</code>
 * to wait until the number of initializing shards in the cluster is 0.
 */
public ClusterHealthRequest waitForNoInitializingShards(boolean waitForNoInitializingShards){
    this.waitForNoInitializingShards = waitForNoInitializingShards;
    return this;
}