class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
       
        // 1000
        //  200 200 200 200 200 200
        //  40 40 40 40 40
        //  10 10 10 10
        //  3  3  4
        
        
       // 4 rounds (60/15)
        // 4 buckets 2 pigs --1 round
        // 
        
        
        //  
        // 
        
        
        int T= minutesToTest/minutesToDie;   //Trial count   
        
        return (int)Math.ceil(Math.log(buckets)/Math.log(T+1));
        
    }
}