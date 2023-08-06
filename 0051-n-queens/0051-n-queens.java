class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        int[][] board = new int[n][n];
        
        List<List<String>> ans = new  ArrayList<List<String>>();
        
        isPossible(board,0,ans );
        
        
         
        
        return ans;
        
    }
    
    public static void isPossible(int[][] board , int row, List<List<String>> ans){
        
        if(board.length <= row){
            
            List<String> inner = new ArrayList<String>();
            
            for(int i = 0 ; i<board.length ;i++){
                
                String st ="";
                for(int j = 0 ; j<board.length ; j++){
                    
                    if(board[i][j] == 0){
                        st+=".";
                    }else{
                        st+="Q";
                    }
                }
                
                inner.add(st);
                
            }
            ans.add(inner);
            
           
            return ;
        }
        
        for(int i = 0 ; i < board.length ;i++){
            
            if(isSafe(board,row,i)){
                
                board[row][i] = 1;
                
                isPossible(board,row+1,ans);
                
                board[row][i] = 0;
                
            }
            
        }
        
        return ;
        
    }
    
    public static boolean isSafe(int[][] board , int row , int col){
        
        for(int r = 0 ; r <= row ; r++){
            
            if(board[r][col] == 1){
                return false;
            }
            
        }
        
        int c = col ;
        
        for(int r = row ; r >= 0 && c>= 0  ; r--){
            
            if(board[r][c] == 1){
                return false;
            }
            c--;
            
        }
        
          c = col ;
        
        for(int r = row ; r >= 0 && c< board.length  ; r--){
            
            if(board[r][c] == 1){
                return false;
            }
            c++;
            
        }
        
        return true;
        
    }
    
}