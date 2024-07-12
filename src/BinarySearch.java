import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        //  for binary search array should be sorted
        // in this we do first index + last ined / 2 and check if element is less than or greater than  and like wise we decide our nexr first inxdex and last index
         int[] arr = new int[100];
         int target = 42;
         for ( int i = 0; i < arr.length; i++) {
            arr[i] = i;
         }
        //  int index = Arrays.binarySearch( arr, target);
        int index = binarySearch(arr, target);
         if(index == -1){
            System.out.println(target + "not found");
         }
         else{
            System.out.println("target found at :" + index);
         }
    }

    public static int binarySearch(int[] arr, int target){


        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start) /2;
            int value = arr[mid];

            System.out.println("middle value : " +value);

            if(value < target) {
                start = mid + 1;

            }
            else if(value > target){
                end = mid -1;
            }
            else {
                return -1;
            }

        }
        return -1;  // target not found
    }
}
