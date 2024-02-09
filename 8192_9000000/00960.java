/**
 * There are 2 diffirent show mode.
 * {@link com.daimajia.swipe.SwipeLayout.ShowMode}.PullOut and
 * {@link com.daimajia.swipe.SwipeLayout.ShowMode}.LayDown.
 *
 * @param mode
 */
public void setShowMode(ShowMode mode){
    mShowMode = mode;
    requestLayout();
}