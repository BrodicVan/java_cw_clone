/**
 * Merges this frame with the given frame (case of a RET instruction).
 * 
 * @param frame a frame
 * @param access the local variables that have been accessed by the
 *        subroutine to which the RET instruction corresponds.
 * @return <tt>true</tt> if this frame has been changed as a result of the
 *         merge operation, or <tt>false</tt> otherwise.
 */
public boolean merge(final Frame frame, final boolean[] access){
    boolean changes = false;
    for (int i = 0; i < locals; ++i) {
        if (!access[i] && !values[i].equals(frame.values[i])) {
            values[i] = frame.values[i];
            changes = true;
        }
    }
    return changes;
}