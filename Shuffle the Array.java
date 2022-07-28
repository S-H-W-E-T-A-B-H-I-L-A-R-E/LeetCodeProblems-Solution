class Solution {
    public int[] shuffle(int[] nums, int n) {
      
        if(nums.length<=0 || n < 0 )
            return nums;
        
        int[] result = new int[nums.length] ;
        
        for(int i=0; i<n; i++){
            result[2*i] = nums[i];
            result[2*i+1]= nums[n+i];
        }
        return result;
    }
}