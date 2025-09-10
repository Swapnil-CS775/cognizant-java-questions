package com.swapnil;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Question13 {
    public static void main(String[] args) {
        String s="aartfu";
        ans(s);
    }

    public static void ans(String s){
        HashMap<Character,Integer>freq=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        int minEven=Integer.MAX_VALUE;
        int maxOdd=Integer.MIN_VALUE;

        for(char c:freq.keySet()){
            if(freq.get(c)%2==0 && freq.get(c)<minEven)minEven=freq.get(c);
            else {
                if(freq.get(c)>maxOdd)maxOdd=freq.get(c);
            }
        }

        System.out.println(Math.abs(minEven-maxOdd));
    }
}
