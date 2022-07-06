class Solution {
    public int fib(int n) {
      
        return f(n, new HashMap<Integer,Integer>()  );
    }
    
    private int f(int n , HashMap memo){
        
        if(n==0){
            return 0;
        }
        
        if(n==1){
            return 1;
        }
        
        if(memo.containsKey(n)){
            
            return (int)memo.get(n);
        }
        
        int first = f(n-1, memo);
        int second = f(n-2 , memo);
        memo.put(n, first + second);
        
        return first + second;
        
        
    }
}