package leetcode;

public class Q1476 {

    class SubrectangleQueries {

        int rows ;
        int cols;
        int[][] rectangle;
        public SubrectangleQueries(int[][] rectangle) {
            rows = rectangle.length ;
            cols =rectangle[0].length;
            this.rectangle = rectangle;

        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            int r =row1;

            while(r <= row2  ){
                int c=col1;
                while(c<=col2){
                    rectangle[r][c]=newValue;

                    c++;
                }


                r++;

            }

        }

        public int getValue(int row, int col) {
            return rectangle[row][col];
        }
    }

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
}
