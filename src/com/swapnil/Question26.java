package com.swapnil;

import java.util.HashSet;
import java.util.Iterator;

public class Question26 {
    public static void main(String[] args) {
        int[] arr={1,6,4,3,6,5};
        String s="ABCDEF";

        ans(arr,s);
    }

    public static void ans(int[] arr,String s){
        HashSet<Integer>allowed=new HashSet<>();
        for(int num:arr) allowed.add(num);

        int count=0;

        for(char ch:s.toCharArray()){
            String ascii=String.valueOf((int)ch);

            for(char digitChar:ascii.toCharArray()){
                int digit=digitChar-'0';
                if(allowed.contains(digit))
                {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
