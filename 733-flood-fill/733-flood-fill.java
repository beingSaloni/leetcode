class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image[sr][sc] == newColor){
            
            return image;
        }
        
        dfs(image,sr,sc,newColor,image[sr][sc]);
        
        return image;
        
    }
    
    public static void dfs(int[][] image, int sr , int sc , int newColor , int temp){
        
        if(sr >= image.length || sc >= image[0].length || sr < 0 || sc < 0){
            
            return ;
        }
        
        if(image[sr][sc] != temp){
            return ;
        }
        
        image[sr][sc]= newColor;
        
        dfs(image,sr+1,sc,newColor,temp);
        dfs(image,sr-1,sc,newColor,temp);
        dfs(image,sr,sc-1,newColor,temp);
        dfs(image,sr,sc+1,newColor,temp);
        
        
    }
}