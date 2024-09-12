class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count=0;
        for(String word:words){
            
          if(check(word,allowed)) count++;
        }
        
        return count;
        
    }
    
    
    public boolean check(String word,String all){
        char [] ww= word.toCharArray();
        
        for(char c:ww){
            String s=""+c;
            if(!all.contains(s)) return false;
            s="";
        }
        
        return true;
        
    }
}