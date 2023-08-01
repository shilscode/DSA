class Solution {
    

    static int findNumbers(int[] nums) {
        int count= 0;
        for(int num: nums){
            if (countdigit(num)/2==0){
                count++;
            }
        }
        return count;
    }
    static int countdigit(int num){
        int count =0;
        while (num>0){
            
            num= num/10;
            count++;

        }
        return count;
        

    }


     public static void main (String[]args){

        int[] nums1 = {555,901,482,1771};
        int output1 = findNumbers(nums1);
        

        System.out.println("Output for nums1: " + output1);
    }


    
}