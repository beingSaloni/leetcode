class Solution {
    public int numDecodings(String s) {
        
        int[] arr = new int[s.length()];
        
        for(int i = 0 ; i < s.length() ; i++){
            
            arr[i] = s.charAt(i)- '0';
            
            // System.out.println(arr[i]);
        }
        int[] memo = new int[s.length()];
    
         return solve(arr , 0,  memo);
    }
    
    public static int solve(int[] arr , int start ,  int[] memo ){
        
        
        
        if(arr.length <= start){
          // System.out.println(s);
        
            return 1 ;
        }
        
        if(start==0 && arr[start] == 0 ){
            return 0;
        }
        if(start -1 >= 0 && arr[start] == 0  && arr[start-1] >= 3){
            
            
            return 0;
        }
        
        if(memo[start] != 0){
            
           return  memo[start];
        }
        
    int cz = 0;
        
        if(arr[start] > 0){
            cz = solve(arr , start + 1 ,  memo);
        }else{
            
            return 0;
        }
        
        int cc = 0;
        if(start+1 < arr.length && (arr[start]*10 + arr[start+1]) <= 26 ){
            
            cc+= solve(arr , start + 2 ,  memo);
        }
        
         // System.out.println(arr[i]);
        
        memo[start] = cz + cc ;
        
        return cz +cc;
        
      
        
    }
    
}