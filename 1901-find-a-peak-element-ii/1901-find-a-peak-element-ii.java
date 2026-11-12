class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int[] ans = new int[2];
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
               max = Math.max(max,mat[i][j]);
            }
        }
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j]==max){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}