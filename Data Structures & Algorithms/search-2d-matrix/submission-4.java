class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        
        int colStart = 0;
        int colEnd = matrix[0].length-1;

        int row = -1;

        while (rowStart <= rowEnd) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][colStart] <= target && matrix[mid][colEnd] >= target) {
                row = mid;
                break;
            }
            else if (matrix[mid][colStart] < target && matrix[mid][colEnd] < target) {
                rowStart = mid + 1;
            }
            else {
                rowEnd = mid - 1;
            }
        }

        if (row == -1) {
            return false;
        }

        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return true;
            }
            else if (matrix[row][mid] <= target) {
                colStart = mid + 1;
            }
            else {
                colEnd = mid - 1;
            }
        }
        return false;
    }
}
