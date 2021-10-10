class Test {
	public static boolean test(int[] nums) {
		int testNaive = trading_Naive.maxProfit(nums);
		int testOnepass = trading_Onepass.maxProfit(nums);
		return testNaive == testOnepass;
	}
	
	private static int solution(int[] prices) {
		int maxCur = 0, maxSoFar = 0;
		for(int i = 1; i < prices.length; i++) {
		    maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
		    maxSoFar = Math.max(maxCur, maxSoFar);
		}
		return maxSoFar;
	}
}
