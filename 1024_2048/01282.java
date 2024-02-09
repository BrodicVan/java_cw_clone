/**
 * 回收VelocityTracker
 */
private void recycleVelocityTracker(){
    if (mVelocityTracker != null) {
        mVelocityTracker.recycle();
        mVelocityTracker = null;
    }
}