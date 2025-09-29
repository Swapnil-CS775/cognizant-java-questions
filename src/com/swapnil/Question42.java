package com.swapnil;

public class Question42 {
    public static void main(String[] args) {
        String s1=" Always Joe in Friends Joe with Joe Joe";
        String s2="Joe";

        ans(s1,s2);
    }

    public static void ans(String s1,String s2){
        int count=0;
        if(s2.length()>s1.length()) System.out.println(0);
        int index=0;
        while((index=s1.indexOf(s2,index)) != -1){
            count++;
            index=index+s2.length();
        }

        System.out.println(count);
    }
}
