class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        
        int[] ans= new int[nums.length];
        int idx=0;
        
        for(int i=0;i<nums.length;i+=2){
            ans[idx++]=nums[i+1];
            ans[idx++]=nums[i];
        }
        
        return ans;
        
    }
}