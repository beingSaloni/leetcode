package leetcode;

public class Q1389 {

    import java.util.ArrayList;
    class Solution {
        public static  int[] createTargetArray(int[] nums, int[] index) {

            int l = nums.length;
            ArrayList<Integer> arr = new ArrayList<Integer>(l);
            int[] res = new int[l];

            for(int i=0; i<l; i++){
                arr.add(index[i], nums[i]);
            }

            for(int i = 0; i<l; i++){
                res[i] = arr.get(i);
            }
            return res;
        }
    }
}
