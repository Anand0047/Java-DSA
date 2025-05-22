public class BestTimeToBuyAndSellLT {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int buy = prices[0];
        int profit = 0;
        for (int i =0;i<prices.length;i++){
            if (prices[i]<buy){
                buy = i ;
            }
                profit = Math.max(profit,prices[i]-buy);
        }
        System.out.println(profit);
        }
    }

