class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
       List<List<Integer>> outer = new ArrayList<List<Integer>>();
        
        List<Integer> inner = new ArrayList<Integer>();
        Arrays.sort(candidates);
        
        com(candidates , 0 , target , outer , inner);
        
        return outer;
        
        
    }
    
    public static void com(int[] can , int i , int t , List<List<Integer>> outer  ,   List<Integer> inner ){
        
        if(t==0){
            
           
                
                outer.add(new ArrayList<>(inner));
            
            
            
            return;
        }
        
        if(t<0 || i>= can.length){

            
            return;
        }
        
        for(int j = i ; j < can.length ;j++){
            if(j > i && can[j]==can[j-1]){
                continue;
            }
             inner.add(can[j]);
          com(can , j+1 , t- can[j] , outer, inner);
           inner.remove(inner.size()-1);
            
        }
        
//         com(can , i+1 , t , outer , inner);
//         inner.add(can[i]);
//         com(can , i+1 , t- can[i] , outer, inner);
//         inner.remove(inner.size()-1);
        
        
    }
    
    
}