/** Same functionality as <code>setGridGapY(ConstraintParser.parseBoundSize(boundsSize, true, false))</code> only this method
 * returns <code>this</code> for chaining multiple calls.
 * <p>
 * For a more thorough explanation of what this constraint does see the white paper or cheat Sheet at www.migcomponents.com.
 * @param boundsSize The <code>BoundSize</code> of the gap. This is a minimum and/or preferred and/or maximum size. E.g.
 * <code>"50:100:200"</code> or <code>"100px"</code>.
 * @return <code>this</code> so it is possible to chain calls. E.g. <code>new LayoutConstraint().noGrid().gap().fill()</code>.
 * @see #setGridGapY(BoundSize)
 */
public final LC gridGapY(String boundsSize){
	setGridGapY(ConstraintParser.parseBoundSize(boundsSize, true, false));
	return this;
}