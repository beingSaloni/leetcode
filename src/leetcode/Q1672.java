package leetcode;

public class Q1672 {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max =0;
            int j = 0;
            int currmax = 0 ;
            int i = 0;
            while (j < accounts.length){

                if(i >= accounts[0].length){
                    if(currmax>max){
                        max =currmax;
                    }
                    j++;
                    currmax = 0;
                    i = 0;
                    continue;

                }
                currmax = currmax + accounts[j][i];

                i++;

            };

            return max;

        }
    }
}
