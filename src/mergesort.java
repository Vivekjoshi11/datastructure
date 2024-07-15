public class mergesort {

    // merge sort 
    public static void main(String[] args) {
        
        int[] arr = {8,2,5,3,4,7,6,1};
        mergesortfunction(arr);

        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
        }
    }

    private static void mergesortfunction(int[] arr) {
      int length = arr.length;
      if(length <= 1 ){   // base case
        return;
      }
      int middle = length/2;
      int[] left = new int[middle]; // left half
      int[] right = new int[length - middle]; // right half

      int i = 0; // left array
      int j = 0; // right array

      for (int k = 0; k < right.length; k++) {
        if(i < middle){
            left[k] = arr[k];
        }
        else{
            right[j] = arr[k];
            j++;
        }
      }
      mergesortfunction(left);
      mergesortfunction(right);
      merge(left, right, arr);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array){
      int leftSize = array.length/2;
      int rightSize = array.length - leftSize;
      int i = 0, l = 0, r =0;

      // check condition for merging
      while (l < leftSize && r < rightSize) {
        if(leftArray[l] < rightArray[r]){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        else{
            array[i] = rightArray[r];
            i++;
            r++; 
        }
      }
      while(l < leftSize){
        array[i] = leftArray[l];
        i++;
        l++;
      }
      while (r < rightSize) {
        array[i] = rightArray[r];
        i++;
        r++;
      }
    }
}
