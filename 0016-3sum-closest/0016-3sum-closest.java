class Solution {

    public int threeSumClosest(int[] nums, int target) {
        
        int mindiff=Integer.MAX_VALUE;
        int closestsum=Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            
            while(left<right){
                int currentsum=nums[i]+nums[left]+nums[right];
             int   diff=Math.abs(currentsum-target);
                
                if(currentsum==target){
                    return currentsum;
                }
                
                if(diff<mindiff){
                    mindiff=diff;
                    closestsum=currentsum;
                }
                
                if(currentsum<target){
                    left++;
                }else{
                    right--;
                }
                
                
                
            }
            
        }
        
        return closestsum;
       
    }
}
