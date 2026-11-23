class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums,target,0,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int[] nums,int target,int start,ArrayList<Integer> current,List<List<Integer>> list){
        if(target==0){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i = start ; i < nums.length ; i++){
            if(nums[i]>target){
                continue;
            }
            current.add(nums[i]);
            backtrack(nums,target-nums[i],i,current,list);
            current.remove(current.size()-1);
        }
    }
}