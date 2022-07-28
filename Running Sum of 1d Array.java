class Solution {
    public int[] runningSum(int[] nums) {
        
        int size = nums.length;
        if(size == 0) return nums;
        int sum=0;
        int[] ans= new int[size];
        for(int i =0 ; i<size; i++){
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}


/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/