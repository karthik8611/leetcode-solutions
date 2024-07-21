class Solution {
    public int minChanges(int n, int k) {
        
        int count=0;
        
        for(int i=0;i<32;i++){
            int nb=(n&(1<<i));
            int kb=(k&(1<<i));
            
            if(nb!=kb){
                if(nb==0){
                    count=-1;
                    break;
                }
                count++;
            }
        }
        
        return count;
        
    }
}