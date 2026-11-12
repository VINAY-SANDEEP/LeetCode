class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new  ArrayList<Integer>();
        int element1 = 0;
        int element2 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(count1 == 0 && nums[i] != element2){
                element1 = nums[i];
                count1=1;
            }
           else if(count2 ==0 && nums[i] != element1){
                element2 = nums[i];
                count2 = 1;
            }
            else if(element1==nums[i]){
                count1++;
            }
            else if (element2==nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        int c1 = 0;
        int c2 = 0;
        for(int i  = 0 ; i < nums.length ; i++){
            if(nums[i]==element1){
                c1++;
            }else if(nums[i]==element2){
                c2++;
            }
        }
        int mini = (nums.length/3);
        if(c1 > mini){
            list.add(element1);
        }
        if(c2 > mini){
            list.add(element2);
        }
        return list;
    }
}