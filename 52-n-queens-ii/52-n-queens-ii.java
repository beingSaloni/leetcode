class Solution {
    public int totalNQueens(int n) {
        
        int[][] board = new int[n][n];
        int[] ans = new int[1];
        solve(board,0,ans);
           
        
        
        
        return ans[0];
        
    }
    
    public static void solve(int[][] board , int row, int [] ans){
        
        if(row>=board.length){
            
            ans[0]++;
            
              return ;
        }
        
        for(int col = 0 ; col < board.length ; col++){
            
           
            
            if(isSafe(board,row,col)){
                 board[row][col] = 1 ;
                 // System.out.println(row + " " + col);
                solve(board, row+1 , ans) ;
                   
                
                board[row][col] = 0 ;
            }
            
             
        }
        
        return ;
        
        
    }
    
    public static boolean isSafe(int[][] board , int row , int col){
        
        for(int i = 0 ; i<row ; i++){
            
            if(board[i][col] ==1){
                    return false;
            }
        }
        
        int c = col;
         for(int i = row ; i>=0&& c>=0 ; i--){
            
            if(board[i][c] ==1){
                    return false;
            }
             c--;
        }
        c=col;
        for(int i = row ; i>=0&& c<board.length ; i--){
            
            if(board[i][c] ==1){
                    return false;
            }
             c++;
        }
        
        return true;
        
    }
    
    
}