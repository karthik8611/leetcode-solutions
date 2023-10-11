class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        for(int k:nums){
            if(map.get(k)==2){
                set.add(k);
            }
        }
        list.addAll(set);
        
        
        
        return list;
        
        
        
    }
}