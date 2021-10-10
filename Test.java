class Test {
	public static boolean test(int[] nums) {
		int testNaive = trading_Naive.maxProfit(nums);
		int testOnepass = trading_Onepass.maxProfit(nums);
		return testNaive == testOnepass;
	}
}
