/**
 * <p>
 * Finds the next focusable component that fits in this View's bounds
 * (excluding fading edges) pretending that this View's top is located at
 * the parameter top.
 * </p>
 * 
 * @param topFocus
 *            look for a candidate is the one at the top of the bounds if
 *            topFocus is true, or at the bottom of the bounds if topFocus
 *            is false
 * @param top
 *            the top offset of the bounds in which a focusable must be
 *            found (the fading edge is assumed to start at this position)
 * @param preferredFocusable
 *            the View that has highest priority and will be returned if it
 *            is within my bounds (null is valid)
 * @return the next focusable component in the bounds or null if none can be
 *         found
 */
private View findFocusableViewInMyBounds(final boolean topFocus, final int top, View preferredFocusable){
	/*
	 * The fading edge's transparent side should be considered for focus
	 * since it's mostly visible, so we divide the actual fading edge length
	 * by 2.
	 */
	final int fadingEdgeLength = getVerticalFadingEdgeLength() / 2;
	final int topWithoutFadingEdge = top + fadingEdgeLength;
	final int bottomWithoutFadingEdge = top + getHeight() - fadingEdgeLength;

	if ((preferredFocusable != null) && (preferredFocusable.getTop() < bottomWithoutFadingEdge)
			&& (preferredFocusable.getBottom() > topWithoutFadingEdge))
	{
		return preferredFocusable;
	}

	return findFocusableViewInBounds(topFocus, topWithoutFadingEdge, bottomWithoutFadingEdge);
}