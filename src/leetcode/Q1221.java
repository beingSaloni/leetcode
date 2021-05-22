package leetcode;

public class Q1221 {

    class Solution {
        public int balancedStringSplit(String s) {
            int c =0;
            int max =0 ;
            for(int i =0 ; i<s.length() ;i++){

                if(s.charAt(i)=='L'){
                    c++;
                }else{
                    c--;
                }

                if(c==0){
                    max= max +1;
                }

            }

            return max;

        }
    }
}
