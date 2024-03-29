// -----------------------------------------------------------------------
/**
 * Removes the extension from a filename.
 * <p>
 * This method returns the textual part of the filename before the last dot.
 * There must be no directory separator after the dot.
 * 
 * <pre>
 * foo.txt    --&gt; foo
 * a\b\c.jpg  --&gt; a\b\c
 * a\b\c      --&gt; a\b\c
 * a.b\c      --&gt; a.b\c
 * </pre>
 * <p>
 * The output will be the same irrespective of the machine that the code is
 * running on.
 * 
 * @param filename
 *            the filename to query, null returns null
 * @return the filename minus the extension
 */
public static String removeExtension(String filename){
	if (filename == null) {
		return null;
	}
	int index = indexOfExtension(filename);
	if (index == -1) {
		return filename;
	} else {
		return filename.substring(0, index);
	}
}