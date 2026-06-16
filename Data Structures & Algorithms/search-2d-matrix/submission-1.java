class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int top = 0;
        int bot = matrix.length-1;

        int row = 0;
        while (top <= bot) {
            int mid = (top + bot) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][col]) {
                row = mid;
                break;
            }
            else if(target >= matrix[mid][col]) {
                top = mid + 1;
            }
            else {
                bot = mid - 1;
            }
        }

        int start = 0;
        int end = col;
        while (start <= end) {
            int mid = (start + end)/2;
            if (matrix[row][mid] == target) {
                return true;
            }
            else if (matrix[row][mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}