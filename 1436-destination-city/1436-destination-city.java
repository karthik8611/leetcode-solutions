class Solution {
    public String destCity(List<List<String>> paths) {
        
        Set<String> hasDest = new HashSet<>();
        
        for(int i=0;i<paths.size();i++){
            hasDest.add(paths.get(i).get(0));
        }
        
        
        for(int i=0;i<paths.size();i++){
            String candidate=paths.get(i).get(1);
            if(!hasDest.contains(candidate)) return candidate;
        }
        
        return "";
        
    }
}