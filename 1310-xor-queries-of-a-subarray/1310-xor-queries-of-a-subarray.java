class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int[] ans = new int[arr.length+1];
        int prev = 0;
        int[] solution = new int[queries.length];
        ans[0] = arr[0];
        int c = 2;
        for(int i = 1 ; i < arr.length ; i++){
            
            ans[c] = xor(prev , arr[i]);
            prev = ans[c];
            // System.out.println(ans[c]);
            c++;
        }
        
        for(int i = 0 ; i < queries.length ; i++){
            
            
            solution[i] = xor(ans[queries[i][0] ] , ans[queries[i][1] + 1]);
            
        }
        
        return solution;
        
        
    }
    
    private int xor(int prev , int curr){
        
        //0010
        int ans = 0 ;
        int place = 0;
        while(prev != 0 || curr != 0){
            
            if(prev%2 == curr%2){
                ans = (int)(0*Math.pow(2,place)) + ans ;
            }else{
                ans = (int)(1*Math.pow(2,place)) + ans ;
            }
            
            prev = prev / 2;
            curr = curr / 2;
            place++;
            
        }
        
        return ans;
        
        
        
    }
}