public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {9,1,8,2,7,3,6,4,5};
        bubblesort(arr);

        for(int i : arr){
            System.out.println(i);
        }
       
    }
    public static void bubblesort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
          for (int j = 0; j < arr.length-i-1; j++) {
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
          }
        }
    }
}
