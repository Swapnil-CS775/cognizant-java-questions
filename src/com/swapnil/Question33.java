package com.swapnil;

public class Question33 {
    public static void main(String[] args) {
        int N=3;
        ans(N);
    }

    public static void ans(int n){
        long mod=100000007;
        if(n==0 || n==1) System.out.println(1);
        long[] f=new long[n+1];
        f[0]=1;
        f[1]=1;

        for(int i=2;i<=n;i++){
            f[i]=(f[i-1]+7*f[i-2]+(i/4))%mod;
        }

        System.out.println(f[n]);
    }
}
