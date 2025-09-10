package com.swapnil;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Question15 {
    public static void main(String[] args) {
        String s="ACABDDABDCDACFAEGFDA";
        ans(s);
    }

    public static void ans(String s){
        HashMap<Character,Integer>freqOfChars=new HashMap<>();

        for(char c:s.toCharArray()){
            freqOfChars.put(c,freqOfChars.getOrDefault(c,0)+1);
        }
        System.out.println(freqOfChars);
        HashMap<Integer,Integer>freqOfValues=new HashMap<>();
        for(char c:freqOfChars.keySet()){
            freqOfValues.put(freqOfChars.get(c),freqOfValues.getOrDefault(freqOfChars.get(c),0)+1);
        }
        System.out.println(freqOfValues);

        boolean isAllSame=true;
        int firstkey=-1;
        for(int key:freqOfValues.keySet()){
            firstkey=key;
            break;
        }
        int value=freqOfValues.get(firstkey);
        for(int i:freqOfValues.keySet()){
            if(freqOfValues.get(i)!=value){
                isAllSame=false;
                break;
            }
        }
        System.out.println(isAllSame);
        if(isAllSame){
            System.out.println(Collections.min(freqOfValues.keySet()));
        }
        int maxValue=Collections.max(freqOfValues.values());
        HashSet<Integer>mySet=new HashSet<>();
        for(int i:freqOfValues.keySet()){
            if(maxValue==freqOfValues.get(i)) mySet.add(i);
        }

        if(mySet.size()==0){
            System.out.println(Collections.max(freqOfValues.values()));
        }else {
            System.out.println(Collections.min(mySet));
        }
    }
}
