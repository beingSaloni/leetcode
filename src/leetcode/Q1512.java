package leetcode;

public class Q1512 {
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int count = 0;
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for(int i =0 ; i< nums.length ; i++){
                if(!hm.containsKey(nums[i])){
                    hm.put(nums[i] , 1);
                }else{
                    count = count + hm.get(nums[i]);
                    hm.put(nums[i], hm.get(nums[i]) + 1);
                }

            }
            return count ;


        }
    }
//frequency---count
// 0--0
//1--0
//2--1
//3--3
//4--6
//5--10
}
