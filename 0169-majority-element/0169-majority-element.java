class Solution {
    public int majorityElement(int[] nums) {  
    //     Arrays.sort(nums);
    //  return nums[nums.length/2];
    //  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    //  for(int i = 0 ; i < nums.length ; i++){
    //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    //  }
    //  for(int num : map.keySet()){
    //     if(map.get(num)>nums.length/2){
    //         return num;
    //     }
    //  }
    //  return -1;
    int element = 0;
    int count = 0;
    for(int i = 0 ; i < nums.length ; i++){
        if(count==0){
            count =1;
            element = nums[i];
        }
        else if(element==nums[i]){
            count++;
        }else{
            count--;
        }
    }
    int count1=0;
    for(int i = 0 ; i < nums.length ; i++){
        if(element==nums[i]){
           count1++;
        }
    }
    return (count1 > nums.length/2)?element:-1;
 }
}