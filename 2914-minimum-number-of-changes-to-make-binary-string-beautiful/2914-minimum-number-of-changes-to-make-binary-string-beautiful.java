class Solution {
    public int minChanges(String s) {
        
        
        int k=0;
        
        for(int i=0;i<s.length()-1;i=i+2){
            if(s.charAt(i)!=s.charAt(i+1)) k++;
        }
        
        return k;
        
    }
}