class Solution {
    public int change(int amount, int[] coins) {
   HashMap<String,Integer> memo = new HashMap<>();
        int zz = coin(coins , amount  , 0, memo);
        // if(zz== 10000){
        //     return -1;
        // }
        return zz;
    }
    
    public static int coin(int[] coins, int a , int s , HashMap memo){
        
        if(a==0){
            return 1;
        }
        if(s==coins.length){
            return 0;
        }
        String st = a + " " + s;
        if(memo.containsKey(st)){
            return (int)memo.get(st);
        }
        int c = 0;
        if(coins[s]<=a){
         c =coin(coins,a-coins[s],s,memo);
        }
        int nc = coin(coins, a , s+1,memo);
        int zzz = nc + c;
        memo.put(st,zzz);
        
        return c + nc;
    }
}