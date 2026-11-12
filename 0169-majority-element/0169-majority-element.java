class Solution {
    public int majorityElement(int[] nums) {  
      int element = 0;
      int c = 0;
      for(int i = 0 ; i < nums.length ; i++){
        if(c==0){
            element=nums[i];
            c=1;
        }
        else if(element==nums[i]){
            c++;
        }else{
            c--;
        }
      }
      int c1 = 0;
      for(int i = 0; i < nums.length ; i++){
        if(nums[i]==element){
            c1++;
        }
      }
      return (c1 > (nums.length/2))?element:-1;
}
}