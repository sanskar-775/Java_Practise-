public class BuyAndSell {
    public static int BuyandSell(int prices[]){
        int Maxprofit=0;
        int buyp=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(buyp<prices[i]){//profit
                int profit=prices[i]-buyp;//todays profit
                Maxprofit=Math.max(Maxprofit, profit);
            }else{
                buyp=prices[i];
            }
        }
        return Maxprofit;
    }
    public static void main(String args[]){
        int Prices[]={7,1,5,3,6,4};//O(n)
        System.out.println("maximum profit is "+BuyandSell(Prices));
    }
}
