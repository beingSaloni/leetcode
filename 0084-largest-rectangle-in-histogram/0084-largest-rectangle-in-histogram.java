class Solution {
    public int largestRectangleArea(int[] h) {
        
        int[] prevSmall = prevSmall(h);
        
        int[] nextSmall = nextSmall(h);
        
        int ans = 0;
        
        for(int i = 0 ; i < h.length ; i++){
            
            int temp = (nextSmall[i] - prevSmall[i] -1) * h[i] ;
            
            ans = Math.max(ans , temp);
        }
        
        return ans;
        
    }
    
    public int[] prevSmall(int[] h){
        
        int[] temp = new int[h.length];
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        
        for(int i = 0 ; i < h.length ; i++){
            
           while(s.peek() != -1 && h[s.peek()] >= h[i]){
               
               s.pop();
                // System.out.println(s.pop() + " pop" + i);
               
           }
            
            // System.out.println(s.peek() + " " + i);
            
            temp[i] = s.peek() ;
                s.push(i);
        
            
        }
        
        return temp ;
        
        
    }
    
    public int[] nextSmall(int[] h){
        
        Stack<Integer> s = new Stack<>();
        s.push(h.length);
         int[] temp = new int[h.length];
        for(int i = h.length-1  ; i > -1 ; i--){
            
           while(s.peek() != h.length  && h[s.peek()] >= h[i]){
               
               s.pop();
           }
            
            temp[i] = s.peek() ;
                s.push(i);
        
            
        }
        
        return temp;
        
        
    }
}