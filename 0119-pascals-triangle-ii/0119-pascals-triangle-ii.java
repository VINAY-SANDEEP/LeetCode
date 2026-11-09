class Solution {
    public List<Integer> getRow(int row) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 0 ; i < row ;  i++){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(1);
            for(int j  = 1 ; j < list.size() ; j++){
             ans.add(list.get(j-1)+list.get(j));
            }
            ans.add(1);
            list = ans;
        }
        return list;
    }
}