/**
 * Sets a callback that's invoked when a Cluster is tapped. Note: For this listener to function,
 * the ClusterManager must be added as a click listener to the map.
 */
public void setOnClusterClickListener(OnClusterClickListener<T> listener){
    mOnClusterClickListener = listener;
    mRenderer.setOnClusterClickListener(listener);
}