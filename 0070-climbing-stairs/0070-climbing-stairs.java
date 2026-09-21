class Solution {
    public int climbStairs(int n) {
      if(n<=1){
        return n;
      }
      int ans = 0;
      int prev = 0;
      int prev2 = 1;
      for(int i = 0 ; i < n ; i++){
         ans = prev+prev2;
        prev = prev2;
        prev2 = ans;
      }
      return ans;
    }
}