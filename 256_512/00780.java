/**
 * Set a color to use for the scrim that obscures primary content while a
 * drawer is open.
 * 
 * @param color Color to use in 0xAARRGGBB format.
 */
public void setScrimColor(int color){
    mScrimColor = color;
    invalidate();
}