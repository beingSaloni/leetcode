class Solution {
    public void setZeroes(int[][] matrix) {
        
        // storing temp val for first row
        
        int firstRow = -1;
        
        for(int r = 0 ; r < matrix.length ; r++){
            
            for(int c = 0 ; c < matrix[0].length ; c++){
             
                if(matrix[r][c] == 0){
                    
                    if(r==0){
                        firstRow = 0;
                    }else{
                        matrix[r][0] = 0;
                        matrix[0][c] = 0;
                    }
                
            }
                
            }
            
        }
        
        System.out.println(matrix.length + " " + matrix[0].length);
        
        for(int r = 1 ; r < matrix.length ; r++){
            
            for(int c = 1 ; c < matrix[0].length ; c++){
             
                if(matrix[r][0] == 0 || matrix[0][c] ==0 ){
                    
                    matrix[r][c] = 0;
                    
                    
                    
                   
                
            }
                
            }
            
        }
        
         if(matrix[0][0] == 0){

            
        for(int r = 0 ; r < matrix.length ; r++){
            
            
            matrix[r][0] = 0;
            
        }}
        
        
        if(firstRow == 0){

            
        for(int c = 0 ; c < matrix[0].length ; c++){
            
            
            matrix[0][c] = 0;
            
        }}
        
        
    }     
        
       
        
    }
    
