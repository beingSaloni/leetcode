class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int c = 0 ;
        
        for(int i = 0 ; i < s.length() ; i++){
            
            if(s.charAt(i) == '1'){
                c++;
            }
        }
        
        String ans = "";
        
        int z = s.length() - c ;
            
        while(c > 1){
            
            ans = ans +  "1" ;
            c--;
        }
        
        while(z > 0){
            
            ans = ans +  "0" ;
            z--;
        }
        
        return ans + '1';
        
        
        
        
        
    }
}