package com.swapnil;

public class Question29 {
    public static void main(String[] args) {
        String s="aaabbbcccdddddd";
        ans(s);
    }

    public static void ans(String s){
        int homogenousCount=0;
        int st=0;
        int currentLevel=1;

        while(s.length()-st >= currentLevel){
            boolean homogenous=true;
            int currentEnd=st+currentLevel;
            String currentLayer=s.substring(st,currentEnd);

            char firstChar = currentLayer.charAt(0);
            for(int i=1;i<currentLayer.length();i++){
                if(currentLayer.charAt(i)!=firstChar){
                    homogenous=false;
                    break;
                }
            }

            if(homogenous) homogenousCount++;
            st=currentEnd;
            currentLevel++;
        }

        System.out.println(homogenousCount);
    }
}
