/*
 * private void animateToTab(final int position) { //final View tabView =
 * mTabLayout.getChildAt(position); if (mTabSelector != null) {
 * removeCallbacks(mTabSelector); } mTabSelector = new Runnable() { public
 * void run() { //final int scrollPos = tabView.getLeft() - (getWidth() -
 * tabView.getWidth()) / 2; //smoothScrollTo(scrollPos, 0);
 * setSelection(position); // TODO: Animate mTabSelector = null; } };
 * post(mTabSelector); }
 */
@Override
public void onAttachedToWindow(){
    super.onAttachedToWindow();
    if (mTabSelector != null) {
        // Re-post the selector we saved
        post(mTabSelector);
    }
}