package com.swapnil;

public class Question20 {
    public static void main(String[] args) {
        String s="cba";
        ans(s);
    }

    public static void ans(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(i!=0){
                sum=sum+ Math.abs((s.charAt(i)-'a') - (s.charAt(i-1)-'a'));
            }
        }

        System.out.println(sum);
    }
}
