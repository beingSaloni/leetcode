class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        List<Integer> row,copy = null ;
        
        
        for(int i = 0 ; i<numRows ; i++){
            
            row = new ArrayList<Integer>();
            for(int j = 0 ; j <= i ; j++){
                
                if(j==0 || j==i){
                    
                    row.add(1);
                }else{
                    
                    row.add(copy.get(j-1) + copy.get(j));
                }
                
            }
            
            copy = row;
            ans.add(row);
        }
        
        return ans;
        
    }
}