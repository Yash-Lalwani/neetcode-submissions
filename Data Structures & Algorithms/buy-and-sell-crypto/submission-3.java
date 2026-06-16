class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0]; // 10
        int profit = 0;
        for (int i=1; i<prices.length; i++) {
            if (prices[i] < lowest) {
                lowest = prices[i];
            }
            else {
                profit = Math.max(profit, prices[i] - lowest);
            }
        }
        return profit;
    }
}
