package leetcode;

public class Q1769 {

    class Solution {
        public int[] minOperations(String boxes) {
            int [] r = new int[boxes.length()];


            for(int i = 0 ; i< boxes.length() ; i++ ){
                for(int j = 0 ; j< boxes.length() ;j++){

                    if(boxes.charAt(j) == '1'){

                        r[i] =r[i] + Math.abs(j-i);

                    }




                }


            }

            return r;
        }
    }
}
