class Solution {
    public int longestSubarray(int[] nums) {
        
        int maxVal=0;
        int ans=0;
        int currentLength=0;
        
        for(int num:nums){
            if(maxVal<num){
                maxVal=num;
                ans=0;
                currentLength=0;
            }
            
            if(maxVal==num){
                currentLength++;
            }else{
                currentLength=0;
            }
            
            ans=Math.max(ans,currentLength);
        }
        
        return ans;
        
    }
}