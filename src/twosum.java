import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        // System.out.println(result.toString());
        System.out.println(Arrays.toString(result));
        System.out.println("done");
    }


    // hashmap method

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            
            if(map.containsKey(complement)){
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        return new int[] {}; // not found
    }


//  two for loop methiod


    // public static int[] twoSum(int[] nums, int target) {
    //     for(int i = 0; i < nums.length; i++) {
    //         for(int j = i + 1; j < nums.length; j++) {
    //             if(nums[i] + nums[j] == target) {
    //                 return new int[] { i, j };
    //             }
    //         }
    //     }
    //     return new int[] {};
    // }
    
}
