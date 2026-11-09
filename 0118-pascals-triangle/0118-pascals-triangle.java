class Solution {
    public List<List<Integer>> generate(int num) {
     List<List<Integer>> list = new ArrayList<>();
     ArrayList<Integer> ans = new ArrayList<>();
     ans.add(1);
     list.add(ans);
     for(int i = 1 ; i < num ; i++){
         ArrayList<Integer> line = new ArrayList<>();
         line.add(1);
         for(int j = 1 ; j < i ; j++){
          line.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
         }
         line.add(1);
         list.add(line);
     }
     return list;
    }
}