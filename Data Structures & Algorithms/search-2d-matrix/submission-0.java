class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length-1;
        for (int i=0; i<matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][c]) {
                // int index = i;
                int start = 0;
                int end = c;
                while (start <= end) {
                    int mid = (start + end)/2;
                    if (matrix[i][mid] == target) {
                        return true;
                    }
                    else if (matrix[i][mid] > target) {
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}