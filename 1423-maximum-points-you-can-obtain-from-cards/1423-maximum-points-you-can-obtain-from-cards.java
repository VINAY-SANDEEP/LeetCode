class Solution {
    public int maxScore(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for(int i = 0; i < k ; i++){
            left+=nums[i];
        }
        int max = left;
        int rightind = nums.length-1;
        for(int i = k-1 ; i>= 0 ; i--){
           left-=nums[i];
           right+=nums[rightind--];
           max = Math.max(left+right,max);
        }
        return max;
    }
}