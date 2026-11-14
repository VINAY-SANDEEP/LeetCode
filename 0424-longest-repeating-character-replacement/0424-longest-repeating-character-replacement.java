class Solution {
    public int characterReplacement(String s, int k) {
     HashMap<Character,Integer> map = new HashMap<>();
     int left = 0;
     int max = 0;
     int maxfreq = 0;
     for(int i = 0 ; i < s.length() ; i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
        maxfreq = Math.max(maxfreq,map.get(ch));
        while((i-left+1)-maxfreq>k){
            char  leftch = s.charAt(left);
            map.put(leftch,map.get(leftch)-1);
        if(map.get(leftch)==0){
            map.remove(leftch);
        }
        left++;
        }
        max = Math.max(max,i-left+1);
     }
     return max;
    }
}