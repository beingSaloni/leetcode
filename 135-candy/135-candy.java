class Solution {
    public int candy(int[] ratings) {
        // initialization
        int children = ratings.length;
        int[] candies = new int[children];
        int totalCandy = 0;
        Arrays.fill(candies, 1);
        
        // visit left to right and give required candies
        for(int i = 1;i < children;i++){
            if(ratings[i] > ratings[i - 1]){
                candies[i] = candies[i - 1] + 1;
            }
        }
        
        // visit right to left and give more candies if required 
        for(int i = children - 2;i >= 0;i--){
            if(ratings[i] > ratings[i + 1]){
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        
        // add all the candies
        for(int i = 0;i < children;i++){
            totalCandy += candies[i];
        }
        
        // return the minimum candy required
        return totalCandy;
    }
}