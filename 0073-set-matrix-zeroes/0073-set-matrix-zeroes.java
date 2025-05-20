class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row = matrix.length;        
        int col = matrix[0].length;
        int[][] ans = new int[row][col];

        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                ans[i][j] = matrix[i][j];

        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                if(matrix[i][j] == 0){
                    for(int cl=0; cl<col; cl++) ans[i][cl] =0;
                    for(int rw=0; rw<row; rw++) ans[rw][j] =0;
                }

        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                matrix[i][j] = ans[i][j];
    }
}