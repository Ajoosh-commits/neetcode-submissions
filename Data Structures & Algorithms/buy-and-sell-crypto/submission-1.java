class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int smallest = 101;
        for (int price: prices){
            profit = Math.max(profit, price - smallest);
            smallest = Math.min(smallest, price);
        }
        return profit;
    }
}
