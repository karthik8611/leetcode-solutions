class Solution {
    public int minimumSum(int[] nums) {
        
        
        int n =nums.length;
        
        int minLeft [] = new int [n];
        int minRight[]= new int[n];
        
        int sum=Integer.MAX_VALUE;
        
        minLeft[0]=nums[0];
        minRight[n-1]=nums[n-1];
        
        for(int i=1;i<n;i++){
            
            minLeft[i]=Math.min(minLeft[i-1],nums[i-1]);
            
        }
            for(int i=n-2;i>=0;i--){
            
            minRight[i]=Math.min(minRight[i+1],nums[i+1]);
            
        }
        
        
        for(int i=1;i<n-1;i++){
            if(nums[i]>minLeft[i] && nums[i]>minRight[i]){
                sum=Math.min(sum,nums[i]+minLeft[i]+minRight[i]);
            }
        }
        
          return sum==Integer.MAX_VALUE?-1:sum;
        
    }
}