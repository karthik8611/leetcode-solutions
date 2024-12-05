class Solution {
    public boolean canChange(String start, String target) {
        
        int n=start.length();
        int si=0;
        int ti=0;
        
        while(si<n || ti<n){
            
            while(si<n && start.charAt(si)=='_'){
                si++;
            }
            
            while(ti<n && target.charAt(ti)=='_'){
                ti++;
            }
            
            if(ti==n || si==n){
                return ti==n && si==n;
            }
            
            
            if(start.charAt(si)!=target.charAt(ti) || (start.charAt(si)=='L' && si<ti) || (target.charAt(ti)=='R' && si>ti)
                 
                 )return false;
            si++;
            ti++;
        }
        
        return true;
        
    }
}