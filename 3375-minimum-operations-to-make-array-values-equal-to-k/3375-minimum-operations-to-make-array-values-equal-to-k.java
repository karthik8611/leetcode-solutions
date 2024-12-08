class Solution {
    public int minOperations(int[] nums, int k) {
        
        int ans=0;
        Set<Integer> set = new HashSet<>();
        
        for(int num:nums){
            set.add(num);
        }
        
        for(int num:set){
            if(num>k) {
                ans++;
            }else if(num<k){
                return -1;
            }
        }
        
        return ans;
        
    }
}