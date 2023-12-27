class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n=isConnected.length;
        
        boolean[] visited = new boolean[n];
        int count=0;
        
      for(int i=0;i<n;i++){
          
          if(!visited[i]){
              count++;
              dfs(i,isConnected,visited);
          }
        
      }
        
        return count;
        
        
    }
    
    public void dfs(int node, int[][] adj, boolean[] visited){
        visited[node]=true;
        int n=adj.length;
        
        for(int i=0;i<n;i++){
            if(adj[node][i]==1 && !visited[i]){
                visited[i]=true;
                dfs(i,adj,visited);
            }
        }
        
    }
}