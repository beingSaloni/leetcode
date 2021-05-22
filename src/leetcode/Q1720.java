package leetcode;

public class Q1720 {

    class Solution {
        public int[] decode(int[] encoded, int first) {


            int[] c = new int[encoded.length+1];
            c[0] = first ;
            for(int i = 0 ; i< encoded.length ; i++){

                c[i+1] = c[i] ^encoded[i];

            }


            return c;


        }
    }
}
