public class arryleet_Kunal3 {
   
        public int[] runningSum(int[] nums) {
           
            int n=nums.length;
            int arr[] = new int[n];
            int runningsum=0;
            for (int i = 0 ;i <n; i++){
                runningsum += nums[i];
                 arr[i]= runningsum;
            }
            return arr;
            
        }
    
    
}
