public class besttimeto_buysellstock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
    public static int maxProfit(int[] prices) {
        int min = prices[0], maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }
        
        return maxProfit;
    }
}
