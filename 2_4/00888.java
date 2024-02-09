/**
 * Creates a new 3D rotation on the Y axis. The rotation is defined by its
 * start angle and its end angle. Both angles are in degrees. The rotation
 * is performed around a center point on the 2D space, definied by a pair of
 * X and Y coordinates, called centerX and centerY. When the animation
 * starts, a translation on the Z axis (depth) is performed. The length of
 * the translation can be specified, as well as whether the translation
 * should be reversed in time.
 * 
 * @param fromDegrees the start angle of the 3D rotation
 * @param toDegrees the end angle of the 3D rotation
 * @param centerX the X center of the 3D rotation
 * @param centerY the Y center of the 3D rotation
 * @param reverse true if the translation should be reversed, false
 *            otherwise
 */
public Rotate3dAnimation(float fromDegrees, float toDegrees, float centerX, float centerY,
        float depthZ, boolean reverse){
    mFromDegrees = fromDegrees;
    mToDegrees = toDegrees;
    mCenterX = centerX;
    mCenterY = centerY;
    mDepthZ = depthZ;
    mReverse = reverse;
}