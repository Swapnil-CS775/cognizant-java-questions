package com.swapnil;

public class Question34 {
    public static void main(String[] args) {
        int n=112;
        ans(n);
    }

    public static void ans(int n){
        String num=String.valueOf(n);
        System.out.println(num);
        int start=0;
        int end=1;
        int sum=0;
        while(end<=num.length()){
            sum+=Integer.parseInt(num.substring(start,end));
            end++;
        }

        System.out.println(sum);
    }
}
