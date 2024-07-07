class Solution {

    private int[][] gridBlockSum(char[][] grid, char ch) {
        int n = grid.length, m = grid[0].length;
        int[][] pre = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pre[i][j] = (grid[i][j] == ch) ? 1 : 0;
                if (i > 0) pre[i][j] += pre[i - 1][j];
                if (j > 0) pre[i][j] += pre[i][j - 1];
                if (i > 0 && j > 0) pre[i][j] -= pre[i - 1][j - 1];
            }
        }
        
        return pre;
    }

    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        
        int[][] xCount = gridBlockSum(grid, 'X');
        int[][] yCount = gridBlockSum(grid, 'Y');
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (xCount[i][j] == yCount[i][j] && xCount[i][j] > 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
