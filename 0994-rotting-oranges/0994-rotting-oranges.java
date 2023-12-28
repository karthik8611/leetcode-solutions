class Solution {
    public int orangesRotting(int[][] grid) {
        
        int rows=grid.length;
        int cols=grid[0].length;
        
   
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    rotAdjacent(grid,i,j,2);
                }
            }
        }
        
           //  int minutes=2;
        
        // for(int[] row:grid){
        //     for(int cell :row){
        //         if(cell==-1){
        //             return -1;
        //         }else{
        //             minutes=Math.max(minutes,cell);
        //         }
        //     }
        // }
        int minutes = 2;
        for(int[] row : grid) {
            for(int cell : row) {
                if(cell == 1) return -1;
                minutes = Math.max(minutes, cell);
            }
        }
        
        
        
        return minutes-2;
    
        
    }
    
//     public void rotAdjacent(int[][]grid, int i, int j,int minutes){
        
//         if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || (1<grid[i][j] && grid[i][j]<minutes))return;
//             else{
//             grid[i][j]=minutes;
//             rotAdjacent(grid,i-1,j,minutes+1);
//                rotAdjacent(grid,i+1,j,minutes+1);
//                rotAdjacent(grid,i,j-1,minutes+1);
//                rotAdjacent(grid,i,j+1,minutes+1);
//         }
        
//     }
     private void rotAdjacent(int[][] grid, int i, int j, int minutes) {
        if(i < 0 || i >= grid.length /* out of bounds */
          || j < 0 || j >= grid[0].length /* out of bounds */
          || grid[i][j] == 0 /* empty cell */
          || (1 < grid[i][j] && grid[i][j] < minutes) /* this orange is already rotten by another rotten orange */
          ) return;
        else {
            grid[i][j] = minutes;
            rotAdjacent(grid, i - 1, j, minutes + 1);
            rotAdjacent(grid, i + 1, j, minutes + 1);
            rotAdjacent(grid, i, j - 1, minutes + 1);
            rotAdjacent(grid, i, j + 1, minutes + 1);
        }
    
}
}