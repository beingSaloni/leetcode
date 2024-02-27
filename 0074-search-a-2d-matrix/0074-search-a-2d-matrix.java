class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int low = 0;
        int high = matrix.length*matrix[0].length-1 ;
        int c = 0 ;
        
        while(low <= high && c <= matrix.length*matrix[0].length-1){
            
            int mid = (low + high)/2 ;
            
            int row = mid / matrix[0].length ;
            int col = mid%matrix[0].length ;
            
            // System.out.println(matrix[row][col]);
            
            if(matrix[row][col] == target){
                
                return true;
            }
            
            if(matrix[row][col] < target){
                
                 low = mid +1  ;
            }else{
                
                high= mid -1 ;
            }
            
           c++;
            
            
        }
        
        return false;
        
        
    }
}