public class leaniersearch {
    public static void main(String[] args) {
        int[] arr = {1,5,8,3,6,5};
        int index = LinearSearch(arr,3);
        if(index != -1){
            System.out.println("Element found at index "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    public static int LinearSearch(int[] arr, int value){
       for (int j = 0; j < arr.length; j++) {
        if(arr[j] == value){
            return j;
        }
       }
       return -1;
    }
}
