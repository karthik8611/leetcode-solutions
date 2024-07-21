class Solution {
    public boolean doesAliceWin(String s) {
        
        
        int count=0;
        
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) count++;
        }
        
        if(count==0){
            return false;
        }else if(count%2!=0){
            return true;
        }
        
        return true;
    }
}