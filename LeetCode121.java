//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

//121. Best Time to Buy and Sell Stock

public class LeetCode121 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = buySellStock(prices);
        System.out.println(ans);

    }

    public static int buySellStock(int[] prices){
        int mini = Integer.MAX_VALUE;
        int profit = 0;
        int n = prices.length;

        for(int i=0;i<n;i++){
            int cost = prices[i] - mini;
            profit = Math.max(profit,cost);
            mini = Math.min(mini,prices[i]);
        }
        return profit;
    }
    
}
