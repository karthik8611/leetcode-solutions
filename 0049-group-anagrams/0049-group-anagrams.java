class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        
        
        Map<String,List<String>> map = new HashMap<>();
        
        
        for(String s:strs){
            char ca[] = s.toCharArray();
            Arrays.sort(ca);
            
            String key= String.valueOf(ca);
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(s);

            
        }
        
        
          ans.addAll(map.values());
        
        return ans;
        
    
    }
    
    

}