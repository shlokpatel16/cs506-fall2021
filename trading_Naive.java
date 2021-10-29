public class trading_Naive {
    public static int maxProfit(int prices[]) {
        int maxprofit = 0;
        // enumerate all possible buy dates
        for (int buyDate = 0; buyDate < prices.length - 1; buyDate++) {
            // enumerate all possible sell dates
            for (int sellDate = buyDate + 1; sellDate < prices.length; sellDate++) {
                int profit = prices[sellDate] - prices[buyDate];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
