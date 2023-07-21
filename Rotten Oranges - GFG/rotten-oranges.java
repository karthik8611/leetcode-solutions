//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
      if(grid==null || grid.length==0) return 0;
      int  rows=grid.length;
      int cols=grid[0].length;
      Queue<int[]> queue= new LinkedList<>();
      
      // insert rotten oranges in queue and count the fresh ones
      
        int fresh_count=0;
       for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++){
               
               if(grid[i][j]==2){
                   queue.offer(new int[]{i,j});
               } 
               else if(grid[i][j]==1){
                   fresh_count++;
               }
               
           }
}
    
    if(fresh_count==0)return 0;
     
     int count=0;
     int [][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
     
    while(!queue.isEmpty() && fresh_count>0){
        count++;
        int size = queue.size();
        for(int i=0;i<size;i++){
            
            int [] point = queue.poll();
            
            for(int dir[]: dirs){
                int x=point [0]+dir[0];
                int y=point [1]+dir[1];
                if(x<0 || y<0 || x>=rows || y>=cols || grid[x][y]==2 || grid[x][y]==0)continue;
                grid[x][y]=2;
                queue.offer(new int [] {x,y});
                fresh_count--;
            }
        }
    }
    
    return fresh_count==0?count:-1;
     
     
     
      
    }
}