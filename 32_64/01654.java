/**
 * Sets whether an indicator graphic should be displayed when the View is in
 * a state where a Pull-to-Refresh can happen. An example of this state is
 * when the Adapter View is scrolled to the top and the mode is set to
 * {@link Mode#PULL_FROM_START}
 * 
 * @param showIndicator - true if the indicators should be shown.
 */
public void setShowIndicator(boolean showIndicator){
	mShowIndicator = showIndicator;

	if (getShowIndicatorInternal()) {
		// If we're set to Show Indicator, add/update them
		addIndicatorViews();
	} else {
		// If not, then remove then
		removeIndicatorViews();
	}
}