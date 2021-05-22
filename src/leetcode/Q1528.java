package leetcode;

public class Q1528 {

    class Solution {
        public String restoreString(String s, int[] indices) {


            char[] r = new char[s.length()];



            for(int i= 0 ; i< indices.length ; i++){

                int c = indices[i];


                r[c] = s.charAt(i);



            }
            // System.out.print(Arrays.toString(r));
            String t = "";

            for(int i =0 ; i < s.length() ; i++){

                t =t +"" + r[i];


            }

            return t;
        }
    }
}
