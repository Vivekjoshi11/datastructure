public class interpolationSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int index = interpolationSearch(arr, 1);

        if( index != -1){
            System.out.println("Element found at index " + index);  
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int interpolationSearch(int[] arr, int value) {
        int high = arr.length -1;
        int low = 0;
            while (value>= arr[low]  && value <= arr[high]  &&  low <= high) {
                int probe = (high - low) * (value - arr[low])/
                 (arr[high] - arr[low]) ;

                 System.out.println("probe: "+ probe);

                 if(arr[probe]  == value){
                    return probe;
                 }
                 else if(arr[probe] < value){
                    low = probe + 1;
                 }
                 else{
                    high = probe - 1;
                 }

            }
            return -1; 
        }
}
