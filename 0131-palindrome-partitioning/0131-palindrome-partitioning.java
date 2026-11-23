class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),list);
        return list;
    }
    public static void backtrack(String s,int start,ArrayList<String> current, List<List<String>> list){
        if(start==s.length()){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i = start ; i < s.length() ; i++){
            String sub = s.substring(start,i+1);
            if(fun(sub)){
                current.add(sub);
                 backtrack(s,i+1,current,list);
                 current.remove(current.size()-1);
            }
        }
    }
    public static boolean fun(String sub){
        int start = 0;
        int end = sub.length()-1;
        while(start<=end){
            if(sub.charAt(start)!=sub.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}