class Solution {
    public int lengthOfLIS(int[] nums) {
        
    int[] res = new int[nums.length];
        
    for(int i=1;i<nums.length;i++){
        for(int j=0;j<i;j++){
            if(nums[j]<nums[i]){
                if(res[j]+1>res[i])
                res[i]=res[j]+1;
            }
        }
        
    }
        
        // time compexity:o(n^2)
        // space complexity:o(n)
        int max=0;
        
        for(int i=0;i<res.length;i++){
            if(res[i]>res[max]){
            
                max=i;
            }
        }
        
        return res[max]+1;

        
        
    }
}