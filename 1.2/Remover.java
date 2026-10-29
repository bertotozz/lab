public class Remover {

  public int removeElementInplace(int[] arr, int val) {
    int newSize = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != val) {
        arr[newSize] = arr[i];
        newSize++;
      }
    }
    return newSize;
  }
}
