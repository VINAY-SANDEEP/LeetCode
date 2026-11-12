class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c = 1;
        int max = Integer.MIN_VALUE;
        if(nums.length==1){
            return 1;
        }
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1){
              c++;
              max = Math.max(max,c);
            }else{
              c=1;
            }
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}