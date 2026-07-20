class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
          int i = 0;
       int j = 0;
        while (k>0){
            while ( i < grid.length){
                if(j==grid[0].length-1){

                    i++;
                    j=0;
                    continue;
                }
                int t = grid[i][grid[0].length-1];
                grid[i][grid[0].length-1]= grid[i][j];
                grid[i][j] = t;

                j++;
            }
            i = 0;
            while ( i < grid.length){

                int t = grid[grid.length-1][0];
                grid[grid.length-1][0]= grid[i][0];
                grid[i][0] = t;

                i++;
            }
            i=0;
            k--;
        }

        System.out.println(Arrays.deepToString(grid));

        return (List)Arrays.asList(grid);

    }
}