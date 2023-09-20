class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int [][] dp = new int[n][n];
        
        for(int row []:dp){
            Arrays.fill(row,-1);
        }
        
        return minPath(0,0,dp,n,triangle);
        
        // memiozation approach
    }
    
    public int minPath(int level, int i, int [][] dp, int n, List<List<Integer>> triangle){
       if (dp[level][i] != -1)
            return dp[level][i];

        // If we are at the bottom row, return the value in the triangle
        if (level == n - 1)
            return triangle.get(level).get(i);

        // Calculate the minimum path sum by recursively considering two possible paths: down and diagonal
        int down = triangle.get(level).get(i) + minPath(level+ 1, i, dp,n,triangle);
        int diagonal = triangle.get(level).get(i) + minPath(level + 1, i + 1, dp,n,triangle);

        // Store the result in the dp array and return the minimum of the two paths
        return dp[level][i] = Math.min(down, diagonal);
        
    }
}