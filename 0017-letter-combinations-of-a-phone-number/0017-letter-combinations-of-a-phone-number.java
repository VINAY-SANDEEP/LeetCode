class Solution {
    public List<String> letterCombinations(String s) {
        List<String> list = new ArrayList<>();
        if(s.length()==0){
            return list;
        }
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(s,0,"",map,list);
        return list;
    }
    public void backtrack(String s,int start,String current,String[] map,List<String> list){
        if(start==s.length()){
            list.add(current);
            return;
        }
        int digit = s.charAt(start)-'0';
        String letters = map[digit];
        for(int i = 0 ; i < letters.length() ; i++){
         backtrack(s, start + 1, current + letters.charAt(i), map, list);
        }
    }
}