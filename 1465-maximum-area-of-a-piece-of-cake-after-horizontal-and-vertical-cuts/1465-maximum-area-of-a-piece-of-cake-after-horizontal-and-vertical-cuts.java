class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        // sort both cuts array
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        // find the cake with maximum height and maximum width after cuts
        long maxHeight = 0;
        long maxWidth = 0;
        int prev = 0;
        
        for(int index = 0;index < horizontalCuts.length;index++){
            maxHeight = Math.max(maxHeight, horizontalCuts[index] - prev);
            prev = horizontalCuts[index];
        }
        maxHeight = Math.max(maxHeight, h - prev);
        
        prev = 0;
        for(int index = 0;index < verticalCuts.length;index++){
            maxWidth = Math.max(maxWidth, verticalCuts[index] - prev);
            prev = verticalCuts[index];
        }
        maxWidth = Math.max(maxWidth, w - prev);
        
        
        return (int)((maxHeight * maxWidth) % 1000000007);
    }
}