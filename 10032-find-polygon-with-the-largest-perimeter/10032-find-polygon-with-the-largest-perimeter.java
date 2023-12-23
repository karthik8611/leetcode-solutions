class Solution {
    public long largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        
    
        long ans=-1;
        
        long sum=0;
        
        
        
        for(int i=0;i<nums.length;i++){
            
       if(i>=2 && sum>nums[i]){
           ans=sum+nums[i];
       }
            
            sum+=(long) nums[i];
            
        
            
        }
        
        return ans;
        
    }
}