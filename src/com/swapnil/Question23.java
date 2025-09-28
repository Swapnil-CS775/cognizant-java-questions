package com.swapnil;

import java.util.HashSet;

public class Question23 {
    public static void main(String[] args) {
        String s="B...B...BB...B...BBB";

        ans(s);
    }

    public static void ans(String s){
        String[] dogs=s.split("\\.+");
        HashSet<String>uniqueDogs=new HashSet<>();

        for(int i=0;i<dogs.length;i++){
            uniqueDogs.add(dogs[i]);
        }

        System.out.println(uniqueDogs.size());
    }
}
