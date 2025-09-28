package com.swapnil;

import java.util.Arrays;

public class Question22 {
    public static void main(String[] args) {
        String s="Apple:250:10;Banana:120:15;Orange:300:5";
        ans(s);
    }

    public static void ans(String s){
        int cost=0;
        String[] products=s.split(";");
        System.out.println(Arrays.toString(products));

        for(int i=0;i<products.length;i++){
            String[] p=products[i].split(":");
            cost=cost + Integer.parseInt(p[1])*Integer.parseInt(p[2]);
        }

        System.out.println(cost);
    }
}
