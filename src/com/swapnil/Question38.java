package com.swapnil;

public class Question38 {
    public static void main(String[] args) {
        int first=0;
        int second=0;
        int third=1;
        int n=11;

        ans(first,second,third,n);
    }

    public static void  ans(int first,int second,int third,int n ){
        int term =-1;
        for(int i=4;i<=n;i++){
            term=first+second+third;
            first=second;
            second=third;
            third=term;
        }

        System.out.println(term);
    }
}
