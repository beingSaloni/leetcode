class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        
        // 2
        // 3 4
        // 6 5 7
        // 4 1  8 3
        
        return  min(triangle, 0 , 0 , new HashMap<String,Integer>());
    }
    
    public static int min(List<List<Integer>> triangle , int col , int row , HashMap memo){
       
        if( triangle.size() <= row || triangle.get(row).size() <= col){
            
            return 0;
        }
        String st = row + " " + col ;
        if(memo.containsKey(st)){
            
            return (int)memo.get(st);
        }
        
        int consideredfirst =triangle.get(row).get(col) + min(triangle, col ,row +1 , memo);
        
        int consideredsecond =triangle.get(row).get(col)+ min(triangle, col +1 , row +1 , memo);
        
        int ans =  Math.min(consideredfirst, consideredsecond);
        
        memo.put(st , ans);
        
        return ans;
    }
    
    
}