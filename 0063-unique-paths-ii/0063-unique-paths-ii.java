class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
        int [][] dp = new int[m][n];
        
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        
        return countPaths(m-1,n-1,obstacleGrid,dp);
        
    }
    public int countPaths(int m, int n, int [][] matrix, int [][] dp){
        if(m>=0 && n>=0  && matrix[m][n]==1) return 0;
        
        if(m==0 && n==0){
            return 1;
        }
         if(m<0 || n<0){
            return 0;
        }
        
        
        if(dp[m][n]!=-1) return dp[m][n];
        
        
        
        int up=countPaths(m-1,n,matrix,dp);
        int left=countPaths(m,n-1,matrix,dp);
        
    return dp[m][n]=left+up;
        
    }
    
}