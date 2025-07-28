class Solution {
    public int maxProfit(int[] prices) {
        int small = Integer.MAX_VALUE;
        int large = 0;
        for(int i = 0; i<prices.length; i++){
            if(prices[i] < small){
                small = prices[i];
            }
            int profit = prices[i] - small;
            if(profit>large){
                large = profit;
            }
        }
        return large;

        
    }
}