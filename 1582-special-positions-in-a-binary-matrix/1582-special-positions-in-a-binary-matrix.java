class Solution {
    public int numSpecial(int[][] mat) {
        
        int m=mat.length;
        int n=mat[0].length;
        int count=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0)continue;
                
                boolean good=true;
                
                for(int r=0;r<m;r++){
                    if(mat[r][j]==1 && r!=i){
                        good=false;
                    break;
                    }
                }
                
                for(int c=0;c<n;c++){
                    if(mat[i][c]==1 && c!=j){good=false;
                    break;
                                            }
                }
                
                if(good)count++;
            }
        }
        
        return count;
        
    }
}