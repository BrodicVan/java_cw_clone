/**
 * Sets the bottom expanded title margin in pixels.
 *
 * @param margin the bottom title margin in pixels
 * @see #getExpandedTitleMarginBottom()
 * @attr ref android.support.design.R.styleable#CollapsingToolbarLayout_expandedTitleMarginBottom
 */
public void setExpandedTitleMarginBottom(int margin){
    mExpandedMarginBottom = margin;
    requestLayout();
}