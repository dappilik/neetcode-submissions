class Solution {
    public int maxProfit(int[] prices) {
         int profit = 0;
        int left = 0;
        int right = 1;

        while ( right < prices.length) {
            int c= prices[right] - prices[left];
            if(c < 0){
                left = right;
                right++;
            }else{
                profit = Math.max(profit, c);
                right++;
            }
        }
        return profit;
    }
}
