class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int count=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        
        count--;
        
        String k="";
         while(count-->0){
             k+="1";
         }
        
        while(k.length()<s.length()-1){
            k+="0";
            
        }
        k+="1";
        
        return k;
        
    }
}