class Solution {
    public int findPeakElement(int[] nums) {
        int k=0;
        if(nums.length==2){
            if(nums[0]>nums[1]){
                k=0;
            }else{
                k=1;
            }
        }
            
    
        
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                k=i;
            }else if(nums[i-1]<nums[i] && nums[i]<nums[i+1]){
                k=i+1;
            }
        }
        
        return k;
      
    }
}