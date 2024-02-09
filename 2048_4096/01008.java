/* Standard swap. Also updates our "swaps" variable */
private static void swap(int [] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    swaps++;
}