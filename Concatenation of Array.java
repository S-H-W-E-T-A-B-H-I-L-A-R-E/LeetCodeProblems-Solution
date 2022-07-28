class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        if(n==0) 
        {
            return nums;
        }
        
        int[] ans = new int[n+n];
           
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n]= nums[i];
        }
            return ans;
        
    }
}

//concatenate same array twice