/**
 * Gets the name minus the path from a full filename.
 * <p>
 * This method will handle a file in either Unix or Windows format. The text
 * after the last forward or backslash is returned.
 * 
 * <pre>
 * a/b/c.txt --&gt; c.txt
 * a.txt     --&gt; a.txt
 * a/b/c     --&gt; c
 * a/b/c/    --&gt; &quot;&quot;
 * </pre>
 * <p>
 * The output will be the same irrespective of the machine that the code is
 * running on.
 * 
 * @param filename
 *            the filename to query, null returns null
 * @return the name of the file without the path, or an empty string if none
 *         exists
 */
public static String getName(String filename){
	if (filename == null) {
		return null;
	}
	int index = indexOfLastSeparator(filename);
	return filename.substring(index + 1);
}