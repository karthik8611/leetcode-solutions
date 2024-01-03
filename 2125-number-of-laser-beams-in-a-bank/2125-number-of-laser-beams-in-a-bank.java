class Solution {
    public int numberOfBeams(String[] bank) {
        
        int prevCount=0;
        int total=0;
        for(String row:bank){
            int currentRow=countOnes(row);
            if(currentRow==0)continue;
            total+=currentRow*prevCount;
            prevCount=currentRow;
        }
        
        return total;
        
        
        
    }
    
    private int countOnes(String s){
        int count=0;
        
        for(char c:s.toCharArray()){
            count+=c-'0';
        }
        
        return count;
        
    }
}