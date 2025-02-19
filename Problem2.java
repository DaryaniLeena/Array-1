//Time Complexity: O(m*n) ; where m : number of row , n: no of columns
//Space Complexity: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat[0].length == 0){
            return new int[0];
        }

        int dir = 1; // to set direction up/down
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        int i = 0;
        int[] result = new int[m * n];
        while(i<m*n){
            result[i++]= mat[row][col];
            if(dir == 1){
                if(col== n-1){
                    row++;
                    dir = -1;
                } else if( row == 0){
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            } else{
                if(row == m-1){
                    col++;
                    dir = 1;
                } else if( col == 0){
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }

        }
        return result;
    }
}