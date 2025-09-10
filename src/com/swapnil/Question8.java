package com.swapnil;

import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        String s="she is good grid god and ground player plotter";
        ans(s);
    }

    public static void ans(String s){
        String[] words=s.split("\\s+");
        HashMap<String,Integer>myMap=new LinkedHashMap<>();
        for(int i=0;i< words.length;i++){
            String sub="";
            if(words[i].length()>1){
                sub="" + words[i].charAt(0) + words[i].charAt(words[i].length()-1);
                myMap.put(sub,myMap.getOrDefault(sub,0)+1);
            }
        }
        System.out.println(myMap);
        int maxFreq= Collections.max(myMap.values());
        ArrayList<String>ans=new ArrayList<>();
        for(String key:myMap.keySet()){
            if(myMap.get(key)==maxFreq){
                ans.add(key);
            }
        }

        System.out.println(ans);
    }
}
