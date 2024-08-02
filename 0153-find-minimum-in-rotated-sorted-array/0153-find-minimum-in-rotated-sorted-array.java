class Solution {
    public int findMin(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        
        int si=0;
        int ei=nums.length-1;
        
        while(si<=ei){
            int mid=(si+ei)/2;
            
            if(nums[si]<=nums[mid]){
                min=Math.min(min,nums[si]);
                si=mid+1;
            }else{
                min=Math.min(min,nums[mid]);
                ei=mid-1;
            }
        }
        
        return min;
    }
}