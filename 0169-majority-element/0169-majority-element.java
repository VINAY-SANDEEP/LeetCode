class Solution {
    public int majorityElement(int[] nums) {  
     int element = 0;
     int count = 0;
     for(int i = 0; i < nums.length ; i++){
        if(count==0){
            element=nums[i];
            count=1;
        }else if(nums[i]==element){
            count++;
        }else{
            count--;
        }
     }
     int count1 = 0;
     for(int i = 0 ; i < nums.length ; i++){
        if(nums[i]==element){
          count1++;
        }
     }
     return (count1>nums.length/2)?element:-1;
 }
}