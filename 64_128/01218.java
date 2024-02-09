// TODO(kevinb): consider making this public
private static int lastIndexOf(
    int[] array, int target, int start, int end){
  for (int i = end - 1; i >= start; i--) {
    if (array[i] == target) {
      return i;
    }
  }
  return -1;
}