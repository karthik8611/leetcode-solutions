class Solution {
    
    int size =0;
     
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        
   int [][] result= new int[rows*cols][2];
        
        int distance=1;
        
        int M=rows;
        int N=cols;
        
        result[0]= new int[]{rStart,cStart};
        size++;
        
        while(size<rows*cols){
            
            
            // right
            for(int i=1;i<=distance;i++){
               cStart++;
               check(result,M,N,rStart,cStart);
            }
            
            //down
            
              for(int i=1;i<=distance;i++){
               rStart++;
               check(result,M,N,rStart,cStart);
            }
            
            distance++;
            
            //left
            
              for(int i=1;i<=distance;i++){
               cStart--;
               check(result,M,N,rStart,cStart);
            }
            
            
            //up
            
              for(int i=1;i<=distance;i++){
               rStart--;
               check(result,M,N,rStart,cStart);
            }
            
            distance++;  
            
        }
        
        return result;
    }
    
    private void check(int[][] result,int M,int N,int rows, int cols){
        
        if(rows<0 || rows>=M || cols<0 || cols>=N) return;
        
        result[size]=new int[]{rows,cols};
        size++;
    }
    
    
    
}