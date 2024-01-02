class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        
        
        Map<String, List<Integer>> map = new HashMap<>();
        List<String> ans= new ArrayList<>();
        
        
        for(List<String> list:access_times){
            String a=list.get(0);
            String b=list.get(1);
            
            map.computeIfAbsent(a,k->new ArrayList<>()).add(Integer.parseInt(b));
        }
        
        
     for (Map.Entry<String, List<Integer>> entry : map.entrySet()){
            // sort access times of each employee
            entry.getValue().sort(null);
             
            
            int k=entry.getValue().size();
            
            boolean flag=false;
            
            for(int i=0;i+3<=k;i++){
                flag|=entry.getValue().get(i+2)<entry.getValue().get(i)+100;
            }
            
            if(flag){
                ans.add(entry.getKey());
            }
        }
        
        return ans;
        
    }
}