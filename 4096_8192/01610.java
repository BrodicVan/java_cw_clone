/**
 * Set a drawable to draw in the insets area for the status bar.
 * Note that this will only be activated if this DrawerLayout fitsSystemWindows.
 *
 * @param bg Background drawable to draw behind the status bar
 */
public void setStatusBarBackground(Drawable bg){
  mStatusBarBackground = bg;
  invalidate();
}