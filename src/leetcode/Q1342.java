package leetcode;

public class Q1342 {

    class Solution {
        public int numberOfSteps(int n) {


            int c =0;
            while(n> 0){

                int z = n & 1;
                if(z ==0){
                    n= n>> 1;
                }else{
                    n = n-1;
                }

                c++;
            }


            return c ;
        }
    }
}
