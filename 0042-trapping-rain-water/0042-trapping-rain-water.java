class Solution {
    public int trap(int[] height) {
        int total = 0;
     int[] left = new int[height.length];
     int[] right = new int[height.length];
     int leftMax = Integer.MIN_VALUE;
     int rightMax = Integer.MIN_VALUE;
     for(int i = 0 ; i < height.length ; i++){
        leftMax = Math.max(leftMax,height[i]);
        left[i]=leftMax;
        rightMax = Math.max(rightMax,height[height.length-i-1]);
        right[height.length-i-1]= rightMax;
     }
     for(int i = 0 ;i < height.length ; i++){
        if(height[i] < left[i] && height[i] < right[i]){
            total+=Math.min(left[i],right[i])-height[i];
        }
     }
     return total;
    } 
}
