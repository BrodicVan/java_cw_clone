/**
 * Changes the secondary color and invalidates the view to force a redraw.
 * @param color New color to assign to mSecondaryColor.
 */
public void setSecondaryColor(int color){
    mSecondaryColor = color;
    invalidate();
}