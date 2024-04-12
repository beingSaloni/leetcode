class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int ans = 0;
        
        for(int i = 0 ; i < tickets.length ; i++){
            
             if(k >= i || tickets[k] > tickets[i]){
              ans = ans + Math.min(tickets[i] , tickets[k]);
             }else{
                 
                 ans = ans + (tickets[k] - 1) ;
             }
        
        }
        
        return ans;
        
    }
}