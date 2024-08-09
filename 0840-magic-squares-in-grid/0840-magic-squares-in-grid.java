class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        
        int ans=0;
        
        for(int row=0;row+2<m;row++){
            for(int col=0;col+2<n;col++){
                if(isMagicSquare(grid,row,col)){
                    ans++;
                }
            }
        }
        
        return ans;
        
    }
    
    
    private boolean isMagicSquare(int[][] grid, int row, int col){
        boolean [] seen= new boolean[10];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int num=grid[row+i][col+j];
                
                if(num<1 || num>9) return false;
                if(seen[num]) return false;
                seen[num]=true;
            }
        }
        
        int d1=grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2];
        int d2=grid[row+2][col]+grid[row+1][col+1]+grid[row][col+2];
        
        if(d1!=d2) return false;
        
        int r1=grid[row][col]+grid[row][col+1]+grid[row][col+2];
        int r2=grid[row+1][col]+grid[row+1][col+1]+grid[row+1][col+2];
        int r3=grid[row+2][col]+grid[row+2][col+1]+grid[row+2][col+2];
        
        if(!(r1==d1 && r2==d1 && r3==d1)) return false;
        
        int c1=grid[row][col]+grid[row+1][col]+grid[row+2][col];
        int c2=grid[row][col+1]+grid[row+1][col+1]+grid[row+2][col+1];
        int c3=grid[row][col+2]+grid[row+1][col+2]+grid[row+2][col+2];
        
        if(!(c1==d1 && c2==d1 && c3==d1)) return false;
        
        return true;
        
    }
}