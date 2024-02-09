/**
 * Sets whether the request should wait for there to be no relocating shards before
 * retrieving the cluster health status.  Defaults to {@code false}, meaning the
 * operation does not wait on there being no more relocating shards.  Set to <code>true</code>
 * to wait until the number of relocating shards in the cluster is 0.
 */
public ClusterHealthRequest waitForNoRelocatingShards(boolean waitForNoRelocatingShards){
    this.waitForNoRelocatingShards = waitForNoRelocatingShards;
    return this;
}