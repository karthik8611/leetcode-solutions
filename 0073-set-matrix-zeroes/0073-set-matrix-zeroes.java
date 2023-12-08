class Solution {
    public void setZeroes(int[][] matrix) {
        
    int m=matrix.length;
    int n=matrix[0].length;
    
        int tempRow []= new int[m];
        int tempCol [] = new int[n];
        
        Arrays.fill(tempRow,1);
        Arrays.fill(tempCol,1);
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(matrix[i][j]==0){
                    tempRow[i]=0;
                    tempCol[j]=0;
                }
            }
        }
        // tc: o(mn) space o(m+n)
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(tempRow[i]==0 || tempCol[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}