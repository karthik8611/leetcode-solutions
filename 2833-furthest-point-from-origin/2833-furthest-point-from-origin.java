class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int rcount=0;
        int lcount=0;
        int d=0;
        
        for(int i=0;i<moves.length();i++){
            
            if(moves.charAt(i)=='L' ){
                lcount++;
            } 
            if(moves.charAt(i)=='R'){
                lcount--;
            }
            
              if(moves.charAt(i)=='_'){
                d++;
            }
            
            
        }
        
      
        
        return Math.abs(lcount)+d;
        
    }
}