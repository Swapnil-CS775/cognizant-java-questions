package com.swapnil;

import java.util.Arrays;

public class Question60 {
    public static void main(String[] args) {
        String str="aabccccddd";
        ans(str);
    }

    public static void ans(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            freq[currentChar-97]+=1;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]!=0) {
                ans.append((char) (i + 97));
                ans.append(freq[i]);
            }
        }

        System.out.println(ans);
    }
}
