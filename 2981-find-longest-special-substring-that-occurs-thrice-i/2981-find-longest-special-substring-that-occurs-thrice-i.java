class Solution {
    public int maximumLength(String s) {
        
        Map<String,Integer> map= new HashMap<>();
        
        int res=-1;
        
        for(int i=0;i<=s.length();i++){
            
            for(int j=i+1;j<=s.length();j++){
                   String k=s.substring(i,j);
            
            map.put(k,map.getOrDefault(k,0)+1);
                
            }
            
         
            
            
        }
        
        
        for(String st:map.keySet()){
            if(map.get(st)>=3){
                if(check(st)){
                    res=Math.max(res,st.length());
                }
            }
        }
        
        
        
        return res;
        
    }
    
    public boolean check(String s){
        for(int i=1;i<s.length();i++){
            
            if(s.charAt(i)!=s.charAt(i-1)) return false;
            
        }
        return true;
        
    }
}