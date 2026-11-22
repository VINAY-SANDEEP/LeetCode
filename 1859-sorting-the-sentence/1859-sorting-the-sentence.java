class Solution {
    public String sortSentence(String s) {
        HashMap<Integer,String> map = new HashMap<>();
        String[] str = s.split(" ");
        for(int i = 0 ; i < str.length ; i++){
            char place = str[i].charAt(str[i].length()-1);
            String word = str[i].substring(0,str[i].length()-1);
            map.put(place-'0', word);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <=str.length ; i++){
            String find = map.get(i);
            sb.append(find);
            if(i!=str.length){
                 sb.append(" ");
            }
        }
        System.out.println(map);
        return sb.toString();
    }
}