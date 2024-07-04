class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
         int[] rmax= new int[n];

        rmax[n-1]=nums[n-1];

        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],nums[i]);
        }

        int left=0;
        int right=0;

        int ans=0;

        while(right<n){

            while(left<right && nums[left]>rmax[right]){
                left++;
            }

            ans=Math.max(ans,right-left);
            right++;
        }
        return ans;
        
        
        
    }
}