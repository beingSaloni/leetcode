package leetcode;

public class Q1689 {
    class Solution {
        public int minPartitions(String n) {





            for(int i= 9 ; i > 0 ; i--){
                String s = i + "";
                if(n.contains(i + "0")){
                    return i;
                }



            }

            return 0;

        }
    }
}
