class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,target,0,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int[] nums,int target,int start,ArrayList<Integer> current,List<List<Integer>> list){
        if(target==0){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i = start;i < nums.length; i++){
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i]>target){
                continue;
            }
            current.add(nums[i]);
            backtrack(nums,target-nums[i],i+1,current,list);
            current.remove(current.size()-1);
        }
    }
}