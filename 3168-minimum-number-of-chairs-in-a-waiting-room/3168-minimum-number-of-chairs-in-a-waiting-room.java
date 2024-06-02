class Solution {
    public int minimumChairs(String s) {
        int max=0;
        int curr=0;
        
        for(char c:s.toCharArray()){
            if(c=='E'){
                curr++;
            }else{
                curr--;
            }
            
            max=Math.max(curr,max);
        }
        
        return max;
        
    }
}