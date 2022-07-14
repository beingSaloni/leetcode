class Solution {
    public int numDecodings(String s) {
        
        int[] arr = new int[s.length()];
        //converting string to array
        for(int i = 0 ; i < s.length() ; i++){
            
            arr[i] = s.charAt(i)- '0';
            
         
        }
        int[] memo = new int[s.length()];
    
         return solve(arr , 0,  memo);
    }
    
    public static int solve(int[] arr , int start ,  int[] memo ){
        
        
        
        if(arr.length <= start){
          
        
            return 1 ;
        }
        
        
        if(memo[start] != 0){
            
           return  memo[start];
        }
        
    int considerOneDigit = 0;
        
        if(arr[start] > 0){   // to check no leading zero is considered
             considerOneDigit= solve(arr , start + 1 ,  memo);
        }else{
            
            return 0;
        }
        
        int considerTwoDigit = 0;
        if(start+1 < arr.length && (arr[start]*10 + arr[start+1]) <= 26 ){ 
                                        // We can consider two digits only if it is smaller than 26 
            
            considerTwoDigit+= solve(arr , start + 2 ,  memo);
        }
        
        memo[start] = considerOneDigit + considerTwoDigit ;
        
        return considerOneDigit +considerTwoDigit;
        
      
        
    }
    
}