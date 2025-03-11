public class mergesort {

  public static void main(String[] args) {
      int[] arr = {8, 2, 5, 3, 4, 7, 6, 1};
      mergeSort(arr);

      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
  }

  private static void mergeSort(int[] arr) {
      int length = arr.length;
      if (length <= 1) {  // base case
          return;
      }

      int middle = length / 2;
      int[] left = new int[middle];
      int[] right = new int[length - middle];

      System.arraycopy(arr, 0, left, 0, middle);  // Efficient copying using System.arraycopy
      System.arraycopy(arr, middle, right, 0, length - middle);

      mergeSort(left);
      mergeSort(right);
      merge(left, right, arr);
  }

  public static void merge(int[] leftArray, int[] rightArray, int[] arr) {
      int leftSize = leftArray.length;
      int rightSize = rightArray.length;
      int i = 0, l = 0, r = 0;

      // check condition for merging
      while (l < leftSize && r < rightSize) {
          if (leftArray[l] < rightArray[r]) {
              arr[i] = leftArray[l];
              i++;
              l++;
          } else {
              arr[i] = rightArray[r];
              i++;
              r++;
          }
      }

      // Copy remaining elements from left or right arrays
      while (l < leftSize) {
          arr[i] = leftArray[l];
          i++;
          l++;
      }
      while (r < rightSize) {
          arr[i] = rightArray[r];
          i++;
          r++;
      }
  }
}
