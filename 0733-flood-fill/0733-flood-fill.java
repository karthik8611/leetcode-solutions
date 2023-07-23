class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
        // Time Complexity : O(n*m)
// Space Complexity : O(n*m)
    }
    public void dfs(int [][] image,int sr,int sc,int color,int  curr){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length ) return;
        if(image[sr][sc]!=curr) return;
         
        image[sr][sc]=color;
        dfs(image,sr+1,sc,color,curr);
        dfs(image,sr-1,sc,color,curr);
        dfs(image,sr,sc+1,color,curr);
        dfs(image,sr,sc-1,color,curr);
    }
            
    
}