class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    
        int i=0;
        int j=0;
        
        int product=1;
        int count=0;
        
        int n=nums.length;
       
        while(j<n){
           product*=nums[j];
            
            while(i<=j && product>=k){
                product/=nums[i++];
            }
            
            count+=j-i+1;
            j++;
            
            
            
        }
        
        return count;
        

        
    }
}