class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i =0; i<prices.length; i++) {
            for (int j=i+1; j<prices.length; j++) {
                int buy = prices[i];
                int sell = prices[j];
                int profit = sell - buy;
                res = Math.max(profit, res);
            }
        }
        return res;
    }
}
