class Solution {
    public int change(int amount, int[] coins) {
        
        HashMap<String , Integer> memo = new HashMap<>();
        
     return    solve(coins ,0 , amount , memo);
    }
    
    private int solve(int[] coins , int index , int sum , HashMap memo){
        
        String val = index + " " + sum ;
            
        if(memo.containsKey(val)){
            
            return (int)memo.get(val);
        }
        
        if(index >= coins.length){
            
            return 0;
        }
        
        if(sum == 0){
            
            return 1;
        }
        if(sum < 0){
            
            return 0;
        }
        
        int consider = solve(coins, index , sum - coins[index] , memo );
        int notconsider = solve(coins,index + 1 , sum , memo);
        
        memo.put(val, consider + notconsider);
        return consider + notconsider ;
        
        
    }
}