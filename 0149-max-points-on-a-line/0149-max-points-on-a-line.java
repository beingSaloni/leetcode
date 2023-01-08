class Solution {
    public int maxPoints(int[][] points) {
        // y2 - y1 / x2-x1

        // 1, 1 , 5,3

        // [[3,2],[4,1],[2,3],[1,4]]

        if(points.length ==1){
            return 1;
        }

        // int[][] memo = new int[points.length][points.length];

        int ans = 2;

        for(int i = 0 ; i < points.length ; i++){

            HashMap<Double, Integer> map = new HashMap<>();
            int currAns = 2;
            for(int j = 0 ; j < points.length ; j++){

                if(i==j){
                    continue ;
                }

                // if(points[i][0] - points[j][0] == 0){
                //     continue ;
                // }


                double m = Math.atan2(points[j][1] - points[i][1],points[j][0] - points[i][0]) ;
                //  System.out.println(points[j][1] - points[i][1]);
                //  System.out.println(points[j][0] - points[i][0] + " " + m +  Math.atan2(points[j][1] - points[i][1],points[j][0] - points[i][0] ));
                


                if(map.containsKey(m)){
                    map.put(m,map.get(m) + 1);
                    currAns = Math.max(currAns, map.get(m));
                    System.out.println(m + " " + currAns+ " " + i + " "  + j);
                }else{
                    map.put(m , 2);
                       System.out.println(m + " " + currAns+ " " + i + " "  + j);
                     currAns = Math.max(currAns, map.get(m));
                }


            }

            ans = Math.max(ans, currAns);
        }

       


        return ans;
    }
}