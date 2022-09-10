class Solution {
    public int maxProfit(int k, int[] prices) {
        
          
        HashMap<String, Integer> memo = new HashMap<>();
        
        return max(prices, 0 , true,k,memo);
        
    }
    
     public static int max(int[] prices, int i , boolean canbuy, int tran, HashMap memo){
        
        if(prices.length <= i || tran<=0){
            
            return 0;
        }
        
        String s = i + " " + canbuy + " " + tran;
        if(memo.containsKey(s)){
            
            return (int)memo.get(s);
        }
        if(canbuy){
            if(i == prices.length-1){
                return 0;
            }
            int idle = max(prices,i+1,canbuy,tran,memo);
            
            int buy = -prices[i] + max(prices, i+1 , false,tran,memo);
            
            memo.put(s,Math.max(idle,buy));
            return Math.max(idle,buy);
            
        }
        
        int idle = max(prices, i+1, canbuy,tran,memo);
        
        int sell = prices[i] + max(prices,i+1,true,tran-1,memo);
         memo.put(s,Math.max(idle,sell));
        return Math.max(idle,sell);
        
        
    }
    
}