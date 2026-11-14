class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxfreq = 0;
        int maxlen = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq = Math.max(maxfreq,map.get(ch));
            int win = i-left+1;
            if(win-maxfreq > k){
                char leftch = s.charAt(left);
                map.put(leftch,map.get(leftch)-1);
                left++;
            }
            maxlen = Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}