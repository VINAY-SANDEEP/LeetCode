class Solution {
    public int majorityElement(int[] nums) {  
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0 ; i < nums.length ; i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int max = Integer.MIN_VALUE;
       for(int num:map.values()){
        max = Math.max(max,num);
       }
       for(int num:map.keySet()){
        if(map.get(num)==max){
            return num;
        }
       }
       return -1;
}
}