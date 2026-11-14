class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      HashSet<List<Integer>> list = new HashSet<>();
      ArrayList<Integer> ans = new ArrayList<>();
      for(int i = 0 ; i < nums.length ; i++){
        HashSet<Integer> set = new HashSet<>();
        for(int j = i + 1 ; j < nums.length ; j++){
            int target = -(nums[i]+nums[j]);
            if(set.contains(target)){
                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], target);
                Collections.sort(triplet);
                 list.add(triplet);
            }
            set.add(nums[j]);
        }
      }
      return new ArrayList<>(list);
    }
}