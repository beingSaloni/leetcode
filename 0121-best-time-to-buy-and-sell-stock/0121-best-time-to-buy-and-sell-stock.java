class Solution {
    public int maxProfit(int[] prices) {

//         Kadane's Algorithm
// Kadane's Algorithm is a dynamic programming technique used to find the maximum subarray sum in an array of numbers. The algorithm maintains two variables: max_current represents the maximum sum ending at the current position, and max_global represents the maximum subarray sum encountered so far. At each iteration, it updates max_current to include the current element or start a new subarray if the current element is larger than the accumulated sum. The max_global is updated if max_current surpasses its value.

        int buy = prices[0];
        int profit = 0 ;

        for(int i = 1 ; i < prices.length ; i++){

            if(prices[i] < buy ){
                buy = prices[i];
            }else if(prices[i] - buy > profit){

                profit = prices[i] - buy ;
            }


        }

        return profit;
        
    }
}