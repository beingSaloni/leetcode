class Solution {
    public int trap(int[] height) {
        
        
        int ans = 0 ;
        
        int maxLeft = 0 ;
        
        int maxRight = 0;
        
        int left= 0;
        
        int right = height.length-1 ;
        
        while(right > left){
            
            if(height[right] > height[left]){
                
                if(maxLeft > height[left]){
                    
                    ans+= maxLeft - height[left] ;
                    
                }else{
                    
                    maxLeft = height[left];
                    
                }
                
                left ++;
                
            }else{
                
                if(maxRight > height[right]){
                    
                    ans+= maxRight- height[right] ;
                    
                }else{
                    
                    maxRight = height[right];
                    
                }
                
                
                right--;
            }
            
            
        }
        
        
        
        
        
        
        
        
        return ans;
    }
}