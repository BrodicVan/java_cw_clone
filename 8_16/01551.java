/**
 * JDK1.5-replacement of {@link Arrays#copyOf(char[], int)}
 */
private static char[] copyOf(char[] original, int newLength){
	char[] copy = new char[newLength];
	System.arraycopy(original, 0, copy, 0, Math.min(original.length,
			newLength));
	return copy;
}