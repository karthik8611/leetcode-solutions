class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      if(image[sr][sc]==color)return image;
        
        dfs(image,sr,sc,color, image[sr][sc]);
        
        return image;
        
    }
    
    
    public void dfs(int [][] grid, int i, int j, int color ,int curr){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=curr )return;
        grid[i][j]=color;
        
        dfs(grid,i+1,j,color,curr);
        dfs(grid,i-1,j,color,curr);
        dfs(grid,i,j-1,color,curr);
        dfs(grid,i,j+1,color,curr);
    }
}