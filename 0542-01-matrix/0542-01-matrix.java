class Solution {
    public int[][] updateMatrix(int[][] mat) {
        // refer striver solution for better understanding and also dicussion section
        Queue<int [] > queue= new LinkedList<>();
        
        int m=mat.length;
        int n=mat[0].length;
        
        boolean visited [][] = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    queue.add(new int []{i,j});
                    visited[i][j]=true;
                }
            }
        }
        
        int dirs [][] = new int  [][]{{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!queue.isEmpty()){
            int [] cur=queue.poll();
            
            for(int i=0;i<4;i++){
                int row=cur[0]+dirs[i][0];
                int col=cur[1]+dirs[i][1];
                
                if(row<0 || row>=m || col<0 || col>=n || visited[row][col]){
                    continue;
                }
                visited[row][col]=true;
                mat[row][col]=mat[cur[0]][cur[1]]+1;
                queue.offer(new int []{row,col});
                
            }
        }
        
        return mat;
        
        
        
    }
}