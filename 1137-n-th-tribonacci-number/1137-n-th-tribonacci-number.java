class Solution {
    public int tribonacci(int n) {
       
        
//         int[] T = new int[n + 3];
//         T[0] = 0;
//         T[1] = 1;
//         T[2] = 1;
        
//         for(int i = 3; i <= n; i++){
//             T[i] = T[i-3] + T[i-2] + T[i-1];
//         }
        
//         return T[n];
        
        
        HashMap<Integer, Integer> memo = new HashMap<>();
        
       return tri(n , memo);
    
        
        
        
        
    }
    
    public static int tri(int n , HashMap memo){
        
        if(n==0){
               return 0;
            
        }
        
        if(n==1 || n==2){
            return 1;
        }
        
        if(memo.containsKey(n)){
            
            return (int)memo.get(n);
        }
        
        int z = tri(n-1 , memo) + tri(n-2, memo) + tri(n-3,memo);
        
        memo.put(n,z);
        return z;
        
        
    }
    
    
    
}