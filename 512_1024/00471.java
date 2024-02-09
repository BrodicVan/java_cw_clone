/**
 * Sets the expanded title margins.
 *
 * @param start the starting title margin in pixels
 * @param top the top title margin in pixels
 * @param end the ending title margin in pixels
 * @param bottom the bottom title margin in pixels
 *
 * @see #getExpandedTitleMarginStart()
 * @see #getExpandedTitleMarginTop()
 * @see #getExpandedTitleMarginEnd()
 * @see #getExpandedTitleMarginBottom()
 * @attr ref android.support.design.R.styleable#CollapsingToolbarLayout_expandedTitleMargin
 */
public void setExpandedTitleMargin(int start, int top, int end, int bottom){
    mExpandedMarginStart = start;
    mExpandedMarginTop = top;
    mExpandedMarginEnd = end;
    mExpandedMarginBottom = bottom;
    requestLayout();
}