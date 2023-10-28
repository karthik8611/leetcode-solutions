class Solution {
    public int sumCounts(List<Integer> nums) {
    
        
        int sum=0;
        
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> set = new HashSet<>();
            
            for(int j=i;j<nums.size();j++){
                int a=nums.get(j);
                set.add(a);
                
                int size=set.size();
                sum+=size*size;
                
            }
        }
        
        return sum;
        
        
        
    }
}