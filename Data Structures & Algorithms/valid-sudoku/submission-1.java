class Solution {
    public boolean isValidSudoku(char[][] board) {
       for(int row =0;row<9;row++)
       {
            Set<Integer> seen = new Set<>();
            for(int i = 0 ; i<9;i++)
            {
            if(board[row][I]=='.') continue;
            if(seen.contains(board[row][i])) return false;
            seen.add(board[row][i]);
            }
        }

        for(int col =0 ;col<9; col++)
        {
            Set<Integer> seen = new Set<>();

            for(int j = 0;j<9;j++)
            {
                if(board[j][col]=='.') continue;
                if(seen.contains(board[j][col])) return false;
                seen.add(board[j][col]);
            }
        }

        for(int s = 0; s<9;s++)
        {
            Set<Integer> seen = new Set<>();

            for(int i=0;i<3;i++)
            {
                for(int j =0;j<3;j++)
                {
                    int row = (s/3)*3+i;
                    int col= (s%3)*3+j;

                    if(board[row][col]=='/') continue;
                    if(seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }

            return true;
        }
    }
}
