class Solution {
    public boolean canAliceWin(int n) {
        return solve(n, 10, true);
    }

    public boolean solve(int n, int i, boolean aliceTurn) {
        if (n < i) {
            return !aliceTurn;
        }

        return solve(n - i, i - 1, !aliceTurn);
    }
}