class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c = 1;
        int max = 1;
        if(nums.length==0){
            return 0;
        }
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1){
              c++;
            }else{
              c=1;
            }
            max = Math.max(max,c);
        }
        return max;
    }
}