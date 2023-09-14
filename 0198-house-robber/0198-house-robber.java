class Solution {
    public int rob(int[] nums) {
        
        int dp [] = new int[nums.length];
        
        Arrays.fill(dp,-1);
        
        return solve(nums.length-1,nums,dp);
        
    }
    
    public int solve(int index,int [] nums,int dp []){
        
       // memoization
        
        // tc:o(n)
        
        // space complexity:  o(n) +o(n)
        
        if(index==0) return nums[index];
        
        if(index<0) return 0;
        
        if(dp[index]!=-1) return dp[index];
        
        int pick=solve(index-2,nums,dp)+nums[index];
        int notpick=solve(index-1,nums,dp);
         
        return dp[index]=Math.max(pick,notpick);

    }
}