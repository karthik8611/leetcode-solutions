class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        int [][] dp = new int[n][m];
        
        
        // initialize first row
        for(int j=0;j<m;j++){
            dp[0][j]=matrix[0][j];
        }
        
        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int up=matrix[i][j]+dp[i-1][j];
                
                int leftDiagonal=matrix[i][j];
                
                if(j-1>=0){
                    leftDiagonal+=dp[i-1][j-1];     
                } else{
                    
                      leftDiagonal+=(int)Math.pow(10,9);
                    
                }
                 int rightDiagonal=matrix[i][j];
                if(j+1<m){
                    rightDiagonal+=dp[i-1][j+1];
                }else{
                     rightDiagonal+=(int)Math.pow(10,9);
                    
                }
                
                dp[i][j]=Math.min(up,Math.min(leftDiagonal,rightDiagonal));
            }
        }
        
        
        int minPath=Integer.MAX_VALUE;
        
    for(int j=0;j<m;j++){
        minPath=Math.min(dp[n-1][j],minPath);
    }
        
        return minPath;
        
        
        
        // time complexity:o(n*m)
        // space:o(n*m)
        
        

    }
        

        
 }
