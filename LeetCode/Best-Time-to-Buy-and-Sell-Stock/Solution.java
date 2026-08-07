1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int maxProfit = 0;
5        int buyPrice = prices[0];
6
7        for (int i = 1; i < prices.length; i++) {
8
9            int currentProfit = prices[i] - buyPrice;
10
11            if (currentProfit > maxProfit) {
12                maxProfit = currentProfit;
13            }
14
15            if (prices[i] < buyPrice) {
16                buyPrice = prices[i];
17            }
18        }
19
20        return maxProfit;
21    }
22}