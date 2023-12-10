class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        
        
        int ans=1,mod=1000000007;
        Map<Integer,Integer> last = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            last.put(nums[i],i);
        }
        
        
        for(int i=0,j=0;i<nums.length;i++){
            
            ans=i>j? (ans*2)%mod:ans;
            j=Math.max(j,last.get(nums[i]));
            
        }
        
        
        return  ans;
        
        
        
    }
    

}