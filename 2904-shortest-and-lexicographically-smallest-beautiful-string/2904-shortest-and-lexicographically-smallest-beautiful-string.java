class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        String result="";
        int minLength=Integer.MAX_VALUE;
        
    
        
        for(int i=0;i<s.length();i++){
            
            int count=0;
            int len=0;
            for(int j=i;j<s.length();j++){
                
                len++;
                if(s.charAt(j)=='1'){
                    count++;
                }
                
                if(count==k){
                    
                    if(len<minLength){
                        minLength=len;
                        result=s.substring(i,j+1);
                    } 
                    
                    if(len==minLength){
                        String p=s.substring(i,j+1);
                        
                        if(p.compareTo(result)<0){
                            result=p;
                        }
                    }
                    
                }
                
            }
        }
        
        return result;
        
    }
}