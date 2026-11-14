class Solution {
    public int maxProduct(int[] nums) {
        int front = 0;
        int back = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(front==0){
                front = 1;
            }
            if(back==0){
                back = 1;
            }
            front*=nums[i];
            back*=nums[nums.length-i-1];
           max = Math.max(max,Math.max(front,back));
        }
        return max;
    }
}