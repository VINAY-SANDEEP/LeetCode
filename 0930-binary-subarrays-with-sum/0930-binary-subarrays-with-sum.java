class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return atMostK(nums,goal)-atMostK(nums,goal-1);
    }
    public static int atMostK(int[] nums,int goal){
        int sum = 0;
        int left = 0;
        int c = 0;
          if (goal < 0) return 0;
        for(int i = 0 ; i < nums.length ; i++){
             sum+=nums[i];
             while(sum>goal){
               sum-=nums[left];
               left++;
             }
             c+=(i-left+1);
        }
        return c;
    }
}
