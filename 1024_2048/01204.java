/**
 * <p>Returns the amount of extra space that should be rendered by LinearLayoutManager.
 * By default, {@link android.support.v7.widget.LinearLayoutManager} lays out 1 extra page of
 * items while smooth scrolling and 0 otherwise. You can override this method to implement your
 * custom layout pre-cache logic.</p>
 * <p>Laying out invisible elements will eventually come with performance cost. On the other
 * hand, in places like smooth scrolling to an unknown location, this extra content helps
 * LayoutManager to calculate a much smoother scrolling; which improves user experience.</p>
 * <p>You can also use this if you are trying to pre-render your upcoming views.</p>
 *
 * @return The extra space that should be laid out (in pixels).
 */
protected int getExtraLayoutSpace(RecyclerView.State state){
    if (state.hasTargetScrollPosition()) {
        return mOrientationHelper.getTotalSpace();
    } else {
        return 0;
    }
}