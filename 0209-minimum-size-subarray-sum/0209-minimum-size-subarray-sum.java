class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
         int min_length=Integer.MAX_VALUE;
         int j=0;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            while(sum>=target){
                min_length=Math.min(min_length,i-j+1);
                sum-=nums[j++];
            }
        }
        // time complexity o(n);
        
        return min_length!=Integer.MAX_VALUE?min_length:0;
    }
}