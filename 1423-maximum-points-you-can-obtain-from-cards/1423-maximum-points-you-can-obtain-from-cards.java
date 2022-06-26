class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        // 1,1,2,3,1,1
        // 0 9 1 0 6 1
        
        int sumOffirst = 0;
        for(int i = 0 ; i<k; i++){
            
            sumOffirst+= cardPoints[i];
            
            
            
        }
        
        int maxScore = sumOffirst ;
      
        for(int i = 0 ; i<k; i++){
            
            sumOffirst=  sumOffirst + cardPoints[cardPoints.length-1-i] - cardPoints[k-i-1];
            
            maxScore = Math.max(maxScore, sumOffirst);
            
            
            
        }
        
        return maxScore ;
        
    }
}