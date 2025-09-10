package com.swapnil;

public class Question18 {
    public static void main(String[] args) {
        String s="a123d";
        ans(s);
    }

    public static void ans(String s){
        int count=0,i=0,n=s.length();

        while (i<n){
            if(Character.isDigit(s.charAt(i))){
                int start=i;
                while (i<n && Character.isDigit(s.charAt(i))) i++;
                int end=i-1;
                if(start>0 && end<n-1 && Character.isLetter(s.charAt(start-1)) && Character.isLetter(s.charAt(end+1))) count++;
            }else {
                i++;
            }
        }
        System.out.println(count);
    }
}
