class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int[] res= new int[2];
        int n=nums.length;
        
        
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                res[0]=nums[i];
                break;
            }
            
         }
        
        int totalSum=(n*(n+1))/2;
        int sum=0;
        
        for(int i=0;i<n;i++){
         
            sum+=nums[i];
        }
        
        res[1]=totalSum-(sum-res[0]);
        return res;
        
    }
}