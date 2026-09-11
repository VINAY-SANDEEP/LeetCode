class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str =  s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < str.length ; i++){
            if(Character.isDigit(str[i].charAt(0))){
               list.add(Integer.parseInt(str[i]));
            }
        }
        for(int i = 0 ; i < list.size()-1 ; i++){
            if(list.get(i)>=list.get(i+1)){
               return false;
            }
        }
        return true;
    }
}