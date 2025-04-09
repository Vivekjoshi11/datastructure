public class moveZero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZ(arr);
    }
    public static void moveZ(int[] nums){
      int i =0;

      for (int j = 0; j < nums.length; j++) {
        if(nums[j]!=0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
      }
      for (int k : nums) {
        System.out.println(k);
      }
    }
}
