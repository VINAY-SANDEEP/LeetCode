class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0 ; i < nums.length ; i++){
        //    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int num : map.keySet()){
        //   if(map.get(num)>nums.length/3){
        //     list.add(num);
        //   }
        // }
        // return list;
        int c1 = 0;
        int c2 = 0;
        int ele1 = 0;
        int ele2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(c1==0 && ele2!=nums[i]){
                ele1=nums[i];
                c1=1;
            }
            else if(c2==0 && ele1!=nums[i]){
                ele2=nums[i];
                c2 = 1;
            }
            else if(ele1==nums[i]){
                c1++;
            }
            else if(ele2==nums[i]){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < nums.length ; i++){
            if(ele1==nums[i]){
                count1++;
            }
            if(ele2==nums[i]){
                count2++;
            }
        }
        if(count1>nums.length/3) list.add(ele1);
        if(count2>nums.length/3) list.add(ele2);
        return list;
    }
}