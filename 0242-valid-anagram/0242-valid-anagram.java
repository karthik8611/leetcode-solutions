class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char [] char1= new char[256];
        char [] char2 =new char[256];
        
        for(int i=0;i<s.length();i++){
            char1[s.charAt(i)]++;
        }
        
          for(int i=0;i<t.length();i++){
            char2[t.charAt(i)]++;
        }
        
          for(int i=0;i<char1.length;i++){
           if(char1[i]!=char2[i]) return false;
        }
        
        return true;
    }
}