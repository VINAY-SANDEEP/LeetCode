class Solution {
    public int numberOfSubstrings(String s) {
        int a = -1;
        int b = -1;
        int c = -1;
        int min = Integer.MAX_VALUE;
        int count  = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                a = i;
            }else if(ch=='b'){
                b = i;
            }
            else{
                c = i;
            }
          min = Math.min(a,Math.min(b,c))+1;
          count+=min;
        }
        return count;
    }
}