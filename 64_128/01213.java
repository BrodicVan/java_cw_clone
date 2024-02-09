// Arrays.copyOf() requires Java 6
private static char[] copyOf(char[] original, int length){
  char[] copy = new char[length];
  System.arraycopy(original, 0, copy, 0, Math.min(original.length, length));
  return copy;
}