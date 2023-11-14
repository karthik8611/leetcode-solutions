class Solution {
    public int strStr(String haystack, String needle) {
        
        
    // sliding window approach
        
        int left=0;
        int right=0;
        
        int k=needle.length();
        
        while(right<haystack.length()){
            
            if(right-left+1 ==k)
            {
            String s=haystack.substring(left,right+1);
                
             if(s.equals(needle)){
                 return left;
             }
                left++;
            }
            right++;
                
                
                        
            
        }
        return -1;
    }
}