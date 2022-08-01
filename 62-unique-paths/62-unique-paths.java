class Solution {
    public int uniquePaths(int m, int n) {
       
       
        HashMap<String , Integer> memo = new HashMap<>();
        
        return num(m , n , 0 , 0 , memo) ;
            
            
        }
    
    public static int num(int m , int n , int r , int c , HashMap memo){
        
        if(r>= m-1 && c>= n-1){
            return 1;
        }
        
        if(r >= m || c>= n){
            return 0;
        }
        
        String s = r + " " + c ;
        
        if(memo.containsKey(s)){
            
            return (int)memo.get(s);
        }
        int front = num(m, n , r+1 ,c , memo);
            
         int down =   num(m,n , r,c+1, memo);
        
        memo.put(s , front + down);
        return front + down ;
        
    }
        
    }
