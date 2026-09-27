class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int max = 0;
        for(int i = 1 ; i < points.length ; i++){
         max = Math.max(Math.abs(points[i][0]-points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
         time+=max;
        }
        return time;
    }
}