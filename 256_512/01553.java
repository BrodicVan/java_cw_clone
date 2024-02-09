/**
 * Sets the {@link #mClockwiseOutlineArcWidth} and invalidates the view
 *
 * @param width The height in dp to set
 */
public void setClockwiseOutlineArcWidth(float width){
    mClockwiseOutlineArcWidth = width;
    invalidate();
}