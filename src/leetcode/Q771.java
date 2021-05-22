package leetcode;

public class Q771 {
    class Solution {
        public int numJewelsInStones(String jewels, String stones) {

            int y = 0;
            int c = 0 ;
            while(y < jewels.length()){
                for(int i = 0 ; i< stones.length() ; i++){
                    if(stones.charAt(i) == jewels.charAt(y)){
                        c++;
                    }

                }
                y++;

            }
            return c;
        }}
}
