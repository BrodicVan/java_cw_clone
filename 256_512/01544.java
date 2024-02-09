/**
 * Sets the {@link #mClockwiseReachedArcWidth} and invalidates the view
 *
 * @param width The height in dp to set
 */
public void setClockwiseReachedArcWidth(float width){
    mClockwiseReachedArcWidth = width;
    invalidate();
}