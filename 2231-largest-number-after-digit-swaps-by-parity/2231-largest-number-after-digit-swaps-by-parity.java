class Solution {
    public int largestInteger(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (char c : arr) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
        }
        even.sort(Collections.reverseOrder());
        odd.sort(Collections.reverseOrder());
        int e = 0, o = 0;
        int result = 0;
        for (char c : arr) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                result = result * 10 + even.get(e++);
            } else {
                result = result * 10 + odd.get(o++);
            }
        }
        return result;
    }
}