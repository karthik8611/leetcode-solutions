class Solution {
    
    List<Integer> [] graph;
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        
        boolean [] sus= new boolean[n];
        
        graph= new List[n];
        
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        
        int u,v;
        for(int [] inv:invocations){
            u=inv[0];
            v=inv[1];
            graph[u].add(v);
            
        }
        
        dfs(k,sus);
        boolean removeAll=true;
        
        for(int i=0;i<n;i++){
            if(sus[i]) continue;
            
            for(int next:graph[i]){
                if(sus[next]){
                    removeAll=false;
                    break;
                }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(!sus[i] || !removeAll){
                ans.add(i);
            }
        }
        
        return ans;
        
    }
    
    private void dfs(int node,boolean[] visited){
        if(visited[node]) return;
        
        visited[node]=true;
        
        for(int next:graph[node]){
            dfs(next,visited);
        }
    }
}