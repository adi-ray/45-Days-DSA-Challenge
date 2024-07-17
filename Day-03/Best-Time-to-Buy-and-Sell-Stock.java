class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profitMax = 0;

        for(int i=1;i<prices.length;i++) {
            int cost = prices[i] - min;
            profitMax = Math.max(cost,profitMax);
            min = Math.min(min,prices[i]);
        }

        return profitMax;
    }
}