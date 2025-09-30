package com.swapnil;

public class Question64 {
    public static void main(String[] args) {
        int n=3;
        int r=2;
        int m=100;
        ans(n,r,m);
    }


    public static void ans(int n,int r,int m){
        int an=fact(n) / (fact(r)*(fact(n-r)));
        System.out.println(an%m);;
    }

    public static int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++) fact*=i;

        return fact;
    }
}
