class Solution {
    public int removePalindromeSub(String s) {
        
        
            
            if(isValid(s,0,s.length()-1)){
                
                return 1;
                
            
            
        }
        
        return 2;
        
    }
    
    public static boolean isValid(String s , int start, int end ){
        
        int j = 0 ;
        for(int i = start ; i <= end/2 ; i++){
            // System.out.println(i + " " + end);
            if(s.charAt(i) != s.charAt(end-j)){
                return false;
            }
            j++;
        }
        return true;
    }
    
}