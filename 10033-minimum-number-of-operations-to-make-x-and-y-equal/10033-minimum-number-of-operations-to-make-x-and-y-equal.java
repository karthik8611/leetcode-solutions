class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        Set<Integer> vis = new HashSet<>();
        Queue<int[]> queue= new LinkedList<>();
        queue.add(new int[]{x,0});
        vis.add(x);
        
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int num=curr[0];
            int turn=curr[1];
            
            if(num==y){
                return turn;
            }
            
            if(!vis.contains(num+1)){
                queue.add(new int[]{num+1,turn+1});
                vis.add(num+1);
            }
            
              
            if(num-1>=0 && !vis.contains(num-1)){
                queue.add(new int[]{num-1,turn+1});
                vis.add(num-1);
            }
            if(num%11==0 && !vis.contains(num/11)){
                queue.add(new int[]{num/11,turn+1});
                vis.add(num/11);
            }
            
             if(num%5==0 && !vis.contains(num/5)){
                queue.add(new int[]{num/5,turn+1});
                vis.add(num/5);
            }
        }
        
        return -1;
        
        
    }
        
  
        

}