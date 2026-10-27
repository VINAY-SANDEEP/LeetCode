
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max = Integer.MIN_VALUE;
        int units = 0;
        int ans = logs[0][0];
        for (int i = 0; i < logs.length; i++) {
            int currid = logs[i][0];
            int currtime = logs[i][1];
            if (i == 0) {
                units = currtime;
            } else {
                units = currtime - logs[i - 1][1];
            }
            if (units > max || (units == max && currid < ans)) {
                max = units;
                ans = currid;
            }
        }

        return ans;
    }
}
