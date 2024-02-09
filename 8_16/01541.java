/**
 * JDK1.5-replacement of {@link Arrays#copyOf(char[], int)}
 */
public static State[] copyOf(State[] original, int newLength){
	State[] copy = new State[newLength];
	System.arraycopy(original, 0, copy, 0, Math.min(original.length, newLength));
	return copy;
}