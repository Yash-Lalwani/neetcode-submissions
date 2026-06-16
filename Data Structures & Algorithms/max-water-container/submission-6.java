class Solution {
    public int maxArea(int[] heights) {
        int prod = 0;
        int j = heights.length-1, i=0;
        while (i < j) {
            int area = Math.min(heights[i], heights[j]) * (j-i);
            prod = Math.max(area, prod);
            if (heights[i] < heights[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return prod;
    }
}
