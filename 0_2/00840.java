/** Same functionality as {@link #setDebugMillis(int repaintMillis)} only this method returns <code>this</code> for chaining multiple calls.
 * <p>
 * For a more thorough explanation of what this constraint does see the white paper or cheat Sheet at www.migcomponents.com.
 * @param repaintMillis The new debug repaint interval.
 * @return <code>this</code> so it is possible to chain calls. E.g. <code>new LayoutConstraint().noGrid().gap().fill()</code>.
 * @see #setDebugMillis(int)
 */
public final LC debug(int repaintMillis){
	setDebugMillis(repaintMillis);
	return this;
}