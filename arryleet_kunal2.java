//Example 1:

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]
// Example 2:

// Input: nums = [1,3,2,1]
// Output: [1,3,2,1,1,3,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
// - ans = [1,3,2,1,1,3,2,1]

import java.util.Arrays;

public class arryleet_kunal2 {
    public static void  main (String[]args){
        int [] arr ={1,2,34,5,7};
        int[] result = buildArray(arr);
        System.out.println(Arrays.toString(result));


    }

     public static int[] buildArray(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n*2];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }

         for (int i = n-1; i >=0; i--) {
          
            ans[2 * n - i - 1] = nums[i];
        }
        
        return ans;
    }
}
