class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        Set<Integer> set = new HashSet<>();
        
        for(int k:map.keySet()){
            
            if(set.contains(map.get(k))){
                return false;
            }
            set.add(map.get(k));
            
            
        }
               
               return true;
        
        
        
    }
}