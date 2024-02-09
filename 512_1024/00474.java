/**
 * Set the top and bottom offset for this {@link ViewOffsetHelper}'s view.
 *
 * @param offset the offset in px.
 * @return true if the offset has changed
 */
public boolean setTopAndBottomOffset(int offset){
    if (mOffsetTop != offset) {
        mOffsetTop = offset;
        updateOffsets();
        return true;
    }
    return false;
}