class Solution {
    public int romanToInt(String s) {
        
        int ans = 0 ;
        
        for(int i = 0 ; i < s.length() ; i++){
            
            ans+= solve(s , i);
            
            
        }
        return ans;
    }
    
    
    public int solve(String s , int i){
        
        if(s.charAt(i) == 'I'){
            
          return 1;
        }
        
         if(s.charAt(i) == 'V'){
             
             if(i!= 0 && s.charAt(i-1) == 'I'){
                 
                 return 3;
             }
            
            
          return 5;
        }
        
         if(s.charAt(i) == 'X'){
             
             if(i!= 0 && s.charAt(i-1) == 'I'){
                 
                 return 8;
             }
            
            
          return 10;
        }
        
         if(s.charAt(i) == 'L'){
             
             if(i!= 0 && s.charAt(i-1) == 'X'){
                 
                 return 30;
             }
            
            
          return 50;
        }
        
         if(s.charAt(i) == 'C'){
             
             if(i!= 0 && s.charAt(i-1) == 'X'){
                 
                 return 80;
             }
            
            
          return 100;
        }
        
         if(s.charAt(i) == 'D'){
             
             if(i!= 0 && s.charAt(i-1) == 'C'){
                 
                 return 300;
             }
            
            
          return 500;
        }
        
         if(s.charAt(i) == 'M'){
             
             if(i!= 0 && s.charAt(i-1) == 'C'){
                 
                 return 800;
             }
            
            
          return 1000;
        }
        
        return 0;
        
        
    }
    
}