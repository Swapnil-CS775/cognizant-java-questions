package com.swapnil;

public class Question4 {
    public static void main(String[] args) {
        String s1="ABD";
        String s2="AABCCAD";

        ans(s1,s2);
    }

    public static void ans(String s1,String s2){
        int[] a1=new int[26];
        int[] a2=new int[26];

        for(int i=0;i<s1.length();i++){
            a1[s1.charAt(i)-'A']++;
        }

        for(int i=0;i<s2.length();i++){
            a2[s2.charAt(i)-'A']++;
        }

        int cost=0;
        for(int i=0;i<a1.length;i++){
            cost=cost+Math.abs(a1[i]-a2[i]);
        }

        System.out.println(cost);
    }
}
