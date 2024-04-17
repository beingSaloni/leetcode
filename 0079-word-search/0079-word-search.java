class Solution {
    private boolean dfs(char[][] board, int index, String word , int row, int col ){
        
        if(index== word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length){
            return false;
        }

        if(board[row][col] != word.charAt(index)){
                    return false;
        }


         char prev = board[row][col];
        
         board[row][col] = '0';
        boolean ans = dfs(board,index + 1 , word, row+1, col ) || dfs(board,index + 1 , word, row-1, col) || dfs(board,index + 1 , word, row, col+1 ) || dfs(board,index + 1 , word, row, col-1) ;
         board[row][col] = prev;

         return ans;



    }
    public boolean exist(char[][] board, String word) {

        for(int i  = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){

                if(board[i][j] == word.charAt(0)){

                    if(dfs(board,0,word , i , j)){
                        return true;
                    }
                }



            }
        }

        return false;
        
    }

}