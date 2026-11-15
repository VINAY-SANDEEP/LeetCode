class Solution {
    public int maxProfit(int[] prices) {
      int left = 0;
      int max = 0;
      for(int i = 1 ; i < prices.length ; i++){
        if(prices[i]>prices[left]){
            int profit = prices[i]-prices[left];
             max = Math.max(max,profit);
        }else{
            left = i;
        }
      }
      return max;
    }
}

