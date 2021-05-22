package leetcode;

public class Q1431 {

    class Solution {
        public int max(int[] candies){
            int max = candies[0];
            for(int i = 1 ; i < candies.length ;i ++){
                if(candies[i] > max){
                    max = candies[i];
                }

            }
            return max ;
        }
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean>list = new ArrayList<>();
            int max = max(candies);

            for(int i = 0 ; i< candies.length ; i++){

                if(candies[i] + extraCandies < max){
                    list.add(false);
                }else{
                    list.add(true);
                }

            }
            return list;
        }
    }
}
