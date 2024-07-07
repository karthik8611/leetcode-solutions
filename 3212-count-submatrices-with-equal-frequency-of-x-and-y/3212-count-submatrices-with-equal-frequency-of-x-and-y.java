class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        
        int n=grid.length,m=grid[0].length;
        
        int[][] xCount= gridSum(grid,'X');
        int[][] yCount= gridSum(grid,'Y');
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(xCount[i][j]==yCount[i][j] && xCount[i][j]>0){
                    ans++;
                }
            }
        }
        return ans;
            
        
        
    }
    
    private int[][] gridSum(char[][] grid,char ch){
        
        int n=grid.length,m=grid[0].length;
        
          int[][] prefix = new int[n][m];
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                prefix[i][j]=grid[i][j]==ch?1:0;
                
                if(i>0) prefix[i][j]+=prefix[i-1][j];
                if(j>0) prefix[i][j]+=prefix[i][j-1];
                if(i>0 && j>0) prefix[i][j]-=prefix[i-1][j-1];
            }
        }
        
        return prefix;
    }
}