public class selectionsort {

    //selection sort:
    // in selection sort 
    // we find the smallest element in the array and swap it with the first element
    // then we find the second smallest element and swap it with the second element
    // and so on

    //  quadratic time O(n^2)
    // small data set = okay  for large data set it will not okay
    public static void main(String[] args) {
        int arr[] ={8,7,9,2,3,1,5,4,6};

        selectionsorti(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static void selectionsorti(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]> arr[j]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }
}
