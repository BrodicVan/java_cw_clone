/**
 * Sets the top expanded title margin in pixels.
 *
 * @param margin the top title margin in pixels
 * @see #getExpandedTitleMarginTop()
 * @attr ref android.support.design.R.styleable#CollapsingToolbarLayout_expandedTitleMarginTop
 */
public void setExpandedTitleMarginTop(int margin){
    mExpandedMarginTop = margin;
    requestLayout();
}