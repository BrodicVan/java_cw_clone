// TODO(kevinb): consider making this public
private static int indexOf(
    char[] array, char target, int start, int end){
  for (int i = start; i < end; i++) {
    if (array[i] == target) {
      return i;
    }
  }
  return -1;
}