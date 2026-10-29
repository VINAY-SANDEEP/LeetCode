class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = 0 ; j < matrix[i].length ; j++){
                set.add(matrix[i][j]);
            }
            if(set.size()!=matrix[i].length){
                return false;
            }
        }
        for(int i = 0 ; i < matrix.length ; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = 0 ; j < matrix[i].length ; j++){
                set.add(matrix[j][i]);
            }
            if(set.size()!=matrix[i].length){
                return false;
            }
        }
return true;
    }
}