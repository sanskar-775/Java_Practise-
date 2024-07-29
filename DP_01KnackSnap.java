public class DP_01KnackSnap {
    public static int Knacksnap(int [] val,int wt[] , int W, int n, int dp[][]){
        //base case
        if (W==0 || n==0) {
            return 0;
        }

        if(dp[n][W]!=-1){// checking if the value is already calculated 
            return dp[n][W];
        }

        // valid condition 
        if (wt[n-1]<=W) {
            // include condition 
            int ans1=val[n-1]+Knacksnap(val,wt,W-wt[n-1],n-1,dp);
            //exclude condition
            int ans2 = Knacksnap(val,wt,W,n-1,dp);
            dp[n][W]= Math.max(ans1,ans2);// as we need max profit
            return dp[n][W];
        } else {// not valid conditon do exclude
            dp[n][W] = Knacksnap(val,wt,W,n-1,dp);
            return dp[n][W];
        }
    }
    public static int knapTb(int val[],int wt [],int W ,int n){
        int dp [][]= new int [n+1][W+1];
        // intializing the dp
        for(int i =0;i<n+1;i++){
            for (int j = 0; j < W+1; j++) {
                if (i==0||j==0) {
                    dp[i][j]=0;
                }
            }
        }
        // top down app
            // start from one as 0 th row and col are already intialized
            // replace the n and W from the memoiztion to i and j 
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if(wt[i-1]<=j){
                    dp[i][j]= Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][W];
                }

            }
        }
        return dp[n][W];

    }
    public static void main(String[] args) {
        int []val={15,14,10,45,30};
        int wt[]={2,5,1,3,4};    
        int W=7;
        int dp[][]= new int[val.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(knapTb(val, wt, W, val.length));
    }
}
