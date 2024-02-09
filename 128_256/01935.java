/**
 * Scrolls the view to the given child.
 * 
 * @param child
 *            the View to scroll to
 */
private void scrollToChild(View child){
	child.getDrawingRect(mTempRect);

	/* Offset from child's local coordinates to ScrollView coordinates */
	offsetDescendantRectToMyCoords(child, mTempRect);

	int scrollDelta = computeScrollDeltaToGetChildRectOnScreen(mTempRect);

	if (scrollDelta != 0)
	{
		scrollBy(0, scrollDelta);
	}
}