class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int result [] =new int [2];
        
        int low=0,high=nums.length-1;
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);
        return result;
        
       
        
    }
     private int findFirst(int [] nums,int target){
         
         int low=0,high=nums.length-1,ans=-1;
         
         while(low<=high){
             int mid=low+(high-low)/2;
             
             if(nums[mid]==target){
                 ans=mid;
                 high=mid-1;
             }else if(nums[mid]<target){
                 low=mid+1;
             }else if(nums[mid]>target){
                 high=mid-1;
             }
         }
         
         return ans;
         
         
             
         }
     private int findLast(int [] nums,int target){
          int low=0,high=nums.length-1,ans=-1;
         
         while(low<=high){
             int mid=low+(high-low)/2;
             
             if(nums[mid]==target){
                 ans=mid;
                 low=mid+1;
             }else if(nums[mid]<target){
                 low=mid+1;
             }else if(nums[mid]>target){
                 high=mid-1;
             }
         }
         
         return ans;
             
         }
}