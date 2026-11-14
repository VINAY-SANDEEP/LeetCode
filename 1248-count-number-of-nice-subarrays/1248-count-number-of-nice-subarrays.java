class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return priya(nums,k)-priya(nums,k-1);
    }
    public static int priya(int[] nums,int k){
        int sum = 0;
         int c = 0;
         int left = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum+=nums[i]%2;
            while(sum>k){
                sum-=nums[left]%2;
                left++;
            }
            c+=(i-left+1);
        }
        return c;
    }
}