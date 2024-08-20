class Solution {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            
            if(mid==0|| (nums[mid-1]<nums[mid])){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        
        
        return ans;
    }
}