public class main {
    static int arr[] = {7,1,5,3,6,4};
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        main sol = new main();
        System.out.println(sol.maxProfit(arr));
    }
}
