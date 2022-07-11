class Solution {
    public List<String> generateParenthesis(int n) {
        
         return solve(2*n,"", new ArrayList<>() , 0 , 0);
    }
    
    public static List<String> solve(int n , String s , List<String> list, int open , int close){
        
        if(n==0){
         
            if(open==close){
            list.add(s);
            }
            return list;
            
            
        }
        
         solve(n-1,s+"(",list , open + 1 , close);
        if(open > close){
         solve(n-1, s+")" , list , open , close+1);
        }
        
        return list;
        
    }
    
}