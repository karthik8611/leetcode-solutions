class Solution {
    public long maxArrayValue(int[] nums) {
        
        long [] ans = new long[nums.length];
        
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            
        }
    
        
        for(int i=ans.length-1;i>0;i--){
            if(ans[i]>=ans[i-1]){
                ans[i-1]+=ans[i];
            }
        }
        
        return ans[0];
    }
}