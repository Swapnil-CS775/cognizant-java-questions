package com.swapnil;

public class Question37 {
    public static void main(String[] args) {
        int s=2;
        int d=3;
        int n=6;
        ans(s,d,n);
    }

    public static void ans(int a,int r,int n){
        System.out.println(a*(int)(Math.pow(r,n-1)));
    }
}
