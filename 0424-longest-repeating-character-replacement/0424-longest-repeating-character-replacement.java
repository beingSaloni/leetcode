class Solution {
    public int characterReplacement(String s, int k) {

        int high = 0 ;

        int low = 0 ;

        int maxCount = 0 ;

        int [] count = new int[26];

        int maxL = 0;

        for(high = 0 ; high < s.length() ; high++ ){

            maxCount = Math.max(maxCount , ++count[s.charAt(high) - 'A']) ;

            while(k < high - low + 1 - maxCount){

                count[s.charAt(low) - 'A']-- ;

                low++;



            }

            maxL = Math.max(maxL , high-low+1);




        }


        return maxL ;


        
    }
}