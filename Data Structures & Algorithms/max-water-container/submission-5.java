class Solution {
    public int maxArea(int[] heights) {
        int prod = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int area = Math.min(heights[i], heights[j]) * (j - i);
                prod = Math.max(prod, area);
            }
        }
        return prod;
    }
}
