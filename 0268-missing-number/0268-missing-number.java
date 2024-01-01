class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        int TotalSum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        for(int i=0;i<=n;i++){
            TotalSum+=i;
        }
        
        return TotalSum-sum;
        
    }
}