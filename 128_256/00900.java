/**
 * Indicates this ScrollView whether it should stretch its content height to fill
 * the viewport or not.
 *
 * @param fillViewport True to stretch the content's height to the viewport's
 *        boundaries, false otherwise.
 *
 * @attr ref android.R.styleable#ScrollView_fillViewport
 */
public void setFillViewport(boolean fillViewport){
	if (fillViewport != mFillViewport) {
		mFillViewport = fillViewport;
		requestLayout();
	}
}