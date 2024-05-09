class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        Arrays.sort(happiness);
        
        long ans = 0;
        
        int i = happiness.length - 1;
        
        int c = 0;
        
        while(k-- > 0 && i>= 0){
            
            ans = happiness[i] + ans ;
            i--;
            c++;
            
            if(i >= 0){
                
            happiness[i] = Math.max(happiness[i] - c , 0);
                
                }   
            
        }
        
        return ans;
    }
}