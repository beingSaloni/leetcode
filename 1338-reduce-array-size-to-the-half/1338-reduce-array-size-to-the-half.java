class Solution {
    public int minSetSize(int[] arr) {
        
       
        
        HashSet set = new HashSet<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            
            set.add(arr[i]);
            
        }
        
         int[][] memo = new int[set.size()][2];
        
        Arrays.sort(arr);
        
        int j= 0;
        memo[0][0] = arr[0];
        memo[0][1] = 1;
         for(int i = 1 ; i < arr.length ; i++){
             
             if(arr[i-1]==arr[i]){
                 
                 memo[j][1]++;
             }else{
                 
                 j++;
                  memo[j][0] = arr[i];
        memo[j][1] = 1;
                 
             }
            
          
            
        }
        
        Arrays.sort(memo , (a,b)-> b[1] - a[1]);
        
        int c = 0 ; 
        
        int sum = arr.length/2;
        
        while(sum > 0){
            
            sum-=memo[c][1];
            c++;
        }
        
        
        
        return c;
        
        
    }
}