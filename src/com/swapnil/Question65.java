package com.swapnil;

public class Question65 {
    public static void main(String[] args) {
        int n=4;
        ans(n);
    }

    public static void ans(int n){
        if(n==0) System.out.println(1);
        if(n==1) System.out.println(0);

        long[] dp=new long[n+1];
        dp[0]=1;
        dp[1]=0;


        // Apply the recurrence D(n) = (n - 1) * [D(n-1) + D(n-2)]
        for(int i=2;i<=n;i++){
            dp[i]=(i-1)*(dp[i-1]+dp[i-2]);
        }

        System.out.println(dp[n]);
    }
}
