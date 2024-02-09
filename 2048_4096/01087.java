/**
 * Sets a callback that's invoked when an individual ClusterItem is tapped. Note: For this
 * listener to function, the ClusterManager must be added as a click listener to the map.
 */
public void setOnClusterItemClickListener(OnClusterItemClickListener<T> listener){
    mOnClusterItemClickListener = listener;
    mRenderer.setOnClusterItemClickListener(listener);
}