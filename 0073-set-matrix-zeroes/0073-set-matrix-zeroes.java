class Solution {
    public void setZeroes(int[][] matrix) {
        // Taking dimension of original matrix
        int row = matrix.length;        
        int col = matrix[0].length;
        // Creating duplicate matrix to make changes named ans
        int[][] ans = new int[row][col];

        // Duplicating all original elements in ans[][]
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                ans[i][j] = matrix[i][j];

        // Finding 0 in original matrix and making changes in ans matrix for safe traversal in org matrix
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                if(matrix[i][j] == 0){
                    for(int cl=0; cl<col; cl++) ans[i][cl] =0;
                    for(int rw=0; rw<row; rw++) ans[rw][j] =0;
                }

        // Copying back ans in original matrix as it is required according to problem statement and void returnType
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                matrix[i][j] = ans[i][j];
    }
}