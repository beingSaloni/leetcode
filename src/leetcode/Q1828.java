package leetcode;

public class Q1828 {

    class Solution {
        public int[] countPoints(int[][] points, int[][] queries) {
            int i =0;
            int [] r = new int[queries.length];
            while(queries.length > i){
                int j =0 ;
                int c =0;
                while(points.length > j){

                    int x = points[j][0] - queries[i][0];
                    int y =   points[j][1] - queries[i][1];

                    if(queries[i][2] * queries[i][2] >= ((x * x) +(y * y) )){
                        c ++;

                    }
                    j++;
                }
                r[i] = c ;
                i++;
            }

            return r ;
        }
    }
}
