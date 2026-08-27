class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        
        for(int i=0;i<matrix.length;r++)
        {
            for(int j=0;j<matrix[r].length;j++)
            {
                if(target==matrix[i][j])
                return true;
            }

        }
        return false;
    }
}
