class Solution {
    public int trap(int[] height) {
       int left = 0;
       int right = 0;
       int start = 0;
       int total = 0;
       int end = height.length-1;
       while(start<end){
            left = Math.max(left,height[start]);
            right = Math.max(right,height[end]);
              if(left < right){
                total+=left-height[start];
                start++;
              }
              else{
                 total+=right-height[end];
                end--;
              }
       }
       return total;
    } 
}
