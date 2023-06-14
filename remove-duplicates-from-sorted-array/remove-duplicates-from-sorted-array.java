class Solution {
    public int removeDuplicates(int[] nums) {
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for(int num:nums){
            set.add(num);
        }
        
        int i=0;
        for(int k:set){
            nums[i++]=k;
        }
        
        return set.size();
        
    }
}