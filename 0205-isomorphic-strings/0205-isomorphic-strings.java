class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char first = s.charAt(i);
            char second = t.charAt(i);
            if(!map.containsKey(first)){
                if(!map.containsValue(second)){
                    map.put(first,second);
                }else{
                    return false;
                }
            }else{
                char mapped = map.get(first);
                if(second!=mapped){
                    return false;
                }
            }
        }
        return true;
    }
}