class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
     
        Set<Integer> set = new HashSet<>();
        int count=0;
        
        
        for(int i=nums.size()-1;i>=0;i--){
            count++;
            
            if(nums.get(i)<=k){
                set.add(nums.get(i));
            }
            
            if(set.size()==k) break;
        }
        
        return count;
        
        
            
            
        
            
        
    
        
        
        
    }
}