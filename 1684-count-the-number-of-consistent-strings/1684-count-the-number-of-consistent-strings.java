class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        
    int count=words.length;
        
        int[] freq=new int[26];
        
        for(char c:allowed.toCharArray()){
            freq[c-'a']++;
        }
        
        for(String word:words){
            
            
            for(char c:word.toCharArray()){
                if(freq[c-'a']<=0){
                    count--;
                    break;
                }
            }
        }
        
        return count;
        
    }
}