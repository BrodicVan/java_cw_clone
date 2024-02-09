/**
 * Sets the ending expanded title margin in pixels.
 *
 * @param margin the ending title margin in pixels
 * @see #getExpandedTitleMarginEnd()
 * @attr ref android.support.design.R.styleable#CollapsingToolbarLayout_expandedTitleMarginEnd
 */
public void setExpandedTitleMarginEnd(int margin){
    mExpandedMarginEnd = margin;
    requestLayout();
}