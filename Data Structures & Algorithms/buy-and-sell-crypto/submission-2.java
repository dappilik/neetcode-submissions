class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int[] minLeft = new int[prices.length];
        int min = prices[0];
        int[] maxRight = new int[prices.length];
        int max = prices[prices.length - 1];
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            minLeft[i] = min;
        }
        for (int i = prices.length - 1; i > -1; i--) {
            if (max < prices[i]) {
                max = prices[i];
            }
            maxRight[i] = max;
        }
        for (int i = 0; i < prices.length; i++) {
            int profit = maxRight[i] - minLeft[i];
            if (result < profit) {
                result = profit;
            }
        }

        return result;
    }
}
