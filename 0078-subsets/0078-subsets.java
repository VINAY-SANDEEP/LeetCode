class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        fun(nums,0,nums.length,list,new ArrayList<>());
        return list;
    }
    public static void fun(int[] nums,int start,int end,List<List<Integer>> list,ArrayList<Integer> ans){
        if(start==end){
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[start]);
        fun(nums,start+1,end,list,ans);
        ans.remove(ans.size()-1);
        fun(nums,start+1,end,list,ans);
    }
}