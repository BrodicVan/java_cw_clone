// Copy from Arrays.copyOfRange() which is only available from API level 9.
/**
 * Copies elements from {@code original} into a new array, from indexes start (inclusive) to
 * end (exclusive). The original order of elements is preserved.
 * If {@code end} is greater than {@code original.length}, the result is padded
 * with the value {@code 0.0f}.
 *
 * @param original the original array
 * @param start the start index, inclusive
 * @param end the end index, exclusive
 * @return the new array
 * @throws ArrayIndexOutOfBoundsException if {@code start < 0 || start > original.length}
 * @throws IllegalArgumentException if {@code start > end}
 * @throws NullPointerException if {@code original == null}
 */
public static float[] copyOfRange(float[] original, int start, int end){
    if (start > end) {
        throw new IllegalArgumentException();
    }
    int originalLength = original.length;
    if (start < 0 || start > originalLength) {
        throw new ArrayIndexOutOfBoundsException();
    }
    int resultLength = end - start;
    int copyLength = Math.min(resultLength, originalLength - start);
    float[] result = new float[resultLength];
    System.arraycopy(original, start, result, 0, copyLength);
    return result;
}