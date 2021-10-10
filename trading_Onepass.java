public class trading_Onepass {
    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        // enumerate all possible buy dates
        for (int buyDate = 0; buyDate < prices.length; buyDate++) {
            if (prices[buyDate] < minprice)
                minprice = prices[buyDate];
            else if (prices[buyDate] - minprice > maxprofit)
                maxprofit = prices[buyDate] - minprice;
        }
        return maxprofit;
    }
}
