public class insertionsort {

    // insertion sort
    // after comparing elements to the left shift element to the right to make room to insert a value
    // quadratic time O(n^2)
    // small data set = decent
    // large data set = BAD

    // Less steps than Bubble sort
    // Best case is O(n) Compared to selection sort O(n^2)
    // Worst case is O(n^2) compared to selection sort O(n^2)
    public static void main(String[] args) {
        int arr[] = {9,1,8,2,7,3,6,5,4};
        insertionsortfunction(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void insertionsortfunction(int[] arr) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'insertionsortfunction'");
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
