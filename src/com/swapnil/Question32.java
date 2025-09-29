package com.swapnil;

public class Question32 {
    public static void main(String[] args) {
        int num=38;
        ans(num);
    }

    public static void ans(int num){
        if(num<10) System.out.println(num);
        else {
            while(num>=10){
                num=sum(num);
            }
        }
        System.out.println(num);
    }

    public static int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
