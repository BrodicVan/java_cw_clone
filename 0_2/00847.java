/** Sets a wrap after the number of columns/rows that is defined in the {@link net.miginfocom.layout.AC}.
 * <p>
 * Same functionality as {@link #setWrapAfter(int 0)} only this method returns <code>this</code> for chaining multiple calls.
 * <p>
 * For a more thorough explanation of what this constraint does see the white paper or cheat Sheet at www.migcomponents.com.
 * @return <code>this</code> so it is possible to chain calls. E.g. <code>new LayoutConstraint().noGrid().gap().fill()</code>.
 */
public final LC wrap(){
	setWrapAfter(0);
	return this;
}