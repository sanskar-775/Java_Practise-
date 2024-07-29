public class DP_FiboTab {
    public static int FiboTab(int n){
        int dp []= new int[n+1];
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int countWays(int n , int ways[]){
        if (n<0) {
            return 0;
        }if(n==0){
            return 1;
        }
        if(ways[n]!=-1){//already calculated hai matlab
            return ways[n];
        }
        ways[n]=countWays(n-1, ways)+countWays(n-2, ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(FiboTab(n));
    }
}
