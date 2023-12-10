class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        
        long max=Integer.MIN_VALUE;
        
        for(int num:nums){
            max=Math.max(num,max);
        }
        
        int j=0,i=0,count=0,n=nums.length;
        
        long ans=0;
        while(j<nums.length){
            if(nums[j]==max){
                count++;
            }
            if(count>=k){
                while(count>=k){
                    ans+=n-j;// count the no of subarrays
                    
                    if(nums[i]==max){
                        count--; // decrease the count as the window slides
                    }
                    i++;
                    
                    
                }
            }
            j++;
        }
        
        return ans;
        
    }
}