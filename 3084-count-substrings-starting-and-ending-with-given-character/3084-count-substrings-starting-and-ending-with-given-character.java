class Solution {
    public long countSubstrings(String s, char c) {
        
        long ans=0;
        int count=0;
        
        for(char ch:s.toCharArray()){
            if(ch==c){
                count++;
                ans+=count;
            }
        }
        
        return ans;
        
    }
}