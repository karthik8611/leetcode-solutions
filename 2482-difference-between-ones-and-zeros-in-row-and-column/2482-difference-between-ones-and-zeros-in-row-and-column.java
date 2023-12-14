class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        
        int[][]  result= new int[m][n];
        
        int[] rowCount=new int[m];
        int[] colCount=new int[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        
        int[] rowZeroCount = new int[m];
        int[] colZeroCount=new int[n];
        
        for(int i=0;i<m;i++){
            rowZeroCount[i]=grid[i].length-rowCount[i];
        }
        
        for(int j=0;j<n;j++){
            colZeroCount[j]=grid.length-colCount[j];
        }
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=rowCount[i]+colCount[j]-rowZeroCount[i]-colZeroCount[j];
            }
        }
        
        return result;
        
        
        
        
        
        
    }
}