class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n=grid.length;
        
        int[] ans= new int[2];
        
        int[] count = new int[n*n+1];
        
        for(int[] row:grid){
            for(int num:row){
                count[num]++;
                
                if(count[num]==2){
                    ans[0]=num;
                }
            }
            
        }
        
        for(int i=1;i<=n*n;i++){
            if(count[i]==0){
                ans[1]=i;
            }
        }
        return ans;
        
        
        
    }
}