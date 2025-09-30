package com.swapnil;

import java.util.Arrays;

public class Question58 {
    public static void main(String[] args) {
        int num=12;
        ans(num);
    }

    public static void ans(int num){
        char[] digits=String.valueOf(num).toCharArray();

        int i=digits.length-2;
        while(i>=0 && digits[i]>=digits[i+1]) i--;

        if(i<0) {
            System.out.println(-1);
            return;
        }

        int j=digits.length-1;
        while(digits[j]<=digits[i]) j--;
        char temp=digits[j];
        digits[j]=digits[i];
        digits[i]=temp;

        Arrays.sort(digits,i+1,digits.length);

        long result=Long.parseLong(new String(digits));
        if(result>Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(result);
        }
    }
}
