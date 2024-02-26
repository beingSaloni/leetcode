class Solution {
    public void setZeroes(int[][] matrix) {
        
        // # 0 assume first row and col to act as an indicator to tell us
        //     in this row/col we have any 1
        // #1  Scan complete matrix and if any 1's found set first row and col accordingly
        // #2 after complete scanning, set the complete matric according to 1st row and col
        // #3 after setting complete matrix, set first col and then row accordingly 
        
        
        
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
        
        // using first row aand col values to set the values of complete matrix
        
        for(int r = 1 ; r < matrix.length ; r++){
            
            for(int c = 1 ; c < matrix[0].length ; c++){
             
                if(matrix[r][0] == 0 || matrix[0][c] ==0 ){
                    
                    matrix[r][c] = 0;
                    
                    
                    
                   
                
            }
                
            }
            
        }
        
        // setting first row value
        
         if(matrix[0][0] == 0){

            
        for(int r = 0 ; r < matrix.length ; r++){
            
            
            matrix[r][0] = 0;
            
        }}
        
        // setting first col value
        
        if(firstRow == 0){

            
        for(int c = 0 ; c < matrix[0].length ; c++){
            
            
            matrix[0][c] = 0;
            
        }}
        
        
    }     
        
       
        
    }
    
