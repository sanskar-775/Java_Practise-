public class DP_LCsubString {
    public static int LCS(String s1, String s2){// Time Complexity O(N*M)
        int n = s1.length();
        int m = s2.length();
        int ans=0;
        //INTIALIZING THE DP 
        int dp[][]= new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < m+1; i++) {
            dp[0][i]=0;
        }
         for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <m+1; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j]=dp[i-1][j-1]+1;
                    ans=Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
         }
         return ans;
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="abcge";
        System.out.println(LCS(str1, str2));
    }
}
