class Solution {
    public int gcdOfOddEvenSums(int n) {

        int sumodd = 0 ;

        int sumeven = 0 ;

        for(int i = 1 ; i <= n ; i++){

            sumodd += (i*2) -1 ;

            sumeven += (2*i) ;

        }
        
        for(int i = sumodd/2  ; i > 1; i--){

            if(sumeven % i == 0 && sumodd %i == 0){

                return i;
            }


        }

        return 1;
    }    
    
}