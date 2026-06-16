class Solution {
    public int maxArea(int[] heights) {
        int prod = 1;
        int zero = 1;
        for (int i=0; i<heights.length; i++) {
            for (int j=i+1; j<heights.length; j++) {
                if (Math.min(heights[i], heights[j]) == 0) {
                    zero = 0;
                }
                else if (Math.min(heights[i], heights[j])*(j-i) > prod) {
                    prod = Math.min(heights[i], heights[j])*(j-i);
                }
            }
        }
        if (prod == 1 && zero == 0) {
            return zero;
        }
        else {
            return prod;
        }
    }
}
