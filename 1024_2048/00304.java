/**
 * Set a color to use for the shadow at the edge of content view while a drawer is open.
 * @param shadowColor  Color to use in 0xAARRGGBB format.
 * @return this
 */
public DrawerConsumer setShadowColor(int shadowColor){
    mShadowColor = shadowColor;
    return this;
}