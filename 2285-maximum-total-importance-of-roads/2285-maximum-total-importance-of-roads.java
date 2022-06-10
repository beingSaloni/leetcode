class Solution {
    public long maximumImportance(int n, int[][] roads) {
     
        
        
        long[] count = new long[n];
        

        
        
        for(int i = 0 ; i < roads.length ;i++){
            
          count[roads[i][0]]++ ;
            
            count[roads[i][1]]++;
            
           
            
        }
        
        Arrays.sort(count);
      long sum = 0 ;
        
        for(int i = 1 ; i <= n ;i++){
            
           // System.out.println(count[i-1]);
            sum+=(count[i-1]*i);
            
            
        }
        
     return sum ;   
    }
}